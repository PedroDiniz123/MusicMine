package me.core;

import me.music.core.LoadMusicModules;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

public class MusicMine extends JavaPlugin {

    public MusicMine plugin;

    @Override
    public void onEnable() {
        plugin = this;

        loadConfig();
        loadModules();
    }


    @Override
    public void onDisable() {
        HandlerList.unregisterAll();
    }

    private void loadModules(){
        new LoadMusicModules(plugin);
    }

    private void loadConfig(){
        getConfig().options().copyDefaults(false);
        saveDefaultConfig();
    }
}
