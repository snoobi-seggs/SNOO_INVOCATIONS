package emu.grasscutter.game.activity.trialavatar;

import emu.grasscutter.data.GameData;
import emu.grasscutter.data.excels.TrialAvatarActivityData;
import emu.grasscutter.game.activity.ActivityConfigItem;
import emu.grasscutter.net.proto.TrialAvatarActivityDetailInfoOuterClass.TrialAvatarActivityDetailInfo;
import emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.stream.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder(builderMethodName = "of")
public class TrialAvatarPlayerData {
    List<RewardInfoItem> rewardInfoList;

    private static List<Integer> getAvatarIdList(int scheduleId) {
        if (GameData.getTrialAvatarActivityCustomData().isEmpty()) {
            if (GameData.getTrialAvatarActivityDataMap().get(scheduleId) == null) return List.of();

            return GameData.getTrialAvatarActivityDataMap().get(scheduleId).getAvatarIndexIdList();
        }
        if (GameData.getTrialAvatarActivityCustomData().get(scheduleId) == null) return List.of();
        return GameData.getTrialAvatarActivityCustomData().get(scheduleId).getAvatarIndexIdList();
    }

    private static List<Integer> getRewardIdList(int scheduleId) {
        if (GameData.getTrialAvatarActivityCustomData().isEmpty()) {
            if (GameData.getTrialAvatarActivityDataMap().get(scheduleId) == null) return List.of();

            return GameData.getTrialAvatarActivityDataMap().get(scheduleId).getRewardIdList();
        }
        if (GameData.getTrialAvatarActivityCustomData().get(scheduleId) == null) return List.of();
        return GameData.getTrialAvatarActivityCustomData().get(scheduleId).getRewardIdList();
    }

    public static TrialAvatarPlayerData create(int scheduleId) {
        List<Integer> avatarIds = getAvatarIdList(scheduleId);
        List<Integer> rewardIds = getRewardIdList(scheduleId);
        return TrialAvatarPlayerData.of()
            .rewardInfoList(IntStream.range(0, avatarIds.size())
                .filter(i -> avatarIds.get(i) > 0 && rewardIds.get(i) > 0)
                .mapToObj(i -> RewardInfoItem.create(
                    avatarIds.get(i), 
                    rewardIds.get(i)))
                .collect(Collectors.toList()))
            .build();
    }

    public TrialAvatarActivityDetailInfo toProto() {
        return TrialAvatarActivityDetailInfo.newBuilder()
            .addAllRewardInfoList(getRewardInfoList().stream()
                .map(RewardInfoItem::toProto).toList())
            .build();
    }

    public RewardInfoItem getRewardInfo(int trialAvatarIndexId) {
        return getRewardInfoList().stream().filter(x -> x.getTrialAvatarIndexId() == trialAvatarIndexId)
            .findFirst().orElse(null);
    }

    @Data
    @FieldDefaults(level = AccessLevel.PRIVATE)
    @Builder(builderMethodName = "of")
    public static class RewardInfoItem {
        int trialAvatarIndexId;
        int rewardId;
        boolean passedDungeon;
        boolean receivedReward;

        public static RewardInfoItem create(int trialAvatarIndexId, int rewardId) {
            return RewardInfoItem.of()
                .trialAvatarIndexId(trialAvatarIndexId)
                .rewardId(rewardId)
                .passedDungeon(true)
                .receivedReward(false)
                .build();
        }

        public TrialAvatarActivityRewardDetailInfo toProto() {
            return TrialAvatarActivityRewardDetailInfo.newBuilder()
                .setTrialAvatarIndexId(getTrialAvatarIndexId())
                .setRewardId(getRewardId())
                .setPassedDungeon(isPassedDungeon())
                .setReceivedReward(isReceivedReward())
                .build();
        }
    }
}


