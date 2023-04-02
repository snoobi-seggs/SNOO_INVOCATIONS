package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.gcg.GcgNpc;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import emu.grasscutter.net.proto.GCGWeekChallengeInfoNotifyOuterClass.GCGWeekChallengeInfoNotify;
import emu.grasscutter.net.proto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo;

import java.util.*;

public class PacketGCGWeekChallengeInfoNotify extends BasePacket {

    public PacketGCGWeekChallengeInfoNotify(Player player, boolean isNotifyNpcChange) {
        super(PacketOpcodes.GCGWeekChallengeInfoNotify);
		
		//GCGWeekChallengeInfoNotify
		  //repeated GCGWeekChallengeInfo challenge_info_list = 3;
		  //uint32 next_refresh_time = 4;
		  //bool is_notify_npc_change = 7;
		  
		  
		//GCGWeekChallengeInfo
		  //bool is_finished
		  //uint32 npc_id
		  //uint64 unlock_time
		  
		Map<Integer,GcgNpc> tavernNpcs = player.getGcgManager().getTavernNpcs();
		List<Integer> weeklyNpcIds = player.getGcgManager().getWeeklyNpcIds();
		
		GCGWeekChallengeInfoNotify.Builder proto = GCGWeekChallengeInfoNotify.newBuilder()
														.setNextRefreshTime((int) (System.currentTimeMillis() / 1000) + 18000) 
														.setIsNotifyNpcChange(isNotifyNpcChange);
														
		
		for (GcgNpc npc : tavernNpcs.values()) {
			if (weeklyNpcIds.contains(npc.getId())) {
				proto.addChallengeInfoList(GCGWeekChallengeInfo.newBuilder()
											.setIsFinished(false)
											.setNpcId(npc.getId())
											.setUnlockTime(0)
											.build());
			}
		}
		
		this.setData(proto.build());
    }
}
