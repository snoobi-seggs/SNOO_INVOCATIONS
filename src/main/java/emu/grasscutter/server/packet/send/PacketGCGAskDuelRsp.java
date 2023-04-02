package emu.grasscutter.server.packet.send;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import java.util.*;

import emu.grasscutter.net.proto.GCGAskDuelRspOuterClass.GCGAskDuelRsp;
import emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel;

public class PacketGCGAskDuelRsp extends BasePacket {

	public PacketGCGAskDuelRsp(int retcode) {
		super(PacketOpcodes.GCGAskDuelRsp);
		
		//GCGAskDuelRsp
		  //GCGDuel duel = 9;
		  //int32 retcode = 2;
		  
		GCGAskDuelRsp proto = GCGAskDuelRsp.newBuilder()
								.setRetcode(retcode)
								.build();
								
		//log error
		Grasscutter.getLogger().error("DECK IS INVALID, CANNOT CREATE GAME!");
		
        this.setData(proto);
	}
	
    public PacketGCGAskDuelRsp(Player player, int serverSeq, GCGDuel duel) {
        super(PacketOpcodes.GCGAskDuelRsp);
		
		//GCGAskDuelRsp
		  //GCGDuel duel = 9;
		  //int32 retcode = 2;
		  
		GCGAskDuelRsp proto = GCGAskDuelRsp.newBuilder()
								.setDuel(duel)
								.setRetcode(0)
								.build();
								
		//debug
		Grasscutter.getLogger().info(proto.toString());
		
        this.setData(proto);
    }
}
