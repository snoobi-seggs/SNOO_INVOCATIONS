package emu.grasscutter.game.quest.exec;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.excels.QuestData;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.QuestValueExec;
import emu.grasscutter.game.quest.enums.QuestExec;
import emu.grasscutter.game.quest.handlers.QuestExecHandler;

@QuestValueExec(QuestExec.QUEST_EXEC_REFRESH_GROUP_MONSTER)
public class ExecRefreshGroupMonster extends QuestExecHandler {

    @Override
    public boolean execute(GameQuest quest, QuestData.QuestExecParam condition, String... paramStr) {
        var groupId = Integer.parseInt(paramStr[0]);

        var scriptManager = quest.getOwner().getScene().getScriptManager();

        var targetGroupInstance = scriptManager.getGroupInstanceById(groupId);
        if (targetGroupInstance == null) {
            Grasscutter.getLogger().warn("trying to load unknown group {} in scene {}", groupId, quest.getOwner().getScene().getId());
        } else {
            scriptManager.refreshGroupMonster(targetGroupInstance);
        }

        return true;
    }

}
