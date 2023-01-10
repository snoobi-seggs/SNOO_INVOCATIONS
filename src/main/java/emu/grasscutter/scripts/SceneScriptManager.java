package emu.grasscutter.scripts;

import com.github.davidmoten.rtreemulti.RTree;
import com.github.davidmoten.rtreemulti.geometry.Geometry;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.GameData;
import emu.grasscutter.data.excels.MonsterData;
import emu.grasscutter.data.excels.WorldLevelData;
import emu.grasscutter.data.server.Grid;
import emu.grasscutter.game.entity.*;
import emu.grasscutter.game.entity.gadget.platform.BaseRoute;
import emu.grasscutter.game.props.EntityType;
import emu.grasscutter.game.world.Scene;
import emu.grasscutter.game.world.SceneGroupInstance;
import emu.grasscutter.net.proto.VisionTypeOuterClass;
import emu.grasscutter.scripts.constants.EventType;
import emu.grasscutter.scripts.data.*;
import emu.grasscutter.scripts.service.ScriptMonsterSpawnService;
import emu.grasscutter.scripts.service.ScriptMonsterTideService;
import emu.grasscutter.utils.FileUtils;
import emu.grasscutter.utils.GridPosition;
import emu.grasscutter.utils.JsonUtils;
import emu.grasscutter.utils.Position;
import io.netty.util.concurrent.FastThreadLocalThread;
import kotlin.Pair;
import lombok.val;

import org.luaj.vm2.LuaError;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;

import javax.annotation.Nonnull;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import static emu.grasscutter.scripts.constants.EventType.*;

public class SceneScriptManager {
    private final Scene scene;
    private final Map<String, Integer> variables;
    private SceneMeta meta;
    private boolean isInit;
    /**
     * current triggers controlled by RefreshGroup
     */
    private final Map<Integer, Set<SceneTrigger>> currentTriggers;
    private final Map<String, Set<SceneTrigger>> triggersByGroupScene;
    private final Map<Integer, Set<Pair<String, Integer>>> activeGroupTimers;
    private final Map<String, AtomicInteger> triggerInvocations;
    private final Map<Integer, EntityRegion> regions; // <EntityId-Region>
    private final Map<Integer, SceneGroup> sceneGroups;
    private final Map<Integer, SceneGroupInstance> sceneGroupsInstances;
    private ScriptMonsterTideService scriptMonsterTideService;
    private ScriptMonsterSpawnService scriptMonsterSpawnService;
    /**
     * blockid - loaded groupSet
     */
    private final Map<Integer, Set<SceneGroup>> loadedGroupSetPerBlock;
    private List<Grid> groupGrids;
    public static final ExecutorService eventExecutor;
    static {
        eventExecutor = new ThreadPoolExecutor(4, 4,
                60, TimeUnit.SECONDS, new LinkedBlockingDeque<>(10000),
                FastThreadLocalThread::new, new ThreadPoolExecutor.AbortPolicy());
    }
    public SceneScriptManager(Scene scene) {
        this.scene = scene;
        this.currentTriggers = new ConcurrentHashMap<>();
        this.triggersByGroupScene = new ConcurrentHashMap<>();
        this.activeGroupTimers = new ConcurrentHashMap<>();
        this.triggerInvocations = new ConcurrentHashMap<>();

        this.regions = new ConcurrentHashMap<>();
        this.variables = new ConcurrentHashMap<>();
        this.sceneGroups = new ConcurrentHashMap<>();
        this.sceneGroupsInstances = new ConcurrentHashMap<>();
        this.scriptMonsterSpawnService = new ScriptMonsterSpawnService(this);
        this.loadedGroupSetPerBlock = new ConcurrentHashMap<>();
        this.groupGrids = null; //This is changed on init

        // TEMPORARY
        if (this.getScene().getId() < 10 && !Grasscutter.getConfig().server.game.enableScriptInBigWorld) {
            return;
        }

        // Create
        this.init();
    }

    public Scene getScene() {
        return scene;
    }

    public List<Grid> getGroupGrids() {
        return groupGrids;
    }

    public SceneConfig getConfig() {
        if (!isInit) {
            return null;
        }
        return meta.config;
    }

