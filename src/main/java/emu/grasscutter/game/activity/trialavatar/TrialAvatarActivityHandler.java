package emu.grasscutter.game.activity.trialavatar;

import emu.grasscutter.game.activity.ActivityHandler;
import emu.grasscutter.game.activity.GameActivity;
import emu.grasscutter.game.activity.PlayerActivityData;
import emu.grasscutter.game.props.ActivityType;
import emu.grasscutter.net.proto.ActivityInfoOuterClass.ActivityInfo;
import emu.grasscutter.utils.JsonUtils;

import java.util.stream.Collectors;

@GameActivity(ActivityType.NEW_ACTIVITY_TRIAL_AVATAR)
public class TrialAvatarActivityHandler extends ActivityHandler {

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
}
