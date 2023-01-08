package emu.grasscutter.game.world;

import java.util.HashSet;
import java.util.Set;

import emu.grasscutter.game.entity.GameEntity;
import emu.grasscutter.scripts.data.SceneGroup;
import lombok.Getter;
import lombok.Setter;

public class SceneGroupInstance {
    @Getter private SceneGroup luaGroup;
    @Getter @Setter private int targetSuiteId;
    @Getter @Setter private int activeSuiteId;
    @Getter private Set<GameEntity> deadEntities;

    public SceneGroupInstance(SceneGroup group) {
        this.luaGroup = group;
        this.targetSuiteId = 0;
        this.activeSuiteId = 0;
        this.deadEntities = new HashSet<>();
    }
}
