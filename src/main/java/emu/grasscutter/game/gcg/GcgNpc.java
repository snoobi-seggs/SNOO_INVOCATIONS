package emu.grasscutter.game.gcg;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder(builderMethodName = "of")
public class GcgNpc {
	@Id
	//vars
	@Getter @Setter private int npcId;
	@Getter @Setter private int levelId;
	@Getter @Setter private int scenePointId;
	
	//constructor
	public GcgNpc(int npcId, int levelId, int scenePointId) {
		this.npcId = npcId;
		this.levelId = levelId;
		this.scenePointId = scenePointId;
	}
	
	//for retards who cant use getNpcId()
	public int getId() {
		return this.npcId;
	}
	
	//unused but incase got many same npc on diff chair
	public GcgNpc clone() {
		return new GcgNpc(npcId, levelId, scenePointId);
	}
	
}