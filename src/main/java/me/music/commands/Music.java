package me.music.commands;

import com.google.common.collect.Lists;
import me.core.MusicMine;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import static me.music.utils.Utilities.*;

import java.util.*;

public class Music implements CommandExecutor {
    public MusicMine plugin;

    public Music(MusicMine plugin) {
        this.plugin = plugin;
        plugin.getCommand("music").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("§cOnly for players.");
            return true;
        }

        Player player = (Player) sender;

        int lenght = plugin.getConfig().getInt("config.compasses.lenght");

        List<String>[] compassList = new List[lenght];
        String[][] notes = new String[lenght][4];

        List<String>[] compassList2 = new List[lenght];
        String[][] notes2 = new String[lenght][4];

        for (int i = 0; i < lenght; i++){
            compassList[i] = plugin.getConfig().getStringList("config.compasses.piano.compass_" + i);
            compassList2[i] = plugin.getConfig().getStringList("config.compasses.bass.compass_" + i);

            for (int j = 0; j < 4; j ++) {
                notes[i][j] = compassList[i].get(j);
                notes2[i][j] = compassList2[i].get(j);
            }
        }


        for (int i = 0; i < lenght; i++) {
            for (int j = 0; j < 4; j++) {
                checkNote(notes[i][j], player, "piano");
                checkNote(notes2[i][j], player, "bass");

                try {
                    Thread.sleep((215));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        return true;
    }
}
