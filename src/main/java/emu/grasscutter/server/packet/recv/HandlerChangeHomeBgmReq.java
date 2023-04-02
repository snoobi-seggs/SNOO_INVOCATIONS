package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.HomeChangeBgmReqOuterClass.HomeChangeBgmReq;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketChangeHomeBgmNotify;
import emu.grasscutter.server.packet.send.PacketChangeHomeBgmRsp;

@Opcodes(PacketOpcodes.HomeChangeBgmReq)
public class HandlerChangeHomeBgmReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = HomeChangeBgmReq.parseFrom(payload);

        int homeBgmId = req.getBgmId();
        var home = session.getPlayer().getHome();

        home.getHomeSceneItem(session.getPlayer().getSceneId()).setHomeBgmId(homeBgmId);
        home.save();

        session.send(new PacketChangeHomeBgmNotify(homeBgmId));
        session.send(new PacketChangeHomeBgmRsp());
    }
}