    public Map<Integer, SceneBlock> getBlocks() {
        return meta.blocks;
    }

    public Map<String, Integer> getVariables() {
        return variables;
    }

    public Set<SceneTrigger> getTriggersByEvent(int eventId) {
        return currentTriggers.computeIfAbsent(eventId, e -> ConcurrentHashMap.newKeySet());
    }
    public int getTriggerCount() {
        return currentTriggers.size();
    }
    public void registerTrigger(List<SceneTrigger> triggers) {
        triggers.forEach(this::registerTrigger);
    }
    public void registerTrigger(SceneTrigger trigger) {
        triggerInvocations.put(trigger.getName(), new AtomicInteger(0));
        getTriggersByEvent(trigger.getEvent()).add(trigger);
        Grasscutter.getLogger().debug("Registered trigger {}", trigger.getName());
    }

    public void deregisterTrigger(List<SceneTrigger> triggers) {
        triggers.forEach(this::deregisterTrigger);
    }
    public void deregisterTrigger(SceneTrigger trigger) {
        getTriggersByEvent(trigger.getEvent()).remove(trigger);
        Grasscutter.getLogger().debug("deregistered trigger {}", trigger.getName());
    }

    public void resetTriggers(int eventId) {
        currentTriggers.put(eventId, ConcurrentHashMap.newKeySet());
    }

    public void resetTriggersForGroupSuite(SceneGroup group, int suiteIndex) {
        Grasscutter.getLogger().debug("reset triggers for group {} suite {}", group.id, suiteIndex);
        var suite = group.getSuiteByIndex(suiteIndex);
        if (suite == null) {
            Grasscutter.getLogger().warn("Trying to load null suite Triggers for group {} with suiteindex {}", group.id, suiteIndex);
            return;
        }

        var groupSceneTriggers = triggersByGroupScene.get(group.id+"_"+suiteIndex);
        if(groupSceneTriggers == null){
            groupSceneTriggers = new HashSet<>();
        }

        if(!groupSceneTriggers.isEmpty()) {
            for (var trigger : groupSceneTriggers) {
                currentTriggers.get(trigger.getEvent()).remove(trigger);
            }
            groupSceneTriggers.clear();
        }

        if (!suite.sceneTriggers.isEmpty()) {
            groupSceneTriggers.addAll(suite.sceneTriggers);
            for (var trigger : groupSceneTriggers) {
                registerTrigger(trigger);
                /*this.currentTriggers.computeIfAbsent(trigger.event, k -> ConcurrentHashMap.newKeySet())
                    .add(trigger);*/
            }
        }
        triggersByGroupScene.put(group.id+"_"+suiteIndex, groupSceneTriggers);
    }

    public void refreshGroup(SceneGroupInstance groupInstance) {
        if(groupInstance == null || groupInstance.getLuaGroup().suites==null){
            return;
        }
        //for (int i = 1; i<= group.suites.size();i++){
            //refreshGroup(group, i);
            refreshGroup(groupInstance, groupInstance.getActiveSuiteId(), false); //Refresh the last group triggers
        //}
    }
    public int refreshGroup(SceneGroupInstance groupInstance, int suiteIndex, boolean excludePrevSuite) {
        SceneGroup group = groupInstance.getLuaGroup();
        if(suiteIndex == 0) {
            if(excludePrevSuite) {
                suiteIndex = group.findInitSuiteIndex(groupInstance.getActiveSuiteId());
            } else
                suiteIndex = group.findInitSuiteIndex(0);
        }
        if(suiteIndex == 0) return 0;

        var suiteData = group.getSuiteByIndex(suiteIndex);
        if (suiteData == null) {
            return 0;
        }

        int prevSuiteIndex = groupInstance.getActiveSuiteId();
        boolean waitForOne = false;
        SceneSuite prevSuiteData = null;
        if(prevSuiteIndex != 0) {
            prevSuiteData = group.getSuiteByIndex(prevSuiteIndex);
            if (prevSuiteData != null) {
                if(prevSuiteData.ban_refresh && !suiteData.ban_refresh) {
                    waitForOne = true;
                }
            }
        }

        if(waitForOne && (groupInstance.getTargetSuiteId() == 0 || prevSuiteIndex != groupInstance.getTargetSuiteId())) {
            groupInstance.setTargetSuiteId(suiteIndex);
            return 0;
        }

        groupInstance.setTargetSuiteId(0);

		if(prevSuiteData != null){
			removeGroupSuite(group, prevSuiteData);
		} //Remove old group suite

		addGroupSuite(groupInstance, suiteData);

        groupInstance.setActiveSuiteId(suiteIndex);
        return suiteIndex;
    }
    public void refreshGroupMonster(SceneGroupInstance groupInstance) {
        var group = groupInstance.getLuaGroup();
        var monstersToSpawn = group.monsters.values().stream()
            .filter(m -> {
                var entity = scene.getEntityByConfigId(m.config_id);
                return (entity == null || entity.getGroupId()!=group.id) && !groupInstance.getDeadEntities().contains(entity);
            })
            .map(mob -> createMonster(group.id, group.block_id, mob))
            .toList();//TODO check if it interferes with bigworld or anything else
        this.addEntities(monstersToSpawn);
    }
    public EntityRegion getRegionById(int id) {
        return regions.get(id);
    }

