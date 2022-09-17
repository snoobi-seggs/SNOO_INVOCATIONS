package emu.grasscutter.game.activity.condition.all;

import emu.grasscutter.game.activity.condition.ActivityCondition;
import emu.grasscutter.game.activity.condition.ActivityConditionBaseHandler;
import emu.grasscutter.game.quest.GameQuest;

import static emu.grasscutter.game.activity.condition.ActivityConditions.NEW_ACTIVITY_COND_PLAYER_LEVEL_GREAT_EQUAL;

@ActivityCondition(NEW_ACTIVITY_COND_PLAYER_LEVEL_GREAT_EQUAL)
public class PlayerLevelGreatEqualActivityActivityCondition extends ActivityConditionBaseHandler {

    @Override
    public boolean execute(GameQuest quest, int... params) {
        return quest.getOwner().getLevel() >= params[0];

    }
}
