package emu.grasscutter.data.excels;

import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import emu.grasscutter.game.props.WatcherTriggerType;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.List;

@ResourceType(name = "TrialAvatarActivityDataExcelConfigData.json") 
@EqualsAndHashCode(callSuper=false)
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TrialAvatarActivityDataData extends GameResource {
    private int trialAvatarIndexId;
    private int trialAvatarId;
    private int dungeonId;
    private String battleAvatarsList;
    private int firstPassReward;
    private int id;
    private WatcherTrigger triggerConfig;
    private int progress;

    @Override
    public int getId() {
        return trialAvatarIndexId;
    }

    @Override
    public void onLoad() {
        triggerConfig.paramList = triggerConfig.paramList.stream().filter(x -> !x.isBlank()).toList();
        triggerConfig.watcherTriggerType = WatcherTriggerType.getTypeByName(triggerConfig.triggerType);
    }

    @Getter
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class WatcherTrigger{
        String triggerType;
        List<String> paramList;

        transient WatcherTriggerType watcherTriggerType;
    }
}
