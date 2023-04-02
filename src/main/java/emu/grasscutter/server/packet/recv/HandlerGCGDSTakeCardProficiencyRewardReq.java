package emu.grasscutter.server.packet.recv;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.GameData;
import emu.grasscutter.data.common.ItemParamData;
import emu.grasscutter.data.excels.GcgProficiencyRewardData.GcgRewardData;
import emu.grasscutter.game.props.ActionReason;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketGCGDSTakeCardProficiencyRewardRsp;

import java.util.List;

@Opcodes(PacketOpcodes.GCGDSTakeCardProficiencyRewardReq)
public class HandlerGCGDSTakeCardProficiencyRewardReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		GCGDSTakeCardProficiencyRewardReq req = GCGDSTakeCardProficiencyRewardReq.parseFrom(payload);
		
		//debug
		Grasscutter.getLogger().info("PLAYER {} is claiming Proficiency: \n{}",session.getPlayer().getUid(), req.toString());
		
		int rewardIndex = req.getRewardIndex();
		int cardId = req.getCardId();
		
		if (GameData.getGcgProficiencyRewardDataMap().get(cardId) != null) {
			GcgRewardData reward = GameData.getGcgProficiencyRewardDataMap().get(cardId).getRewardList().get(rewardIndex - 1);
			if (reward.getRewardId() != 0) {
				int rewardId = reward.getRewardId();
				List<ItemParamData> rewardItems = GameData.getRewardDataMap().get(rewardId).getRewardItemList();
				session.getPlayer().getInventory().addItemParamDatas(rewardItems, ActionReason.GCG_PROFICIENCY_REWARD);
				//rn no save to db
				session.send(new PacketGCGDSTakeCardProficiencyRewardRsp(req.getRewardIndex(),req.getCardId()));
			} else {
				//reward index does not yield an actual reward data
				Grasscutter.getLogger().error("null GcgRewardData");
				session.send(new PacketGCGDSTakeCardProficiencyRewardRsp(req.getRewardIndex(),req.getCardId(),1));
			}
		} else {
			//not in reward datamap
			Grasscutter.getLogger().error("null reward data");
			session.send(new PacketGCGDSTakeCardProficiencyRewardRsp(req.getRewardIndex(),req.getCardId(),1));
		}
	}

}
