package me.jordyn.tasks;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;
import me.jordyn.Plugin;
import net.md_5.bungee.api.ChatColor;

public class BroadcastTask extends BukkitRunnable{

    Plugin plugin;

    public BroadcastTask(Plugin plugin){
        this.plugin = plugin;
    }

    @Override
    public void run() {
        Bukkit.getServer().broadcastMessage(ChatColor.AQUA + "This is a timed broadcast!");
    }
    
}
