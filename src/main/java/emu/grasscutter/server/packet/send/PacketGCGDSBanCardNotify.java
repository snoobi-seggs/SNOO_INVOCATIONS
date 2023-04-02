package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import java.util.List;

import emu.grasscutter.net.proto.GCGDSBanCardNotifyOuterClass.GCGDSBanCardNotify;

public class PacketGCGDSBanCardNotify extends BasePacket {

    public PacketGCGDSBanCardNotify() {
        super(PacketOpcodes.GCGDSBanCardNotify);
		
		  //repeated uint32 card_list = 10;
		  
		GCGDSBanCardNotify proto = GCGDSBanCardNotify.newBuilder()
									.addAllCardList(List.of())
									.build();

        this.setData(proto);
    }
}
