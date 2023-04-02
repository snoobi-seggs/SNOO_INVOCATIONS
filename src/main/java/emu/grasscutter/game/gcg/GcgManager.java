package emu.grasscutter.game.gcg;

import emu.grasscutter.data.GameData;
import emu.grasscutter.data.binout.*;	//GcgConfigSkill
import emu.grasscutter.data.excels.*;
import emu.grasscutter.database.DatabaseHelper;
//import emu.grasscutter.game.gcg.exec.*;
import emu.grasscutter.game.gcg.*;
import emu.grasscutter.game.gcg.enums.*;
import emu.grasscutter.game.player.BasePlayerManager;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.props.EnterReason;
import emu.grasscutter.game.props.PlayerProperty;
import emu.grasscutter.game.props.WatcherTriggerType;
import emu.grasscutter.game.world.Scene;
import emu.grasscutter.Grasscutter;
import emu.grasscutter.scripts.data.SceneConfig;
import emu.grasscutter.server.packet.send.*;
import emu.grasscutter.utils.Utils;
import emu.grasscutter.utils.Position;

import java.util.*;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.Setter;

import static emu.grasscutter.config.Configuration.GAME_OPTIONS;
import static java.util.Map.entry;

//PROTO so nice right
import emu.grasscutter.net.proto.EnterTypeOuterClass.EnterType;
import emu.grasscutter.net.proto.GCGActionTypeOuterClass.GCGActionType;
import emu.grasscutter.net.proto.GCGAttackCostInfoOuterClass.GCGAttackCostInfo;
import emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard;
import emu.grasscutter.net.proto.GCGChangeOnstageInfoOuterClass.GCGChangeOnstageInfo;
import emu.grasscutter.net.proto.GCGControllerShowInfoOuterClass.GCGControllerShowInfo;
import emu.grasscutter.net.proto.GCGCostReviseInfoOuterClass.GCGCostReviseInfo;
import emu.grasscutter.net.proto.GCGClientPerformTypeOuterClass.GCGClientPerformType;
import emu.grasscutter.net.proto.GCGDiceSideTypeOuterClass.GCGDiceSideType;
import emu.grasscutter.net.proto.GCGDamageDetailOuterClass.GCGDamageDetail;
import emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel;
import emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge;
import emu.grasscutter.net.proto.GCGEndReasonOuterClass.GCGEndReason;
import emu.grasscutter.net.proto.GCGGameBusinessTypeOuterClass.GCGGameBusinessType;
import emu.grasscutter.net.proto.GCGLevelTypeOuterClass.GCGLevelType;
import emu.grasscutter.net.proto.GCGMessageOuterClass.GCGMessage;
import emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePack;
import emu.grasscutter.net.proto.GCGMsgAddCardsOuterClass.GCGMsgAddCards;
import emu.grasscutter.net.proto.GCGMsgAddDiceOuterClass.GCGMsgAddDice;
import emu.grasscutter.net.proto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate;
import emu.grasscutter.net.proto.GCGMsgCostDiceOuterClass.GCGMsgCostDice;
import emu.grasscutter.net.proto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise;
import emu.grasscutter.net.proto.GCGMsgCharDieOuterClass.GCGMsgCharDie;
import emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform;
import emu.grasscutter.net.proto.GCGMsgDiceRerollOuterClass.GCGMsgDiceReroll;
import emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll;
import emu.grasscutter.net.proto.GCGMsgDuelDataChangeOuterClass.GCGMsgDuelDataChange;
import emu.grasscutter.net.proto.GCGMsgGameOverOuterClass.GCGMsgGameOver;
import emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd;
import emu.grasscutter.net.proto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove;
import emu.grasscutter.net.proto.GCGMsgMoveCardOuterClass.GCGMsgMoveCard;
import emu.grasscutter.net.proto.GCGMsgNewCardOuterClass.GCGMsgNewCard;
import emu.grasscutter.net.proto.GCGMsgNoDamageSkillResultOuterClass.GCGMsgNoDamageSkillResult;
import emu.grasscutter.net.proto.GCGMsgOpTimerOuterClass.GCGMsgOpTimer;
import emu.grasscutter.net.proto.GCGMsgPassOuterClass.GCGMsgPass;
import emu.grasscutter.net.proto.GCGMsgPhaseChangeOuterClass.GCGMsgPhaseChange;
import emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue;
import emu.grasscutter.net.proto.GCGMsgPVEIntentionOuterClass.GCGMsgPVEIntention;
import emu.grasscutter.net.proto.GCGMsgPVEIntentionChangeOuterClass.GCGMsgPVEIntentionChange;
import emu.grasscutter.net.proto.GCGMsgPVEIntentionInfoOuterClass.GCGMsgPVEIntentionInfo;
import emu.grasscutter.net.proto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin;
import emu.grasscutter.net.proto.GCGMsgReactionEndOuterClass.GCGMsgReactionEnd;
import emu.grasscutter.net.proto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards;
import emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage;
import emu.grasscutter.net.proto.GCGMsgSelectOnStageByEffectOuterClass.GCGMsgSelectOnStageByEffect;
import emu.grasscutter.net.proto.GCGMsgSkillLimitsChangeOuterClass.GCGMsgSkillLimitsChange;
import emu.grasscutter.net.proto.GCGMsgSkillResultOuterClass.GCGMsgSkillResult;
import emu.grasscutter.net.proto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange;
import emu.grasscutter.net.proto.GCGMsgUpdateControllerOuterClass.GCGMsgUpdateController;
import emu.grasscutter.net.proto.GCGMsgUseSkillOuterClass.GCGMsgUseSkill;
import emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd;
import emu.grasscutter.net.proto.GCGMsgWaitingListChangeOuterClass.GCGMsgWaitingListChange;
import emu.grasscutter.net.proto.GCGOperationReqOuterClass.GCGOperationReq;
import emu.grasscutter.net.proto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard;
import emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase;
import emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.GCGPhaseType;
import emu.grasscutter.net.proto.GCGPlayCardCostInfoOuterClass.GCGPlayCardCostInfo;
import emu.grasscutter.net.proto.GCGPlayerFieldOuterClass.GCGPlayerField;
import emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason;
import emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo;
import emu.grasscutter.net.proto.GCGSkillHpChangeTypeOuterClass.GCGSkillHpChangeType;
import emu.grasscutter.net.proto.GCGSkillPreviewElementReactionInfoOuterClass.GCGSkillPreviewElementReactionInfo;
import emu.grasscutter.net.proto.GCGSkillPreviewHpInfoOuterClass.GCGSkillPreviewHpInfo;
import emu.grasscutter.net.proto.GCGSkillPreviewInfoOuterClass.GCGSkillPreviewInfo;
import emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo;
import emu.grasscutter.net.proto.GCGSkillPreviewTokenChangeInfoOuterClass.GCGSkillPreviewTokenChangeInfo;
import emu.grasscutter.net.proto.GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo;
import emu.grasscutter.net.proto.GCGSkillPreviewNotifyOuterClass.GCGSkillPreviewNotify;
import emu.grasscutter.net.proto.GCGTokenOuterClass.GCGToken;
import emu.grasscutter.net.proto.GCGZoneOuterClass.GCGZone;
import emu.grasscutter.net.proto.GCGZoneTypeOuterClass.GCGZoneType;
import emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam;
import emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture;
import emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair;
import emu.grasscutter.net.proto.Unk3300ADHENCIFKNI.Unk3300_ADHENCIFKNI;

public class GcgManager extends BasePlayerManager {
	
	// common vars for inter snoobi reference
	public int serverSeq = 1;
	public Map<Integer,List<GCGDiceSideType>> playerDice = new HashMap<Integer,List<GCGDiceSideType>>(); //currentControllerId -> List of dice fr that controller
	public Map<Integer,GcgCharData> charGuidToDataMap = new HashMap<Integer,GcgCharData>();
	//public Map<Integer,GcgCardData> cardGuidToDataMap = new HashMap<Integer,GcgCardData>();
	public int currentControllerId = 0;
	public int onStageCardGuidPlayer1 = 0;
	public int onStageCardGuidPlayer2 = 0;
	public int guidCounter = 1;
	public boolean isFirstSelect = true;
	
	//refactor hell cardGuid -> card details
	public Map<Integer, GcgGameCardDetail> gcgGameDetails = new HashMap<Integer, GcgGameCardDetail>();
	public List<Integer> availableGuids = new ArrayList<Integer>();
	
	//player
	@Getter private Map<Integer,GcgNpc> tavernNpcs = new HashMap<>();
	@Getter @Setter private int currentInvitedCharId = 0;
	@Getter private List<Integer> weeklyNpcIds = new ArrayList<>();
	@Getter private List<Integer> constNpcIds = new ArrayList<>();
	@Getter @Setter private int activeDeckId = 1;
	
	@Getter private int currentlyPlayedLevelId = 0;	//for settling restart
	@Getter private GCGLevelType currentlyPlayedLevelType = GCGLevelType.GCG_LEVEL_TYPE_NONE;	//levelType for settle restart
	@Getter @Setter private boolean isLastDuelWin = false;	//when exit settle, play win or lose convo w the current invited char npc
	@Getter private boolean isInDuel = false;		//when reconnect, tell client if player was in a match and disconnect halfway
	
	//items unlocked
	@Getter @Setter private Map<Integer,GcgCard> unlockedCards = new HashMap<>();
	@Getter @Setter private Set<Integer> unlockedFields = new HashSet<>();
	@Getter @Setter private Set<Integer> unlockedCardBacks = new HashSet<>();
	
	//deckdata
	@Getter @Setter private Map<Integer,GcgDeck> decks = new HashMap<>(); //player deck data
	
	//db
	@Getter @Setter private GcgPlayer playerGcgData;
	
    public GcgManager(Player player) {
        super(player);
    }
	
	/*************************************
	 * initialising some hardcoded stuff *
	 *************************************/
	public void init() {
		//bind with db
		GcgPlayer playerData = GcgPlayer.getByUid(player.getUid());
		this.playerGcgData = playerData;
		this.decks = playerData.getDecks();
		this.tavernNpcs = playerData.getTavernNpcs();
		this.currentlyPlayedLevelId = playerData.getCurrentlyPlayedLevelId();
		this.currentlyPlayedLevelType = playerData.getCurrentlyPlayedLevelType();
		this.currentInvitedCharId = playerData.getCurrentInvitedCharId();
		this.isInDuel = playerData.isInDuel();
		this.unlockedCards = playerData.getUnlockedCards();
		//this.weeklyNpcIds = playerData.getWeeklyNpcIds();
		//this.npcIds = playerData.getConstNpcIds();
		
		//hardcoded, supposed to randomise npc every week
		tavernNpcs.put(201, new GcgNpc(201, 2012, 102)); //ganyu
		tavernNpcs.put(109, new GcgNpc(109, 1092, 302)); //weekly darina
		tavernNpcs.put(110, new GcgNpc(110, 1102, 401)); //weekly kimiya 
		tavernNpcs.put(108, new GcgNpc(108, 1082, 402)); //weekly kurisu
		this.weeklyNpcIds.addAll(List.of(201,109,110,108));
		
		tavernNpcs.put(1, new GcgNpc(1, 40001, 202));	//constant
		tavernNpcs.put(4, new GcgNpc(4, 40004, 303));	//constant
		tavernNpcs.put(3, new GcgNpc(3, 40003, 111));	//constant
		this.constNpcIds.addAll(List.of(1,3,4));
		
		//add default cards (30)
		List<Integer> defaultCards = new ArrayList<>();
		
		GameData.getGcgCardDataMap()
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
				 //FANGCKEJDOL means it is addable to deck and isnt some summon
		
		//if does not own a card, add all
		defaultCards.forEach(cardId -> {
			if (!this.unlockedCards.containsKey(cardId)) {
				this.unlockedCards.put(cardId, new GcgCard(cardId, 1, 2, 10, List.of(), List.of(1))); //rn 2 coz is just hardcode
			}
		});

		//add all field/tables and card backs coz no save to db yet
		List<Integer> defaultCardBacks = List.of(101,102,103,104,109,110,111,112,113,114,115,116,117,118,119,120,0); //0 is id-less black back
		List<Integer> defaultFields = List.of(101,102,103,0); //0 is the id-less monstadt
		defaultCardBacks.forEach(id -> this.unlockedCardBacks.add(id));
		defaultFields.forEach(id -> this.unlockedFields.add(id));
		
		//add default deck for now TODO READ FROM DB
		/*this.decks.add(new GcgDeck(1, 1670434446, 101, 0, 
									List.of(311302,311302,213011,213011,312302,
											312302,312301,312301,312201,312201,
											332007,332007,322001,322001,322007,
											322007,322010,322010,332008,332008,
											321003,321003,321006,321006,332001,
											332001,333006,333006,331301,331301),
									List.of(1401,1301,1501),
									"My Deck")); //new deck*/
									
		//set in db and save
		this.playerGcgData.setFromManager(this,true);
	}
	
	/****************************************
	 * invite character to tavern for seggs *
	 ****************************************/
	public void inviteCharacter(int charId, int levelId) {
		this.inviteCharacter(charId, levelId, 1);
	}
	
	public void inviteCharacter(int charId, int levelId, int pointId) {
		this.inviteCharacter(new GcgNpc(charId, levelId, pointId));
	}
	
	public void inviteCharacter(GcgNpc npc) {
		this.tavernNpcs.put(npc.getId(), npc);
		this.currentInvitedCharId = npc.getId();
		this.playerGcgData.setFromManager(this,true); //save to db
		return;
	}

    /**********************
     * buy card from shop *
     **********************/
    public synchronized boolean gainCard(int cardId) {
		//check if is in map (sanity)
		if (GameData.getGcgCardDataMap().containsKey(cardId)) {
			
			if (this.unlockedCards.containsKey(cardId)) { //alr own card
				GcgCard card = this.unlockedCards.get(cardId);
				card.setNum(card.getNum() + 1);  //add one
				this.unlockedCards.put(cardId, card);
			} else { // is new unlock
				this.unlockedCards.put(cardId, new GcgCard(cardId, 0, 1, 3, List.of(), List.of()));
			}
			
			this.player.getInventory().addItem(cardId, 1);
			this.player.sendPacket(new PacketGCGDSDataNotify(this.player));
			this.playerGcgData.setFromManager(this,true); //save to db
			return true;
		} else {
			Grasscutter.getLogger().warn("cannot add card of id {} as it does not exist in data map",cardId);
			return false;
		}
    }
	