    public void registerRegion(EntityRegion region) {
        regions.put(region.getId(), region);
        Grasscutter.getLogger().debug("Registered region {} from group {}", region.getMetaRegion().config_id, region.getGroupId());
    }
    public void registerRegionInGroupSuite(SceneGroup group, SceneSuite suite) {
        suite.sceneRegions.stream().map(region -> new EntityRegion(this.getScene(), region))
            .forEach(this::registerRegion);
    }
    public synchronized void deregisterRegion(SceneRegion region) {
        var instance = regions.values().stream()
            .filter(r -> r.getConfigId() == region.config_id)
            .findFirst();
        instance.ifPresent(entityRegion -> regions.remove(entityRegion.getId()));
    }

    public Map<Integer, Set<SceneGroup>> getLoadedGroupSetPerBlock() {
        return loadedGroupSetPerBlock;
    }

    // TODO optimize
    public SceneGroup getGroupById(int groupId) {
        for (SceneBlock block : getBlocks().values()) {
            loadBlockFromScript(block); //Load it in case it's not loaded, caching it

            var group = block.groups.get(groupId);
            if (group == null) {
                continue;
            }

            if (!this.sceneGroupsInstances.containsKey(groupId)) {
                getScene().onLoadGroup(List.of(group));
                getScene().onRegisterGroups();
            }
            return group;
        }
        return null;
    }

    public SceneGroupInstance getGroupInstanceById(int groupId) {
        return sceneGroupsInstances.getOrDefault(groupId, null);
    }

    private static void addGridPositionToMap(Map<GridPosition, Set<Integer>> map, int group_id, int vision_level, Position position) {
        //Convert position to grid position
        GridPosition gridPos;
        int width = Grasscutter.getConfig().server.game.visionOptions[vision_level].gridWidth;
        gridPos = new GridPosition((int)(position.getX() / width), (int)(position.getZ() / width), width);

        Set<Integer> groups = map.getOrDefault(gridPos, new HashSet<>());
        groups.add(group_id);
        map.put(gridPos, groups);
    }

