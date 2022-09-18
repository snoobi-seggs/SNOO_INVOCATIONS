package emu.grasscutter.game.activity.condition.all;

import emu.grasscutter.game.activity.condition.ActivityCondition;
import emu.grasscutter.game.activity.condition.ActivityConditionBaseHandler;
import emu.grasscutter.game.player.Player;

import static emu.grasscutter.game.activity.condition.ActivityConditions.NEW_ACTIVITY_COND_SALESMAN_CAN_DELIVER;

@ActivityCondition(NEW_ACTIVITY_COND_SALESMAN_CAN_DELIVER)
public class SalesmanCanDeliver extends ActivityConditionBaseHandler {
    @Override
    public boolean execute(Player player, int... params) {
        //TODO need to reverse engineer this logic.
        //This condition appears only in one condition "condId": 5003001
        //and this condition accept no params. I have no idea how to implement it
        return false;
    }
}
