package emu.grasscutter.data.custom;

import lombok.*;
import java.util.List;

@Data
public class TrialAvatarActivityCustomData {
    private int ScheduleId;
    private List<Integer> AvatarIndexIdList;
    private List<Integer> RewardIdList;

    public void onLoad() {
        this.AvatarIndexIdList = AvatarIndexIdList.stream().filter(x -> x > 0).toList();
        this.RewardIdList = RewardIdList.stream().filter(x -> x > 0).toList();
    }
}
