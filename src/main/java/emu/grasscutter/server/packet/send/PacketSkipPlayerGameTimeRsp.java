package emu.grasscutter.server.packet.send;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.world.World;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp;

public class PacketSkipPlayerGameTimeRsp extends BasePacket {

	public PacketSkipPlayerGameTimeRsp(int retcode) {
		super(PacketOpcodes.SkipPlayerGameTimeRsp);

		SkipPlayerGameTimeRsp proto = SkipPlayerGameTimeRsp.newBuilder()
				.setRetcode(retcode)
				.build();

		this.setData(proto);
	}
	
	public PacketSkipPlayerGameTimeRsp(int oldGameTime, int newGameTime) {
		super(PacketOpcodes.SkipPlayerGameTimeRsp);

		SkipPlayerGameTimeRsp proto = SkipPlayerGameTimeRsp.newBuilder()
				.setClientGameTime(oldGameTime)
				//.setGameTime((int) (newGameTime % 1440)) //now they want no mod time
				.setGameTime(newGameTime)
				.build();
		//debug
		//Grasscutter.getLogger().info(proto.toString());
		this.setData(proto);
	}
}
