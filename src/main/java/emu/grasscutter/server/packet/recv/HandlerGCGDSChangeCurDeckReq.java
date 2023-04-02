package emu.grasscutter.server.packet.recv;

import emu.grasscutter.game.gcg.GcgManager;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketGCGDSChangeCurDeckRsp;
import emu.grasscutter.Grasscutter;

import emu.grasscutter.net.proto.GCGDSChangeCurDeckReqOuterClass.GCGDSChangeCurDeckReq;


@Opcodes(PacketOpcodes.GCGDSChangeCurDeckReq)
public class HandlerGCGDSChangeCurDeckReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		GCGDSChangeCurDeckReq req = GCGDSChangeCurDeckReq.parseFrom(payload);
		//debug
		Grasscutter.getLogger().info("SET ACTIVE DECK {}",req.getDeckId());
		
		if (session.getPlayer().getGcgManager().setActiveDeck(req.getDeckId())) {
			session.send(new PacketGCGDSChangeCurDeckRsp(req.getDeckId()));
        } else {
			session.send(new PacketGCGDSChangeCurDeckRsp(req.getDeckId(), 1)); //RET_GCG_DS_DECK_INVALID
		}
    }
}