    private void init() {
        var meta = ScriptLoader.getSceneMeta(getScene().getId());
        if (meta == null) {
            return;
        }
        this.meta = meta;

        var path = FileUtils.getScriptPath("Scene/" + getScene().getId() + "/scene_grid.json");

        try {
            this.groupGrids = JsonUtils.loadToList(path, Grid.class);
        } catch (IOException ignored) {
            Grasscutter.getLogger().error("Scene {} unable to load grid file.", getScene().getId());
        } catch (Exception e) {
            Grasscutter.getLogger().error("Scene {} unable to load grid file.", e, getScene().getId());
        }

        boolean runForFirstTime = this.groupGrids == null;

        //Find if the scene entities are already generated, if not generate it
        if(Grasscutter.getConfig().server.game.cacheSceneEntitiesEveryRun || runForFirstTime) {
            List<Map<GridPosition, Set<Integer>>> groupPositions = new ArrayList<>();
            for(int i = 0; i < 6; i++) groupPositions.add(new HashMap<>());

            meta.blocks.values().forEach(block -> {
                block.load(scene.getId(), meta.context);
                block.groups.values().stream().filter(g -> !g.dynamic_load).forEach(group -> {
                    group.load(this.scene.getId());

                    //Add all entitites here
                    group.monsters.values().forEach(m -> addGridPositionToMap(groupPositions.get(m.vision_level), group.id, m.vision_level, m.pos));
                    group.gadgets.values().forEach(g -> addGridPositionToMap(groupPositions.get(g.vision_level), group.id, g.vision_level, g.pos));
                    group.npcs.values().forEach(n -> addGridPositionToMap(groupPositions.get(n.vision_level), group.id, n.vision_level, n.pos));
                    group.regions.values().forEach(r -> addGridPositionToMap(groupPositions.get(0), group.id, 0, r.pos));
                    if(group.garbages != null && group.garbages.gadgets != null) group.garbages.gadgets.forEach(g -> addGridPositionToMap(groupPositions.get(g.vision_level), group.id, g.vision_level, g.pos));
                });
            });

            this.groupGrids = new ArrayList<>();
            for(int i = 0; i < 6; i++) {
                this.groupGrids.add(new Grid());
                this.groupGrids.get(i).grid = groupPositions.get(i);
            }

            try (FileWriter file = new FileWriter(path.toFile())) {
                file.write(JsonUtils.encode(groupGrids));
            } catch (IOException ignored) {
                Grasscutter.getLogger().error("Scene {} unable to write to grid file.", getScene().getId());
            } catch (Exception e) {
                Grasscutter.getLogger().error("Scene {} unable to save grid file.", e, getScene().getId());
            }

            Grasscutter.getLogger().info("Scene {} saved grid file.", getScene().getId());
        }

        // TEMP
        this.isInit = true;
    }

    public boolean isInit() {
        return isInit;
    }

    public void loadBlockFromScript(SceneBlock block) {
        block.load(scene.getId(), meta.context);
    }

    public void loadGroupFromScript(SceneGroup group) {
        group.load(getScene().getId());

        if (group.variables != null) {
            group.variables.forEach(var -> this.getVariables().put(var.name, var.value));
        }

        this.sceneGroups.put(group.id, group);
        this.sceneGroupsInstances.put(group.id, new SceneGroupInstance(group));
    }

    public void unregisterGroup(SceneGroup group) {
        this.sceneGroups.remove(group.id);
        this.sceneGroupsInstances.values().removeIf(i -> i.getLuaGroup().equals(group));
    }

    public void checkRegions() {
        if (this.regions.size() == 0) {
            return;
        }

        for (var region : this.regions.values()) {
            // currently all condition_ENTER_REGION Events check for avatar, so we have no necessary to add other types of entity
            var entities = getScene().getEntities().values()
                .stream()
                .filter(e -> e.getEntityType() == EntityType.Avatar.getValue() && region.getMetaRegion().contains(e.getPosition()))
                .toList();
            entities.forEach(region::addEntity);

            int targetID = 0;
            if (entities.size() > 0) {
                targetID = entities.get(0).getId();
            }

            if (region.hasNewEntities()) {
                Grasscutter.getLogger().trace("Call EVENT_ENTER_REGION_{}",region.getMetaRegion().config_id);
                callEvent(new ScriptArgs(EventType.EVENT_ENTER_REGION, region.getConfigId())
                    .setSourceEntityId(region.getId())
                    .setTargetEntityId(targetID)
                );

                region.resetNewEntities();
            }

            for (int entityId : region.getEntities()) {
                if (getScene().getEntityById(entityId) == null || !region.getMetaRegion().contains(getScene().getEntityById(entityId).getPosition())) {
                    region.removeEntity(entityId);

                }
            }
            if (region.entityLeave()) {
                callEvent(new ScriptArgs(EventType.EVENT_LEAVE_REGION, region.getConfigId())
                    .setSourceEntityId(region.getId())
                    .setTargetEntityId(region.getFirstEntityId())
                );

                region.resetNewEntities();
            }
        }
    }

