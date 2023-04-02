package emu.grasscutter.server.packet.send;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import java.util.*;
import emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair;

import emu.grasscutter.net.proto.GCGActionTypeOuterClass.GCGActionType;
import emu.grasscutter.net.proto.GCGAttackCostInfoOuterClass.GCGAttackCostInfo;
import emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard;
import emu.grasscutter.net.proto.GCGCostReviseInfoOuterClass.GCGCostReviseInfo;
import emu.grasscutter.net.proto.GCGClientPerformTypeOuterClass.GCGClientPerformType;
import emu.grasscutter.net.proto.GCGDamageDetailOuterClass.GCGDamageDetail;
import emu.grasscutter.net.proto.GCGDiceSideTypeOuterClass.GCGDiceSideType;
import emu.grasscutter.net.proto.GCGEndReasonOuterClass.GCGEndReason;
import emu.grasscutter.net.proto.GCGIntentionChangeTypeOuterClass.GCGIntentionChangeType;
import emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.GCGPhaseType;
import emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify;
import emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePack;
import emu.grasscutter.net.proto.GCGMessageOuterClass.GCGMessage;
import emu.grasscutter.net.proto.GCGPlayCardCostInfoOuterClass.GCGPlayCardCostInfo;
import emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason;
import emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo;
import emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo;
import emu.grasscutter.net.proto.GCGTokenOuterClass.GCGToken;
import emu.grasscutter.net.proto.GCGZoneTypeOuterClass.GCGZoneType;

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

public class PacketGCGMessagePackNotify extends BasePacket {

	//GCGMessagePackNotify
	  //uint32 server_seq = 2; //is the sequence id for future replays or somethingidk
	  //repeated GCGMessagePack msg_pack_list = 12;
	  
	//GCGMessagePack
	  //GCGActionType action_type = 9;
	  //repeated GCGMessage msg_list = 5;
	  //uint32 controller_id = 7;
	  
	//GCGActionType
	  //GCG_ACTION_TYPE_NONE = 0;
	  //GCG_ACTION_TYPE_SPECIAL_PHASE = 1;
	  //GCG_ACTION_TYPE_NEXT_PHASE = 2;
	  //GCG_ACTION_TYPE_DRAW = 3;
	  //GCG_ACTION_TYPE_REDRAW = 4;
	  //GCG_ACTION_TYPE_SELECT_ONSTAGE = 5;
	  //GCG_ACTION_TYPE_ROLL = 6;
	  //GCG_ACTION_TYPE_REROLL = 7;
	  //GCG_ACTION_TYPE_ATTACK = 8;
	  //GCG_ACTION_TYPE_PLAY_CARD = 9;
	  //GCG_ACTION_TYPE_PASS = 10;
	  //GCG_ACTION_TYPE_REBOOT = 11;
	  //GCG_ACTION_TYPE_GAME_OVER = 12;
	  //GCG_ACTION_TYPE_TRIGGER = 13;
	  //GCG_ACTION_TYPE_PHASE_EXIT = 14;
	  //GCG_ACTION_TYPE_CUSTOM = 15;
	  //GCG_ACTION_TYPE_NOTIFY_COST = 16;
	  //GCG_ACTION_TYPE_AFTER_OPERATION = 17;
	  //GCG_ACTION_TYPE_USE_SKILL = 18;
	  //GCG_ACTION_TYPE_NOTIFY_SKILL_PREVIEW = 19;
	  //GCG_ACTION_TYPE_PREVIEW_ATTACK = 20;
	  //GCG_ACTION_TYPE_PREVIEW_AFTER_ATTACK = 21;
	  //GCG_ACTION_TYPE_SEND_MESSAGE = 22;
	  //GCG_ACTION_TYPE_WAITING_CHARACTER = 23;
	  //GCG_ACTION_TYPE_TRIGGER_SKILL = 24;
	  //GCG_ACTION_TYPE_BEFORE_NEXT_OPERATION = 25;
	
