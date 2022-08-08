package me.eokasta.orbitalstudios.trial.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class FireCommand implements CommandExecutor {

    @Override
    public boolean onCommand(
            @NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (args.length == 0) {
            sender.sendMessage("§cIncorrect usage. Use: /" + label + " <player>");
            return true;
        }

        final Player targetPlayer = Bukkit.getPlayerExact(args[0]);
        if (targetPlayer == null) {
            sender.sendMessage("§cPlayer not found.");
            return true;
        }

        targetPlayer.setFireTicks(60);
        sender.sendMessage("§6You have set " + targetPlayer.getName() + " on fire!");
        return false;
    }
}