	/*****************************
	 * gain card skin shinyy OwO *
	 *****************************/
	public synchronized boolean gainCardFace(int cardId) {
		//check if is in map (sanity)
		int cardFaceId = Integer.parseInt(cardId + "01");  //since all card faces rn are like 120101 where 1201 is barb and 01 is the skinid
		if (GameData.getGcgCardFaceDataMap().containsKey(cardFaceId)) {
			GcgCardFaceData cardFace = GameData.getGcgCardFaceDataMap().get(cardFaceId);
			
			if (this.unlockedCards.containsKey(cardId)) { //alr own card
				GcgCard card = this.unlockedCards.get(cardId);
				card.setFaceType(1);  //set to gold face
				this.unlockedCards.put(cardId, card);
			} else {
				//do nothing coz is not owned, shld handle better tho
			}
			
			//this.player.getInventory().addItem(cardFace.getItemId(), 1);  //later shld read frm db after unlocking the card itself
			this.player.sendPacket(new PacketGCGDSDataNotify(this.player));
			this.playerGcgData.setFromManager(this,true); //save to db
			return true;
		} else {
			Grasscutter.getLogger().warn("cannot add cardFace of id {} as it does not exist in data map",cardFaceId);
			return false;
		}
    }
	
	//through quests etc
	public synchronized boolean unlockDeck(int deckId) {
		this.player.sendPacket(new PacketGCGDSDeckUnlockNotify(this.player,deckId));
		return true;
	}

	//make new deck or save one
    public synchronized boolean editDeck(int deckId, List<Integer> cardList, List<Integer> characterCardList, String deckName) {
        //save to db and update notify
		//TODO save, validate deck requirements
		int retcode = 0;
		boolean isValid = true;
		int createTime = (int) (System.currentTimeMillis() / 1000);
		
		//if deck is new then new create time, else use old validation
		//GCGDSDeckSaveReq
		  //uint32 deck_id = 4;
		  //repeated uint32 card_list = 11;
		  //repeated uint32 character_card_list = 6;
		  //string name = 5;
		
		//GCGDSDeckSaveRsp
		  //int32 retcode = 9;
		  //bool is_valid = 5;
		  //uint32 deck_id = 15;
		  //fixed32 create_time = 7;
		  
		//GCGDSDeckUpdateNotify
		  //bool is_valid = 2;
		  //uint32 deck_id = 15;
		
		//update in manager
		GcgDeck oldDeck = this.decks.get(deckId);
		if (oldDeck != null) {
			this.decks.put(deckId, new GcgDeck(deckId, (int) System.currentTimeMillis() / 1000, oldDeck.getFieldId(), oldDeck.getCardBackId(), cardList, characterCardList, deckName));
		} else {
			this.decks.put(deckId, new GcgDeck(deckId, (int) System.currentTimeMillis() / 1000, 0, 0, cardList, characterCardList, deckName));
		}
		
		//rsp packets
		this.player.sendPacket(new PacketGCGDSDeckSaveRsp(retcode,isValid,deckId,createTime));
		//this.player.sendPacket(new PacketGCGDSDeckUpdateNotify(isValid,deckId));
		this.playerGcgData.setFromManager(this,true); //save to db
		return true;
	}
	
	//change gcg table design
	public synchronized boolean changeField(int fieldId, int deckId) {
		//satan check
		if (this.unlockedFields.contains(fieldId)) {
			this.decks.get(deckId).setFieldId(fieldId);
			this.playerGcgData.setFromManager(this,true); //save to db
			return true;
		} else {
			return false;
		}
	}
	
	//change gcg deck card back design
	public synchronized boolean changeCardBack(int cardBackId, int deckId) {
		//satan check
		if (this.unlockedCardBacks.contains(cardBackId)) {
			this.decks.get(deckId).setCardBackId(cardBackId);
			this.playerGcgData.setFromManager(this,true); //save to db
			return true;
		} else {
			return false;
		}
	}
	
	//change card skin design
	public synchronized boolean changeCardFace(int cardId, int faceType) {
		//satan check
		if (this.unlockedCards.containsKey(cardId)) {
			this.unlockedCards.get(cardId).setFaceType(faceType);
			this.playerGcgData.setFromManager(this,true); //save to db
			return true;
		} else {
			return false;
		}
	}
   
	//change current active deck
	public synchronized boolean setActiveDeck(int deckId) {
		//check if deck exists
		if (this.getDecks().containsKey(deckId)) {
			this.activeDeckId = deckId;
			this.playerGcgData.setFromManager(this,true); //save to db
			return true;
		} else {
			return false;
		}
	}
	
	//change deck name to seggs
	public synchronized boolean setDeckName(int deckId, String name) {
		//check if deck exists
		if (this.getDecks().containsKey(deckId) && !name.equals("fuck")) { //coz fuck is a bad word ;(
			this.decks.get(this.activeDeckId).setName(name);
			this.playerGcgData.setFromManager(this,true); //save to db
			return true;
		} else {
			return false;
		}
	}
	
	/* when entering or exiting tcg match, save to db */
	public synchronized void setInDuel(boolean inDuel) {
		this.isInDuel = inDuel;
		this.playerGcgData.setFromManager(this,true); //save to db
	}
	
	/* when entering, save current levelId db */
	public synchronized void setCurrentlyPlayedLevelId(int levelId) {
		this.currentlyPlayedLevelId = levelId;
		this.playerGcgData.setFromManager(this,true); //save to db
	}
	
	/* when entering, save current levelType db */
	public synchronized void setCurrentlyPlayedLevelType(GCGLevelType levelType) {
		this.currentlyPlayedLevelType = levelType;
		this.playerGcgData.setFromManager(this,true); //save to db
	}
	
	/********************************************
	 * starts tcg match and sends relavant info *
	 ********************************************/
	public synchronized void startMatch(int levelId, GCGLevelType levelType, int configId) {
		//send details
		int deckId = GameData.getGcgGameDataMap().get(levelId).getDeckId();
		List<Integer> enemyCharacterCards = GameData.getGcgDeckDataMap().get(deckId).getCharacterCardList();
		this.player.sendPacket(new PacketGCGGameBriefDataNotify(this.player, levelId, levelType, configId, enemyCharacterCards));
		
		//whoeever made this the way it is i sincerely hope u become kira's eyeballs which i will lick
        
		Position pos = new Position(0f, -5f, 0f);
		
		Scene oldScene = null;
		
        if (this.player.getScene() != null) {
			Grasscutter.getLogger().warn("PLAYER SCENE IS NOT NULL, GET OLD SCENE");
            oldScene = this.player.getScene();
            // Don't deregister scenes if the player is going to tp back into them
            if (oldScene.getId() == 79999) {
                oldScene.setDontDestroyWhenEmpty(true);
            }
            oldScene.removePlayer(this.player);
        }
		
		//Grasscutter.getLogger().warn("GET NEW 79999 SCENE");
        Scene newScene = this.player.getWorld().getSceneById(79999);
		//Grasscutter.getLogger().warn("GOTTEN NEW 79999 SCENE, ADDING PLAYER");
        newScene.addPlayer(this.player);
		//Grasscutter.getLogger().warn("ADDED NEW PLAYER, SET ABILITY");
        this.player.setAvatarsAbilityForScene(newScene);
		
		SceneConfig config = newScene.getScriptManager().getConfig();
        if (pos == null && config != null) {
            if (config.born_pos != null) {
               pos = newScene.getScriptManager().getConfig().born_pos;
            }
            if (config.born_rot != null) {
                player.getRotation().set(config.born_rot);
            }
        }
		
		//if player.getpos is null, set it to 0 -5 0
		if (player.getPosition() == null) {
			player.getPosition().set(pos);
		}
		
		////if is from non tcg domain, rmb old pos else dont
		if (oldScene != null && newScene != oldScene) {
            newScene.setPrevScene(oldScene.getId());
            oldScene.setDontDestroyWhenEmpty(false);
			this.player.setPrevPos(this.player.getPosition().clone());
			this.player.setPrevRot(this.player.getRotation().clone());
        }
		
		this.player.sendPacket(new PacketPlayerEnterSceneNotify(this.player, this.player, EnterType.ENTER_TYPE_DUNGEON, EnterReason.DungeonEnter, 79999, pos, 2162));

	}
	
	/**************************************************************************
	 * returns the player to a tcg match if they were in one and internet die *
	 **************************************************************************/
	public synchronized void returnToMatch() {
		//rn makes a new match coz i didnt store message pack history lol go refactor ur anus
		startMatch(this.currentlyPlayedLevelId, this.currentlyPlayedLevelType, this.currentInvitedCharId);
	}
   
    /* init match handling  */
    public synchronized void initFinish(Player player) {
		//hard coded for now 
		List<GCGMessagePack> msgPackListToSend = new ArrayList<GCGMessagePack>();
		
		//m1 ALWAYS UPDATE CONTROLLERS to allow none
		GCGMessagePack m1 = GCGMessagePack.newBuilder()
							.setActionType(GCGActionType.GCG_ACTION_TYPE_NONE)
							.setControllerId(0)
							.addMsgList(GCGMessage.newBuilder()
										.setUpdateController(GCGMsgUpdateController.newBuilder()
															.addAllowControllerMap(Uint32Pair.newBuilder().setKey(1).setValue(0).build())
															.addAllowControllerMap(Uint32Pair.newBuilder().setKey(2).setValue(0).build())
															.build())
										.build())
							.build();
		msgPackListToSend.add(m1);
							
		//m2 gain 5 first hand cards
		GCGMessagePack m2 = GCGMessagePack.newBuilder()
							.setActionType(GCGActionType.GCG_ACTION_TYPE_PHASE_EXIT)
							.setControllerId(0)
							.addMsgList(GCGMessage.newBuilder()
										.setClientPerform(GCGMsgClientPerform.newBuilder()
															.addParamList(1)
															.setPerformType(GCGClientPerformType.GCG_CLIENT_PERFORM_TYPE_FIRST_HAND)
															.build())
										.build())
							.build();
		msgPackListToSend.add(m2);
		
		//m3 PHASE CHANGE FROM START TO DRAW (always init START)
		GCGMessagePack m3 = GCGMessagePack.newBuilder()
							.setActionType(GCGActionType.GCG_ACTION_TYPE_NEXT_PHASE)
							.setControllerId(0)
							.addMsgList(GCGMessage.newBuilder()
										.setPhaseChange(GCGMsgPhaseChange.newBuilder()
														.setAfterPhase(GCGPhaseType.GCG_PHASE_TYPE_DRAW)
														.addAllowControllerMap(Uint32Pair.newBuilder().setKey(1).setValue(1).build())
														.addAllowControllerMap(Uint32Pair.newBuilder().setKey(2).setValue(1).build())
														.setBeforePhase(GCGPhaseType.GCG_PHASE_TYPE_START)
														.build())
										.build())
							.build();
		msgPackListToSend.add(m3);
		
		//m4 controller1 card details for drawing (draw 5)
		List<GCGMessage> msgList4 = new ArrayList<GCGMessage>();
		List<Integer> moveCardGuidList = new ArrayList<Integer>();
		
		List<Integer> cardList = this.decks.get(this.activeDeckId).getCardList();	//get card list frm deck to randomise pos
		for (int drawTimes = 1; drawTimes <= 5; drawTimes++) {
			//generate newCardGuid
			int newCardGuid = new Random().nextInt(4,34);
			while (gcgGameDetails.containsKey(newCardGuid)) { //to find not inited yet guid
				newCardGuid = new Random().nextInt(4,34);
			}
			msgList4.add(GCGMessage.newBuilder()
						  .setCardUpdate(GCGMsgCardUpdate.newBuilder()
											.setCard(GCGCard.newBuilder()
													 .setControllerId(1)
													 .setFaceType(this.unlockedCards.get(cardList.get(newCardGuid - 4)).getFaceType())
													 .setGuid(newCardGuid)
													 .setId(cardList.get(newCardGuid - 4))
													 .setIsShow(true)
													 .addAllSkillIdList(GameData.getGcgCardDataMap().get(cardList.get(newCardGuid - 4)).getSkillList())
													 .addAllTagList(List.of())
													 .addAllTokenList(List.of())
													 .build())
											.build())
						  .build());
			//for later ref
			moveCardGuidList.add(newCardGuid);
			//YOU MUST HAVE 3 char in team or below code breaks
			this.gcgGameDetails.put(newCardGuid, GcgGameCardDetail.of()
													.guid(newCardGuid)
													.cardId(cardList.get(newCardGuid - 4))
													//.elementType(GcgElementType.GCG_ELEMENT_NONE)
													.cardType(GcgGameCardDetail.GcgCardType.GCG_CARD)
													.gcgCardData(GameData.getGcgCardDataMap().get(cardList.get(newCardGuid - 4)))
													.build());
			//this.cardGuidToDataMap.put(guid, tempHardCodeMine.get(guid));
		}
		
		msgList4.add(GCGMessage.newBuilder().setMoveCard(GCGMsgMoveCard.newBuilder().addAllCardGuidList(moveCardGuidList).setControllerId(1).setFrom(GCGZoneType.GCG_ZONE_TYPE_DECK).setReason(GCGReason.GCG_REASON_DEFAULT).setTo(GCGZoneType.GCG_ZONE_TYPE_HAND).build()).build());

		GCGMessagePack m4 = GCGMessagePack.newBuilder()
							.setActionType(GCGActionType.GCG_ACTION_TYPE_DRAW)
							.setControllerId(1)
							.addAllMsgList(msgList4)
							.build();
		msgPackListToSend.add(m4);					
							
		//m5 controller2 card details for drawing shown to controller 1 (me)
		List<GCGMessage> msgList5 = new ArrayList<GCGMessage>();
		
		msgList5.add(GCGMessage.newBuilder().setCardUpdate(GCGMsgCardUpdate.newBuilder().setCard(GCGCard.newBuilder().setControllerId(2).setFaceType(0).setGuid(38).setId(0).setIsShow(false).build()).build()).build());
		msgList5.add(GCGMessage.newBuilder().setCardUpdate(GCGMsgCardUpdate.newBuilder().setCard(GCGCard.newBuilder().setControllerId(2).setFaceType(0).setGuid(48).setId(0).setIsShow(false).build()).build()).build());
		msgList5.add(GCGMessage.newBuilder().setCardUpdate(GCGMsgCardUpdate.newBuilder().setCard(GCGCard.newBuilder().setControllerId(2).setFaceType(0).setGuid(52).setId(0).setIsShow(false).build()).build()).build());
		msgList5.add(GCGMessage.newBuilder().setCardUpdate(GCGMsgCardUpdate.newBuilder().setCard(GCGCard.newBuilder().setControllerId(2).setFaceType(0).setGuid(66).setId(0).setIsShow(false).build()).build()).build());
		msgList5.add(GCGMessage.newBuilder().setCardUpdate(GCGMsgCardUpdate.newBuilder().setCard(GCGCard.newBuilder().setControllerId(2).setFaceType(0).setGuid(61).setId(0).setIsShow(false).build()).build()).build());
		msgList5.add(GCGMessage.newBuilder().setMoveCard(GCGMsgMoveCard.newBuilder().addAllCardGuidList(List.of(38,48,52,66,61)).setControllerId(2).addAllFailGuidList(new ArrayList<Integer>()).setFrom(GCGZoneType.GCG_ZONE_TYPE_DECK).setReason(GCGReason.GCG_REASON_DEFAULT).setTo(GCGZoneType.GCG_ZONE_TYPE_HAND).build()).build());
		
		//add drawn cards to class list for later no random
		//moveCardGuidList.addAll(List.of(38,48,52,66,61));
		
		GCGMessagePack m5 = GCGMessagePack.newBuilder()
							.setActionType(GCGActionType.GCG_ACTION_TYPE_DRAW)
							.setControllerId(2)
							.addAllMsgList(msgList5)
							.build();
		msgPackListToSend.add(m5);		
		
        // Send packets.
        this.player.sendPacket(new PacketGCGMessagePackNotify(msgPackListToSend, serverSeq));
		//this.player.sendPacket(new PacketGCGSkillPreviewNotify(this.getSkillPreview()));
		this.serverSeq += 1;
    }
	
