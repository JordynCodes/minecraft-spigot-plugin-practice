package me.jordyn.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MenuHandler implements Listener{
    
    @EventHandler
    public void onMenuClick(InventoryClickEvent e){
        
        Player p = (Player) e.getWhoClicked();
        // e.getClickedInventory().getTitle().equalsIgnoreCase(ChatColor.GRAY + "Armor Stand GUI")
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.GRAY + "Armor Stand GUI")){
          
            switch(e.getCurrentItem().getType()){
                case ARMOR_STAND:
                    p.sendMessage("open armor stand menu");
                    p.closeInventory();
                    // open inv
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
