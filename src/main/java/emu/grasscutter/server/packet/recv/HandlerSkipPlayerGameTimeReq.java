package emu.grasscutter.server.packet.recv;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.game.quest.enums.QuestContent;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketPlayerGameTimeNotify;
import emu.grasscutter.server.packet.send.PacketSkipPlayerGameTimeRsp;

@Opcodes(PacketOpcodes.SkipPlayerGameTimeReq)
public class HandlerSkipPlayerGameTimeReq extends PacketHandler {

	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		SkipPlayerGameTimeReq req = SkipPlayerGameTimeReq.parseFrom(payload);
		
		//debug (TLDR : client_game_time is cur time, game_time is the new time. they are both in minutes. (2 days = 2880 mins)
		//Grasscutter.getLogger().info("\nSkipPlayerGameTimeReq DATA : \n{}\nCURRENT GAMETIME : {}",req.toString(),session.getPlayer().getWorld().getGameTime());
		
		//satan check (cannot be below 30 min diff or neg else is illegal time travel)
		if (req.getGameTime() - req.getClientGameTime() < 30) 	{
			session.getPlayer().sendPacket(new PacketSkipPlayerGameTimeRsp(1));
		} else {
			session.getPlayer().getWorld().changeTime(req.getGameTime());	//since client so nice help calc game time rn so dont need care abt extra days
			session.getPlayer().sendPacket(new PacketPlayerGameTimeNotify(session.getPlayer()));
			session.getPlayer().sendPacket(new PacketSkipPlayerGameTimeRsp(req.getClientGameTime(),req.getGameTime()));
		}
	}

}
