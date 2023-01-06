package emu.grasscutter.game.quest.content;

import emu.grasscutter.data.excels.QuestData;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.QuestValueContent;
import lombok.val;

import static emu.grasscutter.game.quest.enums.QuestContent.QUEST_CONTENT_CLEAR_GROUP_MONSTER;

@QuestValueContent(QUEST_CONTENT_CLEAR_GROUP_MONSTER)
public class ContentClearGroupMonster extends BaseContent {

    @Override
    public boolean execute(GameQuest quest, QuestData.QuestContentCondition condition, String paramStr, int... params) {
        val groupId = condition.getParam()[0];

        var scene = quest.getOwner().getScene();
        var group = scene.getScriptManager().getGroupById(groupId);

        return group.monsters.values().stream()
            .filter(m -> {
                var entity = scene.getEntityByConfigId(m.config_id);
                return entity != null && entity.getGroupId()==group.id;
            }).count() == 0;
    }
}
