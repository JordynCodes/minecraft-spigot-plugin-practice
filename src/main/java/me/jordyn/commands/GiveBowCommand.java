package me.jordyn.commands;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GiveBowCommand implements CommandExecutor{
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player p))
            return true;

        if(args.length == 0){
            giveBow(p);
        } else {
            Player target = Bukkit.getPlayerExact(args[0]);
            if (target == null){
                p.sendMessage(ChatColor.RED + "That player does not exist.");
            } else {
                giveBow(target);
            }
        }

        return true;
    }

    private void giveBow(Player p){
        ItemStack bow = new ItemStack(Material.BOW, 1);
        ItemMeta bowMeta = bow.getItemMeta();
        bowMeta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Teleport Bow");
        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.LIGHT_PURPLE + "This magical bow will");
        lore.add(ChatColor.LIGHT_PURPLE + "teleport the user to");
        lore.add(ChatColor.LIGHT_PURPLE + "wherever its arrow lands.");
        bowMeta.setLore(lore);
        bowMeta.addEnchant(Enchantment.ARROW_INFINITE, 1, false);
        bow.setItemMeta(bowMeta);
        p.getInventory().addItem(bow);
        p.getInventory().addItem(new ItemStack(Material.ARROW, 1));
        p.sendMessage(ChatColor.GREEN + "Given bow to " + p.getDisplayName());
    }

}
