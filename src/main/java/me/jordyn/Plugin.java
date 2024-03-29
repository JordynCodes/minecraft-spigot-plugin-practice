package me.jordyn;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
  private static final Logger LOGGER=Logger.getLogger("practiceplugins");

  public void onEnable() {
    LOGGER.info("PracticePlugins enabled");
  }

  public void onDisable() {
    LOGGER.info("PracticePlugins disabled");
  }
}
