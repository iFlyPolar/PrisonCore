package me.prisoncore.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import me.prisoncore.Main;
import net.md_5.bungee.api.ChatColor;

public class mutechat implements CommandExecutor, Listener {
	Main plugin;

	public mutechat(Main instance) {
		this.plugin = instance;
	}

	public boolean blocked = false;

	@Override
	public boolean onCommand(CommandSender sender, Command command, String string, String[] args) {
		//if (sender.hasPermission("prison.mutechat")) {
			for (Player p : Bukkit.getServer().getOnlinePlayers()) {
				
				p.sendMessage("" + ChatColor.GRAY + "Chat was locked by " + ChatColor.RED + sender.getName());
			//}
			blocked = true;
		}
		return true;

	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerChat(AsyncPlayerChatEvent e) {
		if (blocked == true) {
			//if (!e.getPlayer().hasPermission("prison.mutechat.bypass")) {
				e.setCancelled(true);
				e.getPlayer().sendMessage(ChatColor.GRAY + "The chat is currently locked.");
			//}
		}
	}
}
