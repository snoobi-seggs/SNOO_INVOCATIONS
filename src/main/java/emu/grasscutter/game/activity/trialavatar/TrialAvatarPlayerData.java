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

    public static TrialAvatarPlayerData create(int scheduleId) {
        TrialAvatarActivityData activityData = GameData.getTrialAvatarActivityDataMap().get(scheduleId);
        return TrialAvatarPlayerData.of()
            .rewardInfoList(activityData == null ? List.of() : 
                IntStream.range(0, activityData.getAvatarIndexIdList().size())
                    .filter(i -> activityData.getAvatarIndexIdList().get(i) > 0 && activityData.getRewardIdList().get(i) > 0)
                    .mapToObj(i -> RewardInfoItem.create(
                        activityData.getAvatarIndexIdList().get(i), 
                        activityData.getRewardIdList().get(i)))
                    .collect(Collectors.toList()))
            .build();
    }

    public TrialAvatarActivityDetailInfo toProto() {
        return TrialAvatarActivityDetailInfo.newBuilder()
            .addAllRewardInfoList(getRewardInfoList().stream()
                .map(RewardInfoItem::toProto).toList())
            .build();
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
                .passedDungeon(false)
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


