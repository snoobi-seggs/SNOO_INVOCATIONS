package emu.grasscutter.server.packet.recv;

import emu.grasscutter.data.common.ItemParamData;
import emu.grasscutter.data.GameData;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.props.ActionReason;
import emu.grasscutter.Grasscutter;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.TakeInvestigationTargetRewardReqOuterClass.TakeInvestigationTargetRewardReq;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketPlayerInvestigationTargetNotify;
import emu.grasscutter.server.packet.send.PacketTakeInvestigationTargetRewardRsp;

import java.util.*;

@Opcodes(PacketOpcodes.TakeInvestigationTargetRewardReq)
public class HandlerTakeInvestigationTargetRewardReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		TakeInvestigationTargetRewardReq req = TakeInvestigationTargetRewardReq.parseFrom(payload);
		int questId = req.getQuestId();
		//debug
		Grasscutter.getLogger().warn("TakeInvestigationTargetRewardReq:\n\n{}",req.toString());
		
		if (GameData.getInvestigationTargetDataMap().containsKey(questId)) {
			int rewardId = GameData.getInvestigationTargetDataMap().get(questId).getRewardId();
			Player player = session.getPlayer();
			
			//get reward + sanity check
			Set<Integer> rewardedLevels = player.getInvestigationTargetRewardedLevels();
			if (GameData.getRewardDataMap().containsKey(rewardId) && !rewardedLevels.contains(questId)) {
				List<ItemParamData> rewardItems = GameData.getRewardDataMap().get(rewardId).getRewardItemList();
				player.getInventory().addItemParamDatas(rewardItems, ActionReason.InvestigationTargetReward);
				
				//update player immediately
				rewardedLevels.add(questId);
				player.setInvestigationTargetRewardedLevels(rewardedLevels);
				player.save();
				
				//rsp packet and update handbook
				session.send(new PacketPlayerInvestigationTargetNotify(player));
				session.send(new PacketTakeInvestigationTargetRewardRsp(questId, 0));
			} else {
				session.send(new PacketTakeInvestigationTargetRewardRsp(questId, 1)); //RET_INVESTIGAITON_REWARD_TAKEN
			}
		} else {
			session.send(new PacketTakeInvestigationTargetRewardRsp(questId, 1)); //RET_INVESTIGAITON_TARGET_STATE_ERROR
		}
	}

}
