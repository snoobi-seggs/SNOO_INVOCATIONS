package emu.grasscutter.game.activity.condition;

import emu.grasscutter.game.quest.GameQuest;

/**
 * Base handler for all activity conditions that are listed in NewActivityCondExcelConfigData.json
 */
public abstract class ActivityConditionBaseHandler {
    public abstract boolean execute(GameQuest quest, int... params);
}
