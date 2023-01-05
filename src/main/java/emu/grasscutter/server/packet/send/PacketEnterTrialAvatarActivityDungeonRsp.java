package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonRspOuterClass.EnterTrialAvatarActivityDungeonRsp;

public class PacketEnterTrialAvatarActivityDungeonRsp extends BasePacket {
	
	public PacketEnterTrialAvatarActivityDungeonRsp(int activityId, int trialAvatarIndexId, int retcodeVal) {
		super(PacketOpcodes.EnterTrialAvatarActivityDungeonRsp);
		this.setData(EnterTrialAvatarActivityDungeonRsp.newBuilder()
			.setActivityId(activityId)
			.setTrialAvatarIndexId(trialAvatarIndexId)
			.setRetcode(retcodeVal));
	}
}
