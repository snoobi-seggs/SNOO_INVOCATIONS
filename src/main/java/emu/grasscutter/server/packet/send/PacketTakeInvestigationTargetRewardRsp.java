package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.TakeInvestigationTargetRewardRspOuterClass.TakeInvestigationTargetRewardRsp;

public class PacketTakeInvestigationTargetRewardRsp extends BasePacket {

    public PacketTakeInvestigationTargetRewardRsp(int questId) {
		this(questId, 0);
	}
	
	public PacketTakeInvestigationTargetRewardRsp(int questId, int retcode) {
		super(PacketOpcodes.TakeInvestigationTargetRewardRsp);
		
        TakeInvestigationTargetRewardRsp proto = TakeInvestigationTargetRewardRsp.newBuilder()
                .setQuestId(questId)
                .setRetcode(retcode)
                .build();

		this.setData(proto);
	}
}
