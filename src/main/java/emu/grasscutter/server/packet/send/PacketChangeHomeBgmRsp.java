package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.HomeChangeBgmRspOuterClass.HomeChangeBgmRsp;

public class PacketChangeHomeBgmRsp extends BasePacket {
    public PacketChangeHomeBgmRsp() {
        super(PacketOpcodes.HomeChangeBgmRsp);

        var rsp = HomeChangeBgmRsp.newBuilder()
            .setRetcode(0)
            .build();

        this.setData(rsp);
    }
}
