package emu.grasscutter.data.excels;

import com.google.gson.annotations.SerializedName;
import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ResourceType(name = {"GCGBossLevelExcelConfigData.json"})
public class GcgBossData extends GameResource {

    int id;
	
	@SerializedName(value = "easyLevelId", alternate = {"NNGHFPHLBOG","DDCEJFKKBEO"})
    int easyLevelId;
	
	@SerializedName(value = "seriousLevelId", alternate = {"DOOCADCGGKO","NHFGOPOOJKE"})
    int seriousLevelId;
	
    String unlockCond;
	
	@SerializedName(value = "unlockLevel", alternate = {"LKOILEBONPH","DBELNLMBANE"})
    int unlockLevel; //unlock level requirement
    
    //int JECHMICDJBE;
    int monsterId;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void onLoad() {
        super.onLoad();
    }
}
