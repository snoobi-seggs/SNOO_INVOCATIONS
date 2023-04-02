package emu.grasscutter.data.excels;

import com.google.gson.annotations.SerializedName;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ResourceType(name = {"GCGProficiencyRewardExcelConfigData.json"})
public class GcgProficiencyRewardData extends GameResource {
	
	@SerializedName(value = "charId", alternate = {"KFDMIAPDCEG","BAHNBAOENOB","LCONEMCLIOA"})
    int charId;
	@SerializedName(value = "rewardList", alternate = {"FJHMBDEAADC","DLCFPKLGMLL","EFBIAFODDGJ"})
	List<GcgRewardData> rewardList;  //size is 3
	
	public class GcgRewardData {
		@SerializedName(value = "level", alternate = {"JLFLKLLCBCJ","MPKFDACCEBK","MILNHPLDLMC"})
		@Getter @Setter int level = 0;
		@Getter @Setter int rewardId = 0;
	}
	
    @Override
    public int getId() {
        return charId;
    }
}
