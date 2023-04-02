package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.Grasscutter;

import emu.grasscutter.net.proto.GCGInitFinishReqOuterClass.GCGInitFinishReq;

import emu.grasscutter.server.packet.send.PacketGCGInitFinishRsp;
import emu.grasscutter.server.packet.send.PacketGCGMessagePackNotify;

@Opcodes(PacketOpcodes.GCGInitFinishReq)
public class HandlerGCGInitFinishReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        session.send(new PacketGCGInitFinishRsp(session.getPlayer(),0));		
		//test send only once
		session.getPlayer().getGcgManager().initFinish(session.getPlayer());
		//session.send(new PacketGCGMessagePackNotify(session.getPlayer()));
    }

}
