package me.prisoncore.listeners;

import org.bukkit.event.Listener;

import me.prisoncore.Main;
import me.prisoncore.api.Api;

public class PlayerChatEvent implements Listener {
	Main plugin;
	public PlayerChatEvent(Main instance) {
		this.plugin = instance;
	}
	
	Api api;
	
	/* @EventHandler
	    public void playerChat(AsyncPlayerChatEvent event) {
		 if(plugin.getConfig().getString("ranks." + plugin.getConfig().getString(event.getPlayer().getUniqueId() + ".rank") == "owner")) {
		 }
	        for(Player p : Bukkit.getServer().getOnlinePlayers()) {
	        	p.sendMessage( event.getMessage().toString() + plugin.getConfig().getString(ChatColor.translateAlternateColorCodes('&', event.getPlayer().getUniqueId() + ". suffix")));
	        }
	    }*/
	}
