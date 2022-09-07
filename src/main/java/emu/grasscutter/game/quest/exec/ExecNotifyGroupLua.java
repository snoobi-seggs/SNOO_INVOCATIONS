package emu.grasscutter.game.quest.exec;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.excels.QuestData;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.QuestGroupSuite;
import emu.grasscutter.game.quest.QuestValue;
import emu.grasscutter.game.quest.enums.QuestState;
import emu.grasscutter.game.quest.enums.QuestTrigger;
import emu.grasscutter.game.quest.handlers.QuestExecHandler;
import emu.grasscutter.scripts.constants.EventType;
import emu.grasscutter.scripts.data.ScriptArgs;
import emu.grasscutter.server.packet.send.PacketGroupSuiteNotify;

@QuestValue(QuestTrigger.QUEST_EXEC_NOTIFY_GROUP_LUA)
public class ExecNotifyGroupLua extends QuestExecHandler {

    @Override
    public boolean execute(GameQuest quest, QuestData.QuestExecParam condition, String... paramStr) {
        var sceneId = Integer.parseInt(paramStr[0]);
        var groupId = Integer.parseInt(paramStr[1]);

        var scriptManager = quest.getOwner().getScene().getScriptManager();

        if(quest.getOwner().getScene().getId() == sceneId){
            var group = scriptManager.getGroupById(groupId);
            // workaround to make sure the triggers are still there todo find better way of trigger handling
            scriptManager.refreshGroup(group);
            Grasscutter.getLogger().warn("group: {} \ncondition: {} \nparamStr {}", group, condition, paramStr);
            scriptManager.callEvent(
                quest.getState() == QuestState.QUEST_STATE_FINISHED ?
                    EventType.EVENT_QUEST_FINISH : EventType.EVENT_QUEST_START
                , new ScriptArgs(quest.getSubQuestId()));
        }
        else return false;

        return true;
    }

}
