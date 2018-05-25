package me.prisoncore;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.prisoncore.commands.*;
import me.prisoncore.listeners.PlayerJoin;

public class Main extends JavaPlugin implements Listener {

	public void onEnable() {
		Bukkit.getLogger().info("[PrisonCore] Starting");
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new PlayerJoin(this), this);
		
		getCommand("announce").setExecutor(new announce(this));
		getCommand("clearchat").setExecutor(new clearchat(this));
		getCommand("mutechat").setExecutor(new mutechat(this));


	}
	public void onDisable() {
		Bukkit.getLogger().info("[PrisonCore] Stopping");
	}
	
}
