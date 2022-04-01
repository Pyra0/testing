package com.github.pyra0.thing;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Thing extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.broadcastMessage("test");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
