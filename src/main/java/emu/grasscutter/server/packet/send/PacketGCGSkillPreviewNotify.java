package emu.grasscutter.server.packet.send;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import emu.grasscutter.net.proto.GCGSkillPreviewNotifyOuterClass.GCGSkillPreviewNotify;

import java.util.*;

public class PacketGCGSkillPreviewNotify extends BasePacket {
	//main simple single msg sent
	public PacketGCGSkillPreviewNotify(GCGSkillPreviewNotify proto) {
		super(PacketOpcodes.GCGSkillPreviewNotify);
		//debug
		Grasscutter.getLogger().warn("GCGSkillPreviewNotify DATA:\n{}",proto.toString());
		this.setData(proto);
	}
}