package emu.grasscutter.data.binout;

import emu.grasscutter.Grasscutter;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.*;

@Data
public class GcgConfigSkill {
	private String $type;	//ConfigGCGSkill always afaik
	
	//important ones
	private String name;	//gcgskilldatamap -> in there this is the id
	
	private Map<String,GcgDeclaredValue> declaredValueMap; //"__KEY__SMTH" -> {$type,type,value}
	
	private List<GcgTrigger> triggerList;	//[$type,type,condition;type]
   
	private List<GcgEffect> effectList;
	
	//getters
    public String getId() {	//for dumb shit who dk how use getName
        return name;
    }

    public String getType() {
        return $type;
    }
	
	public String toString() {
		return "GcgConfigSkill :\n" + name +
				"\nDECLARED_VALUE_MAP:\n    " + declaredValueMap.toString() +
				"\n\nTRIGGER_LIST:\n    " + triggerList.toString() +
				"\n\nEFFECT_LIST:\n    " + effectList.toString();
	}
	
	public static class GcgDeclaredValue {
		private String $type;
		@Getter private String type;
		@Getter private String value;
		
		public String getDeclareType() {
			return $type;
		}
		
		public String toString() {
			return " type : " + type +" | value : " + value + "\n        ";
		}
	}
	
	public static class GcgTrigger {
		private String $type;
		@Getter private String type;
		@Getter private GcgLogicCondition condition;
		
		public String getDeclareType() {
			return $type;
		}
		
		public String toString() {
			return " type : " + type +" | condition : " + condition + "\n        ";
		}
	}
	
	public static class GcgEffect {
		private String $type;
		@Getter private GcgLogicCondition condition;
		@Getter private String targetCamp;
		@Getter private String targetCharacter;
		@Getter private GcgDeclare declaredDamage;
		@Getter private GcgDeclare declaredElement;
		@Getter private boolean isUseSetDamageElement; //??
		@Getter private int targetNeedMinHp;
		
		public String getDeclareType() {
			return $type;
		}
		
		public String toString() {
			return "GCGEFFECT :\n" + getDeclareType() +
					"\n        condition : " + condition +
					"\n        targetCamp : " + targetCamp +
					"\n        targetCharacter : " + targetCharacter +
					"\n        declaredDamage : " + declaredDamage +
					"\n        declaredElement : " + declaredElement +
					"\n        isUseSetDamageElement : " + isUseSetDamageElement +
					"\n        targetNeedMinHp : " + targetNeedMinHp;
		}
		
		public static class GcgDeclare {
			private String $type;
			@Getter private String key;
			
			public String getDeclareType() {
				return $type;
			}
			
			public String toString() {
				return "$type : " + getDeclareType() + " | key : " + key;
			}
		}
	}

    public void onLoad() {
        //if (name.equals("Effect_Damage_Physic_2") ||  name.equals("Char_Skill_14012")) {
		//	Grasscutter.getLogger().warn(this.toString());
		//}
    }
	
	public static class GcgLogicCondition {
		private String $type;
		@Getter List<GcgLogicCondition> conditions;	//why tf class in class
		
		public String getDeclareType() {
			return $type;
		}
		
		public String toString() {
			return "[$type : " + getDeclareType() + " | conditions : " + conditions + "]";
		}
	}
}
