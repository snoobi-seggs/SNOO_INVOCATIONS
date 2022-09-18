package emu.grasscutter.game.dungeons.handlers;

import emu.grasscutter.data.excels.DungeonPassConfigData;
import emu.grasscutter.data.excels.QuestData.QuestCondition;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.quest.GameQuest;

public abstract class DungeonBaseHandler {

	public abstract boolean execute(DungeonPassConfigData.DungeonPassCondition condition, int... params);

}
