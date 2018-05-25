package me.prisoncore.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.prisoncore.Main;
import net.md_5.bungee.api.ChatColor;

public class clearchat implements CommandExecutor {
    Main plugin;
    public clearchat(Main instance) {
    	this.plugin = instance;
    }
    
	@Override
	public boolean onCommand(CommandSender sender, Command command, String string, String[] args) {
		for(Player p : Bukkit.getServer().getOnlinePlayers()) {
			if(p.isOp() == false) {
			for (int i = 0; i <= 100; i++) {
			    p.sendMessage(" ");
			
				} 
			}
			p.sendMessage("" + ChatColor.GRAY + "Chat was cleared by " + ChatColor.RED + sender.getName());
		}
		return true;
	}
    
}
