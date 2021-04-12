package dev.slipstream.network.slipstreamgems.commands;

import java.util.UUID;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import dev.slipstream.network.slipstreamgems.Main;
import dev.slipstream.network.slipstreamgems.sql.SQLGetter;
import dev.slipstream.network.slipstreamgems.utils.utils;

public class GemCommand implements CommandExecutor {

	public Main plugin;

	public GemCommand(Main plugin) {
		this.plugin = plugin;

		plugin.getCommand("gems").setExecutor(this);

	}

	public boolean onCommand(CommandSender sender, Command cmd, String lavel, String[] args) {

		if (!(sender instanceof Player)) {
			sender.sendMessage(utils.chat("&cOnly players may execute this command"));
			return true;
		}

		Player p = (Player) sender;
		UUID uuid = p.getUniqueId();

		if (p.hasPermission("SlipStreamGems.gems")) {


			int gems = SQLGetter.getGems(uuid);
			String loreGems = "&a[&6SlipStream Gems&a] &fYou have &a" + gems + " &fGems available";
			sender.sendMessage(utils.chat(loreGems));
			return true;
		}
		return false;
	}
}
