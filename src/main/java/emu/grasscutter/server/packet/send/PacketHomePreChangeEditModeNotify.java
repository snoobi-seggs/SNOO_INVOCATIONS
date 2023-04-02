package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.HomePreChangeEditModeNotifyOuterClass.HomePreChangeEditModeNotify;

public class PacketHomePreChangeEditModeNotify extends BasePacket {

    public PacketHomePreChangeEditModeNotify(boolean isEnterEditMode) {
        super(PacketOpcodes.HomePreChangeEditModeNotify);

        HomePreChangeEditModeNotify proto = HomePreChangeEditModeNotify.newBuilder()
						.setIsEnterEditMode(isEnterEditMode)
						.build();

        this.setData(proto);
    }
}