    public List<EntityGadget> getGadgetsInGroupSuite(SceneGroupInstance groupInstance, SceneSuite suite) {
        var group = groupInstance.getLuaGroup();
        return suite.sceneGadgets.stream()
            .filter(m -> {
                var entity = scene.getEntityByConfigId(m.config_id);
                return (entity == null || entity.getGroupId()!=group.id) && !groupInstance.getDeadEntities().contains(entity);
            })
            .map(g -> createGadget(group.id, group.block_id, g))
            .filter(Objects::nonNull)
            .toList();
    }
    public List<EntityMonster> getMonstersInGroupSuite(SceneGroupInstance groupInstance, SceneSuite suite) {
        var group = groupInstance.getLuaGroup();
        return suite.sceneMonsters.stream()
            .filter(m -> {
                var entity = scene.getEntityByConfigId(m.config_id);
                return (entity == null || entity.getGroupId()!=group.id) && !groupInstance.getDeadEntities().contains(entity);
            })
            .map(mob -> createMonster(group.id, group.block_id, mob))
            .filter(Objects::nonNull)
            .toList();
    }
    public void addGroupSuite(SceneGroupInstance groupInstance, SceneSuite suite) {
        // we added trigger first
        registerTrigger(suite.sceneTriggers);

        var group = groupInstance.getLuaGroup();
        var toCreate = new ArrayList<GameEntity>();
        toCreate.addAll(getGadgetsInGroupSuite(groupInstance, suite));
        toCreate.addAll(getMonstersInGroupSuite(groupInstance, suite));
        addEntities(toCreate);

        registerRegionInGroupSuite(group, suite);
    }
    public void removeGroupSuite(SceneGroup group, SceneSuite suite) {
        deregisterTrigger(suite.sceneTriggers);
        removeMonstersInGroup(group, suite);
        removeGadgetsInGroup(group, suite);

        suite.sceneRegions.forEach(this::deregisterRegion);
    }
    public void killGroupSuite(SceneGroup group, SceneSuite suite) {
        deregisterTrigger(suite.sceneTriggers);

        killMonstersInGroup(group, suite);
        killGadgetsInGroup(group, suite);

        suite.sceneRegions.forEach(this::deregisterRegion);
    }

    public void startMonsterTideInGroup(SceneGroup group, Integer[] ordersConfigId, int tideCount, int sceneLimit) {
        this.scriptMonsterTideService =
                new ScriptMonsterTideService(this, group, tideCount, sceneLimit, ordersConfigId);

    }
    public void unloadCurrentMonsterTide() {
        if (this.getScriptMonsterTideService() == null) {
            return;
        }
        this.getScriptMonsterTideService().unload();
    }
    public void spawnMonstersByConfigId(SceneGroup group, int configId, int delayTime) {
        // TODO delay
        var entity = scene.getEntityByConfigId(configId);
        if(entity!=null && entity.getGroupId() == group.id){
            Grasscutter.getLogger().info("entity already exists failed in group {} with config {}", group.id, configId);
            return;
        }
        entity = createMonster(group.id, group.block_id, group.monsters.get(configId));
        if(entity!=null){
            getScene().addEntity(entity);
        } else {
            Grasscutter.getLogger().warn("failed to create entity with group {} and config {}", group.id, configId);
        }
    }
    // Events
    public void callEvent(int eventType) {
        callEvent(new ScriptArgs(eventType));
    }
    public void callEvent(@Nonnull ScriptArgs params) {
        /**
         * We use ThreadLocal to trans SceneScriptManager context to ScriptLib, to avoid eval script for every groups' trigger in every scene instances.
         * But when callEvent is called in a ScriptLib func, it may cause NPE because the inner call cleans the ThreadLocal so that outer call could not get it.
         * e.g. CallEvent -> set -> ScriptLib.xxx -> CallEvent -> set -> remove -> NPE -> (remove)
         * So we use thread pool to clean the stack to avoid this new issue.
         */
        eventExecutor.submit(() -> this.realCallEvent(params));
    }

