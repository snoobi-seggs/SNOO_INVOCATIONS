package emu.grasscutter.server.packet.recv;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.props.EnterReason;
import emu.grasscutter.game.world.Scene;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.scripts.data.SceneConfig;
import emu.grasscutter.utils.Position;

import emu.grasscutter.net.proto.EnterTypeOuterClass.EnterType;
import emu.grasscutter.net.proto.GCGLevelTypeOuterClass.GCGLevelType;
import emu.grasscutter.net.proto.GCGSettleOptionOuterClass.GCGSettleOption;
import emu.grasscutter.net.proto.GCGSettleOptionReqOuterClass.GCGSettleOptionReq;

import emu.grasscutter.server.packet.send.PacketGCGGameBriefDataNotify;
import emu.grasscutter.server.packet.send.PacketGCGSettleOptionRsp;
import emu.grasscutter.server.packet.send.PacketPlayerEnterSceneNotify;

@Opcodes(PacketOpcodes.GCGSettleOptionReq)
public class HandlerGCGSettleOptionReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		GCGSettleOption option = GCGSettleOptionReq.parseFrom(payload).getOption();	
		
		//quit
		if (option == GCGSettleOption.GCG_SETTLE_OPTION_OPT_EXIT) {
			session.getPlayer().getGcgManager().setInDuel(false); //tells server to not notify client that he was in match since match ended
			session.getPlayer().getWorld().transferPlayerToScene(session.getPlayer(), session.getPlayer().getScene().getPrevScene(), session.getPlayer().getPrevPos());
			//restart, same as in start challenge
		} else if (option == GCGSettleOption.GCG_SETTLE_OPTION_OPT_RESTART) {
			//update manager
			int levelId = session.getPlayer().getGcgManager().getCurrentlyPlayedLevelId();
			GCGLevelType levelType = session.getPlayer().getGcgManager().getCurrentlyPlayedLevelType();
			int configId = session.getPlayer().getGcgManager().getCurrentInvitedCharId();
			
			//start gcg match in manager
			session.getPlayer().getGcgManager().startMatch(levelId, levelType, configId);
		
			//no need set current inv npc and is in match coz u is restarting
			
			//test
			//session.send(new PacketGCGGameBriefDataNotify(session.getPlayer(), levelId, levelType, configId));
			
			//whoeever made this the way it is i sincerely hope u become kira's eyeballs which i will lick
			//Player player = session.getPlayer();
			//Position pos = new Position(0f,-5f,0f);
			//EnterType type = EnterType.ENTER_TYPE_DUNGEON;
			//EnterReason reason = EnterReason.DungeonEnter;
			//
			//Scene oldScene = null;
			//
			//if (player.getScene() != null) {
			//	oldScene = player.getScene();
			//
			//	// Don't deregister scenes if the player is going to tp back into them
			//	if (oldScene.getId() == 79999) {
			//		oldScene.setDontDestroyWhenEmpty(true);
			//	}
			//
			//	oldScene.removePlayer(player);
			//}
			//
			////player.setPrevPos(player.getPosition().clone());
			////player.setPrevRot(player.getRotation().clone());
			//
			//Scene newScene = player.getWorld().getSceneById(79999);
			//newScene.addPlayer(player);
			//player.setAvatarsAbilityForScene(newScene);
			//SceneConfig config = newScene.getScriptManager().getConfig();
			//if (pos == null && config != null) {
			//	if (config.born_pos != null) {
			//	pos = newScene.getScriptManager().getConfig().born_pos;
			//	}
			//	if (config.born_rot != null) {
			//		player.getRotation().set(config.born_rot);
			//	}
			//}
			//
			//// Set player position
			//if (pos == null) {
			//	pos = player.getPosition();
			//}
			//
			////player.getPosition().set(pos);
			//
			//if (oldScene != null && newScene != oldScene) {
			//	newScene.setPrevScene(oldScene.getId());
			//	oldScene.setDontDestroyWhenEmpty(false);
			//}
			//
			//session.send(new PacketPlayerEnterSceneNotify(session.getPlayer(), session.getPlayer(), type, reason, 79999, pos, 2162));
		} else {
			Grasscutter.getLogger().info("unhandled GCGSettleOption: " + option);
			session.getPlayer().getGcgManager().setInDuel(false); //tells server to not notify client that he was in match since match ended
		}
		
		session.send(new PacketGCGSettleOptionRsp(option));
    }

}
