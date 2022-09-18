package emu.grasscutter.game.activity.condition.all;

import emu.grasscutter.game.activity.condition.ActivityCondition;
import emu.grasscutter.game.activity.condition.ActivityConditionBaseHandler;
import emu.grasscutter.game.player.Player;

import static emu.grasscutter.game.activity.condition.ActivityConditions.NEW_ACTIVITY_COND_PLAYER_LEVEL_GREAT_EQUAL;

@ActivityCondition(NEW_ACTIVITY_COND_PLAYER_LEVEL_GREAT_EQUAL)
public class PlayerLevelGreatEqualActivityActivityCondition extends ActivityConditionBaseHandler {

    @Override
    public boolean execute(Player player, int... params) {
        return player.getLevel() >= params[0];
    }
}
