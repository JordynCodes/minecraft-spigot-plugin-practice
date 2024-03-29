package me.jordyn;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
  private static final Logger LOGGER=Logger.getLogger("practiceplugins");

  public void onEnable() {
    LOGGER.info("practiceplugins enabled");
  }

  public void onDisable() {
    LOGGER.info("practiceplugins disabled");
  }
}
