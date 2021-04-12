package dev.slipstream.network.slipstreamgems.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import dev.slipstream.network.slipstreamgems.Main;
import dev.slipstream.network.slipstreamgems.ui.GemStore;

public class InventoryClickListener implements Listener {

	@SuppressWarnings("unused")
	private Main plugin;

	public InventoryClickListener(Main plugin) {
		this.plugin = plugin;

		Bukkit.getPluginManager().registerEvents(this, plugin);

	}

	@EventHandler
	public void onClick(InventoryClickEvent e) {
		String title = e.getView().getTitle();
		if (title.equals(GemStore.inventory_name)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name)) {
				GemStore.clicked((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
			if (title.equals(GemStore.inventory_name)) {
				GemStore.clicked2((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
			if (title.equals(GemStore.inventory_name)) {
				GemStore.clicked3((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
			if (title.equals(GemStore.inventory_name)) {
				GemStore.clicked4((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		
		
		
		// RANK CLICKS
		
		if (title.equals(GemStore.inventory_name2)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name2)) {
				GemStore.ranksBack((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name2)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name2)) {
				GemStore.ironConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name2)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name2)) {
				GemStore.lapisConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name2)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name2)) {
				GemStore.goldConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name2)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name2)) {
				GemStore.diamondConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name2)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name2)) {
				GemStore.emeraldConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name2)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name2)) {
				GemStore.obsidianConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name2)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name2)) {
				GemStore.netheriteConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		
		
		
		if (title.equals(GemStore.confirmIron)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmIron)) {
				GemStore.ironPurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmLapis)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmLapis)) {
				GemStore.lapisPurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmGold)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmGold)) {
				GemStore.goldPurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmDiamond)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmDiamond)) {
				GemStore.diamondPurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmEmerald)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmEmerald)) {
				GemStore.emeraldPurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmObsidian)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmObsidian)) {
				GemStore.obsidianPurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmNetherite)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmNetherite)) {
				GemStore.netheritePurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}

		
		if (title.equals(GemStore.inventory_name2)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name2)) {
				GemStore.ironConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name2)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name2)) {
				GemStore.lapisConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name2)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name2)) {
				GemStore.goldConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name2)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name2)) {
				GemStore.diamondConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name2)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name2)) {
				GemStore.emeraldConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name2)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name2)) {
				GemStore.obsidianConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name2)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name2)) {
				GemStore.netheriteConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		
		// PETS PURCHASE
		if (title.equals(GemStore.inventory_name3)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name3)) {
				GemStore.petsBack((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name3)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name3)) {
				GemStore.rangerConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name3)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name3)) {
				GemStore.ambulanceConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name3)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name3)) {
				GemStore.bluecarConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name3)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name3)) {
				GemStore.boxerConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name3)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name3)) {
				GemStore.chickenConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name3)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name3)) {
				GemStore.duckConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name3)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name3)) {
				GemStore.greencarConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}		
		if (title.equals(GemStore.inventory_name3)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name3)) {
				GemStore.hippieConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name3)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name3)) {
				GemStore.minimeConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name3)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name3)) {
				GemStore.mp8Confirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name3)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name3)) {
				GemStore.pandaConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name3)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name3)) {
				GemStore.policeConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name3)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name3)) {
				GemStore.pugConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name3)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name3)) {
				GemStore.redcarConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name3)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name3)) {
				GemStore.redpandaConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name3)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name3)) {
				GemStore.sharkConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name3)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name3)) {
				GemStore.turtleConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name3)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name3)) {
				GemStore.yellowcarConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}

		//PT2
		
		if (title.equals(GemStore.confirmRanger)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmRanger)) {
				GemStore.rangerPurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmAmbulance)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmAmbulance)) {
				GemStore.ambulancePurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmBlueCar)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmBlueCar)) {
				GemStore.bluecarPurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmBoxer)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmBoxer)) {
				GemStore.boxerPurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmChicken)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmChicken)) {
				GemStore.chickenPurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmDuck)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmDuck)) {
				GemStore.duckPurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmGreenCar)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmGreenCar)) {
				GemStore.greencarPurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmHippie)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmHippie)) {
				GemStore.hippiePurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmMiniMe)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmMiniMe)) {
				GemStore.minimePurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmMP8)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmMP8)) {
				GemStore.mp8Purchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmPanda)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmPanda)) {
				GemStore.pandaPurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmPolice)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmPolice)) {
				GemStore.policePurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmPug)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmPug)) {
				GemStore.pugPurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmRedCar)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmRedCar)) {
				GemStore.redcarPurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmRedPanda)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmRedPanda)) {
				GemStore.redpandaPurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmShark)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmShark)) {
				GemStore.sharkPurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmTurtle)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmTurtle)) {
				GemStore.turtlePurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmYellowCar)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmYellowCar)) {
				GemStore.yellowcarPurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		
		// GLOBAL PERK SHIT
		if (title.equals(GemStore.inventory_name5)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name5)) {
				GemStore.globalBack((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name5)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name5)) {
				GemStore.flyConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name5)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name5)) {
				GemStore.nickConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name5)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name5)) {
				GemStore.nickcolourConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name5)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name5)) {
				GemStore.feedConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name5)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name5)) {
				GemStore.skullConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name5)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name5)) {
				GemStore.hatConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.inventory_name5)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.inventory_name5)) {
				GemStore.afkConfirm((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmFly)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmFly)) {
				GemStore.flyPurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmNick)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmNick)) {
				GemStore.nickPurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmNickColour)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmNickColour)) {
				GemStore.nickcolourPurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmFeed)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmFeed)) {
				GemStore.feedPurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmSkull)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmSkull)) {
				GemStore.skullPurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmHat)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmHat)) {
				GemStore.hatPurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		if (title.equals(GemStore.confirmAFK)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}

			if (title.equals(GemStore.confirmAFK)) {
				GemStore.afkPurchase((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		}
		
	}

	}