package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.Grasscutter;

import emu.grasscutter.net.proto.GCGOperationReqOuterClass.GCGOperationReq;
import emu.grasscutter.net.proto.GCGOperationOuterClass.GCGOperation;

import emu.grasscutter.server.packet.send.PacketGCGOperationRsp;
import emu.grasscutter.server.packet.send.PacketGCGMessagePackNotify;

@Opcodes(PacketOpcodes.GCGOperationReq)
public class HandlerGCGOperationReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		GCGOperationReq req = GCGOperationReq.parseFrom(payload);
		//GCGOperationReq
		  //uint32 redirect_uid = 12;
		  //uint32 op_seq = 10;
		  //GCGOperation op = 8;
		
		//GCGOperation
		  //oneof op {
			//GCGOperationRedraw op_redraw = 3;
			//GCGOperationOnStageSelect op_select_on_stage = 9;
			//GCGOperationReroll op_reroll = 4;
			//GCGOperationAttack op_attack = 7;
			//GCGOperationPass op_pass = 6;
			//GCGOperationPlayCard op_play_card = 15;
			//GCGOperationReboot op_reboot = 5;
			//GCGOperationSurrender op_surrender = 10;
		//}
		
		//debug
		Grasscutter.getLogger().info("REQ:\n{}",req.toString());
		
		session.getPlayer().getGcgManager().operationHandle(session.getPlayer(), req);
		
		//session.send(new PacketGCGMessagePackNotify(yay));
		//int retcode = 0;
        //session.send(new PacketGCGOperationRsp(req.getOpSeq(), retcode));
    }

}
