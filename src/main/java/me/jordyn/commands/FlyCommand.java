package me.jordyn.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor{
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player p))
            return true;

        if (args.length == 0){
            setFlight(p);
        } else {
            if (!p.hasPermission("practiceplugins.fly.other")){
                p.sendMessage(ChatColor.RED + "You do not have permission to target others with this command.");;
                return true;
            }
            Player target = Bukkit.getServer().getPlayerExact(args[0]);
            if (target == null) {
                p.sendMessage(ChatColor.RED + "Must target an online player.");
                return true;
            }
            setFlight(target);
        }

        return true;

    }

    private void setFlight(Player p){
        if (p.getAllowFlight() == false){
            p.setAllowFlight(true);
            p.sendMessage(ChatColor.YELLOW + "You can now fly.");;
        } else {
            p.setAllowFlight(false);
            p.sendMessage(ChatColor.YELLOW + "You can no longer fly.");
        }
    }

}
