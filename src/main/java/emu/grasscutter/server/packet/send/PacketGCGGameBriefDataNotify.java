package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.game.player.Player;

import emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture;
import emu.grasscutter.net.proto.GCGLevelTypeOuterClass.GCGLevelType;
import emu.grasscutter.net.proto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify;
import emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData;
import emu.grasscutter.net.proto.GCGGameBusinessTypeOuterClass.GCGGameBusinessType;
import emu.grasscutter.net.proto.GCGPlayerBriefDataOuterClass.GCGPlayerBriefData;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class PacketGCGGameBriefDataNotify extends BasePacket {

    public PacketGCGGameBriefDataNotify(Player player, int levelId, GCGLevelType levelType, int configId, List<Integer> enemyCharacterCards) {
        super(PacketOpcodes.GCGGameBriefDataNotify);
		
		//GCGGameBriefDataNotify
		//GCGGameBriefData gcg_brief_data = 3;
		//bool is_new_game = 4;
		
		//GCGGameBriefData
		//uint32 Unk3300_NCLDOGNCHGF = 13;
		//GCGGameBusinessType business_type = 8;
		//uint32 Unk3300_FJJDMIBIBJN = 14;
		//uint32 platform_type = 6;
		//uint32 game_id = 12;
		//repeated GCGPlayerBriefData player_brief_list = 5;
		
		//GCGPlayerBriefData
		//string online_id = 5;
		//uint32 uid = 9;
		//uint32 controller_id = 10;
		//ProfilePicture profile_picture = 11;
		//string nick_name = 1;
		//map<uint32, uint32> card_face_map = 14;
		//repeated uint32 card_id_list = 13;
		//string psn_id = 2;
		
		//pfp data
		ProfilePicture pfp = ProfilePicture.newBuilder().setAvatarId(player.getHeadImage()).setCostumeId(0).build();
		ProfilePicture pfpAi = ProfilePicture.newBuilder().setAvatarId(0).setCostumeId(0).build(); //rn hardcoded
		
		
		//cards TODO build for enemy also frm res
		List<Integer> myCharacterCards = player.getGcgManager().getDecks()
											.get(player.getGcgManager().getActiveDeckId())
											.getCharacterCardList();
		
		//this sets the card face type
		Map<Integer,Integer> cardFaceMap = new HashMap<Integer,Integer>();
		myCharacterCards.forEach(charId -> {
			//this assumes u already unlocked the card else how u playing dat shit
			cardFaceMap.put(charId, player.getGcgManager().getUnlockedCards().get(charId).getFaceType());
		});
		
		Map<Integer,Integer> cardFaceMapAi = new HashMap<Integer,Integer>(); //TODO for enemy also frm res
		enemyCharacterCards.forEach(charId -> {
			cardFaceMapAi.put(charId, 0);
			//always no skin coz idk what determines this ngl seggs cum balls real lick
			//and if one monsters wld be blank since their skins dont exist,
			//just like my friends
		});
		
		//player data
		GCGPlayerBriefData gcgPlayer = GCGPlayerBriefData.newBuilder()
										.setOnlineId("")
										.setUid(player.getUid())
										.setControllerId(1) //hardcoded idk
										.setProfilePicture(pfp)
										.setNickName(player.getNickname())
										.putAllCardFaceMap(cardFaceMap)   // i rly dk this one
										.addAllCardIdList(myCharacterCards)    //is the main 3 char, for now used sniff, shld read from deck data
										.setPsnId("") //none since no psn fuck u psn users
										.build();
										
		GCGPlayerBriefData gcgAi = GCGPlayerBriefData.newBuilder()
										.setOnlineId("")
										.setUid(0)
										.setControllerId(2) //hardcoded idk
										.setProfilePicture(pfpAi)
										.setNickName("")
										.putAllCardFaceMap(cardFaceMapAi)   // i rly dk this one
										.addAllCardIdList(enemyCharacterCards)    //is the main 3 char, for now used sniff, shld read from deck data
										.setPsnId("") //none since no psn fuck u psn users
										.build();
		
		//building
		GCGGameBriefData gcgBriefData = GCGGameBriefData.newBuilder()
										.setALGDJMPAHDO(0)
										.setOEAEACPKCNP(0)
										.setBusinessType(GCGGameBusinessType.GCG_GAME_BUSINESS_TYPE_WEEK_CHALLENGE) //req implement
										.setPlatformType(0) //from same json file used sniff rn (PC -> 3)
										.setGameId(levelId) //placeholder TODO read from GCGGameExcelConfigData.json
										.addPlayerBriefList(gcgPlayer)
										.addPlayerBriefList(gcgAi)
										.build();
										
		GCGGameBriefDataNotify proto = GCGGameBriefDataNotify.newBuilder()
										.setGcgBriefData(gcgBriefData)
										.setIsNewGame(true)
										.build();
		
	

        this.setData(proto);
    }
}