	//GCGMessage
	 //ONEOF message
	  //GCGMsgTokenChange token_change = 2;
	  //GCGMsgPhaseChange phase_change = 10;
	  //GCGMsgAddCards add_cards = 5;
	  //GCGMsgRemoveCards remove_cards = 12;
	  //GCGMsgSelectOnStage select_on_stage = 6;
	  //GCGMsgDiceRoll dice_roll = 14;
	  //GCGMsgDiceReroll dice_reroll = 15;
	  //GCGMsgPass pass = 8;
	  //GCGMsgCharDie char_die = 4;
	  //GCGMsgSkillResult skill_result = 3;
	  //GCGMsgCostDice cost_dice = 13;
	  //GCGMsgAddDice add_dice = 7;
	  //GCGMsgMoveCard move_card = 11;
	  //GCGMsgUseSkill use_skill = 1;
	  //GCGMsgNewCard new_card = 296;
	  //GCGMsgUpdateController update_controller = 1111;
	  //GCGMsgModifyAdd modify_add = 1733;
	  //GCGMsgModifyRemove modify_remove = 2014;
	  //GCGMsgUseSkillEnd use_skill_end = 1368;
	  //GCGMsgDuelDataChange duel_data_change = 1791;
	  //GCGMsgClientPerform client_perform = 1677;
	  //GCGMsgGameOver game_over = 632;
	  //GCGMsgOpTimer op_timer = 154;
	  //GCGMsgWaitingListChange waiting_list_change = 1991;
	  //GCGMsgCardUpdate card_update = 1702;
	  //GCGMsgSelectOnStageByEffect select_on_stage_by_effect = 1737;
	  //GCGMsgCostRevise cost_revise = 468;
	  //GCGMsgPhaseContinue phase_continue = 1157;
	  //GCGMsgPVEIntentionInfo pve_intention_info = 850;
	  //GCGMsgPVEIntentionChange pve_intention_change = 1268;
	  //GCGMsgSkillLimitsChange skill_limits_change = 710;
	  //GCGMsgNoDamageSkillResult no_damage_skill_result = 773;
	  //GCGMsgReactionBegin reaction_begin = 243;
	  //GCGMsgReactionEnd reaction_end = 1172;
	  
	//enum GCGReason {
	  //GCG_REASON_DEFAULT = 0;
	  //GCG_REASON_EFFECT = 1;
	  //GCG_REASON_COST = 2;
	  //GCG_REASON_GM = 3;
	  //GCG_REASON_ATTACK = 4;
	  //GCG_REASON_REBOOT = 5;
	  //GCG_REASON_PLAY_CARD = 6;
	  //GCG_REASON_QUICKLY_ONSTAGE = 7;
	  //GCG_REASON_REMOVE_AFTER_DIE = 8;
	  //GCG_REASON_INIT = 9;
	  //GCG_REASON_EFFECT_DAMAGE = 10;
	  //GCG_REASON_EFFECT_HEAL = 11;
	  //GCG_REASON_EFFECT_REVIVE = 12;
       //}
	
	
	//main simple single msg sent
	public PacketGCGMessagePackNotify(List<GCGMessage> msgListToSend, GCGActionType actionType, int controllerId, int serverSeq) {
		super(PacketOpcodes.GCGMessagePackNotify);
		
		GCGMessagePack msgPack = GCGMessagePack.newBuilder()
									.setActionType(actionType)
									.setControllerId(controllerId)
									.addAllMsgList(msgListToSend)
									.build();
									
		GCGMessagePackNotify proto = GCGMessagePackNotify.newBuilder()
										.setServerSeq(serverSeq)
										.addAllMsgPackList(List.of(msgPack))
										.build();
		//debug
		Grasscutter.getLogger().info("GCGMessagePackNotify DATA:\n{}",proto.toString());
		this.setData(proto);
	}
	
	//main mult
	public PacketGCGMessagePackNotify(List<GCGMessagePack> msgPackListToSend, int serverSeq) {
		super(PacketOpcodes.GCGMessagePackNotify);
									
		GCGMessagePackNotify proto = GCGMessagePackNotify.newBuilder()
										.setServerSeq(serverSeq)
										.addAllMsgPackList(msgPackListToSend) 
										.build();

		//debug
		Grasscutter.getLogger().info("GCGMessagePackNotify DATA:\n{}",proto.toString());
		
		this.setData(proto);
	}
}