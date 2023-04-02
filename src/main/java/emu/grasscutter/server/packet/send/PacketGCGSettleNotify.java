package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam;
import emu.grasscutter.net.proto.GCGGameBusinessTypeOuterClass.GCGGameBusinessType;
import emu.grasscutter.net.proto.GCGEndReasonOuterClass.GCGEndReason;
import emu.grasscutter.net.proto.GCGSettleNotifyOuterClass.GCGSettleNotify;

import java.util.*;

public class PacketGCGSettleNotify extends BasePacket {
    public PacketGCGSettleNotify(List<ItemParam> rewardItemList, List<Integer> finishedChallengeIdList, int gameId, boolean isWin, GCGGameBusinessType businessType, int winControllerId, List<Integer> forbidFinishChallengeList, GCGEndReason reason) {
        super(PacketOpcodes.GCGSettleNotify);

		GCGSettleNotify proto = GCGSettleNotify.newBuilder()
									.addAllRewardItemList(rewardItemList)
									.addAllFinishedChallengeIdList(finishedChallengeIdList)
									.setGameId(gameId)
									.setIsWin(isWin)
									.setBusinessType(businessType)
									.setWinControllerId(winControllerId)
									.addAllForbidFinishChallengeList(forbidFinishChallengeList)
									.setReason(reason)
									.build();
		
        this.setData(proto);
    }
}
