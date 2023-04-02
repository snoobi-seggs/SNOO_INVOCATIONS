package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

import java.util.List;
import java.util.ArrayList;

import emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData;
import emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData;
import emu.grasscutter.net.proto.GCGLevelChallengeNotifyOuterClass.GCGLevelChallengeNotify;

public class PacketGCGLevelChallengeNotify extends BasePacket {

    public PacketGCGLevelChallengeNotify(Player player) {
        super(PacketOpcodes.GCGLevelChallengeNotify);
		
		//GCGLevelChallengeNotify
		  //repeated GCGBossChallengeData unlock_boss_challenge_list = 11;
		  //repeated uint32 unlock_world_challenge_list = 3;
		  //repeated GCGLevelData level_list = 4;
		  
		//GCGLevelData
		  //repeated uint32 finished_challenge_id_list = 13;
		  //uint32 level_id = 7;
		  
		//GCGBossChallengeData
		  //repeated uint32 unlock_level_id_list = 3;
		  //uint32 id = 10;
		  
		//hardcode for now
		GCGBossChallengeData bossChallengeDataOceanid = GCGBossChallengeData.newBuilder()
												.setId(1)
												.addAllUnlockLevelIdList(List.of(220101,220102))
												.build();
												
		GCGBossChallengeData bossChallengeDataFatuiPyroAssasin = GCGBossChallengeData.newBuilder()
												.setId(2)
												.addAllUnlockLevelIdList(List.of(230101,230102))
												.build();
												
		GCGBossChallengeData bossChallengeData3 = GCGBossChallengeData.newBuilder()
												.setId(3)
												.addAllUnlockLevelIdList(List.of(220201,220202))
												.build();
												
		GCGBossChallengeData bossChallengeData4 = GCGBossChallengeData.newBuilder()
												.setId(4)
												.addAllUnlockLevelIdList(List.of(260101,260102))
												.build();
												
		GCGBossChallengeData bossChallengeData5 = GCGBossChallengeData.newBuilder()
												.setId(5)
												.addAllUnlockLevelIdList(List.of(250101,250102))
												.build();
		
		GCGBossChallengeData bossChallengeData6 = GCGBossChallengeData.newBuilder()
												.setId(6)
												.addAllUnlockLevelIdList(List.of(270101,270102))
												.build();
												
		/*GCGBossChallengeData bossChallengeData2 = GCGBossChallengeData.newBuilder()
												.setId(3)
												.addAllUnlockLevelIdList(List.of(230301))
												.build();*/
												
		
								
		List<GCGLevelData> levelList = new ArrayList<GCGLevelData>();
		List<Integer> levels = List.of(1, 2, 3, 4, 5, 6, 7, 8, 11, 12, 13, 100, 101, 102, 103, 104, 106, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 10, 1011, 1012, 1013, 1014, 1015, 1021, 1022, 1023, 1024, 1025, 1031, 1032, 1033, 1034, 1035, 1041, 1042, 1043, 1044, 1045, 1051, 1052, 1053, 1054, 1055, 1061, 1062, 1063, 1064, 1065, 1071, 1072, 1073, 1074, 1075, 1081, 1082, 1083, 1084, 1085, 1091, 1092, 1093, 1094, 1095, 1101, 1102, 1103, 1104, 1105, 2011, 2012, 2013, 2014, 2015, 2021, 2022, 2023, 2024, 2025, 2031, 2032, 2033, 2034, 2035, 2041, 2042, 2043, 2044, 2045, 2051, 2052, 2053, 2054, 2055, 2061, 2062, 2063, 2064, 2065, 2071, 2072, 2073, 2074, 2075, 2081, 2082, 2083, 2084, 2085, 2091, 2092, 2093, 2094, 2095, 2101, 2102, 2103, 2104, 2105, 2111, 2112, 2113, 2114, 2115, 2121, 2122, 2123, 2124, 2125, 2131, 2132, 2133, 2134, 2135, 2141, 2142, 2143, 2144, 2145, 2151, 2152, 2153, 2154, 2155, 2161, 2162, 2163, 2164, 2165, 2171, 2172, 2173, 2174, 2175, 2181, 2182, 2183, 2184, 2185, 2191, 2192, 2193, 2194, 2195, 2201, 2202, 2203, 2204, 2205, 2211, 2212, 2213, 2214, 2215, 11001, 11002, 11003, 11004, 11005, 11101, 11102, 11104, 11105, 11106, 11203, 12001, 12002, 12003, 12004, 12005, 12103, 12104, 12105, 12106, 12107, 12202, 13001, 13002, 13003, 13004, 13005, 13101, 13102, 13103, 13104, 13105, 13201, 14001, 14002, 14003, 14004, 14005, 14101, 14102, 14103, 14104, 14105, 14201, 14202, 14203, 14204, 14205, 14301, 14302, 14303, 20001, 20002, 20003, 20004, 30101, 30102, 30104, 30105, 30111, 30112, 40001, 40002, 40003, 40004, 40005, 110101, 110201, 110301, 110401, 110501, 120101, 120201, 120301, 130101, 130201, 130301, 130501, 140101, 140201, 140301, 140401, 150101, 150201, 160101, 160201, 170101, 110102, 110202, 110302, 110402, 110502, 120102, 120202, 120302, 130102, 130202, 130302, 130502, 140102, 140202, 140302, 140402, 150102, 150202, 160102, 160202, 170102, 110103, 110203, 110303, 110403, 110503, 120103, 120203, 120303, 130103, 130203, 130303, 130503, 140103, 140203, 140303, 140403, 150103, 150203, 160103, 160203, 170103, 110104, 110204, 110304, 110404, 110504, 120104, 120204, 120304, 130104, 130204, 130304, 130504, 140104, 140204, 140304, 140404, 150104, 150204, 160104, 160204, 170104, 220101, 220102, 230101, 230102, 220201, 220202, 260101, 260102, 250101, 250102, 270101, 270102);
		
		for (int i : levels) {
			GCGLevelData levelData = GCGLevelData.newBuilder()
									.setLevelId(i)
									.addAllFinishedChallengeIdList(List.of())  // GCGChallenge excel 1 id win List.of(1)
									.build();
			levelList.add(levelData);
		}
		  
		List<Integer> ret = List.of();
		GCGLevelChallengeNotify proto = GCGLevelChallengeNotify.newBuilder()
											.addAllUnlockBossChallengeList(List.of(bossChallengeDataOceanid,bossChallengeDataFatuiPyroAssasin,bossChallengeData3,bossChallengeData4,bossChallengeData5,bossChallengeData6))
											.addAllUnlockWorldChallengeList(List.of(3,15,21,22,9,7,13,17,19,27,35,36,31,32,33,29,30,37,25,26,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78)) //GCGWorldLvel*.json
											.addAllLevelList(levelList)  // TODO implement this in a manager
											.build();

        this.setData(proto);
    }
}
