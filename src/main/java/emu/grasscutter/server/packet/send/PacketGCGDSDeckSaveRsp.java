package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import java.util.*;


import emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp;

public class PacketGCGDSDeckSaveRsp extends BasePacket {

    public PacketGCGDSDeckSaveRsp(int retcode, boolean isValid, int deckId, int createTime) {
        super(PacketOpcodes.GCGDSDeckSaveRsp);
		
		  //int32 retcode = 9;
		  //bool is_valid = 5;
		  //uint32 deck_id = 15;
		  //fixed32 create_time = 7;
		GCGDSDeckSaveRsp proto = GCGDSDeckSaveRsp.newBuilder()
												.setRetcode(retcode)
												.setIsValid(isValid)
												.setDeckId(deckId)
												.setCreateTime(createTime)
												.build();

        this.setData(proto);
    }
}
