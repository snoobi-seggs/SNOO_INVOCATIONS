package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify;

public class PacketGCGGrowthLevelRewardNotify extends BasePacket {

    public PacketGCGGrowthLevelRewardNotify(Player player) {
        super(PacketOpcodes.GCGGrowthLevelRewardNotify);
		
		//repeated uint32 level_reward_taken_list = 2;
		  
		GCGGrowthLevelRewardNotify.Builder proto = GCGGrowthLevelRewardNotify.newBuilder();
		
		player.getGcgRewardedLevels().forEach(level -> proto.addLevelRewardTakenList(level));
		
        this.setData(proto.build());
    }
}
