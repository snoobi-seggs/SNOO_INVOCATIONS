package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.world.World;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify;

public class PacketPlayerGameTimeNotify extends BasePacket {

	public PacketPlayerGameTimeNotify(Player player) {
		super(PacketOpcodes.PlayerGameTimeNotify);

		PlayerGameTimeNotify proto = PlayerGameTimeNotify.newBuilder()
				//.setGameTime(player.getWorld().getGameTime())
				.setGameTime((int) player.getWorld().getTotalGameTimeMinutes())	//rn 3.5+ no longer requires a % 1440
				.setUid(player.getUid())
				.build();

		this.setData(proto);
	}
}
