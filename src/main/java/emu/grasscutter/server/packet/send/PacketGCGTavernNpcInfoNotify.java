package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.gcg.GcgNpc;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import emu.grasscutter.net.proto.GCGTavernNpcInfoNotifyOuterClass.GCGTavernNpcInfoNotify;
import emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo;

import java.util.*;

public class PacketGCGTavernNpcInfoNotify extends BasePacket {
	
	// TODO read frm db
    public PacketGCGTavernNpcInfoNotify(Player player) {
        super(PacketOpcodes.GCGTavernNpcInfoNotify);
		
		//GCGTavernNpcInfoNotify
		  //repeated GCGTavernNpcInfo Unk3300_FKAKHMMIEBC = 12;
		  //repeated GCGTavernNpcInfo Unk3300_BAMLNENDLCM = 2;
		  //GCGTavernNpcInfo character_npc = 11;
		  
		//GCGTavernNpcInfo
		  //uint32 id = 9;
          //uint32 scene_point_id = 15;
          //uint32 level_id = 6;
		  
		List<GCGTavernNpcInfo> constNpcs = new ArrayList<>();
		List<GCGTavernNpcInfo> weekNpcs = new ArrayList<>();
		GCGTavernNpcInfo currentInvitedChar = GCGTavernNpcInfo.newBuilder()
												.setId(0)
												.setLevelId(0)
												.setScenePointId(0)
												.build();
		 
		for (Map.Entry<Integer,GcgNpc> entry : player.getGcgManager().getTavernNpcs().entrySet()) {
			int npcId = entry.getKey();
			GcgNpc npcData = entry.getValue();
			GCGTavernNpcInfo npc = GCGTavernNpcInfo.newBuilder()
										.setId(npcId)
										.setLevelId(npcData.getLevelId())
										.setScenePointId(npcData.getScenePointId())
										.build();
										
			if (player.getGcgManager().getWeeklyNpcIds().contains(npcId)) {
				weekNpcs.add(npc);
			} else if (player.getGcgManager().getConstNpcIds().contains(npcId)) {
				constNpcs.add(npc);
			} else if (npcId == player.getGcgManager().getCurrentInvitedCharId()) {
				currentInvitedChar = npc;
			}
		}
		
		GCGTavernNpcInfoNotify proto = GCGTavernNpcInfoNotify.newBuilder()
										.addAllWeekNpcList(weekNpcs)     //weekly char npc
										.addAllConstNpcList(constNpcs)      //constant actual npc challenges
										.setCharacterNpc(currentInvitedChar) //cur invited char
										.build();

        this.setData(proto);
    }
}
