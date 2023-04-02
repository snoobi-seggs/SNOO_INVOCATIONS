package emu.grasscutter.data.excels;

import com.google.gson.annotations.SerializedName;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import emu.grasscutter.game.gcg.enums.*;
import emu.grasscutter.net.proto.GCGDiceSideTypeOuterClass.GCGDiceSideType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.*;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ResourceType(name = {"GCGCharExcelConfigData.json"}, loadPriority = ResourceType.LoadPriority.HIGH)
public class GcgCharData extends GameResource {

    int hp;
	
	@SerializedName(value="burstCost", alternate={"BPHBKAGLFCE","GOAKKENJPJO"}) //3.3,3.5
    int burstCost; //burst cost energy
	
	@SerializedName(value="switchName", alternate={"IAPINBOEJCO","PLJDNGEEPBK"})
    String switchName;
	
	int id;
	String cardType;
	
	@SerializedName(value="tagList", alternate={"LKIILDFIPKC"}) //3.5
    List<String> tagList;
	
	List<Integer> skillList;

    @Override
    public int getId() {
        return id;
    }
	
	public GCGDiceSideType getElementType() {
		for (String tag : tagList) {
			if (tag.equals("GCG_TAG_NONE")) {
				continue;
			} else if (tag.equals("GCG_TAG_ELEMENT_CRYO")) {
				return GCGDiceSideType.GCG_DICE_SIDE_TYPE_CRYO;
			} else if (tag.equals("GCG_TAG_ELEMENT_HYDRO")) {
				return GCGDiceSideType.GCG_DICE_SIDE_TYPE_HYDRO;
			} else if (tag.equals("GCG_TAG_ELEMENT_PYRO")) {
				return GCGDiceSideType.GCG_DICE_SIDE_TYPE_PYRO;
			} else if (tag.equals("GCG_TAG_ELEMENT_ELECTRO")) {
				return GCGDiceSideType.GCG_DICE_SIDE_TYPE_ELECTRO;
			} else if (tag.equals("GCG_TAG_ELEMENT_GEO")) {
				return GCGDiceSideType.GCG_DICE_SIDE_TYPE_GEO;
			} else if (tag.equals("GCG_TAG_ELEMENT_DENDRO")) {
				return GCGDiceSideType.GCG_DICE_SIDE_TYPE_DENDRO;
			} else if (tag.equals("GCG_TAG_ELEMENT_ANEMO")) {
				return GCGDiceSideType.GCG_DICE_SIDE_TYPE_ANEMO;
			} else if (tag.equals("GCG_TAG_ELEMENT_PAIMON")) {
				return GCGDiceSideType.GCG_DICE_SIDE_TYPE_PAIMON;
			}
		}
		return GCGDiceSideType.GCG_DICE_SIDE_TYPE_INVALID;
	}
	
	public int getElementTypeId() {
		for (String tag : tagList) {
			if (tag.equals("GCG_TAG_NONE")) {
				continue;
			} else if (tag.equals("GCG_TAG_ELEMENT_CRYO")) {
				return 1;
			} else if (tag.equals("GCG_TAG_ELEMENT_HYDRO")) {
				return 2;
			} else if (tag.equals("GCG_TAG_ELEMENT_PYRO")) {
				return 3;
			} else if (tag.equals("GCG_TAG_ELEMENT_ELECTRO")) {
				return 4;
			} else if (tag.equals("GCG_TAG_ELEMENT_GEO")) {
				return 5;
			} else if (tag.equals("GCG_TAG_ELEMENT_DENDRO")) {
				return 6;
			} else if (tag.equals("GCG_TAG_ELEMENT_ANEMO")) {
				return 7;
			} else if (tag.equals("GCG_TAG_ELEMENT_PAIMON")) {
				return 8;
			}
		}
		return 0;
	}
	
	
	public boolean isCatalystUser() {
		if (tagList.contains("GCG_TAG_WEAPON_CATALYST")) {
			return true;
		} else {
			return false;
		}
	}
	
	public List<Integer> getTagIdList() {
		List<Integer> tagIdList = new ArrayList<>();
		for (String tag : tagList) {
			tagIdList.add(GcgTagType.getTypeByName(tag).getId());
		}
		//debug
		//Grasscutter.getLogger().info("CharID: {} | TagIDList : {}",id , tagIdList);
		return tagIdList;
	}

    @Override
    public void onLoad() {
        //super.onLoad();
		//Grasscutter.getLogger().info("GcgCharData: " + this.id + " , " + this.skillList.toString());
    }
}
