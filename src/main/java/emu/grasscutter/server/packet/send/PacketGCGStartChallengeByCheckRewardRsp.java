package emu.grasscutter.server.packet.send;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import emu.grasscutter.net.proto.GCGLevelTypeOuterClass.GCGLevelType;
import emu.grasscutter.net.proto.GCGStartChallengeByCheckRewardRspOuterClass.GCGStartChallengeByCheckRewardRsp;
import java.util.List;

public class PacketGCGStartChallengeByCheckRewardRsp extends BasePacket {

    public PacketGCGStartChallengeByCheckRewardRsp(int levelId, GCGLevelType levelType, int configId) {
        super(PacketOpcodes.GCGStartChallengeByCheckRewardRsp);
		
		//GCGStartChallengeByCheckRewardRsp
		  //repeated uint32 exceeded_item_type_list = 3;
		  //uint32 level_id = 5;
		  //repeated uint32 exceeded_item_list = 8;
		  //GCGLevelType level_type = 2;
		  //uint32 config_id = 9;
		  //int32 retcode = 12;
		  
		GCGStartChallengeByCheckRewardRsp proto = GCGStartChallengeByCheckRewardRsp.newBuilder()
												.setLevelId(levelId)
												.addAllExceededItemList(List.of())  //empty
												.addAllExceededItemTypeList(List.of())  //empty
												.setLevelType(levelType)
												.setConfigId(configId)
												.setRetcode(0)
												.build();

        this.setData(proto);
    }
	
	public PacketGCGStartChallengeByCheckRewardRsp(int retcode) {
        super(PacketOpcodes.GCGStartChallengeByCheckRewardRsp);
		
		GCGStartChallengeByCheckRewardRsp proto = GCGStartChallengeByCheckRewardRsp.newBuilder()
													.setRetcode(retcode)
													.build();
											
		//log error
		Grasscutter.getLogger().error("DECK IS INVALID, CANNOT CREATE GAME!");

        this.setData(proto);
    }
}
