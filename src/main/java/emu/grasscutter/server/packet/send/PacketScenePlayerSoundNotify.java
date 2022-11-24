package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.utils.Position;
import org.sorapointa.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify;
import org.sorapointa.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.PlaySoundType;
import org.sorapointa.proto.VectorOuterClass.Vector;
import java.util.List;
import java.util.Objects;

public class PacketScenePlayerSoundNotify extends BasePacket {
	
	public PacketScenePlayerSoundNotify(Position playPosition, String soundName, int playType) {
		super(PacketOpcodes.ScenePlayerSoundNotify, true);

		ScenePlayerSoundNotify.Builder proto = ScenePlayerSoundNotify.newBuilder();
			if (!Objects.equals(playPosition, null)) {
				proto.setPlayPos(Vector.newBuilder()
				.setX(playPosition.getX())
				.setY(playPosition.getY())
				.setZ(playPosition.getZ())
				.build());
			}
			if (!Objects.equals(soundName, null)) {
				proto.setSoundName(soundName);
			}
			if (!Objects.equals(playType, null)) {
				proto.setPlayType(PlaySoundType.valueOf(playType));
			}
		this.setData(proto.build());
	}
}
