package emu.grasscutter.data.custom;

import lombok.*;
import java.util.List;

@Data
public class TrialAvatarCustomData {
    private int trialAvatarId;
    private List<String> trialAvatarParamList;
    private Integer coreProudSkillLevel;
    private Integer skillDepotId;
}
