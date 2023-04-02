package emu.grasscutter.game.gcg;

import lombok.Getter;
import lombok.Setter;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.excels.*;
import emu.grasscutter.game.gcg.enums.*;
import emu.grasscutter.game.gcg.enums.GcgCardValueType.*;

import java.util.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder(builderMethodName = "of")
public class GcgGameCardDetail {
	//common vars
	@Getter @Setter private int guid;                       //card guid for reference (repeat info frm map key)
	@Getter @Setter private int cardId;						//charId or cardId for datamap pull
	@Getter @Setter private GcgElementType elementType;		//char or card elementType
	
	//cardType char or not char
	@Getter @Setter GcgCardType cardType;
	
	//char var
	@Getter @Setter private int maxHp;
	@Getter @Setter private int curHp;
	@Getter @Setter private int maxEnergy;
	@Getter @Setter private int curEnergy;
	@Getter @Setter private GcgCharData gcgCharData;		//one of
	@Getter @Setter private List<Integer> elementalTags;	//elemental aura, check reaction per attack
	
	//card var
	@Getter @Setter private int useTimes;
	@Getter @Setter private GcgCardData gcgCardData;		//one of
	
	//constructor (why tho)	
	//public GcgGameCardDetail(int guid) {
	//	this.guid = guid;
	//}
	
	//unused but incase got many same npc on diff chair
	//public GcgGameCardDetail clone() {
	//	return new GcgGameCardDetail(guid);
	//}
	
	//changeToken
	public int changeCardValue(GcgCardValueType type, int newValue) {
		newValue = newValue >= 0 ? newValue : 0; //cannot be below 0
		switch (type) {
			case GCG_CARD_VALUE_NONE -> Grasscutter.getLogger().warn("Called GCG_CARD_TYPE_NONE with {}",newValue);
			case GCG_CARD_VALUE_MAX_HP -> this.maxHp = newValue;
			case GCG_CARD_VALUE_CUR_HP -> this.curHp = newValue;	//already 0 checked
			case GCG_CARD_VALUE_MAX_ENERGY -> this.maxEnergy = newValue;
			case GCG_CARD_VALUE_CUR_ENERGY -> {
				if (cardType == GcgCardType.GCG_CHAR) {	//ensure this only applies to characater type cards
					Grasscutter.getLogger().warn("NEW ENERGY = {}, MAX ENERGY = {}",newValue,maxEnergy);
					this.curEnergy = newValue <= maxEnergy ? newValue : maxEnergy;	//cannot exceed max energy (actly client wldnt reject but for bug keeping)
					return this.curEnergy;
				}
			}
			case GCG_CARD_VALUE_USE_TIMES -> this.useTimes = newValue;
			default -> Grasscutter.getLogger().warn("Called unknown GCG_ENUM_TYPE with ",newValue);
		}
		return newValue; //0 >
	}
	
	//elemental aura from GcgTokenType.getId()
	public void addElementalAura(int tokenId) {
		//add if it not contain
		if (!this.elementalTags.contains(tokenId)) {
			this.elementalTags.add(tokenId);
		} else {}
		return;
	}
	
	public void removeElementalAura(int tokenId) {
		this.removeElementalAura(List.of(tokenId));
	}
	
	public void removeElementalAura(List<Integer> tokenIds) {
		//remove if contains else ignore
		for (int tokenId : tokenIds) {
			if (this.elementalTags.contains(tokenId)) {
				int index = this.elementalTags.indexOf(tokenId);
				this.elementalTags.remove(index);
			} else {}
		}
	}
	
	//when die
	public void clearElementalAura() {
		this.elementalTags = new ArrayList<Integer>();
	}
	
	//card type enum either char or card
	public enum GcgCardType {
		GCG_CHAR,
		GCG_CARD
	}
}