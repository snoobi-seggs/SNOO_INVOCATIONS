package emu.grasscutter.server.packet.recv;

import emu.grasscutter.game.activity.trialavatar.TrialAvatarActivityHandler;
import emu.grasscutter.game.props.ActivityType;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.server.game.GameSession;
import lombok.val;

@Opcodes(PacketOpcodes.PlayerQuitDungeonReq)
public class HandlerPlayerQuitDungeonReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        val handler = session.getPlayer().getActivityManager().getActivityHandlerAs(ActivityType.NEW_ACTIVITY_TRIAL_AVATAR, TrialAvatarActivityHandler.class);

        handler.ifPresent(trialAvatarActivityHandler -> trialAvatarActivityHandler.unsetTrialAvatarTeam(session.getPlayer()));

        session.getPlayer().getServer().getDungeonSystem().exitDungeon(session.getPlayer());
    }

}
