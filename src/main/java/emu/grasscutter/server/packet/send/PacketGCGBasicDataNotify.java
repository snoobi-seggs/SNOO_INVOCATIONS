package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import java.util.*;


import emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify;

public class PacketGCGBasicDataNotify extends BasePacket {

    public PacketGCGBasicDataNotify(Player player) {
        super(PacketOpcodes.GCGBasicDataNotify);
		
		  //uint32 level = 6;
		  //uint32 exp = 4;
		  //repeated uint32 level_reward_taken_list = 14;
		  
		GCGBasicDataNotify proto = GCGBasicDataNotify.newBuilder()
										.setLevel(10)
										.setExp(0)
										.addAllLevelRewardTakenList(player.getGcgRewardedLevels())
										.build();

        this.setData(proto);
    }
}
