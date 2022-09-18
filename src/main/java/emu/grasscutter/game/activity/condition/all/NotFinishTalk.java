package emu.grasscutter.game.activity.condition.all;

import emu.grasscutter.game.activity.condition.ActivityCondition;
import emu.grasscutter.game.activity.condition.ActivityConditionBaseHandler;
import emu.grasscutter.game.player.Player;

import static emu.grasscutter.game.activity.condition.ActivityConditions.NEW_ACTIVITY_COND_NOT_FINISH_TALK;

@ActivityCondition(NEW_ACTIVITY_COND_NOT_FINISH_TALK)
public class NotFinishTalk extends ActivityConditionBaseHandler {
    @Override
    public boolean execute(Player player, int... params) {
        return player
            .getQuestManager()
            .getMainQuests()
            .int2ObjectEntrySet()
            .stream()
            .noneMatch(q -> q.getValue().getTalks().get(params[0]) != null); //FIXME taken from ContentCompleteTalk
    }
}
