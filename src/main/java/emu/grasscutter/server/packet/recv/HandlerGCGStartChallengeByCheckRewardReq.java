package emu.grasscutter.server.packet.recv;


import emu.grasscutter.Grasscutter;
import emu.grasscutter.game.gcg.GcgDeck;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.props.EnterReason;
import emu.grasscutter.game.world.data.TeleportProperties;
import emu.grasscutter.game.world.Scene;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.scripts.data.SceneConfig;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.event.player.PlayerTeleportEvent.TeleportType;
import emu.grasscutter.server.packet.send.PacketGCGStartChallengeByCheckRewardRsp;
import emu.grasscutter.server.packet.send.PacketGCGGameBriefDataNotify;
import emu.grasscutter.server.packet.send.PacketPlayerEnterSceneNotify;
import emu.grasscutter.utils.Position;

import emu.grasscutter.net.proto.EnterTypeOuterClass.EnterType;
import emu.grasscutter.net.proto.GCGStartChallengeByCheckRewardReqOuterClass.GCGStartChallengeByCheckRewardReq;


@Opcodes(PacketOpcodes.GCGStartChallengeByCheckRewardReq)
public class HandlerGCGStartChallengeByCheckRewardReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		GCGStartChallengeByCheckRewardReq req = GCGStartChallengeByCheckRewardReq.parseFrom(payload);
		Grasscutter.getLogger().info("GCGStartChallengeByCheckRewardReq: " + req.toString());
		
		//proto
		//uint32 level_id = 13;
		//GCGLevelType level_type = 3;
		//uint32 config_id = 5;
		
		//update manager
		session.getPlayer().getGcgManager().setCurrentlyPlayedLevelId(req.getLevelId());
		session.getPlayer().getGcgManager().setCurrentlyPlayedLevelType(req.getLevelType());
		session.getPlayer().getGcgManager().setCurrentInvitedCharId(req.getConfigId());
		
		//satan check
		GcgDeck deck = session.getPlayer().getGcgManager().getDecks().get(session.getPlayer().getGcgManager().getActiveDeckId());
		if (!(deck.getCardList().size() == 30) || !(deck.getCharacterCardList().size() == 3) || deck.getCharacterCardList().contains(0)) {
			session.send(new PacketGCGStartChallengeByCheckRewardRsp(12007)); //RET_GCG_DS_DECK_INVALID = 12207;
			return;
		}
		
		//test		
        session.send(new PacketGCGStartChallengeByCheckRewardRsp(req.getLevelId(), req.getLevelType(), req.getConfigId()));
		
		//start gcg match in manager
		session.getPlayer().getGcgManager().startMatch(req.getLevelId(), req.getLevelType(), req.getConfigId());
		
		//this shld be in start match
		/*session.send(new PacketGCGGameBriefDataNotify(session.getPlayer(), req.getLevelId(), req.getLevelType(), req.getConfigId()));
		
		//whoeever made this the way it is i sincerely hope u become kira's eyeballs which i will lick
		Player player = session.getPlayer();
		Position pos = new Position(0f,-5f,0f);
		EnterType type = EnterType.ENTER_TYPE_DUNGEON;
		EnterReason reason = EnterReason.DungeonEnter;
		
        Scene oldScene = null;

        if (player.getScene() != null) {
            oldScene = player.getScene();

            // Don't deregister scenes if the player is going to tp back into them
            if (oldScene.getId() == 79999) {
                oldScene.setDontDestroyWhenEmpty(true);
            }

            oldScene.removePlayer(player);
        }
		
		//player.setPrevPos(player.getPosition().clone());
		//player.setPrevRot(player.getRotation().clone());

        Scene newScene = player.getWorld().getSceneById(79999);
        newScene.addPlayer(player);
        player.setAvatarsAbilityForScene(newScene);
        SceneConfig config = newScene.getScriptManager().getConfig();
        if (pos == null && config != null) {
            if (config.born_pos != null) {
               pos = newScene.getScriptManager().getConfig().born_pos;
            }
            if (config.born_rot != null) {
                player.getRotation().set(config.born_rot);
            }
        }

        // Set player position
        if (pos == null) {
            pos = player.getPosition();
        }

        //player.getPosition().set(pos);

        if (oldScene != null && newScene != oldScene) {
            newScene.setPrevScene(oldScene.getId());
            oldScene.setDontDestroyWhenEmpty(false);
        }
		
		session.send(new PacketPlayerEnterSceneNotify(session.getPlayer(), session.getPlayer(), type, reason, 79999, pos, 2162));*/
    }

}