	/* start match  handling of deck data */
    public synchronized void askDuel(Player player) {
		//SATAN CHECK make sure deck is 30 card and is 3 char cards
		GcgDeck deck = this.decks.get(this.activeDeckId);
		if (!(deck.getCardList().size() == 30) || !(deck.getCharacterCardList().size() == 3 || deck.getCharacterCardList().contains(0))) {
			this.player.sendPacket(new PacketGCGAskDuelRsp(12207));	//RET_GCG_DS_DECK_INVALID = 12207;
			return;
		}
		
		//RESET everything when duel start (reconnections to server be like L)
		this.serverSeq = 1; //always reset when match start
		this.playerDice = new HashMap<Integer,List<GCGDiceSideType>>();
		//this.onFieldGuidToDeckGuidMap = new HashMap<Integer,Integer>();
		this.charGuidToDataMap = new HashMap<Integer,GcgCharData>();
		//this.cardGuidToDataMap = new HashMap<Integer,GcgCardData>();
		this.currentControllerId = 0;
		this.onStageCardGuidPlayer1 = 0;
		this.onStageCardGuidPlayer2 = 34;//0
		this.isFirstSelect = true;
		this.setInDuel(true);	//you are now in a match
		//reset guids
		this.gcgGameDetails = new HashMap<Integer, GcgGameCardDetail>();
		this.availableGuids = new ArrayList<Integer>();
		
		//guids
		this.guidCounter = 1;
        
        //suppposedly take enemy and ur cards frm db and add as data here
		
		//for now hardcode
		//cardList				
		List<GCGCard> quickCards = new ArrayList<GCGCard>();
		List<GCGCard> historyCards = new ArrayList<GCGCard>();  //idk bro
		
		//add main char cards
		for (int charId : this.decks.get(this.activeDeckId).getCharacterCardList()) {
			//build and add card to proto				
			//if (charId != 0) {
			GcgCharData charData = GameData.getGcgCharDataMap().get(charId);
			GCGCard card = GCGCard.newBuilder()
							.setControllerId(1)
							.setFaceType(this.unlockedCards.get(charId).getFaceType())
							.setGuid(guidCounter)
							.setId(charId)
							.setIsShow(true)
							.addAllSkillIdList(charData.getSkillList())
							.addAllTagList(charData.getTagIdList())	//converted already from GCG_TAG_* -> tag id
							.addTokenList(GCGToken.newBuilder().setKey(GcgTokenType.CUR_HP.getId()).setValue(charData.getHp()).build())
							.addTokenList(GCGToken.newBuilder().setKey(GcgTokenType.MAX_HP.getId()).setValue(charData.getHp()).build())
							.addTokenList(GCGToken.newBuilder().setKey(GcgTokenType.CUR_ELEM_ENERGY.getId()).setValue(0).build())
							.addTokenList(GCGToken.newBuilder().setKey(GcgTokenType.MAX_ELEM_ENERGY.getId()).setValue(charData.getBurstCost()).build())
							.build();
			//add
			quickCards.add(card);
			historyCards.add(card);
			//}

			//add to temp map for later quick ref
			this.gcgGameDetails.put(guidCounter, GcgGameCardDetail.of()
													.guid(guidCounter)
													.cardId(charId)
													.elementType(GcgElementType.getTypeById(charData.getElementTypeId()))
													.cardType(GcgGameCardDetail.GcgCardType.GCG_CHAR)
													.maxHp(charData.getHp())
													.curHp(charData.getHp())
													.maxEnergy(charData.getBurstCost())
													.curEnergy(0)
													.gcgCharData(charData)
													.elementalTags(new ArrayList<Integer>())
													.build());
			this.charGuidToDataMap.put(guidCounter, GameData.getGcgCharDataMap().get(charId));	//deprec
			//increment guid counter
			this.guidCounter += 1;
		}
		
		//add other cards (hidden) into deck
		for (int i = 1; i <= 30; i++) {	//30 times
			GCGCard quickCard = GCGCard.newBuilder()
									.setControllerId(1)
									//.setFaceType(0)
									.setGuid(this.guidCounter)
									.build();
			quickCards.add(quickCard);
			this.guidCounter += 1;
		} 
		//this.guidCounter = 34;
		
		//theirs TO REFACTOR
		int deckId = GameData.getGcgGameDataMap().get(this.currentlyPlayedLevelId).getDeckId();
		List<Integer> theirCards = GameData.getGcgDeckDataMap().get(deckId).getCharacterCardList();//List.of(1101,1102,1403);
		for (int charId : theirCards) {
			GcgCharData charData = GameData.getGcgCharDataMap().get(charId);
			GCGCard card = GCGCard.newBuilder()
							.setControllerId(2)
							.setFaceType(0)	//since monsters do not have skins, all be 0
							.setGuid(guidCounter)
							.setId(charId)
							.setIsShow(true)
							.addAllSkillIdList(GameData.getGcgCharDataMap().get(charId).getSkillList())
							.addAllSkillLimitsList(List.of())
							.addAllTagList(charData.getTagIdList())
							.addTokenList(GCGToken.newBuilder().setKey(GcgTokenType.CUR_HP.getId()).setValue(charData.getHp()).build())
							.addTokenList(GCGToken.newBuilder().setKey(GcgTokenType.MAX_HP.getId()).setValue(charData.getHp()).build())
							.addTokenList(GCGToken.newBuilder().setKey(GcgTokenType.CUR_ELEM_ENERGY.getId()).setValue(0).build())
							.addTokenList(GCGToken.newBuilder().setKey(GcgTokenType.MAX_ELEM_ENERGY.getId()).setValue(charData.getBurstCost()).build())
							.build();
			//add
			quickCards.add(card);
			historyCards.add(card);
			//add to temp map for later quick ref
			this.gcgGameDetails.put(guidCounter, GcgGameCardDetail.of()
													.guid(guidCounter)
													.cardId(charId)
													.elementType(GcgElementType.getTypeById(charData.getElementTypeId()))
													.cardType(GcgGameCardDetail.GcgCardType.GCG_CHAR)
													.maxHp(charData.getHp())
													.curHp(charData.getHp())
													.maxEnergy(charData.getBurstCost())
													.curEnergy(0)
													.gcgCharData(charData)
													.elementalTags(new ArrayList<Integer>())
													.build());
			this.charGuidToDataMap.put(guidCounter,charData);
			this.guidCounter += 1;
			
		}
		for (int i = 1; i <= 30; i++) {
			GCGCard quickCard = GCGCard.newBuilder()
									.setControllerId(2)
									//.setFaceType(0)
									.setGuid(this.guidCounter)
									.build();
			quickCards.add(quickCard);
			this.guidCounter += 1;
		}
										
		//challengeList must be met before match ends
		List<Integer> challengeIds = List.of(1,906,907,901,903,904,905,908,909);
		List<GCGDuelChallenge> challengeList = new ArrayList<GCGDuelChallenge>();
		for (int id : challengeIds) {
			GCGDuelChallenge gcgChallenge = GCGDuelChallenge.newBuilder()
												.setChallengeId(id)
												.setCurProgress(1)
												.setTotalProgress(2)
												.build();
			challengeList.add(gcgChallenge);
		}
		
		//costReviseInfo
		GCGCostReviseInfo gcgCostReviseInfo = GCGCostReviseInfo.newBuilder()
												//.addAllAttackCostList(List.of())
												//.addAllCanUseHandCardIdList(List.of())
												//.addAllPlayCardCostList(List.of())
												//.addAllSelectOnStageCostList(List.of())
												//.setIsCanAttack(false)
												.build();
	
		//common var
		GCGZone emptyCardList = GCGZone.newBuilder().build();
		
		Map<Integer,GCGZone> modifyZoneMap123 = new HashMap<Integer,GCGZone>();
		modifyZoneMap123.put(1,emptyCardList);
		modifyZoneMap123.put(2,emptyCardList);
		modifyZoneMap123.put(3,emptyCardList);
		
		Map<Integer,GCGZone> modifyZoneMap343536 = new HashMap<Integer,GCGZone>();
		modifyZoneMap343536.put(34,emptyCardList);
		modifyZoneMap343536.put(35,emptyCardList);
		modifyZoneMap343536.put(36,emptyCardList);
		
		
		//fieldList
		GCGPlayerField field1 = GCGPlayerField.newBuilder()
									//character_zone
									.setCharacterZone(GCGZone.newBuilder().addAllCardList(List.of(1,2,3)).build())
									.setKOIGNIFNCMI(emptyCardList)
									.setCGBIBGGMGEF(emptyCardList)
									.setJLPLPDNEFJA(emptyCardList)
									.setDIFHGPIAFNK(emptyCardList)
									.setControllerId(1)
									.setDeckCardNum(30)
									//.addAllDiceSideList(List.of())
									//.addAllIntentionList(List.of())
									//.setIsPassed(false)
									.putAllModifyZoneMap(modifyZoneMap123)
									//.addAllWaitingList(List.of())
									.setCardBackShowId(this.decks.get(this.activeDeckId).getCardBackId())
									.setFieldShowId(this.decks.get(this.activeDeckId).getFieldId())
									.build();
									
		GCGPlayerField field2 = GCGPlayerField.newBuilder()
									.setCharacterZone(GCGZone.newBuilder().addAllCardList(List.of(34,35,36)).build())  //this is to determine main cards on field i think
									.setKOIGNIFNCMI(emptyCardList)
									.setCGBIBGGMGEF(emptyCardList)
									.setJLPLPDNEFJA(emptyCardList)
									.setDIFHGPIAFNK(emptyCardList)
									.setControllerId(2)
									.setDeckCardNum(30)
									//.addAllDiceSideList(List.of())
									//.addAllIntentionList(List.of())
									//.setIsPassed(false)
									.putAllModifyZoneMap(modifyZoneMap343536)
									//.addAllWaitingList(List.of())
									.setCardBackShowId(0)
									.setFieldShowId(0)
									.build();
		
													
		//unk snoobi
		Unk3300_ADHENCIFKNI unk3300ADHENCIFKNI1 = Unk3300_ADHENCIFKNI.newBuilder()
													//.setBeginTime(0)
													.setControllerId(1)
													//.setTimeStamp(0)
													.build();
		Unk3300_ADHENCIFKNI unk3300ADHENCIFKNI2 = Unk3300_ADHENCIFKNI.newBuilder()
													//.setBeginTime(0)
													.setControllerId(2)
													//.setTimeStamp(0)
													.build();
													
		//phase helper FIRST TURN
		GCGPhase phase = GCGPhase.newBuilder()
						.setPhaseType(GCGPhaseType.GCG_PHASE_TYPE_START)
						.putAllowControllerMap(1,1)
						.putAllowControllerMap(2,0)
						.build();
						
		//show info list for controller allocation
		GCGControllerShowInfo controller1 = GCGControllerShowInfo.newBuilder()
											.setPsnId("")
											.setNickName(player.getNickname())
											.setOnlineId("")
											.setProfilePicture(ProfilePicture.newBuilder().setAvatarId(player.getHeadImage()).setCostumeId(0).build())
											.setControllerId(1)
											.build();
											
		GCGControllerShowInfo controller2 = GCGControllerShowInfo.newBuilder()
											.setPsnId("")
											.setNickName("")
											.setOnlineId("")
											.setProfilePicture(ProfilePicture.newBuilder().setAvatarId(0).setCostumeId(0).build())
											.setControllerId(2)
											.build();
											
											
		//THE MOST FUCKING PAINFUL SHIT FUCK U
		//m1
		List<GCGMessage> msgList1 = new ArrayList<GCGMessage>();
		msgList1.add(GCGMessage.newBuilder()
						.setPhaseChange(GCGMsgPhaseChange.newBuilder()
											.setAfterPhase(GCGPhaseType.GCG_PHASE_TYPE_START)
											.addAllowControllerMap(Uint32Pair.newBuilder().setKey(1).setValue(1).build())
											.addAllowControllerMap(Uint32Pair.newBuilder().setKey(2).setValue(1).build())
											.setBeforePhase(GCGPhaseType.GCG_PHASE_TYPE_INVALID)
											.build())
						.build());
		msgList1.add(GCGMessage.newBuilder()
						.setUpdateController(GCGMsgUpdateController.newBuilder()
												.addAllowControllerMap(Uint32Pair.newBuilder().setKey(1).setValue(1).build())
												.addAllowControllerMap(Uint32Pair.newBuilder().setKey(2).setValue(0).build())
												.build())
						.build());
					
		GCGMessagePack m1 = GCGMessagePack.newBuilder()
							.setActionType(GCGActionType.GCG_ACTION_TYPE_NONE)
							.setControllerId(0)
							.addAllMsgList(msgList1)
							.build();
							
		//send message always blank phase continue
		List<GCGMessage> msgList2 = new ArrayList<GCGMessage>();
		msgList2.add(GCGMessage.newBuilder().setPhaseContinue(GCGMsgPhaseContinue.newBuilder().build()).build());
		//msgList1 = AddRestDefault(msgList1, List.of());
		GCGMessagePack m2 = GCGMessagePack.newBuilder()
							.setActionType(GCGActionType.GCG_ACTION_TYPE_SEND_MESSAGE)
							.setControllerId(0)
							.addAllMsgList(msgList2)
							.build();					
							
		List<GCGMessagePack> historyMsgPackList = List.of(m1,m2);
		
		//decks
		List<Integer> cardIdList = new ArrayList<>();
		cardIdList.addAll(this.decks.get(this.activeDeckId).getCharacterCardList());
		cardIdList.addAll(this.decks.get(this.activeDeckId).getCardList());
							
		//building
		GCGDuel duel = GCGDuel.newBuilder()
						.setCurControllerId(1)
						.addAllUnk3300CDCMBOKBLAK(List.of(unk3300ADHENCIFKNI1, unk3300ADHENCIFKNI2))
						//.setUnk3300JBBMBKGOONO(0) //commneted due to obfuscation
						//.setUnk3300JHDDNKFPINA(0) //commneted due to obfuscation
						.setBusinessType(GCGGameBusinessType.GCG_GAME_BUSINESS_TYPE_NONE)
						.addAllCardIdList(cardIdList)
						.addAllCardList(quickCards) //the rest lazy hardcode
						.addAllChallengeList(challengeList)
						.setControllerId(1) //
						.setCostRevise(gcgCostReviseInfo)
						.addAllFieldList(List.of(field1,field2))
						//.addAllForbidFinishChallengeList(List.of())
						.setGameId(0)
						.addAllHistoryCardList(historyCards)
						.addAllHistoryMsgPackList(historyMsgPackList) //L
						.addAllIntentionList(List.of())
						.setPhase(phase)
						.setRound(1)
						.setServerSeq(serverSeq)
						.addAllShowInfoList(List.of(controller1,controller2))
						.build();

        // Send packets.
		this.player.sendPacket(new PacketGCGAskDuelRsp(this.player, serverSeq, duel));
		this.serverSeq += 1;
    }

