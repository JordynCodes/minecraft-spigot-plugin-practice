package me.jordyn.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class TPBowListener implements Listener {

    @EventHandler
    public void onArrowLand(ProjectileHitEvent e) {

        if (!(e.getEntity().getShooter() instanceof Player p)) {
            return;
        }

        if (!p.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
                .equals(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Teleport Bow")) {
            return;
        }

        p.teleport(e.getEntity().getLocation());
        e.getEntity().remove();

    }
}
