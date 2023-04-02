package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;


import emu.grasscutter.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify;

public class PacketGCGGrowthLevelNotify extends BasePacket {

    public PacketGCGGrowthLevelNotify(int level,int exp) {
        super(PacketOpcodes.GCGGrowthLevelNotify);
		
		//uint32 level = 10;
		//uint32 exp = 2;
		
		GCGGrowthLevelNotify proto = GCGGrowthLevelNotify.newBuilder()
										.setLevel(level)
										.setExp(exp)
										.build();


        this.setData(proto);
    }
}
