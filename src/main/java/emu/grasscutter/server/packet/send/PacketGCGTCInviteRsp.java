package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;


import emu.grasscutter.net.proto.GCGTCInviteRspOuterClass.GCGTCInviteRsp;

public class PacketGCGTCInviteRsp extends BasePacket {

    public PacketGCGTCInviteRsp(int charId) {
        super(PacketOpcodes.GCGTCInviteRsp);
		
		//uint32 character_id = 9;
		//int32 retcode = 11;
		  
		GCGTCInviteRsp proto = GCGTCInviteRsp.newBuilder()
										.setCharacterId(charId)
										.setRetcode(0)
										.build();


        this.setData(proto);
    }
	
	public PacketGCGTCInviteRsp(int charId, int retcode) {
        super(PacketOpcodes.GCGTCInviteRsp);
		
		//uint32 character_id = 9;
		//int32 retcode = 11;
		  
		GCGTCInviteRsp proto = GCGTCInviteRsp.newBuilder()
										.setCharacterId(charId)
										.setRetcode(retcode)
										.build();


        this.setData(proto);
    }
}
