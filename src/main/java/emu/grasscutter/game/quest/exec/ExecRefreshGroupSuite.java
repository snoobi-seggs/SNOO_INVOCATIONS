package emu.grasscutter.game.quest.exec;

import emu.grasscutter.data.excels.QuestData;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.QuestValueExec;
import emu.grasscutter.game.quest.enums.QuestExec;
import emu.grasscutter.game.quest.handlers.QuestExecHandler;

@QuestValueExec(QuestExec.QUEST_EXEC_REFRESH_GROUP_SUITE)
public class ExecRefreshGroupSuite extends QuestExecHandler {

    @Override
    public boolean execute(GameQuest quest, QuestData.QuestExecParam condition, String... paramStr) {
        var sceneId = Integer.parseInt(paramStr[0]);
        var entries = paramStr[1].split(";");

        boolean result = true;
        for(var entry : entries) {
            var groupId = Integer.parseInt(entry.split(",")[0]);
            var suiteId = Integer.parseInt(entry.split(",")[1]);

            if(!quest.getOwner().getWorld().getSceneById(sceneId).getScriptManager().refreshGroupSuite(groupId, suiteId, quest)) {
                result = false;
            }
        }

        return result;
    }

}
