package emu.grasscutter.game.activity.trialavatar;

import com.esotericsoftware.reflectasm.ConstructorAccess;
import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.GameData;
import emu.grasscutter.data.custom.TrialAvatarActivityDataCustomData;
import emu.grasscutter.data.excels.RewardData;
import emu.grasscutter.data.excels.TrialAvatarActivityDataData;
import emu.grasscutter.game.activity.ActivityWatcher;
import emu.grasscutter.game.activity.DefaultWatcher;
import emu.grasscutter.game.dungeons.challenge.factory.ChallengeFactory;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.props.ActionReason;
import emu.grasscutter.game.props.WatcherTriggerType;
import emu.grasscutter.game.activity.ActivityHandler;
import emu.grasscutter.game.activity.GameActivity;
import emu.grasscutter.game.activity.PlayerActivityData;
import emu.grasscutter.game.props.ActivityType;
import emu.grasscutter.net.proto.ActivityInfoOuterClass.ActivityInfo;
import emu.grasscutter.server.packet.send.PacketActivityInfoNotify;
import emu.grasscutter.server.packet.send.PacketScenePlayerLocationNotify;
import emu.grasscutter.utils.JsonUtils;

import java.util.*;
import java.util.stream.*;
import lombok.*;

@GameActivity(ActivityType.NEW_ACTIVITY_TRIAL_AVATAR)
public class TrialAvatarActivityHandler extends ActivityHandler {
    @Getter @Setter private int selectedTrialAvatarIndex;

    @Override
    public void onInitPlayerActivityData(PlayerActivityData playerActivityData) {
        TrialAvatarPlayerData trialAvatarPlayerData = TrialAvatarPlayerData.create(getActivityConfigItem().getScheduleId());

        playerActivityData.setDetail(trialAvatarPlayerData);
    }

    @Override
    public void onProtoBuild(PlayerActivityData playerActivityData, ActivityInfo.Builder activityInfo) {
        TrialAvatarPlayerData trialAvatarPlayerData = getTrialAvatarPlayerData(playerActivityData);

        activityInfo.setTrialAvatarInfo(trialAvatarPlayerData.toProto());
    }

    @Override
    public void initWatchers(Map<WatcherTriggerType, ConstructorAccess<?>> activityWatcherTypeMap) {
        var watcherType = activityWatcherTypeMap.get(WatcherTriggerType.TRIGGER_FINISH_CHALLENGE);
        ActivityWatcher watcher;
        if(watcherType != null){
            watcher = (ActivityWatcher) watcherType.newInstance();
        }else{
            watcher = new DefaultWatcher();
        }

        watcher.setActivityHandler(this);
        getWatchersMap().computeIfAbsent(WatcherTriggerType.TRIGGER_FINISH_CHALLENGE, k -> new ArrayList<>());
        getWatchersMap().get(WatcherTriggerType.TRIGGER_FINISH_CHALLENGE).add(watcher);
    }

    public TrialAvatarPlayerData getTrialAvatarPlayerData(PlayerActivityData playerActivityData) {
        if (playerActivityData.getDetail() == null || playerActivityData.getDetail().isBlank()) {
            onInitPlayerActivityData(playerActivityData);
            playerActivityData.save();
        }

        return JsonUtils.decode(playerActivityData.getDetail(), TrialAvatarPlayerData.class);
    }

    public int getTrialActivityDungeonId(int trialAvatarIndexId) {
        if (GameData.getTrialAvatarActivityDataCustomData().isEmpty()) {
            if (GameData.getTrialAvatarActivityDataDataMap().get(trialAvatarIndexId) == null) return 0;

            return GameData.getTrialAvatarActivityDataDataMap().get(trialAvatarIndexId).getDungeonId();
        }
        if (GameData.getTrialAvatarActivityDataCustomData().get(trialAvatarIndexId) == null) return 0;
        return GameData.getTrialAvatarActivityDataCustomData().get(trialAvatarIndexId).getDungeonId();
    }

