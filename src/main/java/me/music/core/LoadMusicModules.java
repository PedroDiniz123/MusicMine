package me.music.core;

import me.core.MusicMine;
import me.music.commands.Music;
import me.music.commands.PlayNote;

public class LoadMusicModules {
    public LoadMusicModules(MusicMine plugin) {
        try{
            new Music(plugin);
            new PlayNote(plugin);

            plugin.getServer().getConsoleSender().sendMessage("§aFunfou");
        }catch (Exception exception) {

        }
    }
}
