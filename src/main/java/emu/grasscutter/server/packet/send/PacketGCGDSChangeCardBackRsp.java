package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp;

public class PacketGCGDSChangeCardBackRsp extends BasePacket {

    public PacketGCGDSChangeCardBackRsp(int cardBackId, int deckId, int retcode) {
		super(PacketOpcodes.GCGDSChangeCardBackRsp);
		
		GCGDSChangeCardBackRsp proto = GCGDSChangeCardBackRsp.newBuilder()
									.setCardBackId(cardBackId)
									.setDeckId(deckId)
									.setRetcode(retcode)
									.build();
		
        this.setData(proto);
	}
	
    public PacketGCGDSChangeCardBackRsp(int cardBackId, int deckId) {
        super(PacketOpcodes.GCGDSChangeCardBackRsp);
		
		GCGDSChangeCardBackRsp proto = GCGDSChangeCardBackRsp.newBuilder()
									.setCardBackId(cardBackId)
									.setDeckId(deckId)
									.setRetcode(0)
									.build();
		
        this.setData(proto);
    }
}
