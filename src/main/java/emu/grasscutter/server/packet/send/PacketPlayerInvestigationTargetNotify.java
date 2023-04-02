package emu.grasscutter.server.packet.send;

import java.util.*;
import java.util.stream.Collectors;

import emu.grasscutter.data.GameData;
import emu.grasscutter.data.excels.*;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget;
import emu.grasscutter.net.proto.PlayerInvestigationTargetNotifyOuterClass.PlayerInvestigationTargetNotify;

public class PacketPlayerInvestigationTargetNotify extends BasePacket {
	
	public PacketPlayerInvestigationTargetNotify(Player player) {
		super(PacketOpcodes.PlayerInvestigationTargetNotify);
		
		//in many investigations, there are many investigation targets...
		List<InvestigationTarget> investigationTargetList = new ArrayList<InvestigationTarget>();
		
		GameData.getInvestigationTargetDataMap()
				.values()
				.forEach(investigationTargetData -> {
							InvestigationTarget investigationTarget = InvestigationTarget.newBuilder()
																	.setTotalProgress(investigationTargetData.getProgress())
																	.setProgress(investigationTargetData.getProgress()) //hardcode
																	.setInvestigationId(investigationTargetData.getInvestigationId())
																	.setState(player.getInvestigationTargetRewardedLevels()
																				.contains(investigationTargetData.getId())
																				? InvestigationTarget.State.STATE_REWARD_TAKEN
																				: InvestigationTarget.State.STATE_COMPLETE)
																	.setQuestId(investigationTargetData.getId()) //this one needs id altho its called questId
																	.build();
							investigationTargetList.add(investigationTarget);
				});
	
																	
		PlayerInvestigationTargetNotify proto = PlayerInvestigationTargetNotify.newBuilder()
				.addAllInvestigationTargetList(investigationTargetList)
				.build();
		
		this.setData(proto);
	}
}
