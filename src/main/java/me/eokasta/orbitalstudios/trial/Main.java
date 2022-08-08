package me.eokasta.orbitalstudios.trial;

import me.eokasta.orbitalstudios.trial.command.ExplodeCommand;
import me.eokasta.orbitalstudios.trial.command.FireCommand;
import me.eokasta.orbitalstudios.trial.command.LightningCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("fire").setExecutor(new FireCommand());
        getCommand("lightning").setExecutor(new LightningCommand());
        getCommand("explode").setExecutor(new ExplodeCommand());
    }
}
