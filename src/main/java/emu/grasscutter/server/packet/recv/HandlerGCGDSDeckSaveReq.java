package emu.grasscutter.server.packet.recv;

import emu.grasscutter.game.gcg.GcgManager;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.Grasscutter;

import emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq;


@Opcodes(PacketOpcodes.GCGDSDeckSaveReq)
public class HandlerGCGDSDeckSaveReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		//GCGDSDeckSaveReq
		  //uint32 deck_id = 4;
		  //repeated uint32 card_list = 11;
		  //repeated uint32 character_card_list = 6;
		  //string name = 5;
		GCGDSDeckSaveReq req = GCGDSDeckSaveReq.parseFrom(payload);
		//debug
		//Grasscutter.getLogger().debug(req.toString());
        session.getPlayer().getGcgManager().editDeck(req.getDeckId(), req.getCardListList(), req.getCharacterCardListList(), req.getName());
    }
}
