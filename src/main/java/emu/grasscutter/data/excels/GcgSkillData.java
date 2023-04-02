package emu.grasscutter.data.excels;

import com.google.gson.annotations.SerializedName;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.GameData;
import emu.grasscutter.data.ResourceType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair;

import java.util.*;
import static java.util.Map.entry;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ResourceType(name = {"GCGSkillExcelConfigData.json"}, loadPriority = ResourceType.LoadPriority.LOW)
public class GcgSkillData extends GameResource {
	
	@SerializedName(value="id",alternate={"Id"})
	int id;
	
	@SerializedName(value="skillCost",alternate={"MPCBBHIOOJD"})
	List<DiceCostData> skillCost;
	
	@SerializedName(value="skillTags",alternate={"KHEMKOEBBGE"})
    List<String> skillTags;
	
	@SerializedName(value="skillConfig",alternate={"FECDCBKJJKC"})
	String skillConfig; // name to bin out map
	
	@SerializedName(value="EHEAJIPNMBJ",alternate={"GOIGKLKEMMI"})
	int EHEAJIPNMBJ; // idk
	
	public class DiceCostData {
		@SerializedName(value="costType",alternate={"BCGPIIPDEPC"})
		private String costType;
		private int count;
		
		public String getCostType() {
			return costType;
		}
		
		public int getCount() {
			return count;
		}
	}
	
	public int getElementType() {
		//check if is basic atk (scam method)
		if (!GameData.getGcgCharDataMap().get(this.id / 10).isCatalystUser()) { //catalst all deal element dmg w n atk
			for (DiceCostData costRequirement : this.skillCost) {
				String costType = costRequirement.getCostType();
				if (costType == null) {
					continue;
				} else if (costType.equals("GCG_COST_DICE_VOID")) {
					return 0; //phys dmg since only basic atks require other dice types
				}
			}
		}
		
		//check element type if is not basic atk
		for (DiceCostData costRequirement : this.skillCost) {
			String costType = costRequirement.getCostType();
			if (costType == null) {
				continue;
			} else if (costType.equals("GCG_COST_DICE_CRYO")) {
				return 1;
			} else if (costType.equals("GCG_COST_DICE_HYDRO")) {
				return 2;
			} else if (costType.equals("GCG_COST_DICE_PYRO")) {
				return 3;
			} else if (costType.equals("GCG_COST_DICE_ELECTRO")) {
				return 4;
			} else if (costType.equals("GCG_COST_DICE_GEO")) {
				return 5;
			} else if (costType.equals("GCG_COST_DICE_DENDRO")) {
				return 6;
			} else if (costType.equals("GCG_COST_DICE_ANEMO")) {
				return 7;
			} else if (costType.equals("GCG_COST_DICE_PAIMON")) { //idt this exist
				return 8;
			} else {} //do nothing cos cld be void and energy cost tags etc
		}
		
		return 0; //if no dice cost found, element damage wld become phys
	}
	
	public int getEnergyCost() {
		for (DiceCostData costRequirement : this.skillCost) {
			String costType = costRequirement.getCostType();
			if (costType == "GCG_COST_ENERGY") {
				return costRequirement.getCount();
			} else {} //do nothing cos cld be dice cost
		}
		return 0; //if no energy cost since not burst
	}
	
	public List<Uint32Pair> getCostMap() {
		Map<String,Integer> costTypeToDiceCostMap = Map.ofEntries(
			entry("GCG_COST_ENERGY",1),
			entry("GCG_COST_DICE_SAME",3),
			entry("GCG_COST_DICE_VOID",10),
			entry("GCG_COST_DICE_CRYO",11),
			entry("GCG_COST_DICE_HYDRO",12),
			entry("GCG_COST_DICE_PYRO",13),
			entry("GCG_COST_DICE_ELECTRO",14),
			entry("GCG_COST_DICE_GEO",15),
			entry("GCG_COST_DICE_DENDRO",16),
			entry("GCG_COST_DICE_ANEMO",17),
			entry("GCG_COST_DICE_PAIMON",18)
		);
		
		//debug
		//Grasscutter.getLogger().info(costTypeToDiceCostMap.toString());
		
		List<Uint32Pair> costMap = new ArrayList<>();
		for (DiceCostData costData : this.skillCost) {
			if (costData.costType != null) {
				//Grasscutter.getLogger().info("skillId = {}, costType = {}, count = {}",this.id, costData.costType,costData.count);
				costMap.add(Uint32Pair.newBuilder()
							.setKey(costTypeToDiceCostMap.getOrDefault(costData.costType,0))
							.setValue(costData.count)
							.build());
			} else {
				//intentionally ignore
			}
		}
		return costMap;
	}
	
	public boolean isElementalBurst() {
		if (this.skillTags.contains("GCG_SKILL_TAG_Q")) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getSkillData() {
		String ret = "";
		for (DiceCostData data : this.skillCost) {
			ret = ret + "costType : " + data.getCostType() + " count : " + data.getCount() + "\n";
		}
		return ret;
	}

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void onLoad() {
        //super.onLoad();
		//Grasscutter.getLogger().info("GcgSkillData: " + this.id + " \n " + this.getSkillData());
    }
}
