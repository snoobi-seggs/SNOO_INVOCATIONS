package emu.grasscutter.data.excels;

import com.google.gson.annotations.SerializedName;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ResourceType(name = {"GCGLevelExcelConfigData.json"})
public class GcgLevelData extends GameResource {

    int level;
    int exp;
    int rewardId;
    long unlockDescTextMapHash;
	
	@SerializedName(value="iconType",alternate={"GHOJNFPNCPD","JICDGHLIPIH"})
	String iconType;

    @Override
    public int getId() {
        return level;
    }

    @Override
    public void onLoad() {
        //super.onLoad();
		//Grasscutter.getLogger().info("GcgLevelData: " + this.level + " , " + this.rewardId);
    }
}
