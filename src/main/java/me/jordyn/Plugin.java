package me.jordyn;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

import me.jordyn.commands.GiveBowCommand;
import me.jordyn.listeners.TPBowListener;

public class Plugin extends JavaPlugin {
  private static final Logger LOGGER = Logger.getLogger("practiceplugins");

  public void onEnable() {
    LOGGER.info("PracticePlugins enabled");
    getCommand("givebow").setExecutor(new GiveBowCommand());
    getServer().getPluginManager().registerEvents(new TPBowListener(), this);
  }

  public void onDisable() {
    LOGGER.info("PracticePlugins disabled");
  }
}
