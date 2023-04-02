/*package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData;
import emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify;

import java.util.*;

public class PacketGCGTCTavernChallengeDataNotify extends BasePacket {

    public PacketGCGTCTavernChallengeDataNotify(int charId, int levelId) {
        super(PacketOpcodes.GCGTCTavernChallengeDataNotify);
		
		//proto itself
		//repeated GCGTCTavernChallengeData tavern_challenge;
		
		//GCGTCTavernChallengeData
		//repeated uint32 unlock_level_id_list = 13;
		//uint32 character_id = 4;
		
		GCGTCTavernChallengeData challengeData = GCGTCTavernChallengeData.newBuilder()
													.setCharacterId(charId)
													.addAllUnlockLevelIdList(List.of(levelId))
													.build();
		  
		GCGTCTavernChallengeDataNotify proto = GCGTCTavernChallengeDataNotify.newBuilder()
													.addAllTavernChallengeList(List.of()) //unimplemented
													.build();


        this.setData(proto);
    }
}*/
