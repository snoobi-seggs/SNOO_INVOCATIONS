package emu.grasscutter.server.packet.recv;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.Grasscutter;

import emu.grasscutter.net.proto.GCGTCInviteReqOuterClass.GCGTCInviteReq;

import emu.grasscutter.server.packet.send.*;

@Opcodes(PacketOpcodes.GCGTCInviteReq)
public class HandlerGCGTCInviteReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		GCGTCInviteReq req = GCGTCInviteReq.parseFrom(payload);
		
		//GCGTCInviteReq proto
		//  uint32 character_id = 8;
		//  uint32 level_id = 11;
		
		//get vars owo
		Player player = session.getPlayer();
		int charId = req.getCharacterId();
		int levelId = req.getLevelId();
		
		//debug
		Grasscutter.getLogger().info("GCGTCInviteReq: " + req.toString());
		
		// add to current npcs
		player.getGcgManager().inviteCharacter(charId,levelId,1);// hardcode pointId to 1, currently this method does not send a notify
		
		// invite packets
		session.send(new PacketGCGTCTavernInfoNotify(player,charId,levelId,1)); //hardcode point id
		session.send(new PacketGCGTavernNpcInfoNotify(player));
        session.send(new PacketGCGTCInviteRsp(charId,0));
    }

}
