package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import emu.grasscutter.net.proto.GCGOperationRspOuterClass.GCGOperationRsp;

public class PacketGCGOperationRsp extends BasePacket {

    public PacketGCGOperationRsp(int opSeq, int retcode) {
        super(PacketOpcodes.GCGOperationRsp);
		
		  //uint32 op_seq = 8;
		  //int32 retcode = 7;
		  
		GCGOperationRsp proto = GCGOperationRsp.newBuilder()
									.setOpSeq(opSeq)
									.setRetcode(retcode)
									.build();
		
        this.setData(proto);
    }
}
