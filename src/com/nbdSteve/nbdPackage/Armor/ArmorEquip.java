package com.nbdSteve.nbdPackage.Armor;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import com.nbdSteve.nbdPackage.Main;
import com.nbdSteve.nbdPackage.api.ArmorEquipEvent;

public class ArmorEquip implements Listener {

	private Plugin plugin = Main.getPlugin(Main.class);

	@EventHandler
	public void armorEquip(ArmorEquipEvent event) {

		Player player = event.getPlayer();
		ItemStack newArmor = event.getNewArmorPiece();

		if (newArmor == null) {
			return;
		}

		if (newArmor.getType().equals(Material.AIR)) {
			return;
		}

		if (player.getInventory().getHelmet() == null || player.getInventory().getChestplate() == null
				|| player.getInventory().getLeggings() == null || player.getInventory().getBoots() == null) {
			return;
		}

		if (newArmor.hasItemMeta()) {

			if (newArmor.getItemMeta().hasLore()) {

				if (newArmor.getItemMeta().getLore().contains(ChatColor.translateAlternateColorCodes('&',
						plugin.getConfig().getString("ArmorSet1.UniqueName")))) {

					boolean boots = player.getInventory().getBoots().getItemMeta().getLore().contains(ChatColor
							.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet1.UniqueName")));
					boolean leggings = player.getInventory().getLeggings().getItemMeta().getLore().contains(ChatColor
							.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet1.UniqueName")));
					boolean chestplate = player.getInventory().getChestplate().getItemMeta().getLore()
							.contains(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ArmorSet1.UniqueName")));
					boolean helmet = player.getInventory().getHelmet().getItemMeta().getLore().contains(ChatColor
							.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet1.UniqueName")));

					if (boots && chestplate && leggings && helmet) {
						for (String message : plugin.getConfig().getStringList("ArmorSet1.ActivatedMessage")) {
							player.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
						}
					}
					return;
				}

				if (newArmor.getItemMeta().getLore().contains(ChatColor.translateAlternateColorCodes('&',
						plugin.getConfig().getString("ArmorSet2.UniqueName")))) {

					boolean boots = player.getInventory().getBoots().getItemMeta().getLore().contains(ChatColor
							.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet2.UniqueName")));
					boolean leggings = player.getInventory().getLeggings().getItemMeta().getLore().contains(ChatColor
							.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet2.UniqueName")));
					boolean chestplate = player.getInventory().getChestplate().getItemMeta().getLore()
							.contains(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ArmorSet2.UniqueName")));
					boolean helmet = player.getInventory().getHelmet().getItemMeta().getLore().contains(ChatColor
							.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet2.UniqueName")));

					if (boots && chestplate && leggings && helmet) {
						for (String message : plugin.getConfig().getStringList("ArmorSet2.ActivatedMessage")) {
							player.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
						}
					}
					return;
				}

				if (newArmor.getItemMeta().getLore().contains(ChatColor.translateAlternateColorCodes('&',
						plugin.getConfig().getString("ArmorSet3.UniqueName")))) {

					boolean boots = player.getInventory().getBoots().getItemMeta().getLore().contains(ChatColor
							.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet3.UniqueName")));
					boolean leggings = player.getInventory().getLeggings().getItemMeta().getLore().contains(ChatColor
							.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet3.UniqueName")));
					boolean chestplate = player.getInventory().getChestplate().getItemMeta().getLore()
							.contains(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ArmorSet3.UniqueName")));
					boolean helmet = player.getInventory().getHelmet().getItemMeta().getLore().contains(ChatColor
							.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet3.UniqueName")));

					if (boots && chestplate && leggings && helmet) {
						for (String message : plugin.getConfig().getStringList("ArmorSet3.ActivatedMessage")) {
							player.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
						}
					}
					return;
				}

				if (newArmor.getItemMeta().getLore().contains(ChatColor.translateAlternateColorCodes('&',
						plugin.getConfig().getString("ArmorSet4.UniqueName")))) {

					boolean boots = player.getInventory().getBoots().getItemMeta().getLore().contains(ChatColor
							.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet4.UniqueName")));
					boolean leggings = player.getInventory().getLeggings().getItemMeta().getLore().contains(ChatColor
							.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet4.UniqueName")));
					boolean chestplate = player.getInventory().getChestplate().getItemMeta().getLore()
							.contains(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ArmorSet4.UniqueName")));
					boolean helmet = player.getInventory().getHelmet().getItemMeta().getLore().contains(ChatColor
							.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet4.UniqueName")));

					if (boots && chestplate && leggings && helmet) {
						for (String message : plugin.getConfig().getStringList("ArmorSet4.ActivatedMessage")) {
							player.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
						}
					}
					return;
				}
				
				if (newArmor.getItemMeta().getLore().contains(ChatColor.translateAlternateColorCodes('&',
						plugin.getConfig().getString("ArmorSet5.UniqueName")))) {

					boolean boots = player.getInventory().getBoots().getItemMeta().getLore().contains(ChatColor
							.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet5.UniqueName")));
					boolean leggings = player.getInventory().getLeggings().getItemMeta().getLore().contains(ChatColor
							.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet5.UniqueName")));
					boolean chestplate = player.getInventory().getChestplate().getItemMeta().getLore()
							.contains(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ArmorSet5.UniqueName")));
					boolean helmet = player.getInventory().getHelmet().getItemMeta().getLore().contains(ChatColor
							.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet5.UniqueName")));

					if (boots && chestplate && leggings && helmet) {
						for (String message : plugin.getConfig().getStringList("ArmorSet5.ActivatedMessage")) {
							player.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
						}
					}
					return;
				}
			}
		}
	}
}
