package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.TakeInvestigationRewardRspOuterClass.TakeInvestigationRewardRsp;

public class PacketTakeInvestigationRewardRsp extends BasePacket {

    public PacketTakeInvestigationRewardRsp(int id) {
		this(id, 0);
	}
	
	public PacketTakeInvestigationRewardRsp(int id, int retcode) {
		super(PacketOpcodes.TakeInvestigationRewardRsp);
		
        TakeInvestigationRewardRsp proto = TakeInvestigationRewardRsp.newBuilder()
                .setId(id)
                .setRetcode(retcode)
                .build();

		this.setData(proto);
	}
}
