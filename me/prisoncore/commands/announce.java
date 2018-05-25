package me.prisoncore.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.prisoncore.Main;
import net.md_5.bungee.api.ChatColor;

public class announce implements CommandExecutor {
    Main plugin;
    public announce(Main instance) {
    	this.plugin = instance;
    }
    
	@Override
	public boolean onCommand(CommandSender sender, Command command, String string, String[] args) {
		for(Player p : Bukkit.getServer().getOnlinePlayers()) {
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < args.length; ++i) {
			     sb.append(args[i]).append(' ');
			}
			p.sendMessage("" + ChatColor.DARK_RED + "[" + ChatColor.RED + "ANNOUNCEMENT" + ChatColor.DARK_RED + "] " + ChatColor.RED + sb);
		}
		return true;
	}
    
}
