package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.gcg.GcgNpc;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify;

public class PacketGCGTCTavernInfoNotify extends BasePacket {
	
	// TODO read frm db since logging out should not reset invited char frm tavern
	
	//on login
    public PacketGCGTCTavernInfoNotify(Player player) {
		super(PacketOpcodes.GCGTCTavernInfoNotify);
		
		int currentInvitedCharId = player.getGcgManager().getCurrentInvitedCharId();
		GcgNpc npc = player.getGcgManager().getTavernNpcs().get(currentInvitedCharId);
		
		if (npc != null) {
			new PacketGCGTCTavernInfoNotify(player, 
											currentInvitedCharId,
											npc.getLevelId(),
											npc.getScenePointId());
		} else {
			new PacketGCGTCTavernInfoNotify(player, 0, 0, 0);
		}
    }
	
	//on invite character to tavern
	public PacketGCGTCTavernInfoNotify(Player player, int charId, int levelId, int pointId) {
        super(PacketOpcodes.GCGTCTavernInfoNotify);
		
		//GCGTCTavernInfoNotify
		  //uint32 level_id = 5;
		  //bool Unk3300_IMFJBNFMCHM = 11;
		  //bool Unk3300_MBGMHBNBKBK = 8;
		  //uint32 point_id = 4;
		  //uint32 element_type = 6;
		  //uint32 avatar_id = 9;
		  //uint32 character_id = 12;
		  
		int mainCharacterId = player.getMainCharacterId();
		
		int elementTypeId = player.getAvatars()
								.getAvatarById(mainCharacterId)
								.getSkillDepot()
								.getElementType()
								.getValue();
		  
		GCGTCTavernInfoNotify proto = GCGTCTavernInfoNotify.newBuilder()
										.setIsLastDuelWin(player.getGcgManager().isLastDuelWin())
										.setIsOwnerInDuel(player.getGcgManager().isInDuel())
										.setAvatarId(mainCharacterId)   //hardcoded sniff
										.setElementType(elementTypeId)  //read from excels todo
										.setCharacterId(charId)     //char npcId
										.setLevelId(levelId)        //stage level Id, this wld change for serious showdowns
										.setPointId(pointId)        //where they sit, as of now normal is 1 ad serious shld be in other room
										.build();


        this.setData(proto);
    }
}
