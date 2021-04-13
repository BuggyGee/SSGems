package dev.slipstream.network.slipstreamgems.ui;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import dev.slipstream.network.slipstreamgems.Main;
import dev.slipstream.network.slipstreamgems.sql.SQLGetter;
import dev.slipstream.network.slipstreamgems.utils.utils;

public class GemStore {

	public static Inventory inv;
	public static String inventory_name;
	public static int inv_boxes = 9;
	public static int inv_rows = inv_boxes * 3;
	public static Inventory inv2;
	public static int inv_rows2 = inv_boxes * 2;
	public static int inv_rows4 = inv_boxes * 4;
	public static int inv_rows6 = inv_boxes * 3;
	public static Inventory inv3;
	public static Inventory inv4;
	public static Inventory inv5;
	public static String inventory_name2;
	public static String inventory_name3;
	public static String inventory_name4;
	public static String inventory_name5;

	public static Inventory ironConfirm;
	public static Inventory lapisConfirm;
	public static Inventory goldConfirm;
	public static Inventory diamondConfirm;
	public static Inventory emeraldConfirm;
	public static Inventory obsidianConfirm;
	public static Inventory netheriteConfirm;
	public static String confirmIron;
	public static String confirmLapis;
	public static String confirmGold;
	public static String confirmDiamond;
	public static String confirmEmerald;
	public static String confirmObsidian;
	public static String confirmNetherite;
	public static Inventory rangerConfirm;
	public static Inventory ambulanceConfirm;
	public static Inventory bluecarConfirm;
	public static Inventory boxerConfirm;
	public static Inventory chickenConfirm;
	public static Inventory duckConfirm;
	public static Inventory greencarConfirm;
	public static Inventory hippieConfirm;
	public static Inventory minimeConfirm;
	public static Inventory mp8Confirm;
	public static Inventory pandaConfirm;
	public static Inventory policeConfirm;
	public static Inventory pugConfirm;
	public static Inventory redcarConfirm;
	public static Inventory redpandaConfirm;
	public static Inventory sharkConfirm;
	public static Inventory turtleConfirm;
	public static Inventory yellowcarConfirm;
	public static Inventory flyConfirm;
	public static Inventory nickConfirm;
	public static Inventory nickcolourConfirm;
	public static Inventory afkConfirm;
	public static Inventory skullConfirm;
	public static Inventory hatConfirm;
	public static String confirmRanger;
	public static String confirmAmbulance;
	public static String confirmBlueCar;
	public static String confirmBoxer;
	public static String confirmChicken;
	public static String confirmDuck;
	public static String confirmGreenCar;
	public static String confirmHippie;
	public static String confirmMiniMe;
	public static String confirmMP8;
	public static String confirmPanda;
	public static String confirmPolice;
	public static String confirmPug;
	public static String confirmRedCar;
	public static String confirmRedPanda;
	public static String confirmShark;
	public static String confirmTurtle;
	public static String confirmYellowCar;
	public static String confirmFly;
	public static String confirmNick;
	public static String confirmNickColour;
	public static String confirmAFK;
	public static String confirmSkull;
	public static String confirmHat;

	
	public static int inv_rows3 = inv_boxes * 1;

	public static Main plugin;

	public static void initialize() {

		inventory_name = utils.chat("&6&lSlipStream Gem Store");
		inv = Bukkit.createInventory(null, inv_rows);
		inv2 = Bukkit.createInventory(null, inv_rows6);
		inv3 = Bukkit.createInventory(null, inv_rows4);
		inv4 = Bukkit.createInventory(null, inv_rows2);
		inv5 = Bukkit.createInventory(null, inv_rows3);
		inventory_name2 = utils.chat("&6&lSS Gem Store >> &4&lRanks");
		inventory_name3 = utils.chat("&6&lSS Gem Store >> &4&lPets");
		inventory_name4 = utils.chat("&4&lServer Specfic");
		inventory_name5 = utils.chat("&4&lGlobal Perks");

		confirmIron = utils.chat("&fIRON &a&lConfirm &fOr &4Deny");
		confirmLapis = utils.chat("&9LAPIS &a&lConfirm &fOr &4Deny");
		confirmGold = utils.chat("&6GOLD &a&lConfirm &fOr &4Deny");
		confirmDiamond = utils.chat("&bDIAMOND &a&lConfirm &fOr &4Deny");
		confirmEmerald = utils.chat("&aEMERALD &a&lConfirm &fOr &4Deny");
		confirmObsidian = utils.chat("&5OBSIDIAN &a&lConfirm &fOr &4Deny");
		confirmNetherite = utils.chat("&cNETHERITE &a&lConfirm &fOr &4Deny");
		confirmRanger = utils.chat("&cRANGER &a&lConfirm &fOr &4Deny");
		confirmAmbulance = utils.chat("&cAMBULANCE &a&lConfirm &fOr &4Deny");
		confirmBlueCar = utils.chat("&cBLUECAR &a&lConfirm &fOr &4Deny");
		confirmBoxer = utils.chat("&cBOXER &a&lConfirm &fOr &4Deny");
		confirmChicken = utils.chat("&cCHICKEN &a&lConfirm &fOr &4Deny");
		confirmDuck = utils.chat("&cDUCK &a&lConfirm &fOr &4Deny");
		confirmGreenCar = utils.chat("&cGREENCAR &a&lConfirm &fOr &4Deny");
		confirmHippie = utils.chat("&cHIPPIE &a&lConfirm &fOr &4Deny");
		confirmMiniMe = utils.chat("&cMINIME &a&lConfirm &fOr &4Deny");
		confirmMP8 = utils.chat("&cMP8 &a&lConfirm &fOr &4Deny");
		confirmPanda = utils.chat("&cPANDA &a&lConfirm &fOr &4Deny");
		confirmPolice = utils.chat("&cPOLICECAR &a&lConfirm &fOr &4Deny");
		confirmPug = utils.chat("&cPUG &a&lConfirm &fOr &4Deny");
		confirmRedCar = utils.chat("&cREDCAR &a&lConfirm &fOr &4Deny");
		confirmRedPanda = utils.chat("&cREDPANDA &a&lConfirm &fOr &4Deny");
		confirmShark = utils.chat("&cSHARK &a&lConfirm &fOr &4Deny");
		confirmTurtle = utils.chat("&cTURTLE &a&lConfirm &fOr &4Deny");
		confirmYellowCar = utils.chat("&cYELLOWCAR &a&lConfirm &fOr &4Deny");
		confirmFly = utils.chat("&c/FLY &a&lConfirm &fOr &4Deny");
		confirmNick = utils.chat("&c/NICK &a&lConfirm &fOr &4Deny");
		confirmNickColour = utils.chat("&4/&6n&ei&ac&3k &a&lConfirm &fOr &4Deny");
		confirmAFK = utils.chat("&cAFK BYPASS &a&lConfirm &fOr &4Deny");
		confirmSkull = utils.chat("&c/SKULL &a&lConfirm &fOr &4Deny");
		confirmHat = utils.chat("&c/HAT &a&lConfirm &fOr &4Deny");
		confirmFeed = utils.chat("&c/FEED &a&lConfirm &fOr &4Deny");

		flyConfirm = Bukkit.createInventory(null, inv_rows3);
		nickConfirm = Bukkit.createInventory(null, inv_rows3);
		nickcolourConfirm = Bukkit.createInventory(null, inv_rows3);
		afkConfirm = Bukkit.createInventory(null, inv_rows3);
		skullConfirm = Bukkit.createInventory(null, inv_rows3);
		hatConfirm = Bukkit.createInventory(null, inv_rows3);
		feedConfirm = Bukkit.createInventory(null, inv_rows3);

		rangerConfirm = Bukkit.createInventory(null, inv_rows3);
		ambulanceConfirm = Bukkit.createInventory(null, inv_rows3);
		bluecarConfirm = Bukkit.createInventory(null, inv_rows3);
		boxerConfirm = Bukkit.createInventory(null, inv_rows3);
		chickenConfirm = Bukkit.createInventory(null, inv_rows3);
		duckConfirm = Bukkit.createInventory(null, inv_rows3);
		greencarConfirm = Bukkit.createInventory(null, inv_rows3);
		hippieConfirm = Bukkit.createInventory(null, inv_rows3);
		minimeConfirm = Bukkit.createInventory(null, inv_rows3);
		mp8Confirm = Bukkit.createInventory(null, inv_rows3);
		pandaConfirm = Bukkit.createInventory(null, inv_rows3);
		policeConfirm = Bukkit.createInventory(null, inv_rows3);
		pugConfirm = Bukkit.createInventory(null, inv_rows3);
		redcarConfirm = Bukkit.createInventory(null, inv_rows3);
		redpandaConfirm = Bukkit.createInventory(null, inv_rows3);
		sharkConfirm = Bukkit.createInventory(null, inv_rows3);
		turtleConfirm = Bukkit.createInventory(null, inv_rows3);
		yellowcarConfirm = Bukkit.createInventory(null, inv_rows3);

		ironConfirm = Bukkit.createInventory(null, inv_rows3);
		lapisConfirm = Bukkit.createInventory(null, inv_rows3);
		goldConfirm = Bukkit.createInventory(null, inv_rows3);
		diamondConfirm = Bukkit.createInventory(null, inv_rows3);
		emeraldConfirm = Bukkit.createInventory(null, inv_rows3);
		obsidianConfirm = Bukkit.createInventory(null, inv_rows3);
		netheriteConfirm = Bukkit.createInventory(null, inv_rows3);

	}

