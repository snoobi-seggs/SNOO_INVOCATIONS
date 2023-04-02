package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import java.util.*;

import emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge;
import emu.grasscutter.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify;
import emu.grasscutter.net.proto.GCGLevelTypeOuterClass.GCGLevelType;

public class PacketGCGChallengeUpdateNotify extends BasePacket {

    public PacketGCGChallengeUpdateNotify(int levelId, GCGLevelType levelType, int configId) {
        super(PacketOpcodes.GCGChallengeUpdateNotify);
		
		//GCGChallengeUpdateNotify
		  //uint32 server_seq = 15;
		  //GCGDuelChallenge challenge = 1;
		  
		//GCGDuelChallenge
		  //uint32 challenge_id = 12;
		  //uint32 cur_progress = 2;
		  //uint32 total_progress = 4;
		
		List<Integer> ret = List.of();
		  
		GCGDuelChallenge challenge = GCGDuelChallenge.newBuilder()
										.setChallengeId(904)
										.setCurProgress(1)
										.setTotalProgress(1)
										.build();
		  
		GCGChallengeUpdateNotify proto = GCGChallengeUpdateNotify.newBuilder()
												.setServerSeq(9)
												.setChallenge(challenge)
												.build();

        this.setData(proto);
    }
}
