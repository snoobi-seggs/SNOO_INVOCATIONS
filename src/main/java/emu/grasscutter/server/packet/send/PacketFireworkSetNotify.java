package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.FireworksReformDataNotifyOuterClass;
import emu.grasscutter.net.proto.FireworksReformDataOuterClass;

public class PacketFireworkSetNotify extends BasePacket {

    public PacketFireworkSetNotify(FireworksReformDataOuterClass.FireworksReformData notify) {
        super(PacketOpcodes.FireworksReformDataNotify);

        var proto
                = FireworksReformDataNotifyOuterClass.FireworksReformDataNotify.newBuilder();

		//proto.setId(1).addFireWorksReformDataList(notify);
        proto.addFireworksReformDataList(notify);

        setData(proto.build());
    }

}
