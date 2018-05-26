package me.prisoncore;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.prisoncore.commands.*;
import me.prisoncore.listeners.*;

public class Main extends JavaPlugin implements Listener {
private ConfigManager cfgm;
	public void onEnable() {
		Bukkit.getLogger().info("[PrisonCore] Starting");
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new PlayerJoin(this), this);
		pm.registerEvents(new mutechat(this), this);
		loadConfigManager();
		
		final FileConfiguration config = this.getConfig();
		config.options().copyDefaults(true);
		saveConfig();
		
		getCommand("announce").setExecutor(new announce(this));
		getCommand("clearchat").setExecutor(new clearchat(this));
		getCommand("mutechat").setExecutor(new mutechat(this));
		getCommand("vanish").setExecutor(new vanish(this));


	}
	public void loadConfigManager() {
		cfgm = new ConfigManager();
		cfgm.setup();
	}
	public void onDisable() {
		saveDefaultConfig();
		Bukkit.getLogger().info("[PrisonCore] Stopping");
	}
	
}
