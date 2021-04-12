package dev.slipstream.network.slipstreamgems.commands;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import dev.slipstream.network.slipstreamgems.Main;
import dev.slipstream.network.slipstreamgems.sql.SQLGetter;
import dev.slipstream.network.slipstreamgems.utils.utils;

public class PointCommand implements CommandExecutor {

	public Main plugin;

	public PointCommand(Main plugin) {
		this.plugin = plugin;

		plugin.getCommand("points").setExecutor(this);

	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lavel, String[] args) {
		if (sender.hasPermission("SlipStreamGems.add")) {
			if (args.length == 0) {
				sender.sendMessage(utils.chat("&e/points <add:remove:> <player>"));
			} else if (args.length == 1) {
				if (args[0].equalsIgnoreCase("add")) {
					sender.sendMessage(utils.chat("&e/points add <player> <amount>"));
				} else if (args[0].equals("remove")) {
					sender.sendMessage(utils.chat("&e/points remove <player> <amount>"));

				}
			} else if (args.length == 3) {
				@SuppressWarnings("deprecation")
				OfflinePlayer p = Bukkit.getOfflinePlayer(args[1]);
				UUID uuid = p.getUniqueId();
				int amount = Integer.parseInt(args[2]);
				if (args[0].equalsIgnoreCase("add")) {
					if (p != null) {
						int gems = SQLGetter.getGems(uuid);
						int newGems = (gems + amount);
						SQLGetter.updateGems(uuid, newGems);
						String gemsAdded = ("&eYou have added &a" + args[2] + "&e to &a%player%'s &eaccount");
						gemsAdded = gemsAdded.replace("%player%", p.getName());
						sender.sendMessage(utils.chat(gemsAdded));
					}
				} else if (args[0].equalsIgnoreCase("remove")) {
					if (p != null) {
						int gems = SQLGetter.getGems(uuid);
						int newGems = (gems - amount);
						SQLGetter.updateGems(uuid, newGems);
						String gemsAdded = ("&eYou have removed &a" + args[2] + "&e from &a%player%'s &eaccount");
						gemsAdded = gemsAdded.replace("%player%", p.getName());
						sender.sendMessage(utils.chat(gemsAdded));
					}
				} else if (args[0].equalsIgnoreCase("set")) {
					if (p != null) {
						int newGems = (amount);
						SQLGetter.updateGems(uuid, newGems);
						String gemsAdded = ("&eYou have removed &a" + args[2] + "&e from &a%player%'s &eaccount");
						gemsAdded = gemsAdded.replace("%player%", p.getName());
						sender.sendMessage(utils.chat(gemsAdded));
					}
				}

			}
		} else {
			sender.sendMessage(utils.chat("&cYou do not have permission to execute this command!"));
		}
		return false;

	}
}
