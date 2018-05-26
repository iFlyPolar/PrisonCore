package me.prisoncore.commands;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.prisoncore.Main;
import net.md_5.bungee.api.ChatColor;

public class vanish implements CommandExecutor {
   
	private ArrayList<String> vanished = new ArrayList<String>();
	Main plugin;
    public vanish(Main instance) {
    	this.plugin = instance;
    }
    
	@Override
	public boolean onCommand(CommandSender sender, Command command, String string, String[] args) {
		if(!vanished.contains(sender.getName())) {
			vanished.add(sender.getName());
			for (Player p : Bukkit.getServer().getOnlinePlayers()) {
				p.hidePlayer((Player) sender);
				
			}
			sender.sendMessage(ChatColor.GRAY + "You are now " + ChatColor.GREEN + "Vanished");
		} else {
			for (Player p : Bukkit.getServer().getOnlinePlayers()) {
				p.showPlayer((Player) sender);
				
			}
			sender.sendMessage(ChatColor.GRAY + "You are no longer " + ChatColor.RED + "Vanished");
			vanished.remove(sender.getName());
		}
		return true;
	}
    
}
