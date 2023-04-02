package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.Grasscutter;

import emu.grasscutter.net.proto.GCGDSChangeCardFaceReqOuterClass.GCGDSChangeCardFaceReq;

import emu.grasscutter.server.packet.send.PacketGCGDSChangeCardFaceRsp;

@Opcodes(PacketOpcodes.GCGDSChangeCardFaceReq)
public class HandlerGCGDSChangeCardFaceReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		GCGDSChangeCardFaceReq req = GCGDSChangeCardFaceReq.parseFrom(payload);
		
        boolean isSuccess = session.getPlayer().getGcgManager().changeCardFace(req.getCardId(),req.getFaceType());
		
		if (isSuccess) {
			session.send(new PacketGCGDSChangeCardFaceRsp(req.getCardId(), req.getFaceType()));
		} else {
			session.send(new PacketGCGDSChangeCardFaceRsp(req.getCardId(), req.getFaceType(), 12210));	//RET_GCG_DS_CARD_FACE_IS_LOCK = 12210;
		}
    }

}
