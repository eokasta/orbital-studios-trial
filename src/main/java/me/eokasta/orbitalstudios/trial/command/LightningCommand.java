package me.eokasta.orbitalstudios.trial.command;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class LightningCommand implements CommandExecutor {

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

        final World world = targetPlayer.getWorld();
        world.strikeLightning(targetPlayer.getLocation());
        sender.sendMessage("§6You have sent lightning to " + targetPlayer.getName() + "!");
        return false;
    }
}
