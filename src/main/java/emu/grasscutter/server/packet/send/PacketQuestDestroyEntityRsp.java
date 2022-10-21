package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.RetcodeOuterClass.Retcode;
import org.sorapointa.proto.QuestDestroyEntityRspOuterClass.QuestDestroyEntityRsp;
import org.sorapointa.proto.QuestDestroyEntityReqOuterClass.QuestDestroyEntityReq;

public class PacketQuestDestroyEntityRsp extends BasePacket {

	public PacketQuestDestroyEntityRsp(boolean success, QuestDestroyEntityReq req) {
		super(PacketOpcodes.QuestDestroyEntityRsp);

        this.setData(QuestDestroyEntityRsp.newBuilder()
            .setQuestId(req.getQuestId())
            .setEntityId(req.getEntityId())
            .setSceneId(req.getSceneId())
            .setRetcode(success ? Retcode.RET_SUCC_VALUE : Retcode.RET_FAIL_VALUE));
	}

}
