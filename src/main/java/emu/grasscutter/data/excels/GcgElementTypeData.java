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
@ResourceType(name = {"GCGElementExcelConfigData.json"})
public class GcgElementTypeData extends GameResource {

    String type;
	@SerializedName(value="tokenId",alternate={"BNKFFFCCNGF","AOLNEBPKGFO"})
	int tokenId; //elemental tag to add on skill result msg pack

    @Override
    public int getId() {
        return tokenId;
    }

    @Override
    public void onLoad() {
        //super.onLoad();
		//Grasscutter.getLogger().info("GcgElementData: " + this.type + " , " + this.BNKFFFCCNGF);
    }
}
