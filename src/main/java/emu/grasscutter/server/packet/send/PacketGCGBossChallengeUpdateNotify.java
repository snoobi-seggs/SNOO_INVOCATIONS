package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import java.util.*;


import emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify;
import emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData;

public class PacketGCGBossChallengeUpdateNotify extends BasePacket {

    public PacketGCGBossChallengeUpdateNotify(Player player) {
        super(PacketOpcodes.GCGBossChallengeUpdateNotify);
		
		//GCGBossChallengeUpdateNotify
		  //GCGBossChallengeData boss_challenge = 7;
		
		//GCGBossChallengeData
		  //repeated uint32 unlock_level_id_list = 3;
		  //uint32 id = 10;
		
		//test oceanid
		GCGBossChallengeData bossChallengeData = GCGBossChallengeData.newBuilder()
													.setId(2)
													.addAllUnlockLevelIdList(List.of(230101))
													.build();
													
		GCGBossChallengeUpdateNotify proto = GCGBossChallengeUpdateNotify.newBuilder()
												.setBossChallenge(bossChallengeData)  // TODO implement this in a manager
												.build();

        this.setData(proto);
    }
}
