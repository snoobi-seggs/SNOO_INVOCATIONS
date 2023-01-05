package emu.grasscutter.game.activity.trialavatar;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.GameData;
import emu.grasscutter.data.custom.TrialAvatarActivityDataCustomData;
import emu.grasscutter.data.excels.RewardData;
import emu.grasscutter.data.excels.TrialAvatarActivityDataData;
import emu.grasscutter.game.dungeons.challenge.factory.ChallengeFactory;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.props.ActionReason;
import emu.grasscutter.game.activity.ActivityHandler;
import emu.grasscutter.game.activity.GameActivity;
import emu.grasscutter.game.activity.PlayerActivityData;
import emu.grasscutter.game.props.ActivityType;
import emu.grasscutter.net.proto.ActivityInfoOuterClass.ActivityInfo;
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

    public boolean enterTrialDungeon(Player player, int trialAvatarIndexId, int enterPointId) {
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
        emu.grasscutter.Grasscutter.getLogger().info("{}", player.getTeamManager().getActiveTeam().stream().map(x -> x.getAvatar().getAvatarId()).toList());
    }

    public void unsetTrialAvatarTeam(Player player) {
        if (getSelectedTrialAvatarIndex() <= 0) return;
        player.removeTrialAvatarForActivity();
        setSelectedTrialAvatarIndex(0);
    }

    public boolean getReward(Player player, PlayerActivityData playerActivityData, int trialAvatarIndexId) {
        TrialAvatarPlayerData trialAvatarPlayerData = getTrialAvatarPlayerData(playerActivityData);
        TrialAvatarPlayerData.RewardInfoItem rewardInfo = trialAvatarPlayerData.getRewardInfo(trialAvatarIndexId);
        if (rewardInfo == null) return false;

        RewardData rewardParam = GameData.getRewardDataMap().get(rewardInfo.getRewardId());
        if (rewardParam == null) return false;

        player.getInventory().addItemParamDatas(rewardParam.getRewardItemList(), ActionReason.TrialAvatarActivityFirstPassReward);
        rewardInfo.setReceivedReward(true);
        playerActivityData.setDetail(trialAvatarPlayerData);
        playerActivityData.save();
        return true;
    }
}
