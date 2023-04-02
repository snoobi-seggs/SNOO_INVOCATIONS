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
@ResourceType(name = {"GCGDeckExcelConfigData.json"}, loadPriority = ResourceType.LoadPriority.HIGH)
public class GcgDeckData extends GameResource {

    int id;
	
	@SerializedName(value="characterCardList", alternate={"CCLCEMOICNM"}) //3.45
    List<Integer> characterCardList;
	
	@SerializedName(value="cardList", alternate={"ELCCJEOKFBB"})
    List<Integer> cardList;
	
	//rest unused

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
