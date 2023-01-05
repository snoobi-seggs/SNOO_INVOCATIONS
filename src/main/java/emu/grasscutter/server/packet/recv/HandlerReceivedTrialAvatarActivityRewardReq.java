package emu.grasscutter.server.packet.recv;

import emu.grasscutter.game.activity.trialavatar.TrialAvatarActivityHandler;
import emu.grasscutter.game.props.ActivityType;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.net.proto.RetcodeOuterClass.Retcode;
import emu.grasscutter.net.proto.ReceivedTrialAvatarActivityRewardReqOuterClass.ReceivedTrialAvatarActivityRewardReq;
import emu.grasscutter.server.packet.send.PacketReceivedTrialAvatarActivityRewardRsp;

import lombok.val;

@Opcodes(PacketOpcodes.ReceivedTrialAvatarActivityRewardReq)
public class HandlerReceivedTrialAvatarActivityRewardReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		ReceivedTrialAvatarActivityRewardReq req = ReceivedTrialAvatarActivityRewardReq.parseFrom(payload);

		val playerData = session.getPlayer().getActivityManager()
			.getPlayerActivityDataByActivityType(ActivityType.NEW_ACTIVITY_TRIAL_AVATAR);
		if (playerData == null) {
			session.getPlayer().sendPacket(new PacketReceivedTrialAvatarActivityRewardRsp(
				5002, // trial activity id
				req.getTrialAvatarIndexId(),
				Retcode.RET_FAIL_VALUE));
			return;
		}

		val handler = (TrialAvatarActivityHandler) playerData.get().getActivityHandler();
		if (handler == null) {
			session.getPlayer().sendPacket(new PacketReceivedTrialAvatarActivityRewardRsp(
				5002, // trial activity id
				req.getTrialAvatarIndexId(),
				Retcode.RET_FAIL_VALUE));
			return;
		}

		if (!handler.getReward(session.getPlayer(), playerData.get(), req.getTrialAvatarIndexId())) {
			session.getPlayer().sendPacket(new PacketReceivedTrialAvatarActivityRewardRsp(
				5002, // trial activity id
				req.getTrialAvatarIndexId(),
				Retcode.RET_FAIL_VALUE));
			return;
		}
		session.getPlayer().sendPacket(new PacketReceivedTrialAvatarActivityRewardRsp(
			5002, // trial activity id
			req.getTrialAvatarIndexId(),
			Retcode.RET_SUCC_VALUE));
	}

}
