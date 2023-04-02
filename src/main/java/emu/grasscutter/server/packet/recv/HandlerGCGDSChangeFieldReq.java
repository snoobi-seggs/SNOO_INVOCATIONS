package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.Grasscutter;

import emu.grasscutter.net.proto.GCGDSChangeFieldReqOuterClass.GCGDSChangeFieldReq;

import emu.grasscutter.server.packet.send.PacketGCGDSChangeFieldRsp;

@Opcodes(PacketOpcodes.GCGDSChangeFieldReq)
public class HandlerGCGDSChangeFieldReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		GCGDSChangeFieldReq req = GCGDSChangeFieldReq.parseFrom(payload);
        boolean isSuccess = session.getPlayer().getGcgManager().changeField(req.getFieldId(),req.getDeckId());
		
		if (isSuccess) {
			session.send(new PacketGCGDSChangeFieldRsp(req.getFieldId(), req.getDeckId()));
		} else {
			session.send(new PacketGCGDSChangeFieldRsp(req.getFieldId(), req.getDeckId(), 12211));	//RET_GCG_DS_FIELD_LOCK = 12211;
		}
    }

}