	public static Inventory Base(Player p) {

		Inventory toReturn = Bukkit.createInventory(null, inv_rows, inventory_name);
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		utils.createItem(inv, "beacon", 1, 3, "&eRanks", "", "&bPurchase Ranks with Gems!");
		utils.getSkull(inv,
				"http://textures.minecraft.net/texture/a116e69a845e227f7ca1fdde8c357c8c821ebd4ba619382ea4a1f87d4ae94",
				1, 7, "&ePets", "", "&bPurchase Pets with Gems!");
		utils.createItem(inv, "stone", 1, 21, "&eServer Specific", "", "&bPurchase Server Spefic items!");
		utils.getSkull(inv, "http://textures.minecraft.net/texture/438cf3f8e54afc3b3f91d20a49f324dca1486007fe545399055524c17941f4dc" , 1, 25, "&eGlobal Perks", "", "&bPurchase Global Perks!");

		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(inv, p, 1, 14, "&e " + p.getName(), "", loreGems);
		toReturn.setContents(inv.getContents());
		return toReturn;

	}

	public static Inventory RankGui(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows6, inventory_name2);

		utils.createItem(inv2, "iron_ingot", 1, 11, "&fIron Rank", "&c&l5000 Gems");
		utils.createItem(inv2, "lapis_block", 1, 3, "&9Lapis Rank", "&c&l15000 Gems");
		utils.createItem(inv2, "gold_ingot", 1, 13, "&6Gold Rank", "&c&l20000 Gems");
		utils.createItem(inv2, "diamond", 1, 5, "&bDiamond Rank", "&c&l35000 Gems");
		utils.createItem(inv2, "emerald", 1, 15, "&aEmerald Rank", "&c&l50000 Gems");
		utils.createItem(inv2, "obsidian", 1, 7, "&5Obsidian Rank", "&c&l80000 Gems");
		utils.createItem(inv2, "netherite_ingot", 1, 17, "&4Netherite Rank", "&c&l100 000 Gems");
		utils.createItem(inv2, "red_stained_glass_pane", 1, 23, "&4BACK", "");