    private void realCallEvent(@Nonnull ScriptArgs params) {
        try {
            ScriptLoader.getScriptLib().setSceneScriptManager(this);
            int eventType = params.type;
            Set<SceneTrigger> relevantTriggers = new HashSet<>();
            if (eventType == EventType.EVENT_ENTER_REGION || eventType == EventType.EVENT_LEAVE_REGION) {
                List<SceneTrigger> relevantTriggersList = this.getTriggersByEvent(eventType).stream()
                    .filter(p -> p.getCondition().contains(String.valueOf(params.param1)) &&
                        (p.getSource().isEmpty() || p.getSource().equals(params.getEventSource()))).toList();
                relevantTriggers = new HashSet<>(relevantTriggersList);
            } else {relevantTriggers = new HashSet<>(this.getTriggersByEvent(eventType));}
            for (SceneTrigger trigger : relevantTriggers) {
                handleEventForTrigger(params, trigger);
            }
        } catch (Throwable throwable){
            Grasscutter.getLogger().error("Condition Trigger "+ params.type +" triggered exception", throwable);
        } finally {
            // make sure it is removed
            ScriptLoader.getScriptLib().removeSceneScriptManager();
        }
    }

    private boolean handleEventForTrigger(ScriptArgs params, SceneTrigger trigger ){
        Grasscutter.getLogger().debug("checking trigger {} for event {}", trigger.getName(), params.type);
        try {
            // setup execution
            ScriptLoader.getScriptLib().setCurrentGroup(trigger.currentGroup);
            ScriptLoader.getScriptLib().setCurrentCallParams(params);

            if (evaluateTriggerCondition(trigger, params)) {
                callTrigger(trigger, params);
                return true;
            } else {
                Grasscutter.getLogger().debug("Condition Trigger {} returned false", trigger.getCondition());
            }
            //TODO some ret do not bool
            return false;
        }
        catch (Throwable ex){
            Grasscutter.getLogger().error("Condition Trigger "+trigger.getName()+" triggered exception", ex);
            return false;
        }finally {
            ScriptLoader.getScriptLib().removeCurrentGroup();
        }
    }

    private boolean evaluateTriggerCondition(SceneTrigger trigger, ScriptArgs params){
        Grasscutter.getLogger().trace("Call Condition Trigger {}, [{},{},{}]", trigger.getCondition(), params.param1, params.source_eid, params.target_eid);
        LuaValue ret = this.callScriptFunc(trigger.getCondition(), trigger.currentGroup, params);
        return ret.isboolean() && ret.checkboolean();
    }

    private void callTrigger(SceneTrigger trigger, ScriptArgs params){
        // the SetGroupVariableValueByGroup in tower need the param to record the first stage time
        LuaValue ret = this.callScriptFunc(trigger.getAction(), trigger.currentGroup, params);
        val invocationsCounter = triggerInvocations.get(trigger.getName());
        val invocations = invocationsCounter.incrementAndGet();
        Grasscutter.getLogger().trace("Call Action Trigger {}", trigger.getAction());

        if (trigger.getEvent() == EventType.EVENT_ENTER_REGION) {
            EntityRegion region = this.regions.values().stream().filter(p -> p.getConfigId() == params.param1).toList().get(0);
            getScene().getPlayers().forEach(p -> p.onEnterRegion(region.getMetaRegion()));
            deregisterRegion(region.getMetaRegion());
        } else if (trigger.getEvent() == EventType.EVENT_LEAVE_REGION) {
            EntityRegion region = this.regions.values().stream().filter(p -> p.getConfigId() == params.param1).toList().get(0);
            getScene().getPlayers().forEach(p -> p.onLeaveRegion(region.getMetaRegion()));
            deregisterRegion(region.getMetaRegion());
        }

        // always deregister on error, otherwise only if the count is reached
        if(ret.isboolean() && !ret.checkboolean() || ret.isint() && ret.checkint()!=0
        || trigger.getTrigger_count()>0 && invocations >= trigger.getTrigger_count()) {
            if(trigger.getEvent() == EVENT_TIMER_EVENT){
                cancelGroupTimerEvent(trigger.currentGroup.id, trigger.getSource());
            }
            deregisterTrigger(trigger);
        }
    }

