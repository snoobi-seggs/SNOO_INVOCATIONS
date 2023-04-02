package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import emu.grasscutter.net.proto.GCGDSChangeFieldRspOuterClass.GCGDSChangeFieldRsp;

public class PacketGCGDSChangeFieldRsp extends BasePacket {

    public PacketGCGDSChangeFieldRsp(int fieldId, int deckId, int retcode) {
		super(PacketOpcodes.GCGDSChangeFieldRsp);
		
		GCGDSChangeFieldRsp proto = GCGDSChangeFieldRsp.newBuilder()
									.setFieldId(fieldId)
									.setDeckId(deckId)
									.setRetcode(retcode)
									.build();
		
        this.setData(proto);
	}
	
    public PacketGCGDSChangeFieldRsp(int fieldId, int deckId) {
        super(PacketOpcodes.GCGDSChangeFieldRsp);
		
		GCGDSChangeFieldRsp proto = GCGDSChangeFieldRsp.newBuilder()
									.setFieldId(fieldId)
									.setDeckId(deckId)
									.setRetcode(0)
									.build();
		
        this.setData(proto);
    }
}
