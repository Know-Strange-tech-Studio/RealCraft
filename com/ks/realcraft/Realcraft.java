package com.ks.realcraft;

import com.ks.realcraft.craft.Crafting;
import com.ks.realcraft.events.Instant_tnt_drop;
import com.ks.realcraft.events.Instant_tnt_place;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Realcraft extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE+"Adding Recipes");

        Crafting.init(getConfig());
        /*getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE+"Adding Command");
        getCommand("setspawn").setExecutor(new SetWorldSpawn(this));
        getCommand("spawn").setExecutor(new Spawn(this));*/
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE+"Done Adding Recipes");


        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE+"Adding Event");

        getServer().getPluginManager().registerEvents(new Instant_tnt_place(),this);
        getServer().getPluginManager().registerEvents(new Instant_tnt_drop(),this);

        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE+"Done Adding Event");


        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "[RealCraft] Real Craft is enabled.");
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "[RealCraft]-----------------------");
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "[RealCraft] |▔▔▔▔| |▔▔▔▔▔");
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "[RealCraft] |    | |");
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "[RealCraft] |____| |");
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "[RealCraft] |\\     |");
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "[RealCraft] |  \\   |_____");
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "[RealCraft]-----------------------");

    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[RealCraft] Real Craft is disabled.");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[RealCraft]-----------------------");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[RealCraft] |▔▔▔▔| |▔▔▔▔▔");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[RealCraft] |    | |");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[RealCraft] |____| |");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[RealCraft] |\\     |");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[RealCraft] |  \\   |_____");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[RealCraft]-----------------------");

    }
}
