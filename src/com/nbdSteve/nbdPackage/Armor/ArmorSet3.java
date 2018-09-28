package com.nbdSteve.nbdPackage.Armor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import com.nbdSteve.nbdPackage.Main;
import com.nbdSteve.nbdPackage.Support.SavageFactions;
import com.nbdSteve.nbdPackage.Support.WorldGuard;

import net.milkbowl.vault.economy.Economy;

public class ArmorSet3 implements Listener {

	Economy econ = Main.getEconomy();
	private Plugin plugin = Main.getPlugin(Main.class);

	@EventHandler
	public void onClick(InventoryClickEvent event) {

		if (plugin.getConfig().getBoolean("ArmorSet3.Enabled") == true) {

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
									plugin.getConfig().getString("ArmorSet3.UniqueName")))
							&& item.getType().equals(Material.DIAMOND_BOOTS)) {

						if (econ.getBalance(player) >= plugin.getConfig().getDouble("ArmorSet3.Price")) {

							econ.withdrawPlayer(player, plugin.getConfig().getDouble("ArmorSet3.Price"));

							ItemStack newItem = new ItemStack(Material.DIAMOND_BOOTS);
							ItemMeta itemMeta = newItem.getItemMeta();
							List<String> itemLore = new ArrayList<>();
							itemLore.add(" ");
							itemLore.add(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ArmorSet3.UniqueName")));
							for (String lore : plugin.getConfig().getStringList("ArmorSet3.Lore")) {
								itemLore.add(ChatColor.translateAlternateColorCodes('&', lore));
							}
							itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
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
							player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("InsufficientMessage")));
						}
					}
					
					if (item.getItemMeta().getLore()
							.contains(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ArmorSet3.UniqueName")))
							&& item.getType().equals(Material.DIAMOND_LEGGINGS)) {

						if (econ.getBalance(player) >= plugin.getConfig().getDouble("ArmorSet3.Price")) {

							econ.withdrawPlayer(player, plugin.getConfig().getDouble("ArmorSet3.Price"));

							ItemStack newItem = new ItemStack(Material.DIAMOND_LEGGINGS);
							ItemMeta itemMeta = newItem.getItemMeta();
							List<String> itemLore = new ArrayList<>();
							itemLore.add(" ");
							itemLore.add(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ArmorSet3.UniqueName")));
							for (String lore : plugin.getConfig().getStringList("ArmorSet3.Lore")) {
								itemLore.add(ChatColor.translateAlternateColorCodes('&', lore));
							}
							itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
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
							player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("InsufficientMessage")));
						}
					}
					
					if (item.getItemMeta().getLore()
							.contains(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ArmorSet3.UniqueName")))
							&& item.getType().equals(Material.DIAMOND_CHESTPLATE)) {

						if (econ.getBalance(player) >= plugin.getConfig().getDouble("ArmorSet3.Price")) {

							econ.withdrawPlayer(player, plugin.getConfig().getDouble("ArmorSet3.Price"));

							ItemStack newItem = new ItemStack(Material.DIAMOND_CHESTPLATE);
							ItemMeta itemMeta = newItem.getItemMeta();
							List<String> itemLore = new ArrayList<>();
							itemLore.add(" ");
							itemLore.add(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ArmorSet3.UniqueName")));
							for (String lore : plugin.getConfig().getStringList("ArmorSet3.Lore")) {
								itemLore.add(ChatColor.translateAlternateColorCodes('&', lore));
							}
							itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
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
							player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("InsufficientMessage")));
						}
					}
					
					if (item.getItemMeta().getLore()
							.contains(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ArmorSet3.UniqueName")))
							&& item.getType().equals(Material.DIAMOND_HELMET)) {

						if (econ.getBalance(player) >= plugin.getConfig().getDouble("ArmorSet3.Price")) {

							econ.withdrawPlayer(player, plugin.getConfig().getDouble("ArmorSet3.Price"));

							ItemStack newItem = new ItemStack(Material.DIAMOND_HELMET);
							ItemMeta itemMeta = newItem.getItemMeta();
							List<String> itemLore = new ArrayList<>();
							itemLore.add(" ");
							itemLore.add(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ArmorSet3.UniqueName")));
							for (String lore : plugin.getConfig().getStringList("ArmorSet3.Lore")) {
								itemLore.add(ChatColor.translateAlternateColorCodes('&', lore));
							}
							itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
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
							player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("InsufficientMessage")));
						}
					}
				} else {
					player.closeInventory();
					player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("FullInventoryMessage")));
				}
			}
		} else {
			return;
		}
	}
	
	@EventHandler
	public void onHurt(EntityDamageByEntityEvent event) {

		Entity hurt = event.getEntity();
		Entity deal = event.getDamager();

		if (hurt instanceof Player && deal instanceof Player) {
			Player player = (Player) event.getEntity();
			Player dealer = (Player) event.getDamager();

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

			if (plugin.getConfig().getBoolean("WorldGuard") == true) {
				if (!WorldGuard.allowsPVP(player.getLocation())) {
					event.setCancelled(true);
					return;
				}
			}

			if (plugin.getConfig().getBoolean("SavageFactions") == true) {
				if (SavageFactions.isFriendly(player, dealer)) {
					event.setCancelled(true);
					return;
				}
			}

			if (armor && armorMeta && armorLore) {

				boolean boots = player.getInventory().getBoots().getItemMeta().getLore().contains(ChatColor
						.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet3.UniqueName")));
				boolean leggings = player.getInventory().getLeggings().getItemMeta().getLore().contains(ChatColor
						.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet3.UniqueName")));
				boolean chestplate = player.getInventory().getChestplate().getItemMeta().getLore().contains(ChatColor
						.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet3.UniqueName")));
				boolean helmet = player.getInventory().getHelmet().getItemMeta().getLore().contains(ChatColor
						.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet3.UniqueName")));

				if (boots && leggings && chestplate && helmet) {
					Random rand = new Random();
					int chance = rand.nextInt(plugin.getConfig().getInt("ArmorSet3.ProcChance")) + 1;

					if (chance == 1) {

						double dmg = event.getDamage();
						double newdmg = dmg * plugin.getConfig().getDouble("ArmorSet3.ReducedDamageMod");

						if (plugin.getConfig().getString("ArmorSet3.ReducedProcMessageEnabled") == "true") {
							player.sendMessage(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ArmorSet3.ReducedProcMessage")));
						}
						if (plugin.getConfig().getString("ArmorSet3.ReducedProcSoundEnabled") == "true") {
							player.playSound(player.getLocation(),
									Sound.valueOf(plugin.getConfig().getString("ArmorSet3.ReducedProcSound")),
									plugin.getConfig().getInt("ArmorSet3.ReducedProcVolume"),
									plugin.getConfig().getInt("ArmorSet3.ReducedProcPitch"));
						}
						event.setDamage(newdmg);
					} else {
						return;
					}
				}
			}
		}
	}

	@EventHandler
	public void onDamage(EntityDamageByEntityEvent event) {

		Entity hurt = event.getEntity();
		Entity dealer = event.getDamager();

		if (dealer instanceof Player && hurt instanceof Player) {
			Player player = (Player) event.getDamager();
			Player hurter = (Player) event.getEntity();

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

			if (plugin.getConfig().getBoolean("WorldGuard") == true) {
				if (!WorldGuard.allowsPVP(player.getLocation())) {
					event.setCancelled(true);
					return;
				}
			}

			if (plugin.getConfig().getBoolean("SavageFactions") == true) {
				if (SavageFactions.isFriendly(player, hurter)) {
					event.setCancelled(true);
					return;
				}
			}

			if (armor && armorMeta && armorLore) {

				boolean boots = player.getInventory().getBoots().getItemMeta().getLore().contains(ChatColor
						.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet3.UniqueName")));
				boolean leggings = player.getInventory().getLeggings().getItemMeta().getLore().contains(ChatColor
						.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet3.UniqueName")));
				boolean chestplate = player.getInventory().getChestplate().getItemMeta().getLore().contains(ChatColor
						.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet3.UniqueName")));
				boolean helmet = player.getInventory().getHelmet().getItemMeta().getLore().contains(ChatColor
						.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet3.UniqueName")));

				if (boots && leggings && chestplate && helmet) {

					Random rand = new Random();
					int chance = rand.nextInt(plugin.getConfig().getInt("ArmorSet3.ProcChance")) + 1;

					if (chance == 1) {
						double dmg = event.getDamage();
						double newdmg = dmg * plugin.getConfig().getDouble("ArmorSet3.IncreasedDamageMod");
						if (plugin.getConfig().getString("ArmorSet3.IncreasedProcMessageEnabled") == "true") {
							player.sendMessage(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ArmorSet3.IncreasedProcMessage")));
						}
						if (plugin.getConfig().getString("ArmorSet3.IncreasedProcSoundEnabled") == "true") {
							player.playSound(player.getLocation(),
									Sound.valueOf(plugin.getConfig().getString("ArmorSet3.IncreasedProcSound")),
									plugin.getConfig().getInt("ArmorSet3.IncreasedProcVolume"),
									plugin.getConfig().getInt("ArmorSet3.IncreasedProcPitch"));
						}
						event.setDamage(newdmg);
					} else {
						return;
					}
				}
			}
		} else {
			return;
		}
	}
}