    /********************
     * operation handler (painful)
     ********************/
    public synchronized boolean operationHandle(Player player, GCGOperationReq req) {
        // action type handler
//************************************************************
		if (req.getOp().hasOpRedraw()) { //redraw at start of game
			//final list
			List<GCGMessagePack> msgPackListToSend = new ArrayList<GCGMessagePack>();
			
			//ALWAYS UPDATE CONTROLLERS
			GCGMessage updateController = GCGMessage.newBuilder()
											.setUpdateController(GCGMsgUpdateController.newBuilder()
																	.addAllowControllerMap(Uint32Pair.newBuilder().setKey(1).setValue(0).build())
																	.addAllowControllerMap(Uint32Pair.newBuilder().setKey(2).setValue(1).build())
																	.build())
											.build();
			msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_NONE).setControllerId(0).addMsgList(updateController).build());
					
			//redraw, CORRECT ORDER IS cardremove1,cardremove2,movecard(1,2)backtodeck,cardadd1,cardadd2,movecard(1,2)fromdecktohand
			List<Integer> redrawCardList = req.getOp().getOpRedraw().getCardListList();
			List<Integer> addCardsGuidList = new ArrayList<Integer>();
			int replaceCardControllerId = 0;
			if (redrawCardList.size() != 0) {
				//handle reroll card here
				List<GCGMessage> msgListRedraw = new ArrayList<GCGMessage>();

				//remove
				for (int cardGuid : redrawCardList) {
					// skam way of finding controllerId
					replaceCardControllerId  = cardGuid <= 33 ? 1 : 2;
					//reset id to 0 for removed
					GCGMessage cardUpdateRemove = GCGMessage.newBuilder()
												.setCardUpdate(GCGMsgCardUpdate.newBuilder()
																.setCard(GCGCard.newBuilder()
																			.setControllerId(replaceCardControllerId) // should determine controller id based off card guid
																			.setFaceType(0)
																			.setGuid(cardGuid)
																			.setId(0)  //removed
																			.setIsShow(false)
																			.build()))
												.build();
					//add to redraw msg list
					msgListRedraw.add(cardUpdateRemove);
				}
				GCGMessage moveCardRemove = GCGMessage.newBuilder()
												.setMoveCard(GCGMsgMoveCard.newBuilder()
																.addAllCardGuidList(redrawCardList) 
																.setControllerId(replaceCardControllerId)
																.setFrom(GCGZoneType.GCG_ZONE_TYPE_HAND)
																.setReason(GCGReason.GCG_REASON_DEFAULT)
																.setTo(GCGZoneType.GCG_ZONE_TYPE_DECK)
																.build())
												.build();
				msgListRedraw.add(moveCardRemove);
				
				//add
				List<Integer> cardList = this.decks.get(this.activeDeckId).getCardList();	//get card list frm deck to randomise pos
				for (int cardGuid : redrawCardList) {
					// skam way of finding controllerId
					replaceCardControllerId  = cardGuid <= 33 ? 1 : 2;
					//generate newCardGuid
					int newCardGuid = 0;
					if (replaceCardControllerId == 1) {
						newCardGuid = new Random().nextInt(4,34);
						while (this.gcgGameDetails.containsKey(newCardGuid)) {
							newCardGuid = new Random().nextInt(4,34);
						}
					} else if (replaceCardControllerId == 2) {
						newCardGuid = new Random().nextInt(37,67);
						while (this.gcgGameDetails.containsKey(newCardGuid)) {
							newCardGuid = new Random().nextInt(37,67);
						}
					}
					GCGMessage cardUpdateAdd = GCGMessage.newBuilder()
												.setCardUpdate(GCGMsgCardUpdate.newBuilder()
																.setCard(GCGCard.newBuilder()
																			.setControllerId(cardGuid <= 33 ? 1 : 2)
																			.setFaceType(this.unlockedCards.get(cardList.get(newCardGuid - 4)).getFaceType())
																			.setGuid(newCardGuid)  //FOR NOW reset only one else die
																			.setId(cardList.get(newCardGuid - 4))  //assumes all players have 3 char and 30 play cards
																			.addAllSkillIdList(GameData.getGcgCardDataMap().get(cardList.get(newCardGuid - 4)).getSkillList())  //add tags if any todo
																			.setIsShow(true)
																			.build()))
												.build();
					// add random guid
					addCardsGuidList.add(newCardGuid);
					// add to msg list
					msgListRedraw.add(cardUpdateAdd);
					
					//update for later reference
					//this.cardGuidToDataMap.put(newCardGuid, GameData.getGcgCardDataMap().get(cardList.get(newCardGuid - 4))); //deprec
					this.gcgGameDetails.put(newCardGuid, GcgGameCardDetail.of()
													.guid(newCardGuid)
													.cardId(cardList.get(newCardGuid - 4))
													//.elementType(GcgElementType.GCG_ELEMENT_NONE)
													.cardType(GcgGameCardDetail.GcgCardType.GCG_CARD)
													.gcgCardData(GameData.getGcgCardDataMap().get(cardList.get(newCardGuid - 4)))
													.build());
				}
				// add moved cards from deck to hand
				GCGMessage moveCardAdd = GCGMessage.newBuilder()
												.setMoveCard(GCGMsgMoveCard.newBuilder()
																.addAllCardGuidList(addCardsGuidList) 
																.setControllerId(replaceCardControllerId)
																.setFrom(GCGZoneType.GCG_ZONE_TYPE_DECK)
																.setReason(GCGReason.GCG_REASON_DEFAULT)
																.setTo(GCGZoneType.GCG_ZONE_TYPE_HAND)
																.build())
												.build();
				msgListRedraw.add(moveCardAdd);
				msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_REDRAW).setControllerId(redrawCardList.get(0) <= 33 ? 1 : 2).addAllMsgList(msgListRedraw).build());
			}
					
			//send msg?			
			GCGMessage phaseContinue = GCGMessage.newBuilder().setPhaseContinue(GCGMsgPhaseContinue.newBuilder().build()).build();
			msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_SEND_MESSAGE).setControllerId(0).addMsgList(phaseContinue).build());
						
			//combined 3m.json
			//update controller (idt need again)
			GCGMessage updateController2 = GCGMessage.newBuilder()
											.setUpdateController(GCGMsgUpdateController.newBuilder()
																	.addAllowControllerMap(Uint32Pair.newBuilder().setKey(1).setValue(0).build())
																	.addAllowControllerMap(Uint32Pair.newBuilder().setKey(2).setValue(0).build())
																	.build())
											.build();
			msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_NONE).setControllerId(0).addMsgList(updateController2).build());
			
			//phase change to select on field char
			GCGMessage phaseChange = GCGMessage.newBuilder()
									.setPhaseChange(GCGMsgPhaseChange.newBuilder()
													.setAfterPhase(GCGPhaseType.GCG_PHASE_TYPE_ON_STAGE)
													.addAllowControllerMap(Uint32Pair.newBuilder().setKey(1).setValue(1).build())
													.addAllowControllerMap(Uint32Pair.newBuilder().setKey(2).setValue(1).build())
													.setBeforePhase(GCGPhaseType.GCG_PHASE_TYPE_DRAW)
													.build())
									.build();
			msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_NEXT_PHASE).setControllerId(0).addMsgList(phaseChange).build());
			
			//change current controller in class
			this.currentControllerId = 1;
			
			// final packet
			this.player.sendPacket(new PacketGCGMessagePackNotify(msgPackListToSend, serverSeq));
			//this.player.sendPacket(new PacketGCGSkillPreviewNotify(this.getSkillPreview()));
			this.serverSeq += 1;
//*************************************************************		
		} else if (req.getOp().hasOpSelectOnStage()) { //select on field char
			//final list
			List<GCGMessagePack> msgPackListToSend = new ArrayList<GCGMessagePack>();
			
			//vars
			int onStageCardGuid = req.getOp().getOpSelectOnStage().getCardGuid();
			this.onStageCardGuidPlayer1 = onStageCardGuid; //for now just like this, cleanup later
			this.onStageCardGuidPlayer2 = onStageCardGuidPlayer2; //for now just like this, cleanup later
			
			//ALWAYS UPDATE CONTROLLERS
			GCGMessage updateController = GCGMessage.newBuilder()
											.setUpdateController(GCGMsgUpdateController.newBuilder()
																	.addAllowControllerMap(Uint32Pair.newBuilder().setKey(1).setValue(0).build())
																	.addAllowControllerMap(Uint32Pair.newBuilder().setKey(2).setValue(0).build())
																	.build())
											.build();
			msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_NONE).setControllerId(0).addMsgList(updateController).build());
			
			// SELECT ONSTAGE NOTIFY
			GCGMessage selectOnStageMe = GCGMessage.newBuilder()
											.setSelectOnStage(GCGMsgSelectOnStage.newBuilder()
																.setCardGuid(onStageCardGuidPlayer1)
																.setControllerId(1)
																.setReason(GCGReason.GCG_REASON_DEFAULT)
																.build())
											.build();
			msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_SELECT_ONSTAGE).setControllerId(1).addMsgList(selectOnStageMe).build());
			if (this.isFirstSelect) { //if firsr select on stage, set ganyu as on stage for enemy
				GCGMessage selectOnStageThem = GCGMessage.newBuilder()
												.setSelectOnStage(GCGMsgSelectOnStage.newBuilder()
																	.setCardGuid(onStageCardGuidPlayer2) //for now hardcode the enemy coz idk how ik it
																	.setControllerId(2)
																	.setReason(GCGReason.GCG_REASON_DEFAULT)
																	.build())
												.build();
				msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_SELECT_ONSTAGE).setControllerId(2).addMsgList(selectOnStageThem).build());
			}
				
			//send blank msg usual?			
			GCGMessage blank = GCGMessage.newBuilder().build();
			msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_SEND_MESSAGE).setControllerId(0).addMsgList(blank).build());
			
			// ALSO SEND DICE ROLL if first select
			//update controller since combine w 5m.json
			GCGMessage updateController2 = GCGMessage.newBuilder()
											.setUpdateController(GCGMsgUpdateController.newBuilder()
																	.addAllowControllerMap(Uint32Pair.newBuilder().setKey(1).setValue(0).build())
																	.addAllowControllerMap(Uint32Pair.newBuilder().setKey(2).setValue(0).build())
																	.build())
											.build();
			msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_NONE).setControllerId(0).addMsgList(updateController2).build());
				
			if (this.isFirstSelect) {
				//phase change to roll
				GCGMessage phaseChange = GCGMessage.newBuilder()
										.setPhaseChange(GCGMsgPhaseChange.newBuilder()
														.setAfterPhase(GCGPhaseType.GCG_PHASE_TYPE_DICE)
														.addAllowControllerMap(Uint32Pair.newBuilder().setKey(1).setValue(1).build())
														.addAllowControllerMap(Uint32Pair.newBuilder().setKey(2).setValue(1).build())
														.setBeforePhase(GCGPhaseType.GCG_PHASE_TYPE_ON_STAGE)
														.build())
										.build();
				msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_NEXT_PHASE).setControllerId(0).addMsgList(phaseChange).build());
				
				// actual roll, make list of random dice also
				int rollCount = 8; //preset
				List<GCGDiceSideType> diceSideList = new ArrayList<GCGDiceSideType>();
				for (int i = 1; i <= rollCount; i++) {
					diceSideList.add(GCGDiceSideType.forNumber(new Random().nextInt(1,9)));
				}
				GCGMessage rollMe = GCGMessage.newBuilder()
										.setDiceRoll(GCGMsgDiceRoll.newBuilder()
														.setControllerId(1)
														.setDiceNum(rollCount)
														.addAllDiceSideList(diceSideList)
														.build())
										.build();
				GCGMessage rollThem = GCGMessage.newBuilder()
										.setDiceRoll(GCGMsgDiceRoll.newBuilder()
														.setControllerId(2)
														.setDiceNum(rollCount)
														.addAllDiceSideList(new ArrayList<GCGDiceSideType>())
														.build())
										.build();
				this.isFirstSelect = false; //frm now on no more roll when select onstage
				msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_ROLL).setControllerId(1).addMsgList(rollMe).build());
				msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_ROLL).setControllerId(2).addMsgList(rollThem).build());
				this.playerDice.put(this.currentControllerId,diceSideList); //update dice list for later ref
			} else {
				GCGMessage phaseChange = GCGMessage.newBuilder()
											.setPhaseChange(GCGMsgPhaseChange.newBuilder()
																.setAfterPhase(GCGPhaseType.GCG_PHASE_TYPE_MAIN)
																.setBeforePhase(GCGPhaseType.GCG_PHASE_TYPE_MAIN)
																.addAllowControllerMap(Uint32Pair.newBuilder().setKey(1).setValue(1).build())
																.addAllowControllerMap(Uint32Pair.newBuilder().setKey(2).setValue(0).build())
																.build())
											.build();
				msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_NONE).setControllerId(0).addMsgList(phaseChange).build());
				msgPackListToSend.add(GCGMessagePack.newBuilder()
										.setActionType(GCGActionType.GCG_ACTION_TYPE_NOTIFY_COST)
										.setControllerId(0)
										.addMsgList(this.getNotifyCostMsgList())
										.build());
			}
			
			// final packet
			this.player.sendPacket(new PacketGCGMessagePackNotify(msgPackListToSend, serverSeq));
			this.player.sendPacket(new PacketGCGSkillPreviewNotify(this.getSkillPreview()));
			this.serverSeq += 1;
