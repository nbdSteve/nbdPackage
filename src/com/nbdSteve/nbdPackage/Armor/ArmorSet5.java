package com.nbdSteve.nbdPackage.Armor;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.nbdSteve.nbdPackage.Main;
import com.nbdSteve.nbdPackage.Support.SavageFactions;

import net.milkbowl.vault.economy.Economy;

public class ArmorSet5 implements Listener {

	Economy econ = Main.getEconomy();
	private Plugin plugin = Main.getPlugin(Main.class);

	@EventHandler
	public void onClick(InventoryClickEvent event) {

		if (plugin.getConfig().getBoolean("ArmorSet5.Enabled") == true) {

			Player player = (Player) event.getWhoClicked();
			Inventory open = event.getClickedInventory();
			ItemStack item = event.getCurrentItem();

			if (open == null) {
				return;
			}

			if (open.getName()
					.equals(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("EnchanterName")))
					&& open.getName() != null) {
				event.setCancelled(true);

				if (item.getType().equals(Material.AIR)) {
					return;
				}
				if (item.getItemMeta().getDisplayName() == " ") {
					return;
				}
				if (item.equals(null) || !item.hasItemMeta()) {
					return;
				}
				if (player.getInventory().firstEmpty() != -1) {

					if (item.getItemMeta().getLore()
							.contains(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ArmorSet5.UniqueName")))
							&& item.getType().equals(Material.DIAMOND_BOOTS)) {

						if (econ.getBalance(player) >= plugin.getConfig().getDouble("ArmorSet5.Price")) {

							econ.withdrawPlayer(player, plugin.getConfig().getDouble("ArmorSet5.Price"));

							ItemStack newItem = new ItemStack(Material.DIAMOND_BOOTS);
							ItemMeta itemMeta = newItem.getItemMeta();
							List<String> itemLore = new ArrayList<>();
							itemLore.add(" ");
							itemLore.add(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ArmorSet5.UniqueName")));
							for (String lore : plugin.getConfig().getStringList("ArmorSet5.Lore")) {
								itemLore.add(ChatColor.translateAlternateColorCodes('&', lore));
							}
							itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
							itemMeta.addEnchant(Enchantment.DURABILITY, 3, true);
							itemMeta.setLore(itemLore);
							newItem.setItemMeta(itemMeta);

							player.playSound(player.getLocation(),
									Sound.valueOf(plugin.getConfig().getString("EnchantApplySound")),
									plugin.getConfig().getInt("EnchantApplyVolume"),
									plugin.getConfig().getInt("EnchantApplyPitch"));

							player.getInventory().addItem(newItem);
						} else {
							player.closeInventory();
							player.sendMessage(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("InsufficientMessage")));
						}
					}

					if (item.getItemMeta().getLore()
							.contains(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ArmorSet5.UniqueName")))
							&& item.getType().equals(Material.DIAMOND_LEGGINGS)) {

						if (econ.getBalance(player) >= plugin.getConfig().getDouble("ArmorSet5.Price")) {

							econ.withdrawPlayer(player, plugin.getConfig().getDouble("ArmorSet5.Price"));

							ItemStack newItem = new ItemStack(Material.DIAMOND_LEGGINGS);
							ItemMeta itemMeta = newItem.getItemMeta();
							List<String> itemLore = new ArrayList<>();
							itemLore.add(" ");
							itemLore.add(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ArmorSet5.UniqueName")));
							for (String lore : plugin.getConfig().getStringList("ArmorSet5.Lore")) {
								itemLore.add(ChatColor.translateAlternateColorCodes('&', lore));
							}
							itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
							itemMeta.addEnchant(Enchantment.DURABILITY, 3, true);
							itemMeta.setLore(itemLore);
							newItem.setItemMeta(itemMeta);

							player.playSound(player.getLocation(),
									Sound.valueOf(plugin.getConfig().getString("EnchantApplySound")),
									plugin.getConfig().getInt("EnchantApplyVolume"),
									plugin.getConfig().getInt("EnchantApplyPitch"));

							player.getInventory().addItem(newItem);
						} else {
							player.closeInventory();
							player.sendMessage(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("InsufficientMessage")));
						}
					}

					if (item.getItemMeta().getLore()
							.contains(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ArmorSet5.UniqueName")))
							&& item.getType().equals(Material.DIAMOND_CHESTPLATE)) {

						if (econ.getBalance(player) >= plugin.getConfig().getDouble("ArmorSet5.Price")) {

							econ.withdrawPlayer(player, plugin.getConfig().getDouble("ArmorSet5.Price"));

							ItemStack newItem = new ItemStack(Material.DIAMOND_CHESTPLATE);
							ItemMeta itemMeta = newItem.getItemMeta();
							List<String> itemLore = new ArrayList<>();
							itemLore.add(" ");
							itemLore.add(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ArmorSet5.UniqueName")));
							for (String lore : plugin.getConfig().getStringList("ArmorSet5.Lore")) {
								itemLore.add(ChatColor.translateAlternateColorCodes('&', lore));
							}
							itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
							itemMeta.addEnchant(Enchantment.DURABILITY, 3, true);
							itemMeta.setLore(itemLore);
							newItem.setItemMeta(itemMeta);

							player.playSound(player.getLocation(),
									Sound.valueOf(plugin.getConfig().getString("EnchantApplySound")),
									plugin.getConfig().getInt("EnchantApplyVolume"),
									plugin.getConfig().getInt("EnchantApplyPitch"));

							player.getInventory().addItem(newItem);
						} else {
							player.closeInventory();
							player.sendMessage(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("InsufficientMessage")));
						}
					}

					if (item.getItemMeta().getLore()
							.contains(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ArmorSet5.UniqueName")))
							&& item.getType().equals(Material.DIAMOND_HELMET)) {

						if (econ.getBalance(player) >= plugin.getConfig().getDouble("ArmorSet5.Price")) {

							econ.withdrawPlayer(player, plugin.getConfig().getDouble("ArmorSet5.Price"));

							ItemStack newItem = new ItemStack(Material.DIAMOND_HELMET);
							ItemMeta itemMeta = newItem.getItemMeta();
							List<String> itemLore = new ArrayList<>();
							itemLore.add(" ");
							itemLore.add(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ArmorSet5.UniqueName")));
							for (String lore : plugin.getConfig().getStringList("ArmorSet5.Lore")) {
								itemLore.add(ChatColor.translateAlternateColorCodes('&', lore));
							}
							itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
							itemMeta.addEnchant(Enchantment.DURABILITY, 3, true);
							itemMeta.setLore(itemLore);
							newItem.setItemMeta(itemMeta);

							player.playSound(player.getLocation(),
									Sound.valueOf(plugin.getConfig().getString("EnchantApplySound")),
									plugin.getConfig().getInt("EnchantApplyVolume"),
									plugin.getConfig().getInt("EnchantApplyPitch"));

							player.getInventory().addItem(newItem);
						} else {
							player.closeInventory();
							player.sendMessage(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("InsufficientMessage")));
						}
					}
				} else {
					player.closeInventory();
					player.sendMessage(ChatColor.translateAlternateColorCodes('&',
							plugin.getConfig().getString("FullInventoryMessage")));
				}
			}
		} else {
			return;
		}
	}

	@EventHandler
	public void onMove(PlayerMoveEvent event) {

		Player player = event.getPlayer();

		boolean armor = (player.getInventory().getBoots() != null && player.getInventory().getLeggings() != null
				&& player.getInventory().getChestplate() != null && player.getInventory().getHelmet() != null);
		if (armor == false) {
			return;
		}
		boolean armorMeta = (player.getInventory().getBoots().getItemMeta() != null
				&& player.getInventory().getLeggings().getItemMeta() != null
				&& player.getInventory().getChestplate().getItemMeta() != null
				&& player.getInventory().getHelmet().getItemMeta() != null);
		if (armorMeta == false) {
			return;
		}
		boolean armorLore = (player.getInventory().getBoots().getItemMeta().getLore() != null
				&& player.getInventory().getLeggings().getItemMeta().getLore() != null
				&& player.getInventory().getChestplate().getItemMeta().getLore() != null
				&& player.getInventory().getHelmet().getItemMeta().getLore() != null);
		if (armorLore == false) {
			return;
		}

		if (armor && armorMeta && armorLore) {

			boolean boots = player.getInventory().getBoots().getItemMeta().getLore().contains(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet5.UniqueName")));
			boolean leggings = player.getInventory().getLeggings().getItemMeta().getLore().contains(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet5.UniqueName")));
			boolean chestplate = player.getInventory().getChestplate().getItemMeta().getLore().contains(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet5.UniqueName")));
			boolean helmet = player.getInventory().getHelmet().getItemMeta().getLore().contains(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet5.UniqueName")));

			if (boots && leggings && chestplate && helmet) {

				Location playerLoc = player.getLocation();
				int distance = plugin.getConfig().getInt("ArmorSet5.PlayerDistance");

				for (Player pl : Bukkit.getOnlinePlayers()) {

					if (SavageFactions.isFriendly(pl, player)) {

						if (pl.getLocation().getWorld() == player.getLocation().getWorld()) {

							if (pl.getLocation().distance(playerLoc) <= distance) {

								pl.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION,
										plugin.getConfig().getInt("ArmorSet5.EffectLength"),
										plugin.getConfig().getInt("ArmorSet5.PotionLevel")));
								
								player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION,
										plugin.getConfig().getInt("ArmorSet5.EffectLength"),
										plugin.getConfig().getInt("ArmorSet5.PotionLevel")));

							} else {
								return;
							}
						} else {
							return;
						}
					} else {
						return;
					}
				}
			}
		}
	}
}