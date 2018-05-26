package me.prisoncore.listeners;

import org.bukkit.Bukkit;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.event.Listener;

import me.prisoncore.Main;
import me.prisoncore.api.Api;
import net.md_5.bungee.api.ChatColor;

public class PlayerJoin implements Listener {

	private static final String barmessage = "&dTESR &cBAR";
	Main plugin;
	public PlayerJoin(Main instance) {
		this.plugin = instance;
	}
	
	Api api;
	BossBar bar = Bukkit.createBossBar(ChatColor.translateAlternateColorCodes('&', barmessage), BarColor.YELLOW, BarStyle.SOLID);
	
	}
