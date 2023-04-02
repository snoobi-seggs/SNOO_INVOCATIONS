package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import emu.grasscutter.net.proto.GCGSettleOptionOuterClass.GCGSettleOption;
import emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp;

public class PacketGCGSettleOptionRsp extends BasePacket {

    public PacketGCGSettleOptionRsp(GCGSettleOption option) {
        super(PacketOpcodes.GCGSettleOptionRsp);
		  
		GCGSettleOptionRsp proto = GCGSettleOptionRsp.newBuilder()
									.setOption(option)
									.setRetcode(0)
									.build();
		
        this.setData(proto);
    }
}
