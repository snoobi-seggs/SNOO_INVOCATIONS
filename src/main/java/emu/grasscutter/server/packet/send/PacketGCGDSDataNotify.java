package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.gcg.GcgManager;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import java.util.*;

import emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData;
import emu.grasscutter.net.proto.GCGDSDeckDataOuterClass.GCGDSDeckData;
import emu.grasscutter.net.proto.GCGDSDataNotifyOuterClass.GCGDSDataNotify;


public class PacketGCGDSDataNotify extends BasePacket {

    public PacketGCGDSDataNotify(Player player) {
        super(PacketOpcodes.GCGDSDataNotify);
		
		//GCGDSDataNotify
		  //uint32 cur_deck_id = 8;
		  //repeated GCGDSDeckData deck_list = 3;
		  //repeated uint32 unlock_card_back_id_list = 10;
		  //repeated GCGDSCardData card_list = 9;
		  //repeated uint32 unlock_field_id_list = 5;
		  //repeated uint32 unlock_deck_id_list = 6;
		  
		//GCGDSCardData
		  //uint32 num = 11;
		  //uint32 face_type = 5;
		  //uint32 card_id = 4;
		  //repeated uint32 proficiency_reward_taken_idx_list = 14;
		  //repeated uint32 unlock_face_type_list = 6;
		  //uint32 proficiency = 10;
		  
		//GCGDSDeckData
		  //fixed32 create_time = 5;
		  //uint32 field_id = 13;
		  //uint32 card_back_id = 9;
		  //repeated uint32 card_list = 1;
		  //repeated uint32 character_card_list = 7;
		  //uint32 id = 12;
		  //string name = 10;
		  //bool is_valid = 15;
		  
		//test
		GcgManager manager = player.getGcgManager();
		
		List<GCGDSDeckData> deckList = new ArrayList<>();
		manager.getDecks().values().forEach(gcgDeck -> deckList.add(gcgDeck.toProto()));
		
		List<GCGDSCardData> cardList = new ArrayList<>();
		manager.getUnlockedCards().values().forEach(gcgCard -> cardList.add(gcgCard.toProto()));
			
		
		GCGDSDataNotify proto = GCGDSDataNotify.newBuilder()
									.setCurDeckId(manager.getActiveDeckId())        //active deck
									.addAllDeckList(deckList)						//deck data
									.addAllUnlockCardBackIdList(manager.getUnlockedCardBacks()) //OMG bruh this is the card back like uk the behind of the card
									.addAllCardList(cardList)							//card s unlocked
									.addAllUnlockFieldIdList(manager.getUnlockedFields())      		//OMG bruh this is the table u play tcg on
									.addAllUnlockDeckIdList(List.of(1,2,3,4,5,6,7,8,9,10))  //determines unlockeddecks
									.build();
									
		this.setData(proto);
		//endtest
    }
}
