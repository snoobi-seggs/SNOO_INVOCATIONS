package emu.grasscutter.data.excels;

import com.google.gson.annotations.SerializedName;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.*;

import static java.util.Map.entry;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ResourceType(name = {"GCGElementReactionExcelConfigData.json"})
public class GcgElementReactionData extends GameResource {

    int id;
    
	@SerializedName(value="firstElement",alternate={"NFANLMJDCNL"})
	String firstElement;
	
	@SerializedName(value="secondElement",alternate={"EADDDDPOOJE"})
	String secondElement;
	
	@SerializedName(value="reactionId",alternate={"ONEJALHEENC"})
	int reactionId;	//== id btw
	
    @Override
    public int getId() {
        return id;
    }
	
	//returns the other element
	public int getOtherElementToken(int firstElementToken) {
		Map<Integer,String> fromToken = Map.ofEntries(entry(0,"GCG_ELEMENT_PHYSIC"),	//this shldnt exist
												entry(9,"GCG_ELEMENT_CRYO"),
												entry(10,"GCG_ELEMENT_HYDRO"),
												entry(11,"GCG_ELEMENT_PYRO"),
												entry(12,"GCG_ELEMENT_ELECTRO"),
												entry(13,"GCG_ELEMENT_GEO"),
												entry(14,"GCG_ELEMENT_DENDRO"),
												entry(15,"GCG_ELEMENT_ANEMO")
												);
		Map<String,Integer> toToken = Map.ofEntries(entry("GCG_ELEMENT_PHYSIC",0),	//this shldnt exist
												entry("GCG_ELEMENT_CRYO",9),
												entry("GCG_ELEMENT_HYDRO",10),
												entry("GCG_ELEMENT_PYRO",11),
												entry("GCG_ELEMENT_ELECTRO",12),
												entry("GCG_ELEMENT_GEO",13),
												entry("GCG_ELEMENT_DENDRO",14),
												entry("GCG_ELEMENT_ANEMO",15)
												);
		if (fromToken.get(firstElementToken).equals(firstElement)) {
			return toToken.get(secondElement);
		} else if (fromToken.get(firstElementToken).equals(secondElement)) {
			return toToken.get(firstElement);
		} else {
			return 0;
		}
	}

    @Override
    public void onLoad() {
        super.onLoad();
		//Grasscutter.getLogger().info("GcgLevelData: " + this.level + " , " + this.rewardId);
    }
}
