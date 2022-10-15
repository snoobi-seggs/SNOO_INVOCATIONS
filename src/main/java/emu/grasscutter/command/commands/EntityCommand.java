package emu.grasscutter.command.commands;

import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.entity.*;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.props.FightProperty;
import emu.grasscutter.game.world.Scene;
import emu.grasscutter.utils.Position;
import lombok.Setter;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.regex.Pattern;

import static emu.grasscutter.command.CommandHelpers.*;
import static emu.grasscutter.utils.Language.translate;

@Command(
    label = "entity",
    aliases = {"gadget"},
    usage = {
        "<configId> [state]"},
    permission = "server.entity")
public final class EntityCommand implements CommandHandler {
    private static final Map<Pattern, BiConsumer<EntityParameters, Integer>> intCommandHandlers = Map.ofEntries(
        Map.entry(stateRegex, EntityParameters::setState),
        Map.entry(maxHPRegex, EntityParameters::setMaxHP),
        Map.entry(hpRegex, EntityParameters::setHp),
        Map.entry(defRegex, EntityParameters::setDef),
        Map.entry(atkRegex, EntityParameters::setAtk),
        Map.entry(aiRegex, EntityParameters::setAi)
    );

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        EntityParameters param = new EntityParameters();

        parseIntParameters(args, param, intCommandHandlers);

        // At this point, first remaining argument MUST be the id and the rest the pos
        if (args.size() != 1) {
            sendUsageMessage(sender);  // Reachable if someone does `/give lv90` or similar
            throw new IllegalArgumentException();
        }

        try {
            param.configId = Integer.parseInt(args.get(0));
        } catch (NumberFormatException ignored) {
            CommandHandler.sendMessage(sender, translate(sender, "commands.generic.invalid.entityId"));
        }

        param.scene = targetPlayer.getScene();
        var entity = param.scene.getEntityByConfigId(param.configId);

        if(entity == null){
            CommandHandler.sendMessage(sender, "failure");
            return;
        }
        applyCommonParameters(entity, param);
        if(param.state != -1 && entity instanceof EntityGadget){
            ((EntityGadget) entity).updateState(param.state);
        }

        CommandHandler.sendMessage(sender, "command success");
    }

    private void applyCommonParameters(GameEntity entity, EntityParameters param) {
        if (param.maxHP != -1) {
            entity.setFightProperty(FightProperty.FIGHT_PROP_MAX_HP, param.maxHP);
        }
        if (param.hp != -1) {
            entity.setFightProperty(FightProperty.FIGHT_PROP_CUR_HP, param.hp == 0 ? Float.MAX_VALUE : param.hp);
        }
        if (param.atk != -1) {
            entity.setFightProperty(FightProperty.FIGHT_PROP_ATTACK, param.atk);
            entity.setFightProperty(FightProperty.FIGHT_PROP_CUR_ATTACK, param.atk);
        }
        if (param.def != -1) {
            entity.setFightProperty(FightProperty.FIGHT_PROP_DEFENSE, param.def);
            entity.setFightProperty(FightProperty.FIGHT_PROP_CUR_DEFENSE, param.def);
        }
        //TODO update entity
    }

    private Position GetRandomPositionInCircle(Position origin, double radius) {
        Position target = origin.clone();
        double angle = Math.random() * 360;
        double r = Math.sqrt(Math.random() * radius * radius);
        target.addX((float) (r * Math.cos(angle))).addZ((float) (r * Math.sin(angle)));
        return target;
    }

    private static class EntityParameters {
        @Setter public int configId = -1;
        @Setter public int state = -1;
        @Setter public int hp = -1;
        @Setter public int maxHP = -1;
        @Setter public int atk = -1;
        @Setter public int def = -1;
        @Setter public int ai = -1;
        public Scene scene = null;
    }
}
