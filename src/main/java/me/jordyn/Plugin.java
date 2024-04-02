package me.jordyn;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import me.jordyn.tasks.BroadcastTask;
import net.md_5.bungee.api.ChatColor;

public class Plugin extends JavaPlugin {
  private static final Logger LOGGER=Logger.getLogger("practiceplugins");

  public void onEnable() {
    LOGGER.info("PracticePlugins enabled");
    new BroadcastTask(this).runTaskTimer(this, 0L, 200L);

    new BukkitRunnable() {
      @Override
      public void run(){
        Bukkit.getServer().broadcastMessage(ChatColor.BLUE + "This is an anonymous timed broadcast!");
      }
    }.runTaskTimer(this, 100L, 200L);

  }

  public void onDisable() {
    LOGGER.info("PracticePlugins disabled");
  }
}
