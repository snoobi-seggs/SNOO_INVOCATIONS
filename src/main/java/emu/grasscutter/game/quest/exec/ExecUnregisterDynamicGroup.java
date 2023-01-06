package emu.grasscutter.game.quest.exec;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.excels.QuestData;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.QuestValueExec;
import emu.grasscutter.game.quest.enums.QuestExec;
import emu.grasscutter.game.quest.handlers.QuestExecHandler;
import emu.grasscutter.game.world.Scene;
import emu.grasscutter.scripts.data.SceneBlock;
import emu.grasscutter.scripts.data.SceneGroup;

@QuestValueExec(QuestExec.QUEST_EXEC_UNREGISTER_DYNAMIC_GROUP)
public class ExecUnregisterDynamicGroup extends QuestExecHandler {

    @Override
    public boolean execute(GameQuest quest, QuestData.QuestExecParam condition, String... paramStr) {
        var groupId = Integer.parseInt(paramStr[0]);
        var unknownParam = Integer.parseInt(paramStr[1]); //TODO: Goes from 0 to 1, maybe is a boolean. Investigate

        Grasscutter.getLogger().warn("Unregistering group {}", groupId);

        Scene scene = quest.getOwner().getScene();
        SceneGroup group = scene.getScriptManager().getGroupById(groupId);
        if(group == null) return false;

        SceneBlock block = scene.getScriptManager().getBlocks().get(group.block_id);

        quest.getMainQuest().getQuestGroupSuites().removeIf(gs -> gs.getGroup() == groupId && gs.getScene() == scene.getId()); //Remove suites if they are registered
        scene.unloadGroup(block, groupId);

        Grasscutter.getLogger().warn("Unregistered group {} in scene {}", groupId, scene.getId());

        return true;
    }

}
