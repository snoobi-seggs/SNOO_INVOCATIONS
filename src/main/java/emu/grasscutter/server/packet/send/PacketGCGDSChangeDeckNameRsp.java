package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import java.util.*;

import emu.grasscutter.net.proto.GCGDSChangeDeckNameRspOuterClass.GCGDSChangeDeckNameRsp;

public class PacketGCGDSChangeDeckNameRsp extends BasePacket {
	
	public PacketGCGDSChangeDeckNameRsp(int deckId, String name) {
		this(deckId, name, 0);
	}

    public PacketGCGDSChangeDeckNameRsp(int deckId, String name, int retcode) {
        super(PacketOpcodes.GCGDSChangeDeckNameRsp);
	
		GCGDSChangeDeckNameRsp proto = GCGDSChangeDeckNameRsp.newBuilder()
												.setRetcode(retcode)
												.setDeckId(deckId)
												.setName(name)
												.build();

        this.setData(proto);
    }
}