//******************************************************************
		} else if (req.getOp().hasOpPlayCard()) {
			//final list
			List<GCGMessagePack> msgPackListToSend = new ArrayList<GCGMessagePack>();
			//no update controller unless is a combat action type attack card snoobi
			
			//replace_card_guid
			//target_card_guid
			//card_guid
			//cost_dice_index_list
			GCGOperationPlayCard op = req.getOp().getOpPlayCard();
			List<Integer> targetCardGuids = op.getTargetCardGuidListList();
			int playedCardGuid = op.getCardGuid();
			GcgGameCardDetail cardPlayed = this.gcgGameDetails.get(playedCardGuid);
			
			//this sniffed idk why
			GCGMessage clientPerform = GCGMessage.newBuilder()
										.setClientPerform(GCGMsgClientPerform.newBuilder()
															.setPerformType(GCGClientPerformType.GCG_CLIENT_PERFORM_TYPE_PMECCJLHICF)
															.build())
										.build();
			msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_NONE).setControllerId(0).addMsgList(clientPerform).build());
			
			//MISSING COSTDICE TO IMPLEMENT
			
			//build playCardMsgList
			List<GCGMessage> playCardMsgList = new ArrayList<>();
			//play card info
			GCGMessage playCard = GCGMessage.newBuilder()
									.setCardUpdate(GCGMsgCardUpdate.newBuilder()
													.setCard(GCGCard.newBuilder()
																.addAllSkillIdList(cardPlayed.getGcgCardData().getSkillList())
																.addAllTagList(cardPlayed.getGcgCardData().getTagIdList())
																.setControllerId(this.currentControllerId)
																.setId(cardPlayed.getGcgCardData().getId())
																.setIsShow(true)
																.setGuid(cardPlayed.getGuid())
																.build())
													.build())
									.build();
			playCardMsgList.add(playCard);
			//remove card frm hand										
			GCGMessage removeCards = GCGMessage.newBuilder()
										.setRemoveCards(GCGMsgRemoveCards.newBuilder()
															.setZone(GCGZoneType.GCG_ZONE_TYPE_HAND)
															.setControllerId(this.currentControllerId)
															.addCardGuidList(cardPlayed.getGuid())
															.setReason(GCGReason.GCG_REASON_PLAY_CARD)
															.build())
										.build();
			playCardMsgList.add(removeCards);
			//use skill start
			GCGMessage useSkill = GCGMessage.newBuilder()
									.setUseSkill(GCGMsgUseSkill.newBuilder()
													.setCardGuid(cardPlayed.getGuid())
													.setSkillId(cardPlayed.getGcgCardData().getSkillList().get(0))	//rn most only 1 anyways
													.build())
									.build();
			playCardMsgList.add(useSkill);
			//MISSING EXEC HANDLING
			GCGMessage useSkillEnd = GCGMessage.newBuilder()
										.setUseSkillEnd(GCGMsgUseSkillEnd.newBuilder()
															.setCardGuid(cardPlayed.getGuid())
															.setSkillId(cardPlayed.getGcgCardData().getSkillList().get(0))	//rn most only 1 anyways
															.build())
										.build();
			playCardMsgList.add(useSkillEnd);
			msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_PLAY_CARD).setControllerId(this.currentControllerId).addAllMsgList(playCardMsgList).build());
			//end build playCardMsgList
			//rn game details do not take into account removal of card, only adding
			//notifycost
			msgPackListToSend.add(GCGMessagePack.newBuilder()
										.setActionType(GCGActionType.GCG_ACTION_TYPE_NOTIFY_COST)
										.setControllerId(0)
										.addMsgList(this.getNotifyCostMsgList())
										.build());
			// final packet
			this.player.sendPacket(new PacketGCGMessagePackNotify(msgPackListToSend, serverSeq));
			this.player.sendPacket(new PacketGCGSkillPreviewNotify(this.getSkillPreview()));
			this.serverSeq += 1;
//******************************************************************
		} else if (req.getOp().hasOpReroll()) {
			//final list
			List<GCGMessagePack> msgPackListToSend = new ArrayList<GCGMessagePack>();
			
			//ALWAYS UPDATE CONTROLLERS
			GCGMessage updateController = GCGMessage.newBuilder()
											.setUpdateController(GCGMsgUpdateController.newBuilder()
																	.addAllowControllerMap(Uint32Pair.newBuilder().setKey(1).setValue(0).build())
																	.addAllowControllerMap(Uint32Pair.newBuilder().setKey(2).setValue(0).build())
																	.build())
											.build();
			msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_NONE).setControllerId(0).addMsgList(updateController).build());
			
			//handle actual reroll dice
			//FOR NOW ASSUMES ONLY CONTROLLER 1 SHLD BE NOTIFIED OFF REROLL SELF
			List<Integer> diceRerollIndexList = req.getOp().getOpReroll().getDiceIndexListList();
			List<GCGDiceSideType> diceList = this.playerDice.get(this.currentControllerId);
			//when rerolling, it sends the previous 8 dice list again, and only changes the idx (based 0) of the reroll specified, (tldr, sends repeated data)
			if (diceRerollIndexList.size() != 0) {
				for (int idx : diceRerollIndexList) {
					//replaces specific index
					diceList.set(idx, GCGDiceSideType.forNumber(new Random().nextInt(1,9)));
				}
				this.playerDice.put(this.currentControllerId,diceList); //update player dice for later ref
				GCGMessage diceReroll = GCGMessage.newBuilder()
										.setDiceReroll(GCGMsgDiceReroll.newBuilder()
														.setControllerId(1) //shld be current controller id
														.addAllDiceSideList(this.playerDice.get(this.currentControllerId))
														.addAllSelectDiceIndexList(diceRerollIndexList)
														.build())
										.build();
				msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_REROLL).setControllerId(1).addMsgList(diceReroll).build());
			}
			
			//phase change to pre main
			GCGMessage phaseChange1 = GCGMessage.newBuilder()
									.setPhaseChange(GCGMsgPhaseChange.newBuilder()
													.setAfterPhase(GCGPhaseType.GCG_PHASE_TYPE_PRE_MAIN)
													.setBeforePhase(GCGPhaseType.GCG_PHASE_TYPE_DICE)
													.build())
									.build();
			msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_NEXT_PHASE).setControllerId(0).addMsgList(phaseChange1).build());
			//phase change to main (idk why mhy sep)
			GCGMessage phaseChange2 = GCGMessage.newBuilder()
									.setPhaseChange(GCGMsgPhaseChange.newBuilder()
													.setAfterPhase(GCGPhaseType.GCG_PHASE_TYPE_MAIN)
													.addAllowControllerMap(Uint32Pair.newBuilder().setKey(1).setValue(1).build())
													.setBeforePhase(GCGPhaseType.GCG_PHASE_TYPE_PRE_MAIN)
													.build())
									.build();
			msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_NEXT_PHASE).setControllerId(0).addMsgList(phaseChange2).build());
			
			// TELLS CLIENT THE COST OF THE active CHAR SKILLS
			//phase change to roll
			//GCGCostReviseInfo
			  //repeated uint32 can_use_hand_card_id_list = 15;
			  //repeated GCGSelectOnStageCostInfo select_on_stage_cost_list = 13;
			  //repeated GCGPlayCardCostInfo play_card_cost_list = 5;
			  //repeated GCGAttackCostInfo attack_cost_list = 12;
			  //bool is_can_attack = 14;
			/*List<GCGSelectOnStageCostInfo> selectOnStageCostList = List.of(GCGSelectOnStageCostInfo.newBuilder().setCardGuid(1).addAllCostMap(List.of(Uint32Pair.newBuilder().setKey(10).setValue(1).build())).build(),
																		   GCGSelectOnStageCostInfo.newBuilder().setCardGuid(2).addAllCostMap(List.of(Uint32Pair.newBuilder().setKey(10).setValue(1).build())).build(),
																		   GCGSelectOnStageCostInfo.newBuilder().setCardGuid(3).addAllCostMap(List.of(Uint32Pair.newBuilder().setKey(10).setValue(1).build())).build());
			//this is from GCGCardExcelConfigData.json
			List<GCGPlayCardCostInfo> playCardCostList = List.of(GCGPlayCardCostInfo.newBuilder().setCardId(321006).build(),  //this one none idk why
																 GCGPlayCardCostInfo.newBuilder().setCardId(311101).addAllCostMap(List.of(Uint32Pair.newBuilder().setKey(3).setValue(0).build())).build(), // 3 is diff die and 10 is same die afaik
																 GCGPlayCardCostInfo.newBuilder().setCardId(322002).addAllCostMap(List.of(Uint32Pair.newBuilder().setKey(10).setValue(0).build())).build(),
																 GCGPlayCardCostInfo.newBuilder().setCardId(322001).addAllCostMap(List.of(Uint32Pair.newBuilder().setKey(3).setValue(0).build())).build(),
																 GCGPlayCardCostInfo.newBuilder().setCardId(322007).addAllCostMap(List.of(Uint32Pair.newBuilder().setKey(3).setValue(0).build())).build());
			//KEY
			  //10 is any die
			  //14 is electro die
			  //1 is energy cost
			List<Integer> skillList = this.charGuidToDataMap.get(this.onStageCardGuidPlayer1).getSkillList();
			
			//cost
			List<GCGAttackCostInfo> attackCostList = List.of(GCGAttackCostInfo.newBuilder().addAllCostMap(List.of()).setSkillId(skillList.get(0)).build(),
															 GCGAttackCostInfo.newBuilder().addAllCostMap(List.of()).setSkillId(skillList.get(1)).build(),
															 GCGAttackCostInfo.newBuilder().addAllCostMap(List.of(Uint32Pair.newBuilder().setKey(1).setValue(0).build())).setSkillId(skillList.get(2)).build(),
															 GCGAttackCostInfo.newBuilder().addAllCostMap(List.of(Uint32Pair.newBuilder().setKey(1).setValue(0).build())).setSkillId(skillList.size() == 4 ? skillList.get(3) : 0).build()
															 );
			
			GCGCostReviseInfo costReviseInfo = GCGCostReviseInfo.newBuilder()
												.setIsCanAttack(true)
												.addAllCanUseHandCardIdList(List.of(321006,311101,322002,322001,322007)) // shld not be hardcoded obv
												.addAllSelectOnStageCostList(selectOnStageCostList) //shld be frm res
												.addAllPlayCardCostList(playCardCostList)  //this shld be from res
												.addAllAttackCostList(attackCostList)
												.build();
			GCGMessage costRevise = GCGMessage.newBuilder()
									.setCostRevise(GCGMsgCostRevise.newBuilder()
													.setControllerId(1) // assume for now only self shld be notified
													.setCostRevise(costReviseInfo)
													.build())
									.build();						
			List<GCGMessage> msgListCostRevise = List.of(costRevise);*/
			msgPackListToSend.add(GCGMessagePack.newBuilder()
									.setActionType(GCGActionType.GCG_ACTION_TYPE_NOTIFY_COST)
									.setControllerId(0)
									.addMsgList(this.getNotifyCostMsgList())
									.build());
			
			// final packet
			this.player.sendPacket(new PacketGCGMessagePackNotify(msgPackListToSend, serverSeq));
			this.player.sendPacket(new PacketGCGSkillPreviewNotify(this.getSkillPreview()));
			this.serverSeq += 1;
//********************************************************************************
		} else if (req.getOp().hasOpPass()) {
			//this.currentControllerId = 2;
			// switch turns to enemy
			//order
			/*1)pass
			  2)new phase main -> main but allow controller map now becomes 2
			  3)notify cost (not done) TODO*/
			List<GCGMessagePack> msgPackListToSend = new ArrayList<GCGMessagePack>();
			
			//ALWAYS UPDATE CONTROLLERS
			GCGMessage updateController = GCGMessage.newBuilder()
											.setUpdateController(GCGMsgUpdateController.newBuilder()
																	.addAllAllowControllerMap(List.of(Uint32Pair.newBuilder().setKey(this.currentControllerId).setValue(0).build()))
																	.build())
											.build();						
			List<GCGMessage> msgListController = List.of(updateController);
			msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_NONE).setControllerId(0).addAllMsgList(msgListController).build());
			
			//HANDLE PASS
			GCGMessage pass = GCGMessage.newBuilder()
								.setPass(GCGMsgPass.newBuilder()
											.setControllerId(this.currentControllerId)
											.build())
								.build();						
			List<GCGMessage> msgListPass = List.of(pass);
			msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_PASS).setControllerId(this.currentControllerId).addAllMsgList(msgListPass).build());
			
			//swap first then phase change to 
			this.currentControllerId = this.currentControllerId == 1 ? 2 : 1; //quick switch
			
			//NEXT PHASE main -> main p1 -> p2
			GCGMessage phaseChange = GCGMessage.newBuilder()
									.setPhaseChange(GCGMsgPhaseChange.newBuilder()
													.setAfterPhase(GCGPhaseType.GCG_PHASE_TYPE_MAIN)
													.addAllAllowControllerMap(List.of(Uint32Pair.newBuilder().setKey(this.currentControllerId).setValue(1).build())) // alr swapped to other
													.setBeforePhase(GCGPhaseType.GCG_PHASE_TYPE_MAIN)
													.build())
									.build();						
			List<GCGMessage> msgListPhaseChange = List.of(phaseChange);
			msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_NEXT_PHASE).setControllerId(0).addAllMsgList(msgListPhaseChange).build());
			
			// final packet
			this.player.sendPacket(new PacketGCGMessagePackNotify(msgPackListToSend, serverSeq));
			this.player.sendPacket(new PacketGCGSkillPreviewNotify(this.getSkillPreview()));
			this.serverSeq += 1;
