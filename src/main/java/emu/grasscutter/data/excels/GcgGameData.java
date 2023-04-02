package emu.grasscutter.data.excels;

import com.google.gson.annotations.SerializedName;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.*;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ResourceType(name = {"GCGGameExcelConfigData.json"}, loadPriority = ResourceType.LoadPriority.HIGH)
public class GcgGameData extends GameResource {

    int id;
	
	@SerializedName(value="deckId", alternate={"NMABJHKFCEG"}) //3.45
    int deckId;
	
	//rest unused and idk what they do

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void onLoad() {
        //super.onLoad();
		//Grasscutter.getLogger().info("GcgCharData: " + this.id + " , " + this.skillList.toString());
    }
}
