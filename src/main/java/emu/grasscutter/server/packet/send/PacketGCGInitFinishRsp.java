package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import emu.grasscutter.net.proto.GCGInitFinishRspOuterClass.GCGInitFinishRsp;

public class PacketGCGInitFinishRsp extends BasePacket {

    public PacketGCGInitFinishRsp(Player player, int retcode) {
        super(PacketOpcodes.GCGInitFinishRsp);
		
		  //uint32 retcode only
		  
		GCGInitFinishRsp proto = GCGInitFinishRsp.newBuilder()
									.setRetcode(retcode)
									.build();
		
        this.setData(proto);
    }
}
