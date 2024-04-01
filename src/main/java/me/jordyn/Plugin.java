package me.jordyn;

import java.util.ArrayList;
import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import me.jordyn.commands.ArmorStandCommand;
import me.jordyn.listeners.MenuHandler;

public class Plugin extends JavaPlugin {
  private static final Logger LOGGER=Logger.getLogger("practiceplugins");

  public void onEnable() {
    LOGGER.info("PracticePlugins enabled");
    getCommand("armorstand").setExecutor(new ArmorStandCommand(this));
    getServer().getPluginManager().registerEvents(new MenuHandler(), this);
  }

  public void openMainMenu(Player player){
        Inventory mainMenu = Bukkit.createInventory(player, 9, ChatColor.GRAY + "Armor Stand GUI");
        ItemStack create = new ItemStack(Material.ARMOR_STAND);
        ItemMeta createMeta = create.getItemMeta();
        ArrayList<String> createLore = new ArrayList<>();
        createLore.add(ChatColor.GREEN +"Create a new armor stand");
        createMeta.setLore(createLore);
        create.setItemMeta(createMeta);

        ItemStack close = new ItemStack(Material.BARRIER);
        ItemMeta closeMeta = close.getItemMeta();
        closeMeta.setDisplayName(ChatColor.RED + "Close");
        close.setItemMeta(closeMeta);

        mainMenu.setItem(0, create);
        mainMenu.setItem(8, close);
        player.openInventory(mainMenu);
  }

  public void onDisable() {
    LOGGER.info("PracticePlugins disabled");
  }
}
