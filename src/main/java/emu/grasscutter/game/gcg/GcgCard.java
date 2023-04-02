package emu.grasscutter.game.gcg;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.*;

import emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder(builderMethodName = "of")
public class GcgCard {
	@Id
	//vars
	@Getter @Setter private int cardId;                  //card id for reference
	@Getter @Setter private int faceType;                //0 for default 1 for golden
	@Getter @Setter private int num;                     //??? i think it is the amt of card u have of this kind
	@Getter @Setter private int proficiency;             //number of card wins
	@Getter @Setter private List<Integer> proficiencyRewardTakenIdxList; //taken or not reward list
	@Getter @Setter private List<Integer> unlockedFaceTypeList; //unlocked golden skin list
	
	//retard func
	public int getId() {
		return this.cardId;
	}
	
	//constructor
	public GcgCard(int cardId) {
		this(cardId, 0, 1, 0, List.of(), List.of());
	}
	
	public GcgCard(int cardId, int faceType, int num, int proficiency, List<Integer> proficiencyRewardTakenIdxList, List<Integer> unlockedFaceTypeList) {
		this.cardId = cardId;
		this.faceType = faceType;
		this.num = num;
		this.proficiency = proficiency;
		this.proficiencyRewardTakenIdxList = proficiencyRewardTakenIdxList;
		this.unlockedFaceTypeList = unlockedFaceTypeList;
	}
	
	//unused but incase got many same npc on diff chair
	public GcgCard clone() {
		return new GcgCard(cardId, faceType, num, proficiency, proficiencyRewardTakenIdxList, unlockedFaceTypeList);
	}
	
	public GCGDSCardData toProto() {
		GCGDSCardData proto = GCGDSCardData.newBuilder()
								.setCardId(cardId)
								.setFaceType(faceType)
								.setNum(num)
								.setProficiency(proficiency)
								.addAllProficiencyRewardTakenIdxList(proficiencyRewardTakenIdxList)
								.addAllUnlockFaceTypeList(unlockedFaceTypeList)
								.build();
		return proto;
	}
}