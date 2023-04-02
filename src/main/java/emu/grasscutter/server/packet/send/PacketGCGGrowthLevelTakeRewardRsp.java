package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import java.util.*;


import emu.grasscutter.net.proto.GCGGrowthLevelTakeRewardRspOuterClass.GCGGrowthLevelTakeRewardRsp;

public class PacketGCGGrowthLevelTakeRewardRsp extends BasePacket {

    public PacketGCGGrowthLevelTakeRewardRsp(int level, int rewardId) {
        super(PacketOpcodes.GCGGrowthLevelTakeRewardRsp);
		
		//int32 retcode = 4;
		//uint32 level = 11;
		
		int retcode = 0;

        if (rewardId == 0) {
            retcode = 1;
        }
		  
		List<Integer> ret = List.of();
		GCGGrowthLevelTakeRewardRsp proto = GCGGrowthLevelTakeRewardRsp.newBuilder()
												.setLevel(level)
												.setRetcode(retcode)
												.build();

        this.setData(proto);
    }
}
