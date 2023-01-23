package emu.grasscutter.command.commands;

import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.world.SceneGroupInstance;

import java.util.List;

import static emu.grasscutter.utils.Language.translate;

@Command(label = "group",
         aliases = {"g"},
         usage = {"(refresh) [<groupId>] [<suiteId>]"},
         permission = "player.group",
         permissionTargeted = "player.group.others")
public final class GroupCommand implements CommandHandler {

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        if (args.size() == 0) {
            sendUsageMessage(sender);
            return;
        }
        String cmd = args.remove(0).toLowerCase();

        int groupId = 0;
        int suiteId = 0;
        if (args.size() >= 1) {
            try {
                groupId = Integer.parseInt(args.get(0));
            }
            catch (Exception e) {
                CommandHandler.sendMessage(sender, translate(sender, "commands.group.invalid_groupid"));
                return;
            }
        }
        if (args.size() >= 2) {
            try {
                suiteId = Integer.parseInt(args.get(1));
            }
            catch (Exception e) {
                CommandHandler.sendMessage(sender, translate(sender, "commands.group.invalid_suiteid"));
                return;
            }
        }

        switch (cmd) {
            case "refresh" -> {
                SceneGroupInstance groupInstance = targetPlayer.getScene().getScriptManager().getGroupInstanceById(groupId);
                if(groupInstance == null) {
                    CommandHandler.sendMessage(sender, translate(sender, "commands.group.group_not_found", groupId));
                    return;
                }

                if(args.size() >= 2) {
                    targetPlayer.getScene().getScriptManager().refreshGroup(groupInstance, suiteId, false);
                } else {
                    targetPlayer.getScene().getScriptManager().refreshGroup(groupInstance);
                }

                CommandHandler.sendMessage(sender, translate(sender, "commands.quest.refreshed", groupId));
            }
            default -> {
                sendUsageMessage(sender);
            }
        }
    }
}
