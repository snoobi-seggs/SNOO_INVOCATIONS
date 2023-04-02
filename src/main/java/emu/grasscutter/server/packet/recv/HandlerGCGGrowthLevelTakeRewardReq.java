package emu.grasscutter.server.packet.recv;

import emu.grasscutter.data.common.ItemParamData;
import emu.grasscutter.data.GameData;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.props.ActionReason;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.Grasscutter;

import emu.grasscutter.net.proto.GCGGrowthLevelTakeRewardReqOuterClass.GCGGrowthLevelTakeRewardReq;

import emu.grasscutter.server.packet.send.PacketGCGBasicDataNotify;
import emu.grasscutter.server.packet.send.PacketGCGGrowthLevelNotify;
import emu.grasscutter.server.packet.send.PacketGCGGrowthLevelRewardNotify;
import emu.grasscutter.server.packet.send.PacketGCGGrowthLevelTakeRewardRsp;

import java.util.*;

@Opcodes(PacketOpcodes.GCGGrowthLevelTakeRewardReq)
public class HandlerGCGGrowthLevelTakeRewardReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		
		
		Player pl = session.getPlayer();
        synchronized (pl) {
            GCGGrowthLevelTakeRewardReq req = GCGGrowthLevelTakeRewardReq.parseFrom(payload);
            int level = req.getLevel();
            Set<Integer> rewardedLevels = session.getPlayer().getGcgRewardedLevels();
            if (!rewardedLevels.contains(level)) {// No duplicated reward
                int rewardId = GameData.getGcgLevelDataMap().get(level).getRewardId();
                if (rewardId != 0) {
                    List<ItemParamData> rewardItems = GameData.getRewardDataMap().get(rewardId).getRewardItemList();
                    pl.getInventory().addItemParamDatas(rewardItems, ActionReason.PlayerUpgradeReward);
                    rewardedLevels.add(level);
                    pl.setGcgRewardedLevels(rewardedLevels);
					session.send(new PacketGCGBasicDataNotify(pl)); //idk if tgis is needed here ngl
					session.send(new PacketGCGGrowthLevelRewardNotify(pl));
                    session.send(new PacketGCGGrowthLevelTakeRewardRsp(level, rewardId));
                    pl.save(); //coz slow
                }
            }
        }
    }

}
