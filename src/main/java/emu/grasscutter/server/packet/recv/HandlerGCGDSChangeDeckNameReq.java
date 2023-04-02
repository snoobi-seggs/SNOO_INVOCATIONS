package emu.grasscutter.server.packet.recv;

import emu.grasscutter.game.gcg.GcgManager;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketGCGDSChangeDeckNameRsp;
import emu.grasscutter.Grasscutter;

import emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq;


@Opcodes(PacketOpcodes.GCGDSChangeDeckNameReq)
public class HandlerGCGDSChangeDeckNameReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		GCGDSChangeDeckNameReq req = GCGDSChangeDeckNameReq.parseFrom(payload);
		//debug
		Grasscutter.getLogger().info(req.toString());
		
		if (session.getPlayer().getGcgManager().setDeckName(req.getDeckId(),req.getName())) {
			session.send(new PacketGCGDSChangeDeckNameRsp(req.getDeckId(), req.getName()));
        } else {
			session.send(new PacketGCGDSChangeDeckNameRsp(req.getDeckId(), req.getName(), 12202)); //RET_GCG_DS_DECK_NAME_INVALID
		}
    }
}
