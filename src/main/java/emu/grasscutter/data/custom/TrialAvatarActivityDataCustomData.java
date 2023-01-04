package emu.grasscutter.data.custom;

import emu.grasscutter.game.props.WatcherTriggerType;
import lombok.*;
import java.util.List;

@Data
public class TrialAvatarActivityDataCustomData {
    private int trialAvatarIndexId;
    private int trialAvatarId;
    private int dungeonId;
    private String battleAvatarsList;
    private int firstPassReward;
    private int id;
    private WatcherTrigger triggerConfig;
    private int progress;

    public void onLoad() {
        triggerConfig.paramList = triggerConfig.paramList.stream().filter(x -> !x.isBlank()).toList();
        triggerConfig.watcherTriggerType = WatcherTriggerType.getTypeByName(triggerConfig.triggerType);
    }

    @Data
    public static class WatcherTrigger{
        private String triggerType;
        private List<String> paramList;

        transient WatcherTriggerType watcherTriggerType;
    }
}
