package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardRspOuterClass.GCGDSTakeCardProficiencyRewardRsp;

public class PacketGCGDSTakeCardProficiencyRewardRsp extends BasePacket {
	
	// TODO read frm db since logging out should not reset invited char frm tavern
	
	//on login
    public PacketGCGDSTakeCardProficiencyRewardRsp(int rewardIndex, int cardId) {
		this(rewardIndex, cardId, 0);
    }
	
	//on invite character to tavern
	public PacketGCGDSTakeCardProficiencyRewardRsp(int rewardIndex, int cardId, int retcode) {
        super(PacketOpcodes.GCGDSTakeCardProficiencyRewardRsp);
		
		GCGDSTakeCardProficiencyRewardRsp proto = GCGDSTakeCardProficiencyRewardRsp.newBuilder()
										.setCardId(cardId)
										.setRewardIndex(rewardIndex)
										.setRetcode(retcode)
										.build();


        this.setData(proto);
    }
}
