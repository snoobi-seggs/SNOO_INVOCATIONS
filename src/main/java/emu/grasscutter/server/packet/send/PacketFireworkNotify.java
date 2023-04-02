package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.FireworksLaunchDataNotifyOuterClass;
import emu.grasscutter.net.proto.FireworksLaunchSchemeDataOuterClass;

public class PacketFireworkNotify extends BasePacket {

    public PacketFireworkNotify(FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData pinfo) {
        super(PacketOpcodes.FireworksLaunchDataNotify);

        var proto
                = FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify.newBuilder();

        proto.addSchemeDataList(pinfo);

        setData(proto.build());
    }

}
