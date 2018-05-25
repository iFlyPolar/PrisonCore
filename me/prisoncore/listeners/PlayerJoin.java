package me.prisoncore.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import me.prisoncore.Main;
import me.prisoncore.api.Api;
import net.md_5.bungee.api.ChatColor;

public class PlayerJoin implements Listener {
	Main plugin;
	public PlayerJoin(Main instance) {
		this.plugin = instance;
	}
	
	Api api;
	
	 @EventHandler
	    public void joinServer(PlayerJoinEvent event) {
	        Player player = event.getPlayer();
	        ScoreboardManager scoreboardManager = Bukkit.getScoreboardManager();
	        Scoreboard scoreboard = scoreboardManager.getNewScoreboard();
	        Objective objective = scoreboard.registerNewObjective("Test", "Dummy");
	        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
	        
	        objective.setDisplayName(ChatColor.RED + "≫ FOREIGNMC ≪");

	        player.setScoreboard(scoreboard);
	    }
	}
