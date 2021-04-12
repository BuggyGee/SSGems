package dev.slipstream.network.slipstreamgems;

import java.sql.SQLException;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import dev.slipstream.network.slipstreamgems.commands.GemCommand;
import dev.slipstream.network.slipstreamgems.commands.PointCommand;
import dev.slipstream.network.slipstreamgems.commands.StoreCommand;
import dev.slipstream.network.slipstreamgems.listeners.InventoryClickListener;
import dev.slipstream.network.slipstreamgems.sql.SQLGetter;
import dev.slipstream.network.slipstreamgems.sql.mySQL;
import dev.slipstream.network.slipstreamgems.ui.GemStore;

public class Main extends JavaPlugin implements Listener {

	public mySQL SQL;
	public SQLGetter data;
	
	private static Main instance;

	public void onEnable() {

		this.SQL = new mySQL();
		this.data = new SQLGetter(this);


		try {
			SQL.connect();
		} catch (ClassNotFoundException | SQLException e1) {
			Bukkit.getLogger().info("Database not connected");
		}

		if (SQL.isConnected()) {
			Bukkit.getLogger().info("Database is connected");
			data.createTable();
			this.getServer().getPluginManager().registerEvents(this, this);
		}


		registerManagers();
		registerCommands();
		registerListeners();

		
		GemStore.initialize();

	}

	public void onDisable() {

		SQL.disconnect();


	}

	public static Main getInstance() {
		return instance;
	}

	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		data.createPlayer(player.getUniqueId(), player);
	}

	public void registerManagers() {
		new PointCommand(this);
		new GemCommand(this);
		new SQLGetter(this);

	}

	public void registerCommands() {
		new PointCommand(this);
		new GemCommand(this);
		new StoreCommand(this);

	}

	public void registerListeners() {
		new InventoryClickListener(this);
	}
}
