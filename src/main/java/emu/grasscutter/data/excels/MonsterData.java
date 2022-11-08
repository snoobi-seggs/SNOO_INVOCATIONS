package emu.grasscutter.data.excels;

import java.util.List;
import java.util.Map.Entry;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.GameData;
import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import emu.grasscutter.data.ResourceType.LoadPriority;
import emu.grasscutter.data.common.PropGrowCurve;
import emu.grasscutter.game.props.MonsterType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@ResourceType(name = "MonsterExcelConfigData.json", loadPriority = LoadPriority.LOW)
@EqualsAndHashCode(callSuper=false)
@Data
public class MonsterData extends GameResource {
	private int id;
	
	private String monsterName;
    private MonsterType type;
    private String serverScript;
    private List<Integer> affix;
    private String ai;
    private int[] equips;
    private List<HpDrops> hpDrops;
    private int killDropId;
    private String excludeWeathers;
    private int featureTagGroupID;
    private int mpPropID;
    private String skin;
    private int describeId;
    private int combatBGMLevel;
    private int entityBudgetLevel;
    private float hpBase;
    private float attackBase;
    private float defenseBase;
    private float fireSubHurt;
    private float elecSubHurt;
    private float grassSubHurt;
    private float waterSubHurt;
    private float windSubHurt;
    private float rockSubHurt;
    private float iceSubHurt;
    private float physicalSubHurt;
    private List<PropGrowCurve> propGrowCurves;
    private long nameTextMapHash;
    private int campID;
    
    // Transient
    private int weaponId;
    private MonsterDescribeData describeData;
	private int specialNameId; // will only be set if describe data is available
    
	@Override
	public int getId() {
		return this.id;
	}

	public float getBaseHp() {
		return hpBase;
	}

	public float getBaseAttack() {
		return attackBase;
	}

	public float getBaseDefense() {
		return defenseBase;
	}

	@Override
	public void onLoad() {
		for (int id : this.equips) {
			if (id == 0) {
				continue;
			}
			GadgetData gadget = GameData.getGadgetDataMap().get(id);
			if (gadget == null) {
				continue;
			}
			if (gadget.getItemJsonName().equals("Default_MonsterWeapon")) {
				this.weaponId = id;
			}
		}

		this.describeData = GameData.getMonsterDescribeDataMap().get(this.getDescribeId());

		if (this.describeData == null){
			return;
		}
		for(Entry<Integer, MonsterSpecialNameData> entry: GameData.getMonsterSpecialNameDataMap().entrySet()) {
			if (entry.getValue().getSpecialNameLabId() == this.getDescribeData().getSpecialNameLabId()){
				this.specialNameId = entry.getKey();
				break;
			}
		}
	}
	
	public class HpDrops {
	    private int DropId;
	    private int HpPercent;

	    public int getDropId(){
	        return this.DropId;
	    }
	    public int getHpPercent(){
	        return this.HpPercent;
	    }
	}
}
