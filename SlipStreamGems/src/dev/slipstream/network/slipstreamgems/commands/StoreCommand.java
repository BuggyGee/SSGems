package dev.slipstream.network.slipstreamgems.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import dev.slipstream.network.slipstreamgems.Main;
import dev.slipstream.network.slipstreamgems.ui.GemStore;

public class StoreCommand implements CommandExecutor {
	
	public Main plugin;
	
	public StoreCommand(Main plugin) {
		this.plugin = plugin;
		
		plugin.getCommand("store").setExecutor(this);
	}

	public boolean onCommand(CommandSender sender, Command cmd, String lavel, String[] args) {
		if (!(sender instanceof Player)) {
			return true;
			
		}
		
		Player p = (Player) sender;
		
		if (p.hasPermission("gem.store")) {
			p.openInventory(GemStore.Base(p));
		}
		return false;
	}
}
