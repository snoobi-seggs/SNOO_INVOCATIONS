package emu.grasscutter.data.excels;

import com.google.gson.annotations.SerializedName;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import emu.grasscutter.game.gcg.enums.GcgTagType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair;

import java.util.*;
import static java.util.Map.entry;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ResourceType(name = {"GCGCardExcelConfigData.json"})
public class GcgCardData extends GameResource {

	@SerializedName(value = "token", alternate = {"MHICIIIBLCI","IHDNPHPLBHC"})
    String token; //token
	
	@SerializedName(value = "tokenIcon", alternate = {"EJLBDGICGCA","FLPLPIMNMFD"})
    String tokenIcon; //token icon
	
	@SerializedName(value = "useTimes", alternate = {"PIGACPCFCPF","FFKGPADFBPO"})
	String useTimes;
	
	@SerializedName(value="cardCost", alternate={"BFOPNIGLEMK","MPCBBHIOOJD"})
    List<cardCostInfo> cardCost;
	
	int id;
	
	String cardType;
	
	@SerializedName(value = "tagList", alternate = {"LDKBFGDBOKD","LKIILDFIPKC"})
    List<String> tagList;
	
	List<Integer> skillList;
	
	@SerializedName(value = "isPlayable", alternate={"FANGCKEJDOL","fangckejdol","DBNHFOFHBHA"})
	boolean isPlayable = false; //purely guess real name coz fuck
	
	
	public class cardCostInfo {
		@SerializedName(value = "costType", alternate={"CFKKLOGFHBH","BCGPIIPDEPC"})
		String costType;
		int count;
		
		public String getCostType() {
			return this.costType;
		}
		
		public int getCount() {
			return this.count;
		}
	}

    @Override
    public int getId() {
        return id;
    }
	
	public boolean isPlayable() {
		return isPlayable;
	}
	
	public List<Integer> getTagIdList() {
		List<Integer> tagIdList = new ArrayList<>();
		for (String tag : tagList) {
			if (!tag.equals("GCG_TAG_NONE")) {
				tagIdList.add(GcgTagType.getTypeByName(tag).getId());
			}
		}
		return tagIdList;
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

		List<Uint32Pair> costMap = new ArrayList<>();
		for (cardCostInfo costData : this.cardCost) {
			if (costData.costType != null) {
				costMap.add(Uint32Pair.newBuilder()
							.setKey(costTypeToDiceCostMap.getOrDefault(costData.costType,10))
							.setValue(costData.count)
							.build());
			} else {}
		}
		return costMap;
	}
    @Override
    public void onLoad() {
        //super.onLoad();
		//Grasscutter.getLogger().info("GcgCardData: " + this.id + " , " + this.skillList.toString());
    }
}