//********************************************************************************
		} else if (req.getOp().hasOpAttack()) {
			// atk enemy, msg 7651 - fishcl normal attack ganyu once, forces switch turns btw and coz switch to another char due to shenhe card
			/*1)order use up dice list when atk
			  2)used skill
			  3)??token change
			  4)damage result due to skill
			  5)used skill end
			  6)?? another token change*/
			  //final list
			List<GCGMessagePack> msgPackListToSend = new ArrayList<GCGMessagePack>();
			
			//ALWAYS UPDATE CONTROLLERS to prevent sneak spam actions
			GCGMessage updateController = GCGMessage.newBuilder()
											.setUpdateController(GCGMsgUpdateController.newBuilder()
																	.addAllowControllerMap(Uint32Pair.newBuilder()
																							.setKey(this.currentControllerId)
																							.setValue(0)
																							.build())
																	.build())
											.build();
			msgPackListToSend.add(GCGMessagePack.newBuilder()
									.setActionType(GCGActionType.GCG_ACTION_TYPE_NONE)
									.setControllerId(0)
									.addMsgList(updateController)
									.build());
			
			//HANDLE ATTACK
			List<GCGMessage> msgListAttack = new ArrayList<>(); //build list here
			List<Integer> costDiceIndexList = req.getOp().getOpAttack().getCostDiceIndexListList();
			int skillId = req.getOp().getOpAttack().getSkillId();
			
			//no cost for now debug REMEMBER TO ADD AND UPDATE GCGDETAILS (unimplemented)
			/*GCGMessage costDice = GCGMessage.newBuilder()
											.setCostDice(GCGMsgCostDice.newBuilder()
															.setControllerId(this.currentControllerId)
															.setReason(GCGReason.GCG_REASON_COST)
															.addAllSelectDiceIndexList(costDiceIndexList)
															.build())
											.build();
			msgListAttack.add(costDice);*/
											
			//building part
			//left side notify skill used
			GCGMessage useSkill = GCGMessage.newBuilder()
											.setUseSkill(GCGMsgUseSkill.newBuilder()
															.setCardGuid(this.currentControllerId == 1 ? onStageCardGuidPlayer1 : onStageCardGuidPlayer2)
															.setSkillId(skillId)
															.build())
											.build();
			msgListAttack.add(useSkill);//add to msg list
			
			//add elemental aura & get details frm res
			GcgGameCardDetail enemyCardInfo = this.gcgGameDetails.get(this.currentControllerId == 1 ? onStageCardGuidPlayer2 : onStageCardGuidPlayer1);
			GcgGameCardDetail selfCardInfo = this.gcgGameDetails.get(this.currentControllerId == 1 ? onStageCardGuidPlayer1 : onStageCardGuidPlayer2);
			String skillConfig = GameData.getGcgSkillDataMap().get(skillId).getSkillConfig();
			int damage = 0;
			int elementType = 0;
			if (GameData.getGcgConfigSkillDataMap().get(skillConfig) == null) {
				Grasscutter.getLogger().error("NO SKILL CONFIG FOUND FOR SKILL_ID {}", skillId);
			} else {
				Grasscutter.getLogger().warn("USING SKILL CONFIG {} OF SKILL_ID {}", skillConfig, skillId); //debug
				var declaredValue = GameData.getGcgConfigSkillDataMap()
											.get(skillConfig)
											.getDeclaredValueMap()
											.get("__KEY__DAMAGE");
				if (declaredValue != null) {
					damage = Integer.parseInt(declaredValue.getValue());
				}
				elementType = GcgElementType.getTypeByName(GameData.getGcgConfigSkillDataMap()
															.get(skillConfig)
															.getDeclaredValueMap()
															.get("__KEY__ELEMENT")
															.getValue())
											.getId();
			}
			
			if (elementType != 0) { //not physical dmg
				GCGMessage tokenChangeEffectElement = GCGMessage.newBuilder()
												.setTokenChange(GCGMsgTokenChange.newBuilder()
																.setBefore(0)
																.setAfter(1)
																.setCardGuid(this.currentControllerId == 1 ? onStageCardGuidPlayer2 : onStageCardGuidPlayer1)
																.setReason(GCGReason.GCG_REASON_EFFECT)
																.setTokenType(GcgTokenType.getTokenTypeFromElementType(elementType)) //aura
																.build())
												.build();
				msgListAttack.add(tokenChangeEffectElement);//add to msg list if got element change
				enemyCardInfo.addElementalAura(GcgTokenType.getTokenTypeFromElementType(elementType));
			}
			
			//hp change
			int beforeHp = enemyCardInfo.getCurHp();
			int afterHp = enemyCardInfo.changeCardValue(GcgCardValueType.GCG_CARD_VALUE_CUR_HP, beforeHp - damage); //(3 for now)
			GCGMessage tokenChangeEffectDamage = GCGMessage.newBuilder()
											.setTokenChange(GCGMsgTokenChange.newBuilder()
															.setBefore(beforeHp)//currhp
															.setAfter(afterHp)	//currhp - dmg
															.setCardGuid(this.currentControllerId == 1 ? onStageCardGuidPlayer2 : onStageCardGuidPlayer1)
															.setReason(GCGReason.GCG_REASON_EFFECT_DAMAGE)
															.setTokenType(1)
															.build())
											.build();
			msgListAttack.add(tokenChangeEffectDamage);//add to msg list
			
			//remove all auras on death
			if (afterHp == 0) {
				//clear auras
				for (int tokenId : enemyCardInfo.getElementalTags()) {
					GCGMessage tokenChangeEffectElementDeath = GCGMessage.newBuilder()
												.setTokenChange(GCGMsgTokenChange.newBuilder()
																.setBefore(1)
																.setAfter(0)
																.setCardGuid(enemyCardInfo.getGuid())
																.setReason(GCGReason.GCG_REASON_EFFECT)
																.setTokenType(tokenId) //aura
																.build())
												.build();
					msgListAttack.add(tokenChangeEffectElementDeath);//add to msg list if got element change
				}
				//update gcggame details
				enemyCardInfo.clearElementalAura();
			}
			
			//check reaction
			List<Integer> reactionIdList = this.checkReactions();	//add in skill result
			List<GCGDamageDetail> reactionList = reactionIdList.stream().map(reactionId -> GCGDamageDetail.newBuilder().setSkillId(reactionId).build()).toList();
			
			//make card wack other card real
			GCGMessage skillResult = GCGMessage.newBuilder()
											.setSkillResult(GCGMsgSkillResult.newBuilder()
															//src_card_guid?
															.setSrcCardGuid(this.currentControllerId == 1 ? onStageCardGuidPlayer1 : onStageCardGuidPlayer2)
															//from_result_seq to order damage done (is like a atk sequence order)
															.setFromResultSeq(0)
															//result_seq
															.setResultSeq(1)
															//effect_element
															//.setElementType(GameData.getGcgSkillDataMap().get(skillId).getElementType())
															.setElementType(elementType)
															//last_hp before damage
															.setLastHp(beforeHp)
															//hp after taking dmg
															.setHp(afterHp)
															//damage done to hp removal
															.setDamage(damage)
															//detail_list
															.addAllDetailList(reactionList) // extra abilities such as extra dmg and elemental reaxn
															//skill_id
															.setSkillId(skillId)
															//target_card_guid
															.setTargetCardGuid(this.currentControllerId == 1 ? onStageCardGuidPlayer2 : onStageCardGuidPlayer1)
															.build())
											.build();
			msgListAttack.add(skillResult);//add to msg list
			
			//add reaction skill if any REMOVE COZ FUCK U OMFG FUCKKKKK
			List<GCGMessage> reactions = this.getReactionMsgList(reactionIdList);
			if (reactions.size() != 0) {
				msgListAttack.addAll(reactions);
			}
			
			//tell client the skill used has now ended and u shld touch grass
			GCGMessage useSkillEnd = GCGMessage.newBuilder()
											.setUseSkillEnd(GCGMsgUseSkillEnd.newBuilder()
															.setCardGuid(onStageCardGuidPlayer1)
															.setSkillId(skillId)
															.build())
											.build();
			msgListAttack.add(useSkillEnd);//add to msg list
			
			//add energy to onstage char
			//cardInfo = this.gcgGameDetails.get(this.currentControllerId == 1 ? onStageCardGuidPlayer1 : onStageCardGuidPlayer2);
			int beforeEnergy = selfCardInfo.getCurEnergy();
			int afterEnergy = selfCardInfo.changeCardValue(GcgCardValueType.GCG_CARD_VALUE_CUR_ENERGY, beforeEnergy + 1);
			GCGMessage tokenChangeEffectEnergy = GCGMessage.newBuilder()
											.setTokenChange(GCGMsgTokenChange.newBuilder()
															.setBefore(beforeEnergy)
															.setAfter(afterEnergy)
															.setCardGuid(this.currentControllerId == 1 ? onStageCardGuidPlayer1 : onStageCardGuidPlayer2)
															.setReason(GCGReason.GCG_REASON_ATTACK) //GCG_REASON_COST when use burst
															.setTokenType(GcgTokenType.CUR_ELEM_ENERGY.getId())   //this cld be energy recharge
															.build())
											.build();
			msgListAttack.add(tokenChangeEffectEnergy);//add to msg list
											
			//missing costDice removal coz debugg
			//msgListAttack.addAll(List.of(useSkill,tokenChangeEffectElement, tokenChangeEffectDamage,skillResult,useSkillEnd,tokenChangeEffectEnergy));
			//msgListAttack.addAll(birds); //TESTBIRD
			msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_ATTACK).setControllerId(0).addAllMsgList(msgListAttack).build());
			
			
			//if not die then send
			if (afterHp != 0) {
				msgPackListToSend.addAll(this.switchTurns());
			} else {
				GCGMessage phaseChange = GCGMessage.newBuilder()
											.setPhaseChange(GCGMsgPhaseChange.newBuilder()
															.setAfterPhase(GCGPhaseType.GCG_PHASE_TYPE_DIE)
															.addAllowControllerMap(Uint32Pair.newBuilder().setKey(this.currentControllerId == 1 ? 2 : 1).setValue(1).build())
															.setBeforePhase(GCGPhaseType.GCG_PHASE_TYPE_MAIN)
															.build())
											.build();
				msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_SPECIAL_PHASE).setControllerId(0).addMsgList(phaseChange).build());
			}
			
			// final packet
			this.player.sendPacket(new PacketGCGMessagePackNotify(msgPackListToSend, serverSeq));
			this.player.sendPacket(new PacketGCGSkillPreviewNotify(this.getSkillPreview()));
			this.serverSeq += 1;
			
			//handle death REFACTOR HELL
			if (afterHp == 0) {	//if a card died
				msgPackListToSend = new ArrayList<>(); //re init SNOO
				//ALWAYS UPDATE CONTROLLERS to prevent sneak spam actions
				GCGMessage updateControllerDie = GCGMessage.newBuilder()
												.setUpdateController(GCGMsgUpdateController.newBuilder()
																		.addAllowControllerMap(Uint32Pair.newBuilder()
																								.setKey(this.currentControllerId == 1 ? 2 : 1)
																								.setValue(0)
																								.build())
																		.build())
												.build();
				msgPackListToSend.add(GCGMessagePack.newBuilder()
										.setActionType(GCGActionType.GCG_ACTION_TYPE_NONE)
										.setControllerId(0)
										.addMsgList(updateControllerDie)
										.build());
																
				//rn hardcode swap for p2 only
				if (this.currentControllerId == 1) {
					this.onStageCardGuidPlayer2 = onStageCardGuidPlayer2 == 36 ? 34 : onStageCardGuidPlayer2 + 1;
					GCGMessage selectOnStage = GCGMessage.newBuilder()
												.setSelectOnStage(GCGMsgSelectOnStage.newBuilder()
																	.setReason(GCGReason.GCG_REASON_PPPCKFIIJEJ)	//???
																	.setCardGuid(onStageCardGuidPlayer2)
																	.setControllerId(2)
																	.build())
												.build();
					msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_SELECT_ONSTAGE).setControllerId(2).addMsgList(selectOnStage).build());
					GCGMessage nextPhase = GCGMessage.newBuilder()
											.setPhaseChange(GCGMsgPhaseChange.newBuilder()
															.setAfterPhase(GCGPhaseType.GCG_PHASE_TYPE_MAIN)
															.addAllowControllerMap(Uint32Pair.newBuilder().setKey(1).setValue(1).build())
															.addAllowControllerMap(Uint32Pair.newBuilder().setKey(2).setValue(0).build())
															.setBeforePhase(GCGPhaseType.GCG_PHASE_TYPE_DIE)
															.build())
											.build();
					msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_NEXT_PHASE).setControllerId(0).addMsgList(nextPhase).build());
				}
				
				msgPackListToSend.addAll(this.switchTurns()); //switch player turn
				// final packet
				this.player.sendPacket(new PacketGCGMessagePackNotify(msgPackListToSend, serverSeq));
				this.player.sendPacket(new PacketGCGSkillPreviewNotify(this.getSkillPreview()));
				this.serverSeq += 1;
			}
