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

import emu.grasscutter.net.proto.GCGDSDeckDataOuterClass.GCGDSDeckData;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder(builderMethodName = "of")
public class GcgDeck {
	@Id
	//vars
	@Getter @Setter private int id;                          //deck id for reference
	@Getter @Setter private int createTime;                  //create deck time real
	@Getter @Setter private int fieldId;                     //table design
	@Getter @Setter private int cardBackId;                  //card back design
	@Getter @Setter private List<Integer> cardList = new ArrayList<>();          //cardId in deck (not material ones fyi)
	@Getter @Setter private List<Integer> characterCardList = new ArrayList<>(); //characterCardIds that appear in front of deck , size is 3
	@Getter @Setter private String name;                     //deck name
	
	@Getter @Setter private boolean isValid = true;          //TODO: implement a deck validator        
	
	//constructor
	public GcgDeck(int id) {
		this(id, (int) System.currentTimeMillis() / 1000, 0, 0, List.of(), List.of(), "My Deck");
	}
	
	public GcgDeck(int id, int createTime, int fieldId, int cardBackId, List<Integer> cardList, List<Integer> characterCardList, String name) {
		this(id, createTime, fieldId, cardBackId, cardList, characterCardList, name, true);
	}
	
	public GcgDeck(int id, int createTime, int fieldId, int cardBackId, List<Integer> cardList, List<Integer> characterCardList, String name, boolean isValid) {
		this.id = id;
		this.createTime = createTime;
		this.fieldId = fieldId;
		this.cardBackId = cardBackId;
		this.cardList = cardList;
		this.characterCardList = characterCardList;
		this.name = name;
		this.isValid = isValid;
	}
	
	//unused but incase got many same npc on diff chair
	public GcgDeck clone() {
		return new GcgDeck(id, createTime, fieldId, cardBackId, cardList, characterCardList, name);
	}
	
	public GCGDSDeckData toProto() {
		GCGDSDeckData proto = GCGDSDeckData.newBuilder()
								.setId(id)
								.setCreateTime(createTime)
								.setFieldId(fieldId)
								.setCardBackId(cardBackId)
								.addAllCardList(cardList)
								.addAllCharacterCardList(characterCardList)
								.setName(name)
								.setIsValid(isValid)
								.build();
		return proto;
	}
}