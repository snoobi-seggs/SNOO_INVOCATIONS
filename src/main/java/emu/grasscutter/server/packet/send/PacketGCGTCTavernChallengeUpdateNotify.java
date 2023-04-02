package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData;
import emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify;

import java.util.*;

public class PacketGCGTCTavernChallengeUpdateNotify extends BasePacket {

    public PacketGCGTCTavernChallengeUpdateNotify(int charId, int levelId) {
        super(PacketOpcodes.GCGTCTavernChallengeUpdateNotify);
		
		//proto itself
		//GCGTCTavernChallengeData tavern_challenge = 12;
		
		//GCGTCTavernChallengeData
		//repeated uint32 unlock_level_id_list = 13;
		//uint32 character_id = 4;
		
		GCGTCTavernChallengeData challengeData = GCGTCTavernChallengeData.newBuilder()
													.setCharacterId(charId)
													.addAllUnlockLevelIdList(List.of(levelId))
													.build();
		  
		GCGTCTavernChallengeUpdateNotify proto = GCGTCTavernChallengeUpdateNotify.newBuilder()
													.setTavernChallenge(challengeData)
													.build();


        this.setData(proto);
    }
}
