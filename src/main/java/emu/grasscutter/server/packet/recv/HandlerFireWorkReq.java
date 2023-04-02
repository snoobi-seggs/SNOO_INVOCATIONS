package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.LaunchFireworksReqOuterClass;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketFireworkNotify;
import emu.grasscutter.server.packet.send.PacketFireworkRsp;

@Opcodes(PacketOpcodes.LaunchFireworksReq)
public class HandlerFireWorkReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {

        var req
                = LaunchFireworksReqOuterClass.LaunchFireworksReq.parseFrom(payload);
        //session.send(new PacketFireworkNotify(req.getFireWorkData()));
        session.send(new PacketFireworkNotify(req.getSchemeData()));
        session.send(new PacketFireworkRsp());
    }
}
