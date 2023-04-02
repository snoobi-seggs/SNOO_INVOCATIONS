package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import java.util.*;

import emu.grasscutter.net.proto.GCGDSChangeCurDeckRspOuterClass.GCGDSChangeCurDeckRsp;

public class PacketGCGDSChangeCurDeckRsp extends BasePacket {
	
	public PacketGCGDSChangeCurDeckRsp(int deckId) {
		this(deckId, 0);
	}

    public PacketGCGDSChangeCurDeckRsp(int deckId, int retcode) {
        super(PacketOpcodes.GCGDSChangeCurDeckRsp);
	
		GCGDSChangeCurDeckRsp proto = GCGDSChangeCurDeckRsp.newBuilder()
												.setRetcode(retcode)
												.setDeckId(deckId)
												.build();

        this.setData(proto);
    }
}
