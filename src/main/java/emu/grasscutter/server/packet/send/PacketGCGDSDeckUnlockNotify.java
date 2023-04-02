package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import java.util.*;


import emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify;

public class PacketGCGDSDeckUnlockNotify extends BasePacket {

    public PacketGCGDSDeckUnlockNotify(Player player, int deckId) {
        super(PacketOpcodes.GCGDSDeckUnlockNotify);
		
		  //uint32 deck_id = 14;
		  
		List<Integer> ret = List.of();
		GCGDSDeckUnlockNotify proto = GCGDSDeckUnlockNotify.newBuilder()
												.setDeckId(deckId)
												.build();

        this.setData(proto);
    }
}
