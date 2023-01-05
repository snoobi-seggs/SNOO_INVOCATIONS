package emu.grasscutter.server.packet.recv;

import emu.grasscutter.game.props.ActivityType;
import emu.grasscutter.game.activity.trialavatar.TrialAvatarActivityHandler;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.server.game.GameSession;

import lombok.val;

@Opcodes(PacketOpcodes.PlayerQuitDungeonReq)
public class HandlerPlayerQuitDungeonReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
         val playerData = session.getPlayer().getActivityManager()
            .getPlayerActivityDataByActivityType(ActivityType.NEW_ACTIVITY_TRIAL_AVATAR);
        if (playerData != null) {
            val handler = (TrialAvatarActivityHandler) playerData.get().getActivityHandler();
            if (handler != null) {
                handler.unsetTrialAvatarTeam(session.getPlayer());
            }
        }
        session.getPlayer().getServer().getDungeonSystem().exitDungeon(session.getPlayer());
    }

}
