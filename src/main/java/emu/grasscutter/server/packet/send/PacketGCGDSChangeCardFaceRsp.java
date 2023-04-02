package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import emu.grasscutter.net.proto.GCGDSChangeCardFaceRspOuterClass.GCGDSChangeCardFaceRsp;

public class PacketGCGDSChangeCardFaceRsp extends BasePacket {

    public PacketGCGDSChangeCardFaceRsp(int cardId, int faceType, int retcode) {
		super(PacketOpcodes.GCGDSChangeCardFaceRsp);
		
		GCGDSChangeCardFaceRsp proto = GCGDSChangeCardFaceRsp.newBuilder()
									.setCardId(cardId)
									.setFaceType(faceType)
									.setRetcode(retcode)
									.build();
		
        this.setData(proto);
	}
	
    public PacketGCGDSChangeCardFaceRsp(int cardId, int faceType) {
        super(PacketOpcodes.GCGDSChangeCardFaceRsp);
		
		GCGDSChangeCardFaceRsp proto = GCGDSChangeCardFaceRsp.newBuilder()
									.setCardId(cardId)
									.setFaceType(faceType)
									.setRetcode(0)
									.build();
		
        this.setData(proto);
    }
}