		toReturn.setContents(inv2.getContents());
		return toReturn;

	}

	public static void clicked(Player p, int slot, ItemStack clicked, Inventory inv) {
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eRanks"))) {

			p.closeInventory();
			p.openInventory(GemStore.RankGui(p));

		}
	}

	public static void clicked2(Player p, int slot, ItemStack clicked, Inventory inv) {
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&ePets"))) {

			p.closeInventory();
			p.openInventory(GemStore.PetsGui(p));

		}
	}

	public static void clicked3(Player p, int slot, ItemStack clicked, Inventory inv) {
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eServer Specific"))) {

			p.closeInventory();
			p.openInventory(GemStore.ServerSpecificGui(p));

		}
	}

	public static void clicked4(Player p, int slot, ItemStack clicked, Inventory inv) {
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eGlobal Perks"))) {

			p.closeInventory();
			p.openInventory(GemStore.GlobalPerksGui(p));

		}
	}

	// RANKGUI OPENING OF INDIVIDUAL RANKS / PERMISSION CHECK

	public static void ranksBack(Player p, int slot, ItemStack ranksBack, Inventory inv) {
		if (ranksBack.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4BACK"))) {

			p.closeInventory();
			p.openInventory(GemStore.Base(p));

		}
	}

	public static void ironConfirm(Player p, int slot, ItemStack ironConfirm, Inventory inv) {

		if (ironConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&fIron Rank"))
				&& !p.hasPermission("iron.iron")) {

			p.closeInventory();
			p.openInventory(GemStore.ironConfirm(p));

		} else if (ironConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&fIron Rank"))
				&& p.hasPermission("iron.iron")) {
			p.sendMessage(utils.chat("&aYou are already Iron Rank or higher"));
		}

	}

	public static void lapisConfirm(Player p, int slot, ItemStack lapisConfirm, Inventory inv) {

		if (lapisConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&9Lapis Rank"))
				&& !p.hasPermission("lapis.lapis")) {
			p.closeInventory();
			p.openInventory(GemStore.lapisConfirm(p));

		} else if (lapisConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&9Lapis Rank"))
				&& p.hasPermission("lapis.lapis")) {
			p.sendMessage(utils.chat("&aYou are already Lapis Rank or higher"));
		}

	}

	public static void goldConfirm(Player p, int slot, ItemStack goldConfirm, Inventory inv) {

		if (goldConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&6Gold Rank"))
				&& !p.hasPermission("gold.gold")) {
			p.closeInventory();
			p.openInventory(GemStore.goldConfirm(p));

		} else if (goldConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&6Gold Rank"))
				&& p.hasPermission("gold.gold")) {
			p.sendMessage(utils.chat("&aYou are already Gold Rank or higher"));
		}

	}

	public static void diamondConfirm(Player p, int slot, ItemStack diamondConfirm, Inventory inv) {

		if (diamondConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bDiamond Rank"))
				&& !p.hasPermission("diamond.diamond")) {
			p.closeInventory();
			p.openInventory(GemStore.diamondConfirm(p));

		} else if (diamondConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bDiamond Rank"))
				&& p.hasPermission("diamond.diamond")) {
			p.sendMessage(utils.chat("&aYou are already Diamond Rank or higher"));
		}

	}

	public static void emeraldConfirm(Player p, int slot, ItemStack emeraldConfirm, Inventory inv) {

		if (emeraldConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aEmerald Rank"))
				&& !p.hasPermission("emerald.emerald")) {
			p.closeInventory();
			p.openInventory(GemStore.emeraldConfirm(p));

		} else if (emeraldConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aEmerald Rank"))
				&& p.hasPermission("emerald.emerald")) {
			p.sendMessage(utils.chat("&aYou are already Emerald Rank or higher"));
		}

	}

	public static void obsidianConfirm(Player p, int slot, ItemStack obsidianConfirm, Inventory inv) {

		if (obsidianConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&5Obsidian Rank"))
				&& !p.hasPermission("obsidian.obsidian")) {
			p.closeInventory();
			p.openInventory(GemStore.obsidianConfirm(p));

		} else if (obsidianConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&5Obsidian Rank"))
				&& p.hasPermission("obsidian.obsidian")) {
			p.sendMessage(utils.chat("&aYou are already Obsidian Rank or higher"));
		}

	}

	public static void netheriteConfirm(Player p, int slot, ItemStack netheriteConfirm, Inventory inv) {

		if (netheriteConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4Netherite Rank"))
				&& !p.hasPermission("netherite.netherite")) {
			p.closeInventory();
			p.openInventory(GemStore.netheriteConfirm(p));

		} else if (netheriteConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4Netherite Rank"))
				&& p.hasPermission("netherite.netherite")) {
			p.sendMessage(utils.chat("&aYou are already Netherite Rank"));
		}

	}

	// CONFIRM GUI OF EACH RANK FOLLOWED BTY ACTION OF CLICKING PURCHASE

	// IRON
	public static Inventory ironConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmIron);

		utils.createItem(ironConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l5000 Gems");
		utils.createItem(ironConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(ironConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(ironConfirm.getContents());
		return toReturn;
	}

	public static void ironPurchase(Player p, int slot, ItemStack ironPurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (ironPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 5000) {

			String ironcmd = "lp user %player% parent add iron";
			ironcmd = ironcmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), ironcmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 5000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a5000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (ironPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 5000) {
			p.closeInventory();
			int gems = (5000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		}

		else if (ironPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.RankGui(p));
		}

	}

	// LAPIS

	public static Inventory lapisConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmLapis);

		utils.createItem(lapisConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l15000 Gems");
		utils.createItem(lapisConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(lapisConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(lapisConfirm.getContents());
		return toReturn;
	}

	public static void lapisPurchase(Player p, int slot, ItemStack lapisPurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (lapisPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 15000) {

			String lapiscmd = "lp user %player% parent add lapis";
			lapiscmd = lapiscmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), lapiscmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 15000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a15000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (lapisPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 15000) {
			p.closeInventory();
			int gems = (15000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		}

		else if (lapisPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.RankGui(p));
		}

	}

	// GOLD

	public static Inventory goldConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmGold);

		utils.createItem(goldConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l20000 Gems");
		utils.createItem(goldConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(goldConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(goldConfirm.getContents());
		return toReturn;
	}

	public static void goldPurchase(Player p, int slot, ItemStack goldPurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (goldPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 20000) {

			String goldcmd = "lp user %player% parent add gold";
			goldcmd = goldcmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), goldcmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 20000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a20000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (goldPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 20000) {
			p.closeInventory();
			int gems = (20000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		}

		else if (goldPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.RankGui(p));
		}

	}

	// DIAMOND

	public static Inventory diamondConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmDiamond);

		utils.createItem(diamondConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l35000 Gems");
		utils.createItem(diamondConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(diamondConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(diamondConfirm.getContents());
		return toReturn;
	}

	public static void diamondPurchase(Player p, int slot, ItemStack diamondPurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (diamondPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 35000) {

			String diamondcmd = "lp user %player% parent add diamond";
			diamondcmd = diamondcmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), diamondcmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 35000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a35000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (diamondPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 35000) {
			p.closeInventory();
			int gems = (35000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		} else if (diamondPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.RankGui(p));
		}

	}

	// EMERALD

	public static Inventory emeraldConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmEmerald);

		utils.createItem(emeraldConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l50000 Gems");
		utils.createItem(emeraldConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(emeraldConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(emeraldConfirm.getContents());
		return toReturn;
	}

	public static void emeraldPurchase(Player p, int slot, ItemStack emeraldPurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (emeraldPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 50000) {

			String emeraldcmd = "lp user %player% parent add emerald";
			emeraldcmd = emeraldcmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), emeraldcmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 50000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a50000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (emeraldPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 50000) {
			p.closeInventory();
			int gems = (50000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		} else if (emeraldPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.RankGui(p));
		}

	}

	// OBSIDIAN

	public static Inventory obsidianConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmObsidian);

		utils.createItem(obsidianConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l80000 Gems");
		utils.createItem(obsidianConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(obsidianConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(obsidianConfirm.getContents());
		return toReturn;
	}

	public static void obsidianPurchase(Player p, int slot, ItemStack obsidianPurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (obsidianPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 80000) {

			String obsidiancmd = "lp user %player% parent add obsidian";
			obsidiancmd = obsidiancmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), obsidiancmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 80000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a80000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (obsidianPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 80000) {
			p.closeInventory();
			int gems = (80000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		} else if (obsidianPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.RankGui(p));
		}

	}

	// NETHERITE

	public static Inventory netheriteConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmNetherite);

		utils.createItem(netheriteConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l100 000 Gems");
		utils.createItem(netheriteConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(netheriteConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(netheriteConfirm.getContents());
		return toReturn;
	}

	public static void netheritePurchase(Player p, int slot, ItemStack netheritePurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (netheritePurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 100000) {
			String netheritecmd = "lp user %player% parent add netherite";
			netheritecmd = netheritecmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), netheritecmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 100000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a100 000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (netheritePurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 100000) {
			p.closeInventory();
			int gems = (100000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		} else if (netheritePurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.RankGui(p));
		}

	}

	// END OF RANK/PURCHASE

	// PETSGUI CREATE

	public static Inventory PetsGui(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows4, inventory_name3);

		utils.getSkull(inv3,
				"http://textures.minecraft.net/texture/2e86b02ae2b1c8ca30a8a2f6c3286245b2710349e683697706d81d0d6319916a",
				1, 1, "&ePark Ranger", "&c2500 Gems");
		utils.getSkull(inv3,
				"http://textures.minecraft.net/texture/1debc7b2bc61514bd446665037551bf7c833237e8320fefb485411f8f42f66c8",
				1, 2, "&eAmbulance", "&c2500 Gems");
		utils.getSkull(inv3,
				"http://textures.minecraft.net/texture/007e89793c7e2c956846218df223c46ef03a5c12f5c44f5a80e0ebe446f2be",
				1, 3, "&eBlue Car", "&c2500 Gems");
		utils.getSkull(inv3,
				"http://textures.minecraft.net/texture/5d67e29ff4607a261d2fc15e683366dcb242c45d8a201affdd6a24492a62", 1,
				4, "&eBoxer", "&c2500 Gems");
		utils.getSkull(inv3,
				"http://textures.minecraft.net/texture/1638469a599ceef7207537603248a9ab11ff591fd378bea4735b346a7fae893",
				1, 5, "&eChicken", "&c2500 Gems");
		utils.getSkull(inv3,
				"http://textures.minecraft.net/texture/7520717aff2a660b29411c014b88918b72d11d0853ac2c6ff4eee2888e33a7",
				1, 6, "&eDuck", "&c2500 Gems");
		utils.getSkull(inv3,
				"http://textures.minecraft.net/texture/eeeb3d4c3ad1c63079cabd7010e74d5d155d38f723d9b3ff9b79faacc434", 1,
				7, "&eGreen Car", "&c2500 Gems");
		utils.getSkull(inv3,
				"http://textures.minecraft.net/texture/c2334b3d69c34916ec3a19368762009fda5c05666992810098a71d95dd196d9d",
				1, 8, "&eHippie Van", "&c2500 Gems");
		utils.getSkull(inv3,
				"http://textures.minecraft.net/texture/a116e69a845e227f7ca1fdde8c357c8c821ebd4ba619382ea4a1f87d4ae94",
				1, 9, "&eMini Me", "&c2500 Gems");
		utils.getSkull(inv3,
				"http://textures.minecraft.net/texture/ca1716531244106675167ca5327f23f8c192af7accff449d6b3beb065813f74",
				1, 10, "&eMP-8", "&c2500 Gems");
		utils.getSkull(inv3,
				"http://textures.minecraft.net/texture/947b68ed021632f408fc223ef7957c24786ae509a84e6f18a371a55c3d8cf909",
				1, 11, "&ePanda", "&c2500 Gems");
		utils.getSkull(inv3,
				"http://textures.minecraft.net/texture/df10ade3a30c8f582f8acd7f344e1348c570e0f438ca3f5c33e2c9a93be78f0c",
				1, 12, "&ePolice Car", "&c2500 Gems");
		utils.getSkull(inv3,
				"http://textures.minecraft.net/texture/47b4f84e19b52f31217712e7ba9f51d56da59d2445b4d7f39ef6c323b8166",
				1, 13, "&ePug", "&c2500 Gems");
		utils.getSkull(inv3,
				"http://textures.minecraft.net/texture/e8778c34fba29652cfac8d3f6fb35c49cbc2362b2b8f1378d83b30f463b181",
				1, 14, "&eRed Car", "&c2500 Gems");
		utils.getSkull(inv3,
				"http://textures.minecraft.net/texture/192f773f46ef5b2ecce7ec352a7a973f9c4738dfd7d337a9c01a041fe4e568d0",
				1, 15, "&eRed Panda", "&c2500 Gems");
		utils.getSkull(inv3,
				"http://textures.minecraft.net/texture/a94ae433b301c7fb7c68cba625b0bd36b0b14190f20e34a7c8ee0d9de06d53b9",
				1, 16, "&eShark", "&c2500 Gems");
		utils.getSkull(inv3,
				"http://textures.minecraft.net/texture/5ae885b41cd7b961d35db66269b85f9ef01439019d6cd2f61ad38b72535689",
				1, 17, "&eTurtle", "&c2500 Gems");
		utils.getSkull(inv3,
				"http://textures.minecraft.net/texture/a91def8192f33cc93c556abe688335b5f8a26159711dc576ebd64efaf9249c",
				1, 18, "&eYellow Car", "&c2500 Gems");
		utils.createItem(inv3, "red_stained_glass_pane", 1, 32, "&4BACK", "");

		toReturn.setContents(inv3.getContents());
		return toReturn;

	}

	// PERMISSION CHECK AND OPENING OF GUI
	public static void petsBack(Player p, int slot, ItemStack petsBack, Inventory inv) {
		if (petsBack.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4BACK"))) {

			p.closeInventory();
			p.openInventory(GemStore.Base(p));

		}
	}

	// RANGER

	public static void rangerConfirm(Player p, int slot, ItemStack rangerConfirm, Inventory inv) {

		if (rangerConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&ePark Ranger"))
				&& !p.hasPermission("mpet.rangercar")) {

			p.closeInventory();
			p.openInventory(GemStore.rangerConfirm(p));

		} else if (rangerConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&ePark Ranger"))
				&& p.hasPermission("mpet.rangercar")) {
			p.sendMessage(utils.chat("&aYou already have the Ranger Car pet!"));
		}

	}

	// AMBULANCE
	public static void ambulanceConfirm(Player p, int slot, ItemStack ambulanceConfirm, Inventory inv) {

		if (ambulanceConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eAmbulance"))
				&& !p.hasPermission("mpet.ambulance")) {

			p.closeInventory();
			p.openInventory(GemStore.ambulanceConfirm(p));

		} else if (ambulanceConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eAmbulance"))
				&& p.hasPermission("mpet.ambulance")) {
			p.sendMessage(utils.chat("&aYou already have the Ambulance pet!"));
		}

	}
	// BLUECAR

	public static void bluecarConfirm(Player p, int slot, ItemStack bluecarConfirm, Inventory inv) {

		if (bluecarConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eBlue Car"))
				&& !p.hasPermission("mpet.bluecar")) {

			p.closeInventory();
			p.openInventory(GemStore.bluecarConfirm(p));

		} else if (bluecarConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eBlue Car"))
				&& p.hasPermission("mpet.bluecar")) {
			p.sendMessage(utils.chat("&aYou already have the Blue Car pet!"));
		}

	}

	// BOXER
	public static void boxerConfirm(Player p, int slot, ItemStack boxerConfirm, Inventory inv) {

		if (boxerConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eBoxer"))
				&& !p.hasPermission("mpet.boxer")) {

			p.closeInventory();
			p.openInventory(GemStore.boxerConfirm(p));

		} else if (boxerConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eBoxer"))
				&& p.hasPermission("mpet.boxer")) {
			p.sendMessage(utils.chat("&aYou already have the Boxer pet!"));
		}

	}
	// CHICKEN

	public static void chickenConfirm(Player p, int slot, ItemStack chickenConfirm, Inventory inv) {

		if (chickenConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eChicken"))
				&& !p.hasPermission("mpet.chicken")) {

			p.closeInventory();
			p.openInventory(GemStore.chickenConfirm(p));

		} else if (chickenConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eChicken"))
				&& p.hasPermission("mpet.chicken")) {
			p.sendMessage(utils.chat("&aYou already have the Chicken pet!"));
		}

	}

	// DUCK
	public static void duckConfirm(Player p, int slot, ItemStack duckConfirm, Inventory inv) {

		if (duckConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eDuck"))
				&& !p.hasPermission("mpet.duck")) {

			p.closeInventory();
			p.openInventory(GemStore.duckConfirm(p));

		} else if (duckConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eDuck"))
				&& p.hasPermission("mpet.duck")) {
			p.sendMessage(utils.chat("&aYou already have the Duck pet!"));
		}

	}
	// GREENCAR

	public static void greencarConfirm(Player p, int slot, ItemStack greencarConfirm, Inventory inv) {

		if (greencarConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eGreen Car"))
				&& !p.hasPermission("mpet.greencar")) {

			p.closeInventory();
			p.openInventory(GemStore.greencarConfirm(p));

		} else if (greencarConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eGreen Car"))
				&& p.hasPermission("mpet.rangercar")) {
			p.sendMessage(utils.chat("&aYou already have the Green Car pet!"));
		}

	}

	// HIPPIEVAN
	public static void hippieConfirm(Player p, int slot, ItemStack hippieConfirm, Inventory inv) {

		if (hippieConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eHippie Van"))
				&& !p.hasPermission("mpet.hippievan")) {

			p.closeInventory();
			p.openInventory(GemStore.hippieConfirm(p));

		} else if (hippieConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eHippie Van"))
				&& p.hasPermission("mpet.hippievan")) {
			p.sendMessage(utils.chat("&aYou already have the Hippie Van pet!"));
		}

	}
	// MINIME

	public static void minimeConfirm(Player p, int slot, ItemStack minimeConfirm, Inventory inv) {

		if (minimeConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eMini Me"))
				&& !p.hasPermission("mpet.minime")) {

			p.closeInventory();
			p.openInventory(GemStore.minimeConfirm(p));

		} else if (minimeConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eMini Me"))
				&& p.hasPermission("mpet.minime")) {
			p.sendMessage(utils.chat("&aYou already have the Mini-Me pet!"));
		}

	}

	// MP-8
	public static void mp8Confirm(Player p, int slot, ItemStack mp8Confirm, Inventory inv) {

		if (mp8Confirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eMP-8"))
				&& !p.hasPermission("mpet.mp8")) {

			p.closeInventory();
			p.openInventory(GemStore.mp8Confirm(p));

		} else if (mp8Confirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eMP-8"))
				&& p.hasPermission("mpet.mp8")) {
			p.sendMessage(utils.chat("&aYou already have the MP-8 pet!"));
		}

	}
	// PANDA

	public static void pandaConfirm(Player p, int slot, ItemStack pandaConfirm, Inventory inv) {

		if (pandaConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&ePanda"))
				&& !p.hasPermission("mpet.panda")) {

			p.closeInventory();
			p.openInventory(GemStore.pandaConfirm(p));

		} else if (pandaConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&ePanda"))
				&& p.hasPermission("mpet.panda")) {
			p.sendMessage(utils.chat("&aYou already have the Panda pet!"));
		}

	}

	// POLICECAR
	public static void policeConfirm(Player p, int slot, ItemStack policeConfirm, Inventory inv) {

		if (policeConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&ePolice Car"))
				&& !p.hasPermission("mpet.policecar")) {

			p.closeInventory();
			p.openInventory(GemStore.policeConfirm(p));

		} else if (policeConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&ePolice Car"))
				&& p.hasPermission("mpet.policecar")) {
			p.sendMessage(utils.chat("&aYou already have the Police Car pet!"));
		}

	}
	// PUG

	public static void pugConfirm(Player p, int slot, ItemStack pugConfirm, Inventory inv) {

		if (pugConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&ePug"))
				&& !p.hasPermission("mpet.pug")) {

			p.closeInventory();
			p.openInventory(GemStore.pugConfirm(p));

		} else if (pugConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&ePug"))
				&& p.hasPermission("mpet.pug")) {
			p.sendMessage(utils.chat("&aYou already have the Pug pet!"));
		}

	}

	// REDCAR
	public static void redcarConfirm(Player p, int slot, ItemStack redcarConfirm, Inventory inv) {

		if (redcarConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eRed Car"))
				&& !p.hasPermission("mpet.redcar")) {

			p.closeInventory();
			p.openInventory(GemStore.redcarConfirm(p));

		} else if (redcarConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eRed Car"))
				&& p.hasPermission("mpet.redcar")) {
			p.sendMessage(utils.chat("&aYou already have the Red Car pet!"));
		}

	}
	// REDPANDA

	public static void redpandaConfirm(Player p, int slot, ItemStack redpandaConfirm, Inventory inv) {

		if (redpandaConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eRed Panda"))
				&& !p.hasPermission("mpet.redpanda")) {

			p.closeInventory();
			p.openInventory(GemStore.redpandaConfirm(p));

		} else if (redpandaConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eRed Panda"))
				&& p.hasPermission("mpet.redpanda")) {
			p.sendMessage(utils.chat("&aYou already have the Red Panda pet!"));
		}

	}

	// SHARK
	public static void sharkConfirm(Player p, int slot, ItemStack sharkConfirm, Inventory inv) {

		if (sharkConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eShark"))
				&& !p.hasPermission("miniaturepets.shark")) {

			p.closeInventory();
			p.openInventory(GemStore.sharkConfirm(p));

		} else if (sharkConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eShark"))
				&& p.hasPermission("miniaturepets.shark")) {
			p.sendMessage(utils.chat("&aYou already have the Shark pet!"));
		}

	}
	// TURTLE

	public static void turtleConfirm(Player p, int slot, ItemStack turtleConfirm, Inventory inv) {

		if (turtleConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eTurtle"))
				&& !p.hasPermission("mpet.turtle")) {

			p.closeInventory();
			p.openInventory(GemStore.turtleConfirm(p));

		} else if (turtleConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eTurtle"))
				&& p.hasPermission("mpet.turtle")) {
			p.sendMessage(utils.chat("&aYou already have the Turtle pet!"));
		}

	}

	// YELLOWCAR
	public static void yellowcarConfirm(Player p, int slot, ItemStack yellowcarConfirm, Inventory inv) {

		if (yellowcarConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eYellow Car"))
				&& !p.hasPermission("mpet.yellowcar")) {

			p.closeInventory();
			p.openInventory(GemStore.yellowcarConfirm(p));

		} else if (yellowcarConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&eYellow Car"))
				&& p.hasPermission("mpet.yellowcar")) {
			p.sendMessage(utils.chat("&aYou already have the Yellow Car pet!"));
		}

	}

	// CREATION OF PETSCONFIRM AND CLICK ACTION IN ORDER

	// RANGER
	public static Inventory rangerConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmRanger);

		utils.createItem(rangerConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l5000 Gems");
		utils.createItem(rangerConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(rangerConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(rangerConfirm.getContents());
		return toReturn;
	}

	public static void rangerPurchase(Player p, int slot, ItemStack rangerPurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (rangerPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 5000) {

			String rangercmd = "lp user %player% permission set mpet.rangercar";
			rangercmd = rangercmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), rangercmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 5000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a5000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (rangerPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 5000) {
			p.closeInventory();
			int gems = (5000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		}

		else if (rangerPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.PetsGui(p));
		}

	}

	// AMBULANCE
	public static Inventory ambulanceConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmAmbulance);

		utils.createItem(ambulanceConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l5000 Gems");
		utils.createItem(ambulanceConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(ambulanceConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(ambulanceConfirm.getContents());
		return toReturn;
	}

	public static void ambulancePurchase(Player p, int slot, ItemStack ambulancePurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (ambulancePurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 5000) {

			String ambulancecmd = "lp user %player% permission set mpet.ambulance";
			ambulancecmd = ambulancecmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), ambulancecmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 5000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a5000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (ambulancePurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 5000) {
			p.closeInventory();
			int gems = (5000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		}

		else if (ambulancePurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.PetsGui(p));
		}

	}

	// BLUECAR
	public static Inventory bluecarConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmBlueCar);

		utils.createItem(bluecarConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l5000 Gems");
		utils.createItem(bluecarConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(bluecarConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(bluecarConfirm.getContents());
		return toReturn;
	}

	public static void bluecarPurchase(Player p, int slot, ItemStack bluecarPurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (bluecarPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 5000) {

			String bluecarcmd = "lp user %player% permission set mpet.bluecar";
			bluecarcmd = bluecarcmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), bluecarcmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 5000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a5000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (bluecarPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 5000) {
			p.closeInventory();
			int gems = (5000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		}

		else if (bluecarPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.PetsGui(p));
		}

	}

	// BOXER
	public static Inventory boxerConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmBoxer);

		utils.createItem(boxerConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l5000 Gems");
		utils.createItem(boxerConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(boxerConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(boxerConfirm.getContents());
		return toReturn;
	}

	public static void boxerPurchase(Player p, int slot, ItemStack boxerPurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (boxerPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 5000) {

			String boxercmd = "lp user %player% permission set mpet.boxer";
			boxercmd = boxercmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), boxercmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 5000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a5000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (boxerPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 5000) {
			p.closeInventory();
			int gems = (5000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		}

		else if (boxerPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.PetsGui(p));
		}

	}

	// CHICKEN
	public static Inventory chickenConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmChicken);

		utils.createItem(chickenConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l5000 Gems");
		utils.createItem(chickenConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(chickenConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(chickenConfirm.getContents());
		return toReturn;
	}

	public static void chickenPurchase(Player p, int slot, ItemStack chickenPurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (chickenPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 5000) {

			String chickencmd = "lp user %player% permission set mpet.chicken";
			chickencmd = chickencmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), chickencmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 5000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a5000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (chickenPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 5000) {
			p.closeInventory();
			int gems = (5000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		}

		else if (chickenPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.PetsGui(p));
		}

	}

	// DUCK
	public static Inventory duckConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmDuck);

		utils.createItem(duckConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l5000 Gems");
		utils.createItem(duckConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(duckConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(duckConfirm.getContents());
		return toReturn;
	}

	public static void duckPurchase(Player p, int slot, ItemStack duckPurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (duckPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 5000) {

			String duckcmd = "lp user %player% permission set mpet.duck";
			duckcmd = duckcmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), duckcmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 5000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a5000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (duckPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 5000) {
			p.closeInventory();
			int gems = (5000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		}

		else if (duckPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.PetsGui(p));
		}

	}

	// GREENCAR
	public static Inventory greencarConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmGreenCar);

		utils.createItem(greencarConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l5000 Gems");
		utils.createItem(greencarConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(greencarConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(greencarConfirm.getContents());
		return toReturn;
	}

	public static void greencarPurchase(Player p, int slot, ItemStack greencarPurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (greencarPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 5000) {

			String greencarcmd = "lp user %player% permission set mpet.greencar";
			greencarcmd = greencarcmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), greencarcmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 5000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a5000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (greencarPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 5000) {
			p.closeInventory();
			int gems = (5000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		}

		else if (greencarPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.PetsGui(p));
		}

	}

	// HIPPIE
	public static Inventory hippieConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmHippie);

		utils.createItem(hippieConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l5000 Gems");
		utils.createItem(hippieConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(hippieConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(hippieConfirm.getContents());
		return toReturn;
	}

	public static void hippiePurchase(Player p, int slot, ItemStack hippiePurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (hippiePurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 5000) {

			String hippiecmd = "lp user %player% permission set mpet.hippievan";
			hippiecmd = hippiecmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), hippiecmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 5000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a5000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (hippiePurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 5000) {
			p.closeInventory();
			int gems = (5000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		}

		else if (hippiePurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.PetsGui(p));
		}

	}

	// MINIME
	public static Inventory minimeConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmMiniMe);

		utils.createItem(minimeConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l5000 Gems");
		utils.createItem(minimeConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(minimeConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(minimeConfirm.getContents());
		return toReturn;
	}

	public static void minimePurchase(Player p, int slot, ItemStack minimePurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (minimePurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 5000) {

			String minimecmd = "lp user %player% permission set mpet.minime";
			minimecmd = minimecmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), minimecmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 5000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a5000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (minimePurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 5000) {
			p.closeInventory();
			int gems = (5000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		}

		else if (minimePurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.PetsGui(p));
		}

	}

	// MP8
	public static Inventory mp8Confirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmMP8);

		utils.createItem(mp8Confirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l5000 Gems");
		utils.createItem(mp8Confirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(mp8Confirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(mp8Confirm.getContents());
		return toReturn;
	}

	public static void mp8Purchase(Player p, int slot, ItemStack mp8Purchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (mp8Purchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 5000) {

			String mp8cmd = "lp user %player% permission set mpet.mp8";
			mp8cmd = mp8cmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), mp8cmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 5000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a5000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (mp8Purchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 5000) {
			p.closeInventory();
			int gems = (5000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		}

		else if (mp8Purchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.PetsGui(p));
		}

	}

	// PANDA
	public static Inventory pandaConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmPanda);

		utils.createItem(pandaConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l5000 Gems");
		utils.createItem(pandaConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(pandaConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(pandaConfirm.getContents());
		return toReturn;
	}

	public static void pandaPurchase(Player p, int slot, ItemStack pandaPurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (pandaPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 5000) {

			String pandacmd = "lp user %player% permission set mpet.panda";
			pandacmd = pandacmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), pandacmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 5000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a5000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (pandaPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 5000) {
			p.closeInventory();
			int gems = (5000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		}

		else if (pandaPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.PetsGui(p));
		}

	}

	// POLICE
	public static Inventory policeConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmPolice);

		utils.createItem(policeConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l5000 Gems");
		utils.createItem(policeConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(policeConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(policeConfirm.getContents());
		return toReturn;
	}

	public static void policePurchase(Player p, int slot, ItemStack policePurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (policePurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 5000) {

			String policecmd = "lp user %player% permission set mpet.policecar";
			policecmd = policecmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), policecmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 5000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a5000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (policePurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 5000) {
			p.closeInventory();
			int gems = (5000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		}

		else if (policePurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.PetsGui(p));
		}

	}

	// PUG
	public static Inventory pugConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmPug);

		utils.createItem(pugConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l5000 Gems");
		utils.createItem(pugConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(pugConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(pugConfirm.getContents());
		return toReturn;
	}

	public static void pugPurchase(Player p, int slot, ItemStack pugPurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (pugPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 5000) {

			String pugcmd = "lp user %player% permission set mpet.pug";
			pugcmd = pugcmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), pugcmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 5000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a5000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (pugPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 5000) {
			p.closeInventory();
			int gems = (5000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		}

		else if (pugPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.PetsGui(p));
		}

	}

	// REDCAR
	public static Inventory redcarConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmRedCar);

		utils.createItem(redcarConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l5000 Gems");
		utils.createItem(redcarConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(redcarConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(redcarConfirm.getContents());
		return toReturn;
	}

	public static void redcarPurchase(Player p, int slot, ItemStack redcarPurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (redcarPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 5000) {

			String redcarcmd = "lp user %player% permission set mpet.redcar";
			redcarcmd = redcarcmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), redcarcmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 5000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a5000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (redcarPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 5000) {
			p.closeInventory();
			int gems = (5000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		}

		else if (redcarPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.PetsGui(p));
		}

	}

	// REDPANDA
	public static Inventory redpandaConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmRedPanda);

		utils.createItem(redpandaConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l5000 Gems");
		utils.createItem(redpandaConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(redpandaConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(redpandaConfirm.getContents());
		return toReturn;
	}

	public static void redpandaPurchase(Player p, int slot, ItemStack redpandaPurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (redpandaPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 5000) {

			String redpandacmd = "lp user %player% permission set mpet.redpanda";
			redpandacmd = redpandacmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), redpandacmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 5000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a5000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (redpandaPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 5000) {
			p.closeInventory();
			int gems = (5000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		}

		else if (redpandaPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.PetsGui(p));
		}

	}

	// SHARK
	public static Inventory sharkConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmShark);

		utils.createItem(sharkConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l5000 Gems");
		utils.createItem(sharkConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(sharkConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(sharkConfirm.getContents());
		return toReturn;
	}

	public static void sharkPurchase(Player p, int slot, ItemStack sharkPurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (sharkPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 5000) {

			String sharkcmd = "lp user %player% permission set miniaturepets.shark";
			sharkcmd = sharkcmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), sharkcmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 5000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a5000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (sharkPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 5000) {
			p.closeInventory();
			int gems = (5000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		}

		else if (sharkPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.PetsGui(p));
		}

	}

	// TURTLE
	public static Inventory turtleConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmTurtle);

		utils.createItem(turtleConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l5000 Gems");
		utils.createItem(turtleConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(turtleConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(turtleConfirm.getContents());
		return toReturn;
	}

	public static void turtlePurchase(Player p, int slot, ItemStack turtlePurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (turtlePurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 5000) {

			String turtlecmd = "lp user %player% permission set mpet.turtle";
			turtlecmd = turtlecmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), turtlecmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 5000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a5000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (turtlePurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 5000) {
			p.closeInventory();
			int gems = (5000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		}

		else if (turtlePurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.PetsGui(p));
		}

	}

	// YELLOWCAR
	public static Inventory yellowcarConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmYellowCar);

		utils.createItem(yellowcarConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l5000 Gems");
		utils.createItem(yellowcarConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(yellowcarConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(yellowcarConfirm.getContents());
		return toReturn;
	}

	public static void yellowcarPurchase(Player p, int slot, ItemStack yellowcarPurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (yellowcarPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 5000) {

			String yellowcarcmd = "lp user %player% permission set mpet.yellowcar";
			yellowcarcmd = yellowcarcmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), yellowcarcmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 5000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a5000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (yellowcarPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 5000) {
			p.closeInventory();
			int gems = (5000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		}

		else if (yellowcarPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.PetsGui(p));
		}

	}

	public static Inventory ServerSpecificGui(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows2, inventory_name4);

		utils.createItem(inv4, "STONE", 1, 11, "&STONE Rank", "&c&STONE Gems");
		utils.createItem(inv4, "STONE", 1, 3, "&STONE Rank", "&c&STONE Gems");
		utils.createItem(inv4, "STONE", 1, 13, "&STONE Rank", "&c&STONE Gems");
		utils.createItem(inv4, "STONE", 1, 5, "&STONE Rank", "&c&STONE Gems");
		utils.createItem(inv4, "STONE", 1, 15, "&STONE Rank", "&c&STONE Gems");
		utils.createItem(inv4, "STONE", 1, 7, "&STONE Rank", "&c&STONE Gems");
		utils.createItem(inv4, "STONE", 1, 17, "&STONE Rank", "&c&STONE 000 Gems");

		toReturn.setContents(inv4.getContents());
		return toReturn;

	}

	// GLOBAL PERKS GUI CREATE

	public static Inventory GlobalPerksGui(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, inventory_name5);

		utils.createItem(inv5, "feather", 1, 1, "&B/fly", "&c25000 Gems");
		utils.createItem(inv5, "name_tag", 1, 2, "&b/nick (no colour)", "&c15000 Gems");
		utils.createItem(inv5, "name_tag", 1, 3, "&4/&6n&ei&ac&3k &1c&5o&4l&6o&eu&ar", "&c20000 Gems");
		utils.getSkull(inv5,
				"http://textures.minecraft.net/texture/a116e69a845e227f7ca1fdde8c357c8c821ebd4ba619382ea4a1f87d4ae94",
				1, 4, "&e/skull", "&c25000 Gems");
		utils.createItem(inv5, "leather_helmet", 1, 5, "&b/hat", "&c20000 Gems");
		utils.createItem(inv5, "clock", 1, 6, "&bAFK Bypass", "&c20000 Gems");
		utils.createItem(inv5, "red_stained_glass_pane", 1, 7, "&4BACK", "");

		toReturn.setContents(inv5.getContents());
		return toReturn;

	}

	// GLOBALPERK BACK BUTTON
	public static void globalBack(Player p, int slot, ItemStack globalBack, Inventory inv) {
		if (globalBack.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4BACK"))) {

			p.closeInventory();
			p.openInventory(GemStore.Base(p));

		}
	}

	// FLY

	// PERMISSION CHECK
	public static void flyConfirm(Player p, int slot, ItemStack flyConfirm, Inventory inv) {

		if (flyConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&B/fly"))
				&& !p.hasPermission("essentials.fly.safelogin")) {

			p.closeInventory();
			p.openInventory(GemStore.flyConfirm(p));

		} else if (flyConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&B/fly"))
				&& p.hasPermission("essentials.fly.safelogin")) {
			p.sendMessage(utils.chat("&aYou already have the /fly command!"));
		}

	}

	// GUI
	public static Inventory flyConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmFly);

		utils.createItem(flyConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l5000 Gems");
		utils.createItem(flyConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(flyConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(flyConfirm.getContents());
		return toReturn;
	}

	public static void flyPurchase(Player p, int slot, ItemStack flyPurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (flyPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 5000) {

			String flycmd = "lp user %player% permission set essentials.fly";
			flycmd = flycmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), flycmd);
			String flycmd3 = "lp user %player% permission set sf.fly";
			flycmd = flycm3.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), flycmd);
			String flycmd2 = "lp user %player% permission set essentials.fly.safelogin";
			flycmd2 = flycmd2.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), flycmd2);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 5000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a5000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (flyPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 5000) {
			p.closeInventory();
			int gems = (5000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		}

		else if (flyPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.GlobalPerksGui(p));
		}

	}

	// NICK (NO COLOUR)

	// PERMISSION CHECK
	public static void nickConfirm(Player p, int slot, ItemStack nickConfirm, Inventory inv) {

		if (nickConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&b/nick (no colour)"))
				&& !p.hasPermission("essentials.nick")) {

			p.closeInventory();
			p.openInventory(GemStore.nickConfirm(p));

		} else if (nickConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&b/nick (no colour)"))
				&& p.hasPermission("essentials.nick")) {
			p.sendMessage(utils.chat("&aYou already have the /nick command!"));
		}

	}

	// GUI
	public static Inventory nickConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmNick);

		utils.createItem(nickConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l5000 Gems");
		utils.createItem(nickConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(nickConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(nickConfirm.getContents());
		return toReturn;
	}

	public static void nickPurchase(Player p, int slot, ItemStack nickPurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (nickPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 5000) {

			String nickcmd = "lp user %player% permission set essentials.nick";
			nickcmd = nickcmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), nickcmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 5000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a5000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (nickPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 5000) {
			p.closeInventory();
			int gems = (5000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		}

		else if (nickPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.GlobalPerksGui(p));
		}

	}

	// NICK (WITH COLOUR)

	// PERMISSION CHECK
	public static void nickcolourConfirm(Player p, int slot, ItemStack nickcolourConfirm, Inventory inv) {

		if (nickcolourConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(
				utils.chat("&4/&6n&ei&ac&3k &1c&5o&4l&6o&eu&ar")) && !p.hasPermission("essentials.nick.<color>")) {

			p.closeInventory();
			p.openInventory(GemStore.nickcolourConfirm(p));

		} else if (nickcolourConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(
				utils.chat("&4/&6n&ei&ac&3k &1c&5o&4l&6o&eu&ar")) && p.hasPermission("essentials.nick.<color>")) {
			p.sendMessage(utils.chat("&aYou already have the colour /nick command!"));
		}

	}

	// GUI
	public static Inventory nickcolourConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmNickColour);

		utils.createItem(nickcolourConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l5000 Gems");
		utils.createItem(nickcolourConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(nickcolourConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(nickcolourConfirm.getContents());
		return toReturn;
	}

	public static void nickcolourPurchase(Player p, int slot, ItemStack nickcolourPurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (nickcolourPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 5000) {

			String nickcolourcmd = "lp user %player% permission set essentials.nick.<color>";
			nickcolourcmd = nickcolourcmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), nickcolourcmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 5000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a5000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (nickcolourPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 5000) {
			p.closeInventory();
			int gems = (5000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		}

		else if (nickcolourPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.GlobalPerksGui(p));
		}

	}

	// AFK BYPASS

	// PERMISSION CHECK
	public static void afkConfirm(Player p, int slot, ItemStack afkConfirm, Inventory inv) {

		if (afkConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bAFK Bypass"))
				&& !p.hasPermission("essentials.afk.kickexempt")) {

			p.closeInventory();
			p.openInventory(GemStore.afkConfirm(p));

		} else if (afkConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bAFK Bypass"))
				&& p.hasPermission("essentials.afk.kickexempt")) {
			p.sendMessage(utils.chat("&aYou already have AFK Bypass!"));
		}

	}

	// GUI
	public static Inventory afkConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmAFK);

		utils.createItem(afkConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l5000 Gems");
		utils.createItem(afkConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(afkConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(afkConfirm.getContents());
		return toReturn;
	}

	public static void afkPurchase(Player p, int slot, ItemStack afkPurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (afkPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 5000) {

			String afkcmd = "lp user %player% permission set essentials.afk.kickexempt";
			afkcmd = afkcmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), afkcmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 5000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a5000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (afkPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 5000) {
			p.closeInventory();
			int gems = (5000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		}

		else if (afkPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.GlobalPerksGui(p));
		}

	}

	// SKULL COMMAND

	// PERMISSION CHECK
	public static void skullConfirm(Player p, int slot, ItemStack skullConfirm, Inventory inv) {

		if (skullConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&e/skull"))
				&& !p.hasPermission("essentials.skull.spawn")) {

			p.closeInventory();
			p.openInventory(GemStore.skullConfirm(p));

		} else if (skullConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&e/skull"))
				&& p.hasPermission("essentials.skull.spawn")) {
			p.sendMessage(utils.chat("&aYou already have /skull command!"));
		}

	}

	// GUI
	public static Inventory skullConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmSkull);

		utils.createItem(skullConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l5000 Gems");
		utils.createItem(skullConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(skullConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(skullConfirm.getContents());
		return toReturn;
	}

	public static void skullPurchase(Player p, int slot, ItemStack skullPurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (skullPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 5000) {

			String skullcmd = "lp user %player% permission set essentials.skull";
			skullcmd = skullcmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), skullcmd);
			String skullcmd2 = "lp user %player% permission set essentials.skull.others";
			skullcmd2 = skullcmd2.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), skullcmd2);
			String skullcmd3 = "lp user %player% permission set essentials.skull.spawn";
			skullcmd3 = skullcmd3.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), skullcmd3);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 5000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a5000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (skullPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 5000) {
			p.closeInventory();
			int gems = (5000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		}

		else if (skullPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.GlobalPerksGui(p));
		}

	}

	// HAT COMMAND

	// PERMISSION CHECK
	public static void hatConfirm(Player p, int slot, ItemStack hatConfirm, Inventory inv) {

		if (hatConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&b/hat"))
				&& !p.hasPermission("essentials.hat")) {

			p.closeInventory();
			p.openInventory(GemStore.hatConfirm(p));

		} else if (hatConfirm.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&b/hat"))
				&& p.hasPermission("essentials.hat")) {
			p.sendMessage(utils.chat("&aYou already have /hat command!"));
		}

	}

	// GUI
	public static Inventory hatConfirm(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows3, confirmHat);

		utils.createItem(hatConfirm, "lime_stained_glass_pane", 1, 3, "&aCONFIRM PURCHASE", "&c&l5000 Gems");
		utils.createItem(hatConfirm, "red_stained_glass_pane", 1, 7, "&4DENY PURCHASE", "&eExit Transaction");
		UUID uuid = p.getUniqueId();
		int gems = SQLGetter.getGems(uuid);
		String loreGems = "&fYou have &e" + gems + " &fGems available";

		utils.getPlayerHead(hatConfirm, p, 1, 5, "&e " + p.getName(), "", loreGems);

		toReturn.setContents(hatConfirm.getContents());
		return toReturn;
	}

	public static void hatPurchase(Player p, int slot, ItemStack hatPurchase, Inventory inv) {
		UUID uuid = p.getUniqueId();
		if (hatPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) >= 5000) {

			String hatcmd = "lp user %player% permission set essentials.hat";
			hatcmd = hatcmd.replace("%player%", p.getName());
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), hatcmd);

			int gems = SQLGetter.getGems(uuid);
			int amount = (gems - 5000);
			SQLGetter.updateGems(uuid, amount);

			p.sendMessage(utils.chat("&a5000 Gems have been removed from your account"));

			p.closeInventory();
		} else if (hatPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&aCONFIRM PURCHASE"))
				&& SQLGetter.getGems(uuid) < 5000) {
			p.closeInventory();
			int gems = (5000 - SQLGetter.getGems(uuid));
			p.sendMessage(utils.chat("&cYou need &e" + gems + " &cmore Gems"));
		}

		else if (hatPurchase.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&4DENY PURCHASE"))) {
			p.closeInventory();
			p.openInventory(GemStore.GlobalPerksGui(p));
		}

	}



}
