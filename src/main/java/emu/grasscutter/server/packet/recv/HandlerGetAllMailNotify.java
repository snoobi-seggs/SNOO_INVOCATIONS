package emu.grasscutter.server.packet.recv;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.GetAllMailNotifyOuterClass.GetAllMailNotify;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketGetAllMailResultNotify;

@Opcodes(PacketOpcodes.GetAllMailNotify)
public class HandlerGetAllMailNotify extends PacketHandler {
	//idk what is this ngl
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        GetAllMailNotify req = GetAllMailNotify.parseFrom(payload);
		//debug
		//Grasscutter.getLogger().warn("received GetAllMailNotify with params {}.",req.toString());
		session.send(new PacketGetAllMailResultNotify(session.getPlayer(), req.getIsCollected()));
    }
}