//********************************************************************************
		} else if (req.getOp().hasOpReboot()) { //elemental tuning dice to curr char elemental type
			//get proto data
			List<Integer> diceIndexList = req.getOp().getOpReboot().getDiceIndexListList();
			List<Integer> costCardGuidList = req.getOp().getOpReboot().getCostCardGuidListList(); //this one is nice guid so good
			
			List<GCGMessagePack> msgPackListToSend = new ArrayList<GCGMessagePack>();
			List<GCGMessage> msgList = new ArrayList<GCGMessage>();
			
			//build proto (remove card that was used to elemental tune the die)
			GCGMessage removeCards = GCGMessage.newBuilder()
										.setRemoveCards(GCGMsgRemoveCards.newBuilder()
															.addAllCardGuidList(costCardGuidList)
															.setControllerId(this.currentControllerId)
															.setReason(GCGReason.GCG_REASON_REBOOT) //constant
															.setZone(GCGZoneType.GCG_ZONE_TYPE_HAND) //as of now only hand decks can be sacrificed
															.build())
										.build();
			msgList.add(removeCards);
			
			//old dice map build
			Map<Integer, GCGDiceSideType> fromDiceMap = new HashMap<Integer,GCGDiceSideType>();	//old dice before boot
			for (int diceIndex = 0; diceIndex <= 7; diceIndex++) {
				GCGDiceSideType type = this.playerDice.get(this.currentControllerId).get(diceIndex);
				fromDiceMap.put(diceIndex, type);
			}
			
			//get current char element type
			GCGDiceSideType newDiceType = this.charGuidToDataMap.get(this.currentControllerId == 1 ? onStageCardGuidPlayer1 : onStageCardGuidPlayer2).getElementType(); //get element type of current char
	
			//new dice map build and replace for later reference
			List<GCGDiceSideType> rebootDiceList = this.playerDice.get(this.currentControllerId);
			Map<Integer, GCGDiceSideType> toDiceMap = new HashMap<Integer,GCGDiceSideType>();	//new dice after boot
			for (int diceIndex = 0; diceIndex <= 7; diceIndex++) {										//same as fromDiceMap
				GCGDiceSideType type = this.playerDice.get(this.currentControllerId).get(diceIndex);
				toDiceMap.put(diceIndex, type);
			}
			for (int replaceIndex : diceIndexList) {
				rebootDiceList.set(replaceIndex, newDiceType);
				toDiceMap.put(replaceIndex, newDiceType);										//replace index w new dice
			}
			
			//build proto (update dice)
			GCGMessage addDice = GCGMessage.newBuilder()
									.setAddDice(GCGMsgAddDice.newBuilder()
												.putAllOldDiceMap(fromDiceMap)
												.putAllNewDiceMap(toDiceMap)
												.setChangeCount(diceIndexList.size()) //idk this,probs is the amt of dice changed
												.setControllerId(this.currentControllerId)
												.setReason(GCGReason.GCG_REASON_REBOOT)
												.build())
									.build();
			msgList.add(addDice);
			
			//
			msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_REBOOT).setControllerId(this.currentControllerId).addAllMsgList(msgList).build());
			
			//MISSING COST REVISE AGAIN
											
			/*for (int i = 0; i < diceIndexList.size(); i++) {
				//get var
				int diceIndex = diceIndexList.get(i);
				
				//from
				Map<Integer, GCGDiceSideType> fromDiceMap = new HashMap<Integer,GCGDiceSideType>();
				fromDiceMap.put(diceIndex, this.playerDice.get(diceIndex));
				//to
				Map<Integer, GCGDiceSideType> toDiceMap = new HashMap<Integer,GCGDiceSideType>();
				
				//GCGDiceSideType.forNumber(GameData.getGcgSkillDataMap().get(onStageCardGuidPlayer1).getElementType())
				GCGDiceSideType newDiceType = this.charGuidToDataMap.get(onStageCardGuidPlayer1).getElementType();
				toDiceMap.put(diceIndex, newDiceType); //supposed to be current element char, but res not ready so hardcode TODO GCGCharExcelConfigData.json
				this.playerDice.set(diceIndex, newDiceType); //update list
				
				GCGMessage addDice = GCGMessage.newBuilder()
											.setAddDice(GCGMsgAddDice.newBuilder()
															//one of it was dice_map and the other didnt exist, i would assume dice_map was the new dice_map in 3.2
															.putAllOldDiceMap(fromDiceMap)
															.putAllNewDiceMap(toDiceMap)
															.setChangeCount(0) //idk this
															.setControllerId(this.currentControllerId)
															.setReason(GCGReason.GCG_REASON_REBOOT)
															.build())
											.build();
				List<GCGMessage> msgListReboot = List.of(removeCards,addDice);
				msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_REBOOT).setControllerId(this.currentControllerId).addAllMsgList(msgListReboot).build());
			}*/
			//supposed to cost revise @ m8078.json L43 msg 2.1, to remove usuable cards but i lazy 
			
			// final packet
			this.player.sendPacket(new PacketGCGMessagePackNotify(msgPackListToSend, serverSeq));
			this.player.sendPacket(new PacketGCGSkillPreviewNotify(this.getSkillPreview()));
			this.serverSeq += 1;
