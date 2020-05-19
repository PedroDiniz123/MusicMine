package me.music.commands;

import me.core.MusicMine;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static me.music.utils.Utilities.*;

public class PlayNote implements CommandExecutor {
    public MusicMine plugin;
    public PlayNote(MusicMine plugin) {
        this.plugin = plugin;
        plugin.getCommand("playnote").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if(!(sender instanceof Player)) return false;

        if (args.length != 1) {
            return false;
        }

        Player player = (Player) sender;
        String note = args[0];
        checkNote(note, player, "bass");
        return true;
    }
}
