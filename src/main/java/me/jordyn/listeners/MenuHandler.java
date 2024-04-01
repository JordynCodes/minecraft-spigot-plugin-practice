package me.jordyn.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import me.jordyn.Plugin;

public class MenuHandler implements Listener{

    private Plugin plugin;

    public MenuHandler(Plugin plugin){
        this.plugin = plugin;
    }
    
    @EventHandler
    public void onMenuClick(InventoryClickEvent e){
        
        Player p = (Player) e.getWhoClicked();
        // e.getClickedInventory().getTitle().equalsIgnoreCase(ChatColor.GRAY + "Armor Stand GUI")
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.GRAY + "Armor Stand GUI")){
          
            switch(e.getCurrentItem().getType()){
                case ARMOR_STAND:
                    p.sendMessage("open armor stand menu");
                    p.closeInventory();
                    plugin.openCreateMenu(p);
                    break;
                case BARRIER:
                    p.sendMessage("closing main menu");
                    p.closeInventory();
                    break;
                default: break;
            }

        }

    }

}