    public List<String> getTriggerParamList() {
        // TODO maybe make the custom data an extended class to reduce repeated code
        if (GameData.getTrialAvatarActivityDataCustomData().isEmpty()) {
            if (GameData.getTrialAvatarActivityDataDataMap().get(getSelectedTrialAvatarIndex()) == null) return List.of();

            return GameData.getTrialAvatarActivityDataDataMap().get(getSelectedTrialAvatarIndex()).getTriggerConfig().getParamList();
        }
        if (GameData.getTrialAvatarActivityDataCustomData().get(getSelectedTrialAvatarIndex()) == null) return List.of();
        return GameData.getTrialAvatarActivityDataCustomData().get(getSelectedTrialAvatarIndex()).getTriggerConfig().getParamList();
    }

    public boolean enterTrialDungeon(Player player, int trialAvatarIndexId, int enterPointId) {
        // TODO, not sure if this will cause problem in MP, since we are entering trial activity dungeon
        player.sendPacket(new PacketScenePlayerLocationNotify(player.getScene())); // official does send this

        if (!player.getServer().getDungeonSystem().enterDungeon(
                player,
                enterPointId,
                getTrialActivityDungeonId(trialAvatarIndexId))) return false;

        setSelectedTrialAvatarIndex(trialAvatarIndexId);

        return true;
    }

    public List<Integer> getBattleAvatarsList() {
        if (GameData.getTrialAvatarActivityDataCustomData().isEmpty()) {
            TrialAvatarActivityDataData activityData = GameData.getTrialAvatarActivityDataDataMap()
                    .get(getSelectedTrialAvatarIndex());
            if (activityData == null && activityData.getBattleAvatarsList().isBlank()) return List.of();
            return Stream.of(activityData.getBattleAvatarsList().split(",")).map(Integer::parseInt).toList();
        }
        TrialAvatarActivityDataCustomData activityCustomData = GameData.getTrialAvatarActivityDataCustomData()
                    .get(getSelectedTrialAvatarIndex());
        if (activityCustomData == null && activityCustomData.getBattleAvatarsList().isBlank()) return List.of();
        return Stream.of(activityCustomData.getBattleAvatarsList().split(",")).map(Integer::parseInt).toList();
    }

    public void setupTrialAvatarTeam(Player player) {
        if (getSelectedTrialAvatarIndex() <= 0) return;

        List<Integer> battleAvatarsList = getBattleAvatarsList();
        if (battleAvatarsList.isEmpty()) return;

        player.addTrialAvatarsForActivity(battleAvatarsList);
    }

    public void unsetTrialAvatarTeam(Player player) {
        if (getSelectedTrialAvatarIndex() <= 0) return;
        player.removeTrialAvatarForActivity();
        setSelectedTrialAvatarIndex(0);
    }

    public boolean getReward(Player player, int trialAvatarIndexId) {
        val playerActivityData = player.getActivityManager().getPlayerActivityDataByActivityType(ActivityType.NEW_ACTIVITY_TRIAL_AVATAR);

        if(playerActivityData.isEmpty()){
            return false;
        }

        TrialAvatarPlayerData trialAvatarPlayerData = getTrialAvatarPlayerData(playerActivityData.get());
        TrialAvatarPlayerData.RewardInfoItem rewardInfo = trialAvatarPlayerData.getRewardInfo(trialAvatarIndexId);
        if (rewardInfo == null) return false;

        RewardData rewardParam = GameData.getRewardDataMap().get(rewardInfo.getRewardId());
        if (rewardParam == null) return false;

        player.getInventory().addItemParamDatas(rewardParam.getRewardItemList(), ActionReason.TrialAvatarActivityFirstPassReward);
        rewardInfo.setReceivedReward(true);
        playerActivityData.get().setDetail(trialAvatarPlayerData);
        playerActivityData.get().save();
        return true;
    }

    public void setPassDungeon(PlayerActivityData playerActivityData) {
        TrialAvatarPlayerData trialAvatarPlayerData = getTrialAvatarPlayerData(playerActivityData);
        TrialAvatarPlayerData.RewardInfoItem rewardInfo = trialAvatarPlayerData.getRewardInfo(getSelectedTrialAvatarIndex());
        if (rewardInfo == null) return;

        rewardInfo.setPassedDungeon(true);
        playerActivityData.setDetail(trialAvatarPlayerData);
        playerActivityData.save();
        Player player = Grasscutter.getGameServer().getPlayerByUid(playerActivityData.getUid());
        player.sendPacket(new PacketActivityInfoNotify(toProto(playerActivityData, player.getActivityManager().getConditionExecutor())));
    }
}
