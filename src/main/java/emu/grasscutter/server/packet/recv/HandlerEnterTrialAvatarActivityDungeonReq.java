package emu.grasscutter.server.packet.recv;

import emu.grasscutter.game.activity.trialavatar.TrialAvatarActivityHandler;
import emu.grasscutter.game.props.ActivityType;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.server.packet.send.PacketEnterTrialAvatarActivityDungeonRsp;
import emu.grasscutter.server.packet.send.PacketScenePlayerLocationNotify;
import emu.grasscutter.net.proto.RetcodeOuterClass.Retcode;
import emu.grasscutter.net.proto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq;
import emu.grasscutter.server.game.GameSession;
import lombok.val;

@Opcodes(PacketOpcodes.EnterTrialAvatarActivityDungeonReq)
public class HandlerEnterTrialAvatarActivityDungeonReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		EnterTrialAvatarActivityDungeonReq req = EnterTrialAvatarActivityDungeonReq.parseFrom(payload);

		val playerData = session.getPlayer().getActivityManager()
			.getPlayerActivityDataByActivityType(ActivityType.NEW_ACTIVITY_TRIAL_AVATAR);
		if (playerData == null) {
			session.getPlayer().sendPacket(new PacketEnterTrialAvatarActivityDungeonRsp(
				req.getActivityId(),
				req.getTrialAvatarIndexId(),
				Retcode.RET_FAIL_VALUE));
			return;
		}

		val handler = (TrialAvatarActivityHandler) playerData.get().getActivityHandler();
		if (handler == null) {
			session.getPlayer().sendPacket(new PacketEnterTrialAvatarActivityDungeonRsp(
				req.getActivityId(),
				req.getTrialAvatarIndexId(),
				Retcode.RET_FAIL_VALUE));
			return;
		}

		// TODO, not sure if this will cause problem in MP, since we are entering trial activity dungeon
		session.getPlayer().sendPacket(new PacketScenePlayerLocationNotify(session.getPlayer().getScene())); // official does send this


		if (!handler.enterTrialDungeon(session.getPlayer(), req.getTrialAvatarIndexId(), req.getEnterPointId())) {
			session.getPlayer().sendPacket(new PacketEnterTrialAvatarActivityDungeonRsp(
			req.getActivityId(),
			req.getTrialAvatarIndexId(),
			Retcode.RET_FAIL_VALUE));
			return;
		}

		session.getPlayer().sendPacket(new PacketEnterTrialAvatarActivityDungeonRsp(
			req.getActivityId(),
			req.getTrialAvatarIndexId(),
			Retcode.RET_SUCC_VALUE));
	}

}