    private LuaValue callScriptFunc(String funcName, SceneGroup group, ScriptArgs params) {
        LuaValue funcLua = null;
        if (funcName != null && !funcName.isEmpty()) {
            funcLua = (LuaValue) group.getBindings().get(funcName);
        }

        LuaValue ret = LuaValue.TRUE;

        if (funcLua != null) {
            LuaValue args = LuaValue.NIL;

            if (params != null) {
                args = CoerceJavaToLua.coerce(params);
            }

            ret = safetyCall(funcName, funcLua, args, group);
        }
        return ret;
    }

    public LuaValue safetyCall(String name, LuaValue func, LuaValue args, SceneGroup group) {
        try {
            return func.call(ScriptLoader.getScriptLibLua(), args);
        }catch (LuaError error) {
            ScriptLib.logger.error("[LUA] call trigger failed in group {} with {},{}",group.id,name,args,error);
            return LuaValue.valueOf(-1);
        }
    }

    public ScriptMonsterTideService getScriptMonsterTideService() {
        return scriptMonsterTideService;
    }

    public ScriptMonsterSpawnService getScriptMonsterSpawnService() {
        return scriptMonsterSpawnService;
    }

    public EntityGadget createGadget(int groupId, int blockId, SceneGadget g) {
        if (g.isOneoff) {
            var hasEntity = getScene().getEntities().values().stream()
                .filter(e -> e instanceof EntityGadget)
                .filter(e -> e.getGroupId() == g.group.id)
                .filter(e -> e.getConfigId() == g.config_id)
                .findFirst();
            if (hasEntity.isPresent()) {
                return null;
            }
        }
        EntityGadget entity = new EntityGadget(getScene(), g.gadget_id, g.pos);

        if (entity.getGadgetData() == null) {
            return null;
        }

        entity.setBlockId(blockId);
        entity.setConfigId(g.config_id);
        entity.setGroupId(groupId);
        entity.getRotation().set(g.rot);
        entity.setState(g.state);
        entity.setPointType(g.point_type);
        entity.setRouteConfig(BaseRoute.fromSceneGadget(g));
        entity.setMetaGadget(g);
        entity.buildContent();

        return entity;
    }
    public EntityNPC createNPC(SceneNPC npc, int blockId, int suiteId) {
        return new EntityNPC(getScene(), npc, blockId, suiteId);
    }
    public EntityMonster createMonster(int groupId, int blockId, SceneMonster monster) {
        if (monster == null) {
            return null;
        }

        MonsterData data = GameData.getMonsterDataMap().get(monster.monster_id);

        if (data == null) {
            return null;
        }

        // Calculate level
        int level = monster.level;

        if (getScene().getDungeonManager() != null) {
            level = getScene().getDungeonManager().getLevelForMonster(monster.config_id);
        } else if (getScene().getWorld().getWorldLevel() > 0) {
            WorldLevelData worldLevelData = GameData.getWorldLevelDataMap().get(getScene().getWorld().getWorldLevel());

            if (worldLevelData != null) {
                level = worldLevelData.getMonsterLevel();
            }
        }

        // Spawn mob
        EntityMonster entity = new EntityMonster(getScene(), data, monster.pos, level);
        entity.getRotation().set(monster.rot);
        entity.setGroupId(groupId);
        entity.setBlockId(blockId);
        entity.setConfigId(monster.config_id);
        entity.setPoseId(monster.pose_id);

        this.getScriptMonsterSpawnService()
                .onMonsterCreatedListener.forEach(action -> action.onNotify(entity));

        return entity;
    }

    public void addEntity(GameEntity gameEntity) {
        getScene().addEntity(gameEntity);
    }

    public void meetEntities(List<? extends GameEntity> gameEntity) {
        getScene().addEntities(gameEntity, VisionTypeOuterClass.VisionType.VISION_TYPE_MEET);
    }

    public void addEntities(List<? extends GameEntity> gameEntity) {
        getScene().addEntities(gameEntity);
    }

    public void removeEntities(List<? extends GameEntity> gameEntity) {
        getScene().removeEntities(gameEntity.stream().map(e -> (GameEntity) e).collect(Collectors.toList()), VisionTypeOuterClass.VisionType.VISION_TYPE_REFRESH);
    }

