package emu.grasscutter.game.gcg;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.IndexOptions;
import dev.morphia.annotations.Indexed;
import dev.morphia.annotations.Transient;
import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.GameData;
import emu.grasscutter.data.excels.RewardData;
import emu.grasscutter.database.DatabaseHelper;
import emu.grasscutter.game.gcg.*;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.props.ActionReason;
import emu.grasscutter.net.proto.GCGLevelTypeOuterClass.GCGLevelType;
import emu.grasscutter.server.packet.send.*;
import emu.grasscutter.utils.Utils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Entity(value = "gcg", useDiscriminator = false)
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder(builderMethodName = "of")
public class GcgPlayer {
    @Id
    String id;

    @Indexed(options = @IndexOptions(unique = true))
    long playerUid;
    @Transient Player player;
	
	Map<Integer,GcgCard> unlockedCards;
	Set<Integer> unlockedCardBacks;
	Set<Integer> unlockedFields;
	//Set<Integer> unlockedCardFaces;
	
	Map<Integer,GcgNpc> tavernNpcs;
	int currentlyPlayedLevelId;
	GCGLevelType currentlyPlayedLevelType;
	int currentInvitedCharId;
	List<Integer> weeklyNpcIds;
	List<Integer> constNpcIds;
	
	int activeDeckId;
	Map<Integer,GcgDeck> decks;
	
	//if player in duel
	boolean inDuel;

	
    public void save() {
        DatabaseHelper.saveGcgPlayer(this);
    }

    public static GcgPlayer getByUid(Integer uid) {
        GcgPlayer data = DatabaseHelper.getGcgPlayerDataByUid(uid);
        if (data == null) {
            data = GcgPlayer.create(uid);
        }
        return data;
    }

    public static GcgPlayer create(Integer uid) {
		
		//rn adds all cards for free
		List<Integer> defaultCards = new ArrayList<>();
		/*GameData.getGcgCardDataMap()
			.values()
			.stream()
			//.filter(cardData -> cardData.isPlayable()) //ensures cases like fishcl bird isnt added to deck
			.map(cardData -> (int) cardData.getId()) //maps to cardId for adding to card deck data sent
			.collect(Collectors.toList())
			.forEach(id -> defaultCards.add(id));									 
		GameData.getGcgCharDataMap()
				 .values()
				 .stream()
				 //.filter(cardData -> cardData.isPlayable()) //ensures cases like fishcl bird isnt added to deck
				 .map(cardData -> (int) cardData.getId()) //maps to cardId for adding to card deck data sent
				 .collect(Collectors.toList())
				 .forEach(id -> defaultCards.add(id));
				 //FANGCKEJDOL means it is addable to deck and isnt some summon*/
		Map<Integer,GcgCard> defaultUnlockedCards = new HashMap<>();
		//defaultCards.forEach(cardId -> defaultUnlockedCards.put(cardId, new GcgCard(cardId, 1, 2, 10, List.of(), List.of(1)))); //rn 2 coz is just hardcode
		
        return GcgPlayer.of()
            .playerUid(uid)
			.unlockedCards(defaultUnlockedCards)
			.unlockedCardBacks(new HashSet<Integer>())
			//.unlockedCardFaces(new HashSet<Integer>())
			.unlockedFields(new HashSet<Integer>())
			.tavernNpcs(new HashMap<Integer,GcgNpc>())
			.currentlyPlayedLevelId(0)
			.currentlyPlayedLevelType(GCGLevelType.GCG_LEVEL_TYPE_NONE)
			.currentInvitedCharId(0)
			.weeklyNpcIds(new ArrayList<Integer>())
			.constNpcIds(new ArrayList<Integer>())
			.activeDeckId(1)
			.decks(new HashMap<Integer,GcgDeck>())
			.inDuel(false)
			.build();
    }

    public void onOwnerLogin(Player player) {
        if (this.player == null)
            this.player = player;
        sendInitialPackets();
    }

    public void sendInitialPackets() {
		player.getGcgManager().onPlayerLogin();
    }

    public Player getPlayer() {
        if (this.player == null)
            this.player = Grasscutter.getGameServer().getPlayerByUid((int) this.playerUid, true);
        return this.player;
    }
	
	public void setFromManager(GcgManager manager) {
		setFromManager(manager, false);
	}
	
	public void setFromManager(GcgManager manager, boolean save) {
		this.unlockedCards = manager.getUnlockedCards();
		this.unlockedCardBacks = manager.getUnlockedCardBacks();
		//this.unlockedCardFaces = manager.getUnlockedCardFaces();
		this.unlockedFields = manager.getUnlockedFields();
		this.tavernNpcs = manager.getTavernNpcs();
		this.currentlyPlayedLevelId = manager.getCurrentlyPlayedLevelId();
		this.currentlyPlayedLevelType = manager.getCurrentlyPlayedLevelType();
		this.currentInvitedCharId = manager.getCurrentInvitedCharId();
		this.weeklyNpcIds = manager.getWeeklyNpcIds();
		this.constNpcIds = manager.getConstNpcIds();
		this.activeDeckId = manager.getActiveDeckId();
		this.decks = manager.getDecks();
		this.inDuel = manager.isInDuel();
		
		if (save) {
			this.save();
		}
	}
}