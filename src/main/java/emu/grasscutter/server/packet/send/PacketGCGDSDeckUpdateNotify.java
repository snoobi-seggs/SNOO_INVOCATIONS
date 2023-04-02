package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import java.util.*;


import emu.grasscutter.net.proto.GCGDSDeckUpdateNotifyOuterClass.GCGDSDeckUpdateNotify;

public class PacketGCGDSDeckUpdateNotify extends BasePacket {

    public PacketGCGDSDeckUpdateNotify(boolean isValid, int deckId) {
        super(PacketOpcodes.GCGDSDeckUpdateNotify);
		
		  //bool is_valid = 2;
		  //uint32 deck_id = 15;
		  
		GCGDSDeckUpdateNotify proto = GCGDSDeckUpdateNotify.newBuilder()
												.setIsValid(isValid)
												.setDeckId(deckId)
												.build();

        this.setData(proto);
    }
}
