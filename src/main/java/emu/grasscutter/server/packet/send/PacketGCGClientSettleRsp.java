package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import emu.grasscutter.net.proto.GCGClientSettleRspOuterClass.GCGClientSettleRsp;

public class PacketGCGClientSettleRsp extends BasePacket {

    public PacketGCGClientSettleRsp() {
        super(PacketOpcodes.GCGClientSettleRsp);
		  
		GCGClientSettleRsp proto = GCGClientSettleRsp.newBuilder()
									.setCloseTime((int) (System.currentTimeMillis() / 1000) + 1000)
									.setRetcode(0)
									.build();
		
        this.setData(proto);
    }
}
