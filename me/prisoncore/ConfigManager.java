package me.prisoncore;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class ConfigManager {
	
	private Main plugin = Main.getPlugin(Main.class);
	
	public FileConfiguration ranklist;
	public File playerranks;
	
	public void setup() {
		if(!plugin.getDataFolder().exists()) {
			plugin.getDataFolder().mkdirs();
		}
		playerranks = new File(plugin.getDataFolder(), "ranks.yml");
		
		if(!playerranks.exists()) {
			try {
				playerranks.createNewFile();
			}catch(IOException e) {
				Bukkit.getServer().getLogger().severe(ChatColor.RED + "Could not create ranks.yml");
			}
		}
		
		ranklist = YamlConfiguration.loadConfiguration(playerranks);
		Bukkit.getLogger().info(ChatColor.GREEN + "ranks.yml was successfully created.");
	
		
	}
	
	public FileConfiguration getPlayers() {
		return ranklist;
	}
	
	public void SavePlayers() {
		try {
			ranklist.save(playerranks);
		}catch(IOException e) {
			Bukkit.getLogger().severe(ChatColor.RED + "ranks.yml could not be saved.");
		}
	}
	public void reloadPlayers() {
		ranklist = YamlConfiguration.loadConfiguration(playerranks);
	}

}
