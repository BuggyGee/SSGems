package dev.slipstream.network.slipstreamgems.utils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;

public class utils {
	

	public static String chat(String s) {
		return ChatColor.translateAlternateColorCodes('&', s);
	}

	public static ItemStack createItem(Inventory inv, String materialString, int amount, int invSlot,
			String displayName, String... loreString) {

		ItemStack item;

		List<String> lore = new ArrayList<String>();

		item = new ItemStack(Material.matchMaterial(materialString), amount);

		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(utils.chat(displayName));
		for (String s : loreString) {
			lore.add(utils.chat(s));

		}
		meta.setLore(lore);
		item.setItemMeta(meta);

		inv.setItem(invSlot - 1, item);

		return item;

	}
    @SuppressWarnings("deprecation")
	public static ItemStack getSkull(Inventory inv, String url, int amount, int invSlot, String displayName, String...loreString ) {
        List<String> lore = new ArrayList<String>();
		ItemStack item;
		item = new ItemStack(Material.PLAYER_HEAD, 1, (short) 3);
        if(url.isEmpty())return item;
     
     
        SkullMeta itemMeta = (SkullMeta) item.getItemMeta();
        itemMeta.setDisplayName(utils.chat(displayName));
        GameProfile profile = new GameProfile(UUID.randomUUID(), null);
        byte[] encodedData = Base64.getEncoder().encode(String.format("{textures:{SKIN:{url:\"%s\"}}}", url).getBytes());
        profile.getProperties().put("textures", new Property("textures", new String(encodedData)));
        Field profileField = null;
        try
        {
            profileField = itemMeta.getClass().getDeclaredField("profile");
            profileField.setAccessible(true);
            profileField.set(itemMeta, profile);
        }
        catch (NoSuchFieldException | IllegalArgumentException | IllegalAccessException e)
        {
            e.printStackTrace();
        }
        for (String s : loreString) {
        	lore.add(utils.chat(s));
        }
        itemMeta.setLore(lore);
        item.setItemMeta(itemMeta);
        inv.setItem(invSlot - 1, item);

        return item;
    }
		
	    @SuppressWarnings("deprecation")
		public static ItemStack getPlayerHead(Inventory inv, Player p, int amount, int invSlot,
				String displayName, String... loreString) {
	    	
	    	List<String> lore = new ArrayList<String>();
	        ItemStack skull;
	        skull = new ItemStack(Material.PLAYER_HEAD, 1, (short) 3);
	        SkullMeta meta = (SkullMeta) skull.getItemMeta();
	        meta.setOwner(p.getName());
	        for (String s : loreString) {
	        	lore.add(utils.chat(s));
	        }
	        meta.setLore(lore);
	        skull.setItemMeta(meta);
	        
	        inv.setItem(invSlot - 1, skull);
	        return skull;
	    }

	@SuppressWarnings("deprecation")
	public static ItemStack createItemByte(Inventory inv, String materialString, int byteId, int amount, int invSlot,
			String displayName, String... loreString) {

		ItemStack item;

		List<String> lore = new ArrayList<String>();

		item = new ItemStack(Material.matchMaterial(materialString), amount, (short) byteId);

		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(utils.chat(displayName));
		for (String s : loreString) {
			lore.add(utils.chat(s));

		}
		meta.setLore(lore);
		item.setItemMeta(meta);

		inv.setItem(invSlot - 1, item);

		return item;

	}
}
