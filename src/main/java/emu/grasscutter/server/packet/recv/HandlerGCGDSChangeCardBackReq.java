package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.Grasscutter;

import emu.grasscutter.net.proto.GCGDSChangeCardBackReqOuterClass.GCGDSChangeCardBackReq;

import emu.grasscutter.server.packet.send.PacketGCGDSChangeCardBackRsp;

@Opcodes(PacketOpcodes.GCGDSChangeCardBackReq)
public class HandlerGCGDSChangeCardBackReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		GCGDSChangeCardBackReq req = GCGDSChangeCardBackReq.parseFrom(payload);
        boolean isSuccess = session.getPlayer().getGcgManager().changeCardBack(req.getCardBackId(),req.getDeckId());
		
		if (isSuccess) {
			session.send(new PacketGCGDSChangeCardBackRsp(req.getCardBackId(), req.getDeckId()));
		} else {
			session.send(new PacketGCGDSChangeCardBackRsp(req.getCardBackId(), req.getDeckId(), 12214));	//RET_GCG_DS_CARD_BACK_LOCKED = 12214;
		}
    }

}
