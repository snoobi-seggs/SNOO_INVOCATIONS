package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify;

public class PacketUnlockedHomeBgmNotify extends BasePacket {
    public PacketUnlockedHomeBgmNotify(Player player) {
        super(PacketOpcodes.HomeAllUnlockedBgmIdListNotify);

        if (player.getRealmList() == null) {
            return;
        }

        var unlocked = player.getHome().getUnlockedHomeBgmList();

        var notify = HomeAllUnlockedBgmIdListNotify.newBuilder()
            .addAllAllUnlockedBgmIdList(unlocked)
            .build();

        this.setData(notify);
    }
}