//********************************************************************************
		} else if (req.getOp().hasOpSurrender()) {
			//implement match end actual, for now just tp
			int controllerIdLose = this.currentControllerId;
			int controllerIdWin = this.currentControllerId == 1 ? 2 : 1; //opposite
			List<GCGMessagePack> msgPackListToSend = new ArrayList<GCGMessagePack>();
			
			//ALWAYS UPDATE CONTROLLERS (allow no one do anything)
			GCGMessage updateController = GCGMessage.newBuilder()
											.setUpdateController(GCGMsgUpdateController.newBuilder()
																	.addAllowControllerMap(Uint32Pair.newBuilder().setKey(1).setValue(0).build())
																	.addAllowControllerMap(Uint32Pair.newBuilder().setKey(2).setValue(0).build())
																	.build())
											.build();
			msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_NONE).setControllerId(0).addMsgList(updateController).build());
			
			//phase change to end
			GCGMessage phaseChange = GCGMessage.newBuilder()
											.setPhaseChange(GCGMsgPhaseChange.newBuilder()
															.setAfterPhase(GCGPhaseType.GCG_PHASE_TYPE_FIN)
															.addAllAllowControllerMap(List.of())
															.setBeforePhase(GCGPhaseType.GCG_PHASE_TYPE_MAIN)
															.build())
											.build();
			//GCGEndReason
			  //GCG_END_REASON_DEFAULT = 0;
			  //GCG_END_REASON_DIE = 1;
			  //GCG_END_REASON_SURRENDER = 2;
			  //GCG_END_REASON_DISCONNECTED = 3;
			  //GCG_END_REASON_ROUND_LIMIT = 4;
			  //GCG_END_REASON_GM = 5;
			  //GCG_END_REASON_NO_PLAYER = 6;
			  //GCG_END_REASON_GIVE_UP = 7;
			  //GCG_END_REASON_INIT_TIMEOUT = 8;
			  //GCG_END_REASON_EFFECT = 9;
			  //GCG_END_REASON_Unk3300_INAPHKAKKHF = 10;
			//notify winner
			GCGMessage gameOver = GCGMessage.newBuilder()
											.setGameOver(GCGMsgGameOver.newBuilder()
															.setEndReason(GCGEndReason.GCG_END_REASON_SURRENDER)
															.setWinControllerId(controllerIdWin)
															.build())
											.build();
			List<GCGMessage> msgListGameOver = List.of(phaseChange,gameOver);
			msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_GAME_OVER).setControllerId(0).addAllMsgList(msgListGameOver).build());
			
			//send msg?			
			GCGMessage blank = GCGMessage.newBuilder().build();
			List<GCGMessage> msgListSendMessage = List.of(blank);
			msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_SEND_MESSAGE).setControllerId(0).addAllMsgList(msgListSendMessage).build());
			
			// final packet
			this.player.sendPacket(new PacketGCGMessagePackNotify(msgPackListToSend, serverSeq));
			//this.player.sendPacket(new PacketGCGSkillPreviewNotify(this.getSkillPreview()));
			this.serverSeq += 1;
			this.isLastDuelWin = controllerIdWin == 1 ? true : false;
			List<ItemParam> rewardItemList = List.of(
												ItemParam.newBuilder().setItemId(107021).setCount(300).build(),
												ItemParam.newBuilder().setItemId(223).setCount(1).build(),
												ItemParam.newBuilder().setItemId(201).setCount(100).build()
											);
			this.player.sendPacket(new PacketGCGSettleNotify(rewardItemList, List.of(1,3,16), this.currentlyPlayedLevelId, this.isLastDuelWin, GCGGameBusinessType.GCG_GAME_BUSINESS_TYPE_TAVERN_CHALLENGE, controllerIdWin, List.of(), GCGEndReason.GCG_END_REASON_SURRENDER));
		}
		
		//always rsp
        this.player.sendPacket(new PacketGCGOperationRsp(req.getOpSeq(), 0));
		return true;
    }
	
	/*************************
	 * helper funcs (neater) *
	 *************************/
	public synchronized GCGMessage getNotifyCostMsgList() {
		//onstage cost list
		List<GCGSelectOnStageCostInfo> selectOnStageCostList = List.of(
			GCGSelectOnStageCostInfo.newBuilder()
				.setCardGuid(this.currentControllerId == 1 ? 1 : 34)
				.addCostMap(Uint32Pair.newBuilder().setKey(10).setValue(1).build())
				.build(),
			GCGSelectOnStageCostInfo.newBuilder()
				.setCardGuid(this.currentControllerId == 1 ? 2 : 35)
				.addCostMap(Uint32Pair.newBuilder().setKey(10).setValue(1).build())
				.build(),
			GCGSelectOnStageCostInfo.newBuilder()
				.setCardGuid(this.currentControllerId == 1 ? 3 : 36)
				.addCostMap(Uint32Pair.newBuilder().setKey(10).setValue(1).build())
				.build()
			);
		//attack cost list
		List<GCGAttackCostInfo> attackCostList = new ArrayList<>();
		for (int skillId : this.charGuidToDataMap.get(this.currentControllerId == 1 ? this.onStageCardGuidPlayer1 : this.onStageCardGuidPlayer2).getSkillList()) {
			attackCostList.add(GCGAttackCostInfo.newBuilder()
								.setSkillId(skillId)
								.addAllCostMap(GameData.getGcgSkillDataMap().get(skillId).getCostMap())
								.build());
		}
		//play card cost list
		List<GCGPlayCardCostInfo> playCardCostList = new ArrayList<>();
		List<Integer> canUseHandCardIdList = new ArrayList<>();
		for (Map.Entry<Integer,GcgGameCardDetail> entry : this.gcgGameDetails.entrySet()) {
			if (entry.getKey() >= 4 && entry.getKey() <= 33) { 
				playCardCostList.add(GCGPlayCardCostInfo.newBuilder()
										.setCardId(entry.getValue().getCardId())
										.addAllCostMap(entry.getValue().getGcgCardData().getCostMap())
										.build());
				canUseHandCardIdList.add(entry.getValue().getCardId());
			}
		}
		GCGMessage costRevise = GCGMessage.newBuilder()
									.setCostRevise(GCGMsgCostRevise.newBuilder()
													.setControllerId(this.currentControllerId)
													.setCostRevise(GCGCostReviseInfo.newBuilder()
																	.setIsCanAttack(true)
																	.addAllCanUseHandCardIdList(canUseHandCardIdList) //supposed to get current card in hand
																	.addAllSelectOnStageCostList(selectOnStageCostList)
																	.addAllAttackCostList(attackCostList)
																	.addAllPlayCardCostList(playCardCostList)
																	.build())
													.build())
									.build();
		return costRevise;
	}
	
	/***************
	 * switch turns for player atk combat action
	 ***************/
	public synchronized List<GCGMessagePack> switchTurns() {
		//is force next turn i lazy do now so oh well TODO cum seggs real balls
		List<GCGMessagePack> msgPackListToSend = new ArrayList<>();
		this.currentControllerId = this.currentControllerId == 1 ? 2 : 1;
		
		//NEXT PHASE main -> main p1 -> p2 only if it was not a killing shot
		GCGMessage phaseChange = GCGMessage.newBuilder()
								.setPhaseChange(GCGMsgPhaseChange.newBuilder()
												.setAfterPhase(GCGPhaseType.GCG_PHASE_TYPE_MAIN)
												.addAllowControllerMap(Uint32Pair.newBuilder().setKey(this.currentControllerId).setValue(1).build()) // alr swapped to other
												.setBeforePhase(GCGPhaseType.GCG_PHASE_TYPE_MAIN)
												.build())
								.build();
		msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_NEXT_PHASE).setControllerId(0).addMsgList(phaseChange).build());
		
		//NEXT PHASE main -> main p2 -> p1 (TEST debug to be always my turn, remove this later)
		this.currentControllerId = this.currentControllerId == 1 ? 2 : 1;
		GCGMessage phaseChange2 = GCGMessage.newBuilder()
								.setPhaseChange(GCGMsgPhaseChange.newBuilder()
												.setAfterPhase(GCGPhaseType.GCG_PHASE_TYPE_MAIN)
												.addAllowControllerMap(Uint32Pair.newBuilder().setKey(this.currentControllerId).setValue(1).build()) // alr swapped to other
												.setBeforePhase(GCGPhaseType.GCG_PHASE_TYPE_MAIN)
												.build())
								.build();
		msgPackListToSend.add(GCGMessagePack.newBuilder().setActionType(GCGActionType.GCG_ACTION_TYPE_NEXT_PHASE).setControllerId(0).addMsgList(phaseChange2).build());
		
		//FINALLY NOTIFY COST
		msgPackListToSend.add(GCGMessagePack.newBuilder()
									.setActionType(GCGActionType.GCG_ACTION_TYPE_NOTIFY_COST)
									.setControllerId(0)
									.addMsgList(this.getNotifyCostMsgList())
									.build());
		return msgPackListToSend;
	}
	
	/***********************************
	 * check if any possible reactions *
	 ***********************************/
	public synchronized List<Integer> checkReactions() {
		return this.checkPotentialReactions(0);
	}
	
	/********************************************************
	 * check if any possible reactions if new ele was added *
	 ********************************************************/
	public synchronized List<Integer> checkPotentialReactions(int newAura) {
		List<Integer> reactionList = new ArrayList<>();
		int firstCheck = this.onStageCardGuidPlayer2;
		int meCheck = this.onStageCardGuidPlayer1;
		
		Collection<GcgElementReactionData> possibleReactions = GameData.getGcgElementReactionDataMap().values();
		
		//this is in tokenId form btw not die id dont mixmix uwu
		List<Integer> elementalTags = new ArrayList<Integer>(this.gcgGameDetails.get(firstCheck).getElementalTags());	//enemy 1st
		if (newAura != 0) {
			elementalTags.add(newAura);
		}
		for (GcgElementReactionData reaction : possibleReactions) {
			int firstElement = GcgTokenType.getTokenTypeFromElementType(reaction.getFirstElement());
			int secondElement = GcgTokenType.getTokenTypeFromElementType(reaction.getSecondElement());
			if (elementalTags.contains(firstElement) && elementalTags.contains(secondElement)) {
				reactionList.add(reaction.getId());
			}
		}
		
		return reactionList;
	}
	
	/*************************************************
	 * returns the required elemental reaxn msg list *
	 *************************************************/
	public synchronized List<GCGMessage> getReactionMsgList(List<Integer> reactionIdList) {
		//rn only checks on field coz  lazy so fuck
		//ORDER BY reactionBegin [tokenChangeAura tokenChangeHp skillResult] * AMT_HIT reactionEnd
		List<GCGMessage> msgList = new ArrayList<>();
		for (int reactionId : reactionIdList) {
			GcgGameCardDetail enemyCardInfo = this.gcgGameDetails.get(this.currentControllerId == 1 ? this.onStageCardGuidPlayer2 : this.onStageCardGuidPlayer1);
			GcgGameCardDetail selfCardInfo = this.gcgGameDetails.get(this.currentControllerId == 1 ? this.onStageCardGuidPlayer2 : this.onStageCardGuidPlayer1);
			//reactionBegin
			msgList.add(GCGMessage.newBuilder()
							.setReactionBegin(GCGMsgReactionBegin.newBuilder()
												.setCardGuid(this.currentControllerId == 1 ? this.onStageCardGuidPlayer2 : this.onStageCardGuidPlayer1)
												.setSkillId(reactionId)
												.build())
							.build());
			//removeAura 1
			msgList.add(GCGMessage.newBuilder()
							.setTokenChange(GCGMsgTokenChange.newBuilder()
												.setReason(GCGReason.GCG_REASON_EFFECT)
												.setCardGuid(this.currentControllerId == 1 ? this.onStageCardGuidPlayer2 : this.onStageCardGuidPlayer1)
												.setAfter(0)
												.setBefore(1)
												.setTokenType(GcgTokenType.getTokenTypeFromElementType(GameData.getGcgElementReactionDataMap().get(reactionId).getFirstElement()))
												.build())
							.build());
			//removeAura 2
			msgList.add(GCGMessage.newBuilder()
							.setTokenChange(GCGMsgTokenChange.newBuilder()
												.setReason(GCGReason.GCG_REASON_EFFECT)
												.setCardGuid(this.currentControllerId == 1 ? this.onStageCardGuidPlayer2 : this.onStageCardGuidPlayer1)
												.setAfter(0)
												.setBefore(1)
												.setTokenType(GcgTokenType.getTokenTypeFromElementType(GameData.getGcgElementReactionDataMap().get(reactionId).getSecondElement()))
												.build())
							.build());
			//remove hp TODO WHEN I GET ARND READING RES
			/*String skillConfig = GameData.getGcgSkillDataMap().get(reactionId).getSkillConfig();
			int damage = 0;
			int elementType = 0;
			String target = "CHARACTER_ONSTAGE"; //default
			if (GameData.getGcgConfigSkillDataMap().get(skillConfig) == null) {
				Grasscutter.getLogger().error("NO SKILL CONFIG FOUND FOR SKILL_ID {}", reactionId);
			} else {
				Grasscutter.getLogger().warn("USING SKILL CONFIG {} OF SKILL_ID {}", skillConfig, reactionId); //debug
				damage = Integer.parseInt(GameData.getGcgConfigSkillDataMap()
											.get(skillConfig)
											.getDeclaredValueMap()
											.get("__KEY__DAMAGE")
											.getValue());
				elementType = GcgElementType.getTypeByName(GameData.getGcgConfigSkillDataMap()
															.get(skillConfig)
															.getDeclaredValueMap()
															.get("__KEY__ELEMENT")
															.getValue())
											.getId();
				target = GameData.getGcgConfigSkillDataMap()
											.get(skillConfig)
											.getEffectList()
											.stream()
											.filter(effect -> effect.getDeclareType().equals("ConfigGCGExecEffectDamage"))
											.toList()
											.get(0)
											.getTargetCharacter();
			}
			if (target.equals("CHARACTER_ONSTAGE")) {
				int beforeHp = enemyCardInfo.getCurHp();
				int afterHp = enemyCardInfo.changeCardValue(GcgCardValueType.GCG_CARD_VALUE_CUR_HP, beforeHp - damage);
				msgList.add(GCGMessage.newBuilder()
								.setTokenChange(GCGMsgTokenChange.newBuilder()
													.setReason(GCGReason.GCG_REASON_EFFECT)
													.setCardGuid(enemyCardInfo.getGuid())
													.setAfter(afterHp)
													.setBefore(beforeHp)
													.setTokenType(GcgTokenType.CUR_HP.getId())
													.build())
								.build());
				msgList.add(GCGMessage.newBuilder()
								.setSkillResult(GCGMsgSkillResult.newBuilder()
													//src_card_guid?
													.setSrcCardGuid(this.currentControllerId == 1 ? onStageCardGuidPlayer1 : onStageCardGuidPlayer2)
													//from_result_seq to order damage done (is like a atk sequence order)
													.setFromResultSeq(0)
													//result_seq
													.setResultSeq(1)
													//effect_element
													//.setElementType(GameData.getGcgSkillDataMap().get(skillId).getElementType())
													.setElementType(elementType)
													//last_hp before damage
													.setLastHp(beforeHp)
													//hp after taking dmg
													.setHp(afterHp)
													//damage done to hp removal
													.setDamage(damage)
													//detail_list
													.addAllDetailList(List.of()) // no detail for reaction unless another reac fk u i lazy
													//skill_id
													.setSkillId(reactionId)
													//target_card_guid
													.setTargetCardGuid(enemyCardInfo.getGuid())
												.build())
								.build());
			} else if (target.equals("CHARACTER_TARGET_OTHERS")) {	//not including self
				var a =  this.gcgGameDetails.get(this.currentControllerId == 1 ? 34 : 1);
				var b =  this.gcgGameDetails.get(this.currentControllerId == 1 ? 35 : 2);
				var c =  this.gcgGameDetails.get(this.currentControllerId == 1 ? 36 : 3);
				
				for (var cardInfo : List.of(a,b,c)) {
					if (cardInfo.getGuid() != (this.currentControllerId == 1 ? this.onStageCardGuidPlayer2 : this.onStageCardGuidPlayer1)) {
						int beforeHp = cardInfo.getCurHp();
						int afterHp = cardInfo.changeCardValue(GcgCardValueType.GCG_CARD_VALUE_CUR_HP, beforeHp - damage);
						msgList.add(GCGMessage.newBuilder()
										.setTokenChange(GCGMsgTokenChange.newBuilder()
															.setReason(GCGReason.GCG_REASON_EFFECT)
															.setCardGuid(cardInfo.getGuid())
															.setAfter(afterHp)
															.setBefore(beforeHp)
															.setTokenType(GcgTokenType.CUR_HP.getId())
															.build())
										.build());
						msgList.add(GCGMessage.newBuilder()
										.setSkillResult(GCGMsgSkillResult.newBuilder()
															//src_card_guid?
															.setSrcCardGuid(this.currentControllerId == 1 ? onStageCardGuidPlayer1 : onStageCardGuidPlayer2)
															//from_result_seq to order damage done (is like a atk sequence order)
															.setFromResultSeq(0)
															//result_seq
															.setResultSeq(1)
															//effect_element
															//.setElementType(GameData.getGcgSkillDataMap().get(skillId).getElementType())
															.setElementType(elementType)
															//last_hp before damage
															.setLastHp(beforeHp)
															//hp after taking dmg
															.setHp(afterHp)
															//damage done to hp removal
															.setDamage(damage)
															//detail_list
															.addAllDetailList(List.of()) // no detail for reaction unless another reac fk u i lazy
															//skill_id
															.setSkillId(reactionId)
															//target_card_guid
															.setTargetCardGuid(cardInfo.getGuid())
														.build())
										.build());
					}
				}
			}
			//end removehp*/
			//update gameDetails
			enemyCardInfo.removeElementalAura(GcgTokenType.getTokenTypeFromElementType(GameData.getGcgElementReactionDataMap().get(reactionId).getFirstElement()));
			enemyCardInfo.removeElementalAura(GcgTokenType.getTokenTypeFromElementType(GameData.getGcgElementReactionDataMap().get(reactionId).getSecondElement()));
			//reactionEnd
			msgList.add(GCGMessage.newBuilder()
							.setReactionEnd(GCGMsgReactionEnd.newBuilder()
												.setSkillId(reactionId)
												.build())
							.build());				
		}
		return msgList;
	}
	
	/***********************************************
	 * returns the skill preview for next turn uwu *
	 ***********************************************/
	public synchronized GCGSkillPreviewNotify getSkillPreview() {
		int myOnStageCardGuid = this.currentControllerId == 1 ? this.onStageCardGuidPlayer1 : this.onStageCardGuidPlayer2;
		int enemyOnStageCardGuid = this.currentControllerId == 1 ? this.onStageCardGuidPlayer2 : this.onStageCardGuidPlayer1;
		GCGSkillPreviewNotify.Builder proto = GCGSkillPreviewNotify.newBuilder()
												.setControllerId(this.currentControllerId)
												.setOnstageCardGuid(this.currentControllerId == 1 ? this.onStageCardGuidPlayer1 : this.onStageCardGuidPlayer2)
												.addAllPlayCardList(List.of());
		//onstage preview
		for (int i = 1; i <= 3; i++) {
			proto.addChangeOnstagePreviewList(GCGChangeOnstageInfo.newBuilder()
												.setCardGuid(i)
												.setIsQuick(true)	//fast action when switch char
												.build());
		}
		//damage preview
		for (int skillId : this.gcgGameDetails.get(myOnStageCardGuid).getGcgCharData().getSkillList()) {
			//calculate damage
			String skillConfig = GameData.getGcgSkillDataMap().get(skillId).getSkillConfig();
			int damage = 0;
			if (GameData.getGcgConfigSkillDataMap().get(skillConfig) == null) {
				Grasscutter.getLogger().error("NO SKILL CONFIG FOUND FOR SKILL_ID {}, PREVIEW DMG SET TO 0", skillId);
			} else {
				Grasscutter.getLogger().warn("USING SKILL CONFIG {} OF SKILL_ID {} FOR PREVIEW DMG", skillConfig, skillId); //debug
				var declaredValue = GameData.getGcgConfigSkillDataMap()
											.get(skillConfig)
											.getDeclaredValueMap()
											.get("__KEY__DAMAGE");
				if (declaredValue != null) {
					damage = Integer.parseInt(declaredValue.getValue());
				} else {
					Grasscutter.getLogger().warn("NO SKILL DAMAGE {} OF SKILL_ID {} FOR PREVIEW DMG", skillConfig, skillId); //debug
				}
			}
			//calc new energy per skill
			int afterEnergy = 0;
			if (GameData.getGcgSkillDataMap().get(skillId).isElementalBurst()) {
				afterEnergy = 0;
			} else {
				//is alr max energy
				if (this.gcgGameDetails.get(myOnStageCardGuid).getCurEnergy() == this.gcgGameDetails.get(myOnStageCardGuid).getMaxEnergy()) {
					afterEnergy = this.gcgGameDetails.get(myOnStageCardGuid).getMaxEnergy();
				// else + 1
				} else {
					afterEnergy = this.gcgGameDetails.get(myOnStageCardGuid).getCurEnergy() + 1;
				}
			}
			//calc new aura if character does not have aura attatched
			int potentialAura = 0;
			List<Integer> currentAuras = this.gcgGameDetails.get(enemyOnStageCardGuid).getElementalTags();
			//if (!currentAuras.contains(GcgTokenType.getTokenTypeFromElementType(GameData.getGcgSkillDataMap().get(skillId).getElementType()))) {
				potentialAura = GcgTokenType.getTokenTypeFromElementType(GameData.getGcgSkillDataMap().get(skillId).getElementType());
			//}
			List<Integer> possibleReactions = this.checkPotentialReactions(potentialAura);	//checks as if ele was added
			//pre build skill preview
			GCGSkillPreviewInfo.Builder skillPreview = GCGSkillPreviewInfo.newBuilder()
														.setSkillId(skillId)
														//hp change of enemy
														.putHpInfoMap(enemyOnStageCardGuid, GCGSkillPreviewHpInfo.newBuilder()
																		.setChangeType(GCGSkillHpChangeType.GCG_SKILL_HP_CHANGE_TYPE_DAMAGE)	//idt u heal enemies
																		.setHpChangeValue(damage)
																		.build())
														//MISSING ELEM ADD AND REMOVE IF SKILL OR  BURST
														.putCardTokenChangeMap(myOnStageCardGuid, GCGSkillPreviewTokenChangeInfo.newBuilder()
																					.addTokenChangeList(GCGSkillPreviewTokenInfo.newBuilder()
																											.setTokenType(GcgTokenType.CUR_ELEM_ENERGY.getId())
																											.setBeforeValue(this.gcgGameDetails.get(myOnStageCardGuid).getCurEnergy())
																											.setAfterValue(afterEnergy)
																											.build())
																					.build());
			if ((currentAuras.size() != 0) || potentialAura != 0) {
				GCGSkillPreviewElementReactionInfo.Builder elementalReactionInfo = GCGSkillPreviewElementReactionInfo.newBuilder();
				Set<Integer> reactedAuras = new HashSet<>(); //since u do not add a fresh aura if it is in a reaction
				//add new elem
				if (potentialAura != 0) {
					//add reactionData on adding aura
					for (int reactionId : possibleReactions) {
						//get other element aura to be set as reacted with
						int targetElementAura = GameData.getGcgElementReactionDataMap().get(reactionId).getOtherElementToken(potentialAura);
						if (targetElementAura != 0) { //not null
							elementalReactionInfo.addReactionList(GCGSkillPreviewReactionInfo.newBuilder()
																	.setSourceElement(potentialAura)
																	.setTargetElement(targetElementAura)
																	.build());
							reactedAuras.add(potentialAura);
							reactedAuras.add(targetElementAura);
						}
						
					}
					//add if is not reacted away or is not in currrent auras, add to new aura list
					if (!reactedAuras.contains(potentialAura) && !currentAuras.contains(potentialAura)) {
						elementalReactionInfo.addFreshList(potentialAura);	//new auras
					}
				}
				//add all current if is not reacted away
				for (int aura : currentAuras) {
					if (!reactedAuras.contains(aura)) {
						elementalReactionInfo.addSourceList(aura); //current auras card has
					}
				}
				//elem aura reaxn or not is added here
				skillPreview.putReactionInfoMap(enemyOnStageCardGuid, elementalReactionInfo.build());
			}
			//final
			proto.addSkillPreviewList(skillPreview.build());
		}
		
		return proto.build();
		
	}
	
	/********************
     * Player new acc.
     ********************/
    public synchronized void onPlayerBorn() {
		this.player.sendPacket(new PacketGCGBasicDataNotify(this.player));   //basic info such as level etc
		this.player.sendPacket(new PacketGCGGrowthLevelNotify(10,0)); 		 //TODO implement level saving
		this.player.sendPacket(new PacketGCGDSBanCardNotify());       		 //for now theres none, just send for fun
		this.player.sendPacket(new PacketGCGDSDataNotify(this.player));      //deckslot info
		this.player.sendPacket(new PacketGCGLevelChallengeNotify(this.player));   //idk this ngl
		this.player.sendPacket(new PacketGCGWeekChallengeInfoNotify(this.player,true)); //handbooklike
    }

    /********************
     * Player login.
     ********************/
    public synchronized void onPlayerLogin() {
		this.player.sendPacket(new PacketGCGBasicDataNotify(this.player));   //basic info such as level etc
		this.player.sendPacket(new PacketGCGGrowthLevelNotify(10,0)); 		 //TODO implement level saving
		this.player.sendPacket(new PacketGCGDSBanCardNotify());       		 //for now theres none, just send for fun
		this.player.sendPacket(new PacketGCGDSDataNotify(this.player));      //deckslot info
		this.player.sendPacket(new PacketGCGLevelChallengeNotify(this.player));   //idk this ngl
		this.player.sendPacket(new PacketGCGWeekChallengeInfoNotify(this.player,true)); //handbooklike
    }
}
