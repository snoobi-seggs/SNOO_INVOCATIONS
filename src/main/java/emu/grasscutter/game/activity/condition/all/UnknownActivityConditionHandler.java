package emu.grasscutter.game.activity.condition.all;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.game.activity.PlayerActivityData;
import emu.grasscutter.game.activity.condition.ActivityConditionBaseHandler;

/**
 * This class is used when condition was not found
 */
public class UnknownActivityConditionHandler extends ActivityConditionBaseHandler {

    @Override
    public boolean execute(PlayerActivityData activityData, int... params) {
        Grasscutter.getLogger().error("Called unknown condition handler");
        return false;
    }
}
