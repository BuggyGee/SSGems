package dev.slipstream.network.slipstreamgems.sql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import org.bukkit.entity.Player;

import dev.slipstream.network.slipstreamgems.Main;

public class SQLGetter {

	public static Main plugin;

	public SQLGetter(Main plugin) {
		SQLGetter.plugin = plugin;
	}

	public void createTable() {
		PreparedStatement ps;
		try {
			ps = plugin.SQL.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS SSGems "
					+ "(NAME VARCHAR(100), UUID VARCHAR(100), GEMS INT(100), PRIMARY KEY (NAME))");
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean exists(UUID uuid) {
		try {
			PreparedStatement ps = plugin.SQL.getConnection().prepareStatement("");
			ps.setString(1, uuid.toString());

			ResultSet results = ps.executeQuery();
			if (results.next()) {
				return true;
			}
			return false;
		} catch (

		SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public void createPlayer(final UUID uuid, Player player) {
		try {
			PreparedStatement ps = plugin.SQL.getConnection().prepareStatement("");
			ps.setString(1, uuid.toString());
			ResultSet results = ps.executeQuery();
			results.next();
			if (exists(uuid) != true) {
				PreparedStatement insert = plugin.SQL.getConnection()
						.prepareStatement("");
				insert.setString(1, player.getName());
				insert.setString(2, uuid.toString());
				insert.setInt(3, 0);
				insert.executeUpdate();
			}

		} catch (

		SQLException e) {
			e.printStackTrace();
		}
	}



	public static void updateGems(UUID uuid, int amount) {

		try {
			PreparedStatement ps = plugin.SQL.getConnection().prepareStatement("");
			ps.setInt(1, amount);
			ps.setString(2, uuid.toString());
			ps.executeUpdate();
		} catch (
			SQLException e) {
			e.printStackTrace();
		}
		
		

	}
	
	public static int getGems(UUID uuid) {

		try {
		System.out.println( plugin == null );
		PreparedStatement ps = plugin.SQL.getConnection().prepareStatement("SELECT * FROM SSGems WHERE UUID=?");
		ps.setString(1, uuid.toString());
		ResultSet results = ps.executeQuery();
		int gems = 0;
		if (results.next()) {
			gems = results.getInt("GEMS");
			return gems;
		}
		

	} catch (SQLException e) {
		e.printStackTrace();
	}
		return 0;
}	
	
	
}
