package emu.grasscutter.server.packet.send;

import java.util.*;
import java.util.stream.Collectors;

import emu.grasscutter.data.GameData;
import emu.grasscutter.data.excels.*;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.InvestigationOuterClass.Investigation;
import emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget;
import emu.grasscutter.net.proto.PlayerInvestigationNotifyOuterClass.PlayerInvestigationNotify;

public class PacketPlayerInvestigationNotify extends BasePacket {
	
	public PacketPlayerInvestigationNotify(Player player) {
		super(PacketOpcodes.PlayerInvestigationNotify);
		
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
				
		//in the explore page in adventure handbook, there are many investigations (levels)
		List<Investigation> investigationList = new ArrayList<Investigation>();
		
		GameData.getInvestigationDataMap()
				.values()
				.forEach(investigationData -> {
							int totalProgress = investigationTargetList.stream()
													.filter(investigationTargetData -> investigationTargetData.getInvestigationId() == investigationData.getId())
													.collect(Collectors.toList())
													.size();
													
							Investigation investigation = Investigation.newBuilder()
															.setTotalProgress(totalProgress)
															.setProgress(totalProgress) //hardcode
															.setId(investigationData.getId())
															.setState(player.getInvestigationRewardedLevels()
																				.contains(investigationData.getId())
																				? Investigation.State.STATE_REWARD_TAKEN
																				: Investigation.State.STATE_COMPLETE)
															.build();
															
							investigationList.add(investigation);
				});
																	
		PlayerInvestigationNotify proto = PlayerInvestigationNotify.newBuilder()
				.addAllInvestigationList(investigationList)
				.build();
		
		this.setData(proto);
	}
}
