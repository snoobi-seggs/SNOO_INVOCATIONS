package emu.grasscutter.data.excels;

import com.google.gson.annotations.SerializedName;
import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.GameData;
import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import emu.grasscutter.game.quest.enums.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

@ResourceType(name = "QuestExcelConfigData.json")
@Getter
@ToString
public class QuestData extends GameResource {
    @Getter private int subId;
    @Getter private int mainId;
    @Getter private int order;
    @Getter private long descTextMapHash;

    @Getter private boolean finishParent;
    @Getter private boolean isRewind;

    @Getter private LogicType acceptCondComb;
    @Getter private LogicType finishCondComb;
    @Getter private LogicType failCondComb;

    @Getter private List<QuestAcceptCondition> acceptCond;
    @Getter private List<QuestContentCondition> finishCond;
    @Getter private List<QuestContentCondition> failCond;
    @Getter private List<QuestExecParam> beginExec;
    @Getter private List<QuestExecParam> finishExec;
    @Getter private List<QuestExecParam> failExec;
    @Getter private Guide guide;
    @Getter private List<Integer> trialAvatarList;

    public static String questConditionKey(@Nonnull Enum<?> type, int firstParam, @Nullable String paramsStr) {
        return type.name() + firstParam + (paramsStr != null ? paramsStr : "");
    }

    //ResourceLoader not happy if you remove getId() ~~
    public int getId() {
        return subId;
    }

    public void onLoad() {
        this.acceptCond = acceptCond.stream().filter(p -> p.getType() != null).toList();
        this.finishCond = finishCond.stream().filter(p -> p.getType() != null).toList();
        this.failCond = failCond.stream().filter(p -> p.getType() != null).toList();

        this.beginExec = beginExec.stream().filter(p -> p.type != null).toList();
        this.finishExec = finishExec.stream().filter(p -> p.type != null).toList();
        this.failExec = failExec.stream().filter(p -> p.type != null).toList();

        if (this.acceptCondComb == null)
            this.acceptCondComb = LogicType.LOGIC_NONE;

        if (this.finishCondComb == null)
            this.finishCondComb = LogicType.LOGIC_NONE;

        if (this.failCondComb == null)
            this.failCondComb = LogicType.LOGIC_NONE;

        addToCache();
    }

    private void addToCache() {
        if (this.acceptCond == null) {
            Grasscutter.getLogger().warn("missing AcceptConditions for quest {}", getSubId());
            return;
        }
        val cacheMap = GameData.getBeginCondQuestMap();
        if (getAcceptCond().isEmpty()) {
            val list = cacheMap.computeIfAbsent(QuestData.questConditionKey(QuestCond.QUEST_COND_NONE, 0, null), e -> new ArrayList<>());
            list.add(this);
        } else {
            getAcceptCond().forEach(questCondition -> {
                if (questCondition.getType() == null) {
                    Grasscutter.getLogger().warn("null accept type for quest {}", getSubId());
                    return;
                }
                val key = questCondition.asKey();
                val list = cacheMap.computeIfAbsent(key, e -> new ArrayList<>());
                list.add(this);
            });
        }
    }

    @Data
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class QuestExecParam {
        @SerializedName("_type")
        QuestExec type;
        @SerializedName("_param")
        String[] param;
        @SerializedName("_count")
        String count;
    }

    public static class QuestAcceptCondition extends QuestCondition<QuestCond> { }

    public static class QuestContentCondition extends QuestCondition<QuestContent> { }

    @Data
    public static class QuestCondition<TYPE extends Enum<?> & QuestTrigger> {
        @SerializedName("_type")
        private TYPE type;
        @SerializedName("_param")
        private int[] param;
        @SerializedName("_param_str")
        private String paramStr;
        @SerializedName("_count")
        private int count;

        public String asKey() {
            return questConditionKey(getType(), getParam()[0], getParamStr());
        }
    }

    @Data
    public static class Guide {
        private String type;
        private List<String> param;
        private int guideScene;
    }
}
