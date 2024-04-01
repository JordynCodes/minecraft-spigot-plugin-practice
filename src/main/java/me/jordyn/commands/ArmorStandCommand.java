package me.jordyn.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import me.jordyn.Plugin;

public class ArmorStandCommand implements CommandExecutor{

    private Plugin plugin;

    public ArmorStandCommand(Plugin plugin){
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        
        if (!(sender instanceof Player player)){
            return true;
        }

        plugin.openMainMenu(player);

        return true;
    }
    
}
