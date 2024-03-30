package me.jordyn.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor{
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player p))
            return true;

        if (p.getAllowFlight() == false){
            p.setAllowFlight(true);
            p.sendMessage("You can now fly.");;
        }else{
            p.setAllowFlight(false);
            p.sendMessage("You can no longer fly.");
        }

        return true;

    }

}
