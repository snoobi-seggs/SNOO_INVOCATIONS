package emu.grasscutter.game.world;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import emu.grasscutter.game.entity.GameEntity;
import emu.grasscutter.scripts.data.SceneGadget;
import emu.grasscutter.scripts.data.SceneGroup;
import lombok.Getter;
import lombok.Setter;

public class SceneGroupInstance {
    @Getter private SceneGroup luaGroup;
    @Getter @Setter private int targetSuiteId;
    @Getter @Setter private int activeSuiteId;
    @Getter private Set<Integer> deadEntities; //Config_ids
    private boolean isCached;

    @Getter private Map<Integer, Integer> cachedGadgetStates;
    @Getter private Map<String, Integer> cachedVariables;

    public SceneGroupInstance(SceneGroup group) {
        this.luaGroup = group;
        this.targetSuiteId = 0;
        this.activeSuiteId = 0;
        this.deadEntities = new HashSet<>();
        this.cachedGadgetStates = new ConcurrentHashMap<>();
        this.cachedVariables = new ConcurrentHashMap<>();

        this.isCached = false; //This is true when the group is not loaded on scene but caches suite data
    }

    public boolean isCached() {
        return this.isCached;
    }

    public void setCached(boolean value) {
        this.isCached = value;
    }

    public void cacheGadgetState(SceneGadget g, int state) {
        if(g.persistent) //Only cache when is persistent
            cachedGadgetStates.put(g.config_id, state);
    }

    public int getCachedGadgetState(SceneGadget g) {
        Integer state = cachedGadgetStates.getOrDefault(g.config_id, null);
        return (state == null) ? g.state : state;
    }
}
