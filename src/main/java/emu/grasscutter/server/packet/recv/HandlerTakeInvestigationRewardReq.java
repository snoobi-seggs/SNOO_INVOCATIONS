package emu.grasscutter.server.packet.recv;

import emu.grasscutter.data.common.ItemParamData;
import emu.grasscutter.data.GameData;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.props.ActionReason;
import emu.grasscutter.Grasscutter;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.TakeInvestigationRewardReqOuterClass.TakeInvestigationRewardReq;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketPlayerInvestigationNotify;
import emu.grasscutter.server.packet.send.PacketTakeInvestigationRewardRsp;

import java.util.*;

@Opcodes(PacketOpcodes.TakeInvestigationRewardReq)
public class HandlerTakeInvestigationRewardReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		TakeInvestigationRewardReq req = TakeInvestigationRewardReq.parseFrom(payload);
		int id = req.getId();
		//debug
		Grasscutter.getLogger().warn("TakeInvestigationRewardReq:\n\n{}",req.toString());
		
		if (GameData.getInvestigationDataMap().containsKey(id)) {
			int rewardId = GameData.getInvestigationDataMap().get(id).getRewardId();
			Player player = session.getPlayer();
			
			//get reward + sanity check
			Set<Integer> rewardedLevels = player.getInvestigationRewardedLevels();
			if (GameData.getRewardDataMap().containsKey(rewardId) && !rewardedLevels.contains(id)) {
				List<ItemParamData> rewardItems = GameData.getRewardDataMap().get(rewardId).getRewardItemList();
				player.getInventory().addItemParamDatas(rewardItems, ActionReason.InvestigationReward);
				
				//update player immediately
				rewardedLevels.add(id);
				player.setInvestigationRewardedLevels(rewardedLevels);
				player.save();
				
				//rsp packet and update handbook
				session.send(new PacketPlayerInvestigationNotify(player));
				session.send(new PacketTakeInvestigationRewardRsp(id, 0));
			} else {
				session.send(new PacketTakeInvestigationRewardRsp(id, 1)); //RET_INVESTIGAITON_REWARD_TAKEN
			}
		} else {
			session.send(new PacketTakeInvestigationRewardRsp(id, 1)); //RET_INVESTIGAITON_TARGET_STATE_ERROR
		}
	}

}
