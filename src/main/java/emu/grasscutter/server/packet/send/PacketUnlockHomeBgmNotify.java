package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify;

public class PacketUnlockHomeBgmNotify extends BasePacket {
    public PacketUnlockHomeBgmNotify(int homeBgmId) {
        super(PacketOpcodes.HomeNewUnlockedBgmIdListNotify);

        var notify = HomeNewUnlockedBgmIdListNotify.newBuilder()
            .addNewUnlockedBgmIdList(homeBgmId)
            .build();

        this.setData(notify);
    }
}