    public RTree<SceneBlock, Geometry> getBlocksIndex() {
        return meta.sceneBlockIndex;
    }
    public void removeMonstersInGroup(SceneGroup group, SceneSuite suite) {
        var configSet = suite.sceneMonsters.stream()
                .map(m -> m.config_id)
                .collect(Collectors.toSet());
        var toRemove = getScene().getEntities().values().stream()
                .filter(e -> e instanceof EntityMonster)
                .filter(e -> e.getGroupId() == group.id)
                .filter(e -> configSet.contains(e.getConfigId()))
                .toList();

        getScene().removeEntities(toRemove, VisionTypeOuterClass.VisionType.VISION_TYPE_MISS);
    }
    public void removeGadgetsInGroup(SceneGroup group, SceneSuite suite) {
        var configSet = suite.sceneGadgets.stream()
                .map(m -> m.config_id)
                .collect(Collectors.toSet());
        var toRemove = getScene().getEntities().values().stream()
                .filter(e -> e instanceof EntityGadget)
                .filter(e -> e.getGroupId() == group.id)
                .filter(e -> configSet.contains(e.getConfigId()))
                .toList();

        getScene().removeEntities(toRemove, VisionTypeOuterClass.VisionType.VISION_TYPE_MISS);
    }

    public void killMonstersInGroup(SceneGroup group, SceneSuite suite) {
        var configSet = suite.sceneMonsters.stream()
                .map(m -> m.config_id)
                .collect(Collectors.toSet());
        var toRemove = getScene().getEntities().values().stream()
                .filter(e -> e instanceof EntityMonster)
                .filter(e -> e.getGroupId() == group.id)
                .filter(e -> configSet.contains(e.getConfigId()))
                .toList();

        toRemove.forEach(getScene()::killEntity);
    }
    public void killGadgetsInGroup(SceneGroup group, SceneSuite suite) {
        var configSet = suite.sceneGadgets.stream()
                .map(m -> m.config_id)
                .collect(Collectors.toSet());
        var toRemove = getScene().getEntities().values().stream()
                .filter(e -> e instanceof EntityGadget)
                .filter(e -> e.getGroupId() == group.id)
                .filter(e -> configSet.contains(e.getConfigId()))
                .toList();

        toRemove.forEach(getScene()::killEntity);
    }

    public int createGroupTimerEvent(int groupID, String source, double time) {
        //TODO also remove timers when refreshing and test
        var group = getGroupById(groupID);
        if(group == null || group.triggers == null){
            Grasscutter.getLogger().warn("trying to create a timer for unknown group with id {} and source {}", groupID, source);
            return 1;
        }
        Grasscutter.getLogger().info("creating group timer event for group {} with source {} and time {}",
            groupID, source, time);
        for(SceneTrigger trigger : group.triggers.values()){
            if(trigger.getEvent() == EVENT_TIMER_EVENT &&trigger.getSource().equals(source)){
                Grasscutter.getLogger().warn("[LUA] Found timer trigger with source {} for group {} : {}",
                    source, groupID, trigger.getName());
                var taskIdentifier = Grasscutter.getGameServer().getScheduler().scheduleDelayedRepeatingTask(() ->
                    callEvent(new ScriptArgs(EVENT_TIMER_EVENT)
                        .setEventSource(source)), (int)time, (int)time);
                var groupTasks = activeGroupTimers.computeIfAbsent(groupID, k -> new HashSet<>());
                groupTasks.add(new Pair<>(source, taskIdentifier));

            }
        }
        return 0;
    }
    public int cancelGroupTimerEvent(int groupID, String source) {
        //TODO test
        var groupTimers = activeGroupTimers.get(groupID);
        if(groupTimers!=null && !groupTimers.isEmpty())
        for(var timer : groupTimers){
            if(timer.component1().equals(source)){
                Grasscutter.getGameServer().getScheduler().cancelTask(timer.component2());
                return 0;
            }
        }

        Grasscutter.getLogger().warn("trying to cancel a timer that's not active {} {}", groupID, source);
        return 1;
    }

}
