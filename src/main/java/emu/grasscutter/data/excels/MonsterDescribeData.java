package emu.grasscutter.data.excels;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.GameData;
import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import emu.grasscutter.data.ResourceType.LoadPriority;
import lombok.Data;
import lombok.EqualsAndHashCode;

@ResourceType(name = "MonsterDescribeExcelConfigData.json", loadPriority = LoadPriority.HIGH)
@EqualsAndHashCode(callSuper=false)
@Data
public class MonsterDescribeData extends GameResource {
    private int id;
    private long nameTextMapHash;
    private int titleId;
    private int specialNameLabId;
    private MonsterSpecialNameData specialNameData;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void onLoad() {

    }
}
