package com.nbdSteve.nbdPackage.Enchants;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.nbdSteve.nbdPackage.Main;
import com.nbdSteve.nbdPackage.Support.SavageFactions;
import com.nbdSteve.nbdPackage.Support.WorldGuard;

public class CeBook13 implements Listener {

	private Plugin plugin = Main.getPlugin(Main.class);

	@EventHandler
	public void guiClick(InventoryClickEvent event) {

		if (plugin.getConfig().getBoolean("ceBook13.Enabled") == true) {

			Player player = (Player) event.getWhoClicked();
			Inventory open = event.getClickedInventory();
			ItemStack item = event.getCurrentItem();
			Random random = new Random();

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
				if (item.getItemMeta().getDisplayName() == null) {
					return;
				}
				if (item.equals(null) || !item.hasItemMeta()) {
					return;
				}
				if (player.getInventory().firstEmpty() != -1) {

					if (item.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&',
							plugin.getConfig().getString("ceBook13.Name")))) {

						int currentExp = player.getLevel();

						if (currentExp > plugin.getConfig().getInt("ceBook13.CostXP")) {

							int level = random.nextInt(plugin.getConfig().getInt("ceBook13.MaxLevel")) + 1;

							if (level == 1) {

								player.setLevel(currentExp - plugin.getConfig().getInt("ceBook13.CostXP"));

								ItemStack ceBook13 = new ItemStack(Material.BOOK);
								ItemMeta ceBook13Meta = ceBook13.getItemMeta();
								ceBook13Meta.setDisplayName(ChatColor.translateAlternateColorCodes('&',
										plugin.getConfig().getString("ceBook13.BookLevel1")));
								List<String> ceBook13Lore = new ArrayList<>();
								for (String lore : plugin.getConfig().getStringList("ceBook13.BookLore")) {
									ceBook13Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
								}
								ceBook13Meta.addEnchant(Enchantment.LURE, 10, true);
								ceBook13Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
								ceBook13Meta.setLore(ceBook13Lore);
								ceBook13.setItemMeta(ceBook13Meta);

								player.getInventory().addItem(ceBook13);

								Firework fw = (Firework) player.getWorld().spawnEntity(player.getLocation(),
										EntityType.FIREWORK);
								FireworkMeta fwm = fw.getFireworkMeta();
								FireworkEffect effect = FireworkEffect.builder()
										.withColor(Color.AQUA.mixColors(Color.WHITE.mixColors(Color.PURPLE)))
										.withFade(Color.PURPLE).with(Type.BALL_LARGE).build();
								fwm.setPower(0);
								fwm.addEffect(effect);
								fw.setFireworkMeta(fwm);
							}

							if (level == 2) {

								player.setLevel(currentExp - plugin.getConfig().getInt("ceBook13.CostXP"));

								ItemStack ceBook13 = new ItemStack(Material.BOOK);
								ItemMeta ceBook13Meta = ceBook13.getItemMeta();
								ceBook13Meta.setDisplayName(ChatColor.translateAlternateColorCodes('&',
										plugin.getConfig().getString("ceBook13.BookLevel2")));
								List<String> ceBook13Lore = new ArrayList<>();
								for (String lore : plugin.getConfig().getStringList("ceBook13.BookLore")) {
									ceBook13Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
								}
								ceBook13Meta.addEnchant(Enchantment.LURE, 10, true);
								ceBook13Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
								ceBook13Meta.setLore(ceBook13Lore);
								ceBook13.setItemMeta(ceBook13Meta);

								player.getInventory().addItem(ceBook13);

								Firework fw = (Firework) player.getWorld().spawnEntity(player.getLocation(),
										EntityType.FIREWORK);
								FireworkMeta fwm = fw.getFireworkMeta();
								FireworkEffect effect = FireworkEffect.builder()
										.withColor(Color.AQUA.mixColors(Color.WHITE.mixColors(Color.PURPLE)))
										.withFade(Color.PURPLE).with(Type.BALL_LARGE).build();
								fwm.setPower(0);
								fwm.addEffect(effect);
								fw.setFireworkMeta(fwm);
							}

							if (level == 3) {

								player.setLevel(currentExp - plugin.getConfig().getInt("ceBook13.CostXP"));

								ItemStack ceBook13 = new ItemStack(Material.BOOK);
								ItemMeta ceBook13Meta = ceBook13.getItemMeta();
								ceBook13Meta.setDisplayName(ChatColor.translateAlternateColorCodes('&',
										plugin.getConfig().getString("ceBook13.BookLevel3")));
								List<String> ceBook13Lore = new ArrayList<>();
								for (String lore : plugin.getConfig().getStringList("ceBook13.BookLore")) {
									ceBook13Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
								}
								ceBook13Meta.addEnchant(Enchantment.LURE, 10, true);
								ceBook13Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
								ceBook13Meta.setLore(ceBook13Lore);
								ceBook13.setItemMeta(ceBook13Meta);

								player.getInventory().addItem(ceBook13);

								Firework fw = (Firework) player.getWorld().spawnEntity(player.getLocation(),
										EntityType.FIREWORK);
								FireworkMeta fwm = fw.getFireworkMeta();
								FireworkEffect effect = FireworkEffect.builder()
										.withColor(Color.AQUA.mixColors(Color.WHITE.mixColors(Color.PURPLE)))
										.withFade(Color.PURPLE).with(Type.BALL_LARGE).build();
								fwm.setPower(0);
								fwm.addEffect(effect);
								fw.setFireworkMeta(fwm);
							}

							if (level == 4) {

								player.setLevel(currentExp - plugin.getConfig().getInt("ceBook13.CostXP"));

								ItemStack ceBook13 = new ItemStack(Material.BOOK);
								ItemMeta ceBook13Meta = ceBook13.getItemMeta();
								ceBook13Meta.setDisplayName(ChatColor.translateAlternateColorCodes('&',
										plugin.getConfig().getString("ceBook13.BookLevel4")));
								List<String> ceBook13Lore = new ArrayList<>();
								for (String lore : plugin.getConfig().getStringList("ceBook13.BookLore")) {
									ceBook13Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
								}
								ceBook13Meta.addEnchant(Enchantment.LURE, 10, true);
								ceBook13Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
								ceBook13Meta.setLore(ceBook13Lore);
								ceBook13.setItemMeta(ceBook13Meta);

								player.getInventory().addItem(ceBook13);

								Firework fw = (Firework) player.getWorld().spawnEntity(player.getLocation(),
										EntityType.FIREWORK);
								FireworkMeta fwm = fw.getFireworkMeta();
								FireworkEffect effect = FireworkEffect.builder()
										.withColor(Color.AQUA.mixColors(Color.WHITE.mixColors(Color.PURPLE)))
										.withFade(Color.PURPLE).with(Type.BALL_LARGE).build();
								fwm.setPower(0);
								fwm.addEffect(effect);
								fw.setFireworkMeta(fwm);
							}

							if (level == 5) {

								player.setLevel(currentExp - plugin.getConfig().getInt("ceBook13.CostXP"));

								ItemStack ceBook13 = new ItemStack(Material.BOOK);
								ItemMeta ceBook13Meta = ceBook13.getItemMeta();
								ceBook13Meta.setDisplayName(ChatColor.translateAlternateColorCodes('&',
										plugin.getConfig().getString("ceBook13.BookLevel5")));
								List<String> ceBook13Lore = new ArrayList<>();
								for (String lore : plugin.getConfig().getStringList("ceBook13.BookLore")) {
									ceBook13Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
								}
								ceBook13Meta.addEnchant(Enchantment.LURE, 10, true);
								ceBook13Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
								ceBook13Meta.setLore(ceBook13Lore);
								ceBook13.setItemMeta(ceBook13Meta);

								player.getInventory().addItem(ceBook13);

								Firework fw = (Firework) player.getWorld().spawnEntity(player.getLocation(),
										EntityType.FIREWORK);
								FireworkMeta fwm = fw.getFireworkMeta();
								FireworkEffect effect = FireworkEffect.builder()
										.withColor(Color.AQUA.mixColors(Color.PURPLE.mixColors(Color.FUCHSIA)))
										.withFade(Color.WHITE).with(Type.BALL_LARGE).build();
								fwm.setPower(0);
								fwm.addEffect(effect);
								fw.setFireworkMeta(fwm);
							}
						} else {
							player.closeInventory();
							player.sendMessage(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("InsufficientXPMessage")));
						}
					}
				} else {
					player.closeInventory();
					player.sendMessage(ChatColor.translateAlternateColorCodes('&',
							plugin.getConfig().getString("FullInventoryMessage")));
				}
			}
		}
	}

	@EventHandler
	public void onEnchant(InventoryClickEvent event) {

		if (plugin.getConfig().getBoolean("ceBook13.Enabled") == true) {

			Player player = (Player) event.getWhoClicked();

			if (event.getCurrentItem() == null) {
				return;
			}
			if (event.getClickedInventory() == null) {
				return;
			}

			if (event.getAction() == InventoryAction.SWAP_WITH_CURSOR) {

				if (event.getCursor() == null) {
					return;
				}
				if (event.getCurrentItem() == null) {
					return;
				}
				if (event.getCursor().hasItemMeta() == false) {
					return;
				}
				if (!event.getCursor().getType().equals(Material.BOOK)) {
					return;
				}
				if (!event.getCurrentItem().getType()
						.equals(Material.valueOf(plugin.getConfig().getString("ceBook13.ActiveItem")))) {
					return;
				}

				ItemMeta bookMeta = event.getCursor().getItemMeta();

				if (bookMeta.getDisplayName()
						.equals(ChatColor.translateAlternateColorCodes('&',
								plugin.getConfig().getString("ceBook13.BookLevel1")))
						&& event.getCurrentItem().getType()
								.equals(Material.valueOf(plugin.getConfig().getString("ceBook13.ActiveItem")))) {
					if (event.getCurrentItem().getItemMeta().hasLore()
							&& (event.getCurrentItem().getItemMeta().getLore()
									.contains(ChatColor.translateAlternateColorCodes('&',
											plugin.getConfig().getString("ceBook13.EnchantedLoreLevel1")))
									|| event.getCurrentItem().getItemMeta().getLore()
											.contains(ChatColor.translateAlternateColorCodes('&',
													plugin.getConfig().getString("ceBook13.EnchantedLoreLevel2")))
									|| event.getCurrentItem().getItemMeta().getLore()
											.contains(ChatColor.translateAlternateColorCodes('&',
													plugin.getConfig().getString("ceBook13.EnchantedLoreLevel3")))
									|| event.getCurrentItem().getItemMeta().getLore()
											.contains(ChatColor.translateAlternateColorCodes('&',
													plugin.getConfig().getString("ceBook13.EnchantedLoreLevel4")))
									|| event.getCurrentItem().getItemMeta().getLore()
											.contains(ChatColor.translateAlternateColorCodes('&',
													plugin.getConfig().getString("ceBook13.EnchantedLoreLevel5"))))) {
						event.setCancelled(true);
						player.sendMessage(ChatColor.translateAlternateColorCodes('&',
								plugin.getConfig().getString("ceBook13.AlreadyEnchantedMessage")));
						return;
					} else {
						player.playSound(player.getLocation(),
								Sound.valueOf(plugin.getConfig().getString("EnchantApplySound")),
								plugin.getConfig().getInt("EnchantApplyVolume"),
								plugin.getConfig().getInt("EnchantApplyPitch"));

						ItemStack cursorItem1 = event.getCursor();
						ItemMeta cursorItemMeta = cursorItem1.getItemMeta();
						int cursorItemAmount = event.getCursor().getAmount();
						ArrayList<String> cursorItemLore = new ArrayList<String>();
						if (cursorItemMeta.hasLore()) {
							cursorItemLore = (ArrayList<String>) cursorItemMeta.getLore();
						}
						cursorItemAmount--;
						cursorItem1.setAmount(cursorItemAmount);
						cursorItemMeta.setLore(cursorItemLore);
						cursorItem1.setItemMeta(cursorItemMeta);

						ItemStack newItem = event.getCurrentItem();
						ItemMeta newItemMeta = newItem.getItemMeta();
						if (newItemMeta.hasLore()) {
							ArrayList<String> oldItemLore = (ArrayList<String>) newItemMeta.getLore();
							oldItemLore.add(0, (ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ceBook13.EnchantedLoreLevel1"))));
							newItemMeta.setLore(oldItemLore);
						} else {
							ArrayList<String> newItemLore = new ArrayList<String>();
							newItemLore.add(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ceBook13.EnchantedLoreLevel1")));
							newItemMeta.setLore(newItemLore);
						}
						newItem.setItemMeta(newItemMeta);
						player.setItemOnCursor(cursorItem1);
					}
				}

				if (bookMeta.getDisplayName()
						.equals(ChatColor.translateAlternateColorCodes('&',
								plugin.getConfig().getString("ceBook13.BookLevel2")))
						&& event.getCurrentItem().getType()
								.equals(Material.valueOf(plugin.getConfig().getString("ceBook13.ActiveItem")))) {
					if (event.getCurrentItem().getItemMeta().hasLore()
							&& (event.getCurrentItem().getItemMeta().getLore()
									.contains(ChatColor.translateAlternateColorCodes('&',
											plugin.getConfig().getString("ceBook13.EnchantedLoreLevel2")))
									|| event.getCurrentItem().getItemMeta().getLore()
											.contains(ChatColor.translateAlternateColorCodes('&',
													plugin.getConfig().getString("ceBook13.EnchantedLoreLevel3")))
									|| event.getCurrentItem().getItemMeta().getLore()
											.contains(ChatColor.translateAlternateColorCodes('&',
													plugin.getConfig().getString("ceBook13.EnchantedLoreLevel4")))
									|| event.getCurrentItem().getItemMeta().getLore()
											.contains(ChatColor.translateAlternateColorCodes('&',
													plugin.getConfig().getString("ceBook13.EnchantedLoreLevel5"))))) {
						event.setCancelled(true);
						player.sendMessage(ChatColor.translateAlternateColorCodes('&',
								plugin.getConfig().getString("ceBook13.AlreadyEnchantedMessage")));
						return;
					} else {
						player.playSound(player.getLocation(),
								Sound.valueOf(plugin.getConfig().getString("EnchantApplySound")),
								plugin.getConfig().getInt("EnchantApplyVolume"),
								plugin.getConfig().getInt("EnchantApplyPitch"));

						ItemStack cursorItem1 = event.getCursor();
						ItemMeta cursorItemMeta = cursorItem1.getItemMeta();
						int cursorItemAmount = event.getCursor().getAmount();
						ArrayList<String> cursorItemLore = new ArrayList<String>();
						if (cursorItemMeta.hasLore()) {
							cursorItemLore = (ArrayList<String>) cursorItemMeta.getLore();
						}
						cursorItemAmount--;
						cursorItem1.setAmount(cursorItemAmount);
						cursorItemMeta.setLore(cursorItemLore);
						cursorItem1.setItemMeta(cursorItemMeta);

						ItemStack newItem = event.getCurrentItem();
						ItemMeta newItemMeta = newItem.getItemMeta();
						if (newItemMeta.hasLore()) {
							ArrayList<String> oldItemLore = (ArrayList<String>) newItemMeta.getLore();
							oldItemLore.remove(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ceBook13.EnchantedLoreLevel1")));
							oldItemLore.add(0, (ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ceBook13.EnchantedLoreLevel2"))));
							newItemMeta.setLore(oldItemLore);
						} else {
							ArrayList<String> newItemLore = new ArrayList<String>();
							newItemLore.add(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ceBook13.EnchantedLoreLevel2")));
							newItemMeta.setLore(newItemLore);
						}
						newItem.setItemMeta(newItemMeta);
						player.setItemOnCursor(cursorItem1);
					}
				}

				if (bookMeta.getDisplayName()
						.equals(ChatColor.translateAlternateColorCodes('&',
								plugin.getConfig().getString("ceBook13.BookLevel3")))
						&& event.getCurrentItem().getType()
								.equals(Material.valueOf(plugin.getConfig().getString("ceBook13.ActiveItem")))) {
					if (event.getCurrentItem().getItemMeta().hasLore()
							&& (event.getCurrentItem().getItemMeta().getLore()
									.contains(ChatColor.translateAlternateColorCodes('&',
											plugin.getConfig().getString("ceBook13.EnchantedLoreLevel3")))
									|| event.getCurrentItem().getItemMeta().getLore()
											.contains(ChatColor.translateAlternateColorCodes('&',
													plugin.getConfig().getString("ceBook13.EnchantedLoreLevel4")))
									|| event.getCurrentItem().getItemMeta().getLore()
											.contains(ChatColor.translateAlternateColorCodes('&',
													plugin.getConfig().getString("ceBook13.EnchantedLoreLevel5"))))) {
						event.setCancelled(true);
						player.sendMessage(ChatColor.translateAlternateColorCodes('&',
								plugin.getConfig().getString("ceBook13.AlreadyEnchantedMessage")));
						return;
					} else {
						player.playSound(player.getLocation(),
								Sound.valueOf(plugin.getConfig().getString("EnchantApplySound")),
								plugin.getConfig().getInt("EnchantApplyVolume"),
								plugin.getConfig().getInt("EnchantApplyPitch"));

						ItemStack cursorItem1 = event.getCursor();
						ItemMeta cursorItemMeta = cursorItem1.getItemMeta();
						int cursorItemAmount = event.getCursor().getAmount();
						ArrayList<String> cursorItemLore = new ArrayList<String>();
						if (cursorItemMeta.hasLore()) {
							cursorItemLore = (ArrayList<String>) cursorItemMeta.getLore();
						}
						cursorItemAmount--;
						cursorItem1.setAmount(cursorItemAmount);
						cursorItemMeta.setLore(cursorItemLore);
						cursorItem1.setItemMeta(cursorItemMeta);

						ItemStack newItem = event.getCurrentItem();
						ItemMeta newItemMeta = newItem.getItemMeta();
						if (newItemMeta.hasLore()) {
							ArrayList<String> oldItemLore = (ArrayList<String>) newItemMeta.getLore();
							oldItemLore.remove(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ceBook13.EnchantedLoreLevel1")));
							oldItemLore.remove(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ceBook13.EnchantedLoreLevel2")));
							oldItemLore.add(0, (ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ceBook13.EnchantedLoreLevel3"))));
							newItemMeta.setLore(oldItemLore);
						} else {
							ArrayList<String> newItemLore = new ArrayList<String>();
							newItemLore.add(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ceBook13.EnchantedLoreLevel3")));
							newItemMeta.setLore(newItemLore);
						}
						newItem.setItemMeta(newItemMeta);
						player.setItemOnCursor(cursorItem1);
					}
				}

				if (bookMeta.getDisplayName()
						.equals(ChatColor.translateAlternateColorCodes('&',
								plugin.getConfig().getString("ceBook13.BookLevel4")))
						&& event.getCurrentItem().getType()
								.equals(Material.valueOf(plugin.getConfig().getString("ceBook13.ActiveItem")))) {
					if (event.getCurrentItem().getItemMeta().hasLore()
							&& (event.getCurrentItem().getItemMeta().getLore()
									.contains(ChatColor.translateAlternateColorCodes('&',
											plugin.getConfig().getString("ceBook13.EnchantedLoreLevel4")))
									|| event.getCurrentItem().getItemMeta().getLore()
											.contains(ChatColor.translateAlternateColorCodes('&',
													plugin.getConfig().getString("ceBook13.EnchantedLoreLevel5"))))) {
						event.setCancelled(true);
						player.sendMessage(ChatColor.translateAlternateColorCodes('&',
								plugin.getConfig().getString("ceBook13.AlreadyEnchantedMessage")));
						return;
					} else {
						player.playSound(player.getLocation(),
								Sound.valueOf(plugin.getConfig().getString("EnchantApplySound")),
								plugin.getConfig().getInt("EnchantApplyVolume"),
								plugin.getConfig().getInt("EnchantApplyPitch"));

						ItemStack cursorItem1 = event.getCursor();
						ItemMeta cursorItemMeta = cursorItem1.getItemMeta();
						int cursorItemAmount = event.getCursor().getAmount();
						ArrayList<String> cursorItemLore = new ArrayList<String>();
						if (cursorItemMeta.hasLore()) {
							cursorItemLore = (ArrayList<String>) cursorItemMeta.getLore();
						}
						cursorItemAmount--;
						cursorItem1.setAmount(cursorItemAmount);
						cursorItemMeta.setLore(cursorItemLore);
						cursorItem1.setItemMeta(cursorItemMeta);

						ItemStack newItem = event.getCurrentItem();
						ItemMeta newItemMeta = newItem.getItemMeta();
						if (newItemMeta.hasLore()) {
							ArrayList<String> oldItemLore = (ArrayList<String>) newItemMeta.getLore();
							oldItemLore.remove(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ceBook13.EnchantedLoreLevel1")));
							oldItemLore.remove(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ceBook13.EnchantedLoreLevel2")));
							oldItemLore.remove(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ceBook13.EnchantedLoreLevel3")));
							oldItemLore.add(0, (ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ceBook13.EnchantedLoreLevel4"))));
							newItemMeta.setLore(oldItemLore);
						} else {
							ArrayList<String> newItemLore = new ArrayList<String>();
							newItemLore.add(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ceBook13.EnchantedLoreLevel4")));
							newItemMeta.setLore(newItemLore);
						}
						newItem.setItemMeta(newItemMeta);
						player.setItemOnCursor(cursorItem1);
					}
				}

				if (bookMeta.getDisplayName()
						.equals(ChatColor.translateAlternateColorCodes('&',
								plugin.getConfig().getString("ceBook13.BookLevel5")))
						&& event.getCurrentItem().getType()
								.equals(Material.valueOf(plugin.getConfig().getString("ceBook13.ActiveItem")))) {
					if (event.getCurrentItem().getItemMeta().hasLore() && (event.getCurrentItem().getItemMeta()
							.getLore().contains(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ceBook13.EnchantedLoreLevel5"))))) {
						event.setCancelled(true);
						player.sendMessage(ChatColor.translateAlternateColorCodes('&',
								plugin.getConfig().getString("ceBook13.AlreadyEnchantedMessage")));
						return;
					} else {
						player.playSound(player.getLocation(),
								Sound.valueOf(plugin.getConfig().getString("EnchantApplySound")),
								plugin.getConfig().getInt("EnchantApplyVolume"),
								plugin.getConfig().getInt("EnchantApplyPitch"));

						ItemStack cursorItem1 = event.getCursor();
						ItemMeta cursorItemMeta = cursorItem1.getItemMeta();
						int cursorItemAmount = event.getCursor().getAmount();
						ArrayList<String> cursorItemLore = new ArrayList<String>();
						if (cursorItemMeta.hasLore()) {
							cursorItemLore = (ArrayList<String>) cursorItemMeta.getLore();
						}
						cursorItemAmount--;
						cursorItem1.setAmount(cursorItemAmount);
						cursorItemMeta.setLore(cursorItemLore);
						cursorItem1.setItemMeta(cursorItemMeta);

						ItemStack newItem = event.getCurrentItem();
						ItemMeta newItemMeta = newItem.getItemMeta();
						if (newItemMeta.hasLore()) {
							ArrayList<String> oldItemLore = (ArrayList<String>) newItemMeta.getLore();
							oldItemLore.remove(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ceBook13.EnchantedLoreLevel1")));
							oldItemLore.remove(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ceBook13.EnchantedLoreLevel2")));
							oldItemLore.remove(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ceBook13.EnchantedLoreLevel3")));
							oldItemLore.remove(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ceBook13.EnchantedLoreLevel4")));
							oldItemLore.add(0, (ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ceBook13.EnchantedLoreLevel5"))));
							newItemMeta.setLore(oldItemLore);
						} else {
							ArrayList<String> newItemLore = new ArrayList<String>();
							newItemLore.add(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ceBook13.EnchantedLoreLevel5")));
							newItemMeta.setLore(newItemLore);
						}
						newItem.setItemMeta(newItemMeta);
						player.setItemOnCursor(cursorItem1);
					}
				}
			}
		} else {
			return;
		}
	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onDamage(EntityDamageByEntityEvent event) {
		if (plugin.getConfig().getBoolean("ceBook13.Enabled") == true) {

			if ((event.getDamager() instanceof Player) && (event.getEntity() instanceof Player)) {

				Player player = (Player) event.getDamager();
				Player hurt = (Player) event.getEntity();
				Random rand = new Random();

				if (player.getInventory().getItemInHand().getType().equals(Material.AIR)) {
					return;
				}

				if (player.getInventory().getItemInHand().getItemMeta().getLore() == null) {
					return;
				}

				if (plugin.getConfig().getBoolean("WorldGuard") == true) {
					if (!WorldGuard.allowsPVP(player.getLocation()) || !WorldGuard.allowsPVP(hurt.getLocation())) {
						event.setCancelled(true);
						return;
					}
				}

				if (plugin.getConfig().getBoolean("SavageFactions") == true) {
					if (SavageFactions.isFriendly(player, hurt)) {
						event.setCancelled(true);
						return;
					}
				}

				if (player.getInventory().getItemInHand().getItemMeta() != null
						&& player.getInventory().getItemInHand().getItemMeta().hasLore()) {
					List<String> ceItemLore = player.getInventory().getItemInHand().getItemMeta().getLore();

					if (ceItemLore.contains(ChatColor.translateAlternateColorCodes('&',
							plugin.getConfig().getString("ceBook13.EnchantedLoreLevel1")))) {

						int chance = rand.nextInt(plugin.getConfig().getInt("ceBook13.Chance")) + 1;

						if (chance == 1) {

							if (hurt.hasPotionEffect(PotionEffectType
									.getByName(plugin.getConfig().getString("ceBook13.PotionEffect")))) {
								Collection<PotionEffect> effects = hurt.getActivePotionEffects();
								for (PotionEffect p : effects) {
									p.getDuration();
									if (p.getDuration() > 20000 && p.getType().equals(PotionEffectType
											.getByName(plugin.getConfig().getString("ceBook13.PotionEffect")))) {
										hurt.removePotionEffect(PotionEffectType
												.getByName(plugin.getConfig().getString("ceBook13.PotionEffect")));
									}
								}
							}

							hurt.addPotionEffect(new PotionEffect(
									PotionEffectType.getByName(plugin.getConfig().getString("ceBook13.PotionEffect")),
									plugin.getConfig().getInt("ceBook13.Duration"), 0));
							hurt.playSound(player.getLocation(),
									Sound.valueOf(plugin.getConfig().getString("ceBook13.HurtSound")),
									plugin.getConfig().getInt("ceBook13.HurtVolume"),
									plugin.getConfig().getInt("ceBook13.HurtPitch"));

							if (plugin.getConfig().getBoolean("ceBook13.MessageEnabled") == true) {
								hurt.sendMessage(ChatColor.translateAlternateColorCodes('&',
										plugin.getConfig().getString("ceBook13.EnchantProcMessage")
												.replaceAll("%player%", player.getName())));
							}

							player.playSound(player.getLocation(),
									Sound.valueOf(plugin.getConfig().getString("ceBook13.GiverSound")),
									plugin.getConfig().getInt("ceBook13.GiverVolume"),
									plugin.getConfig().getInt("ceBook13.GiverPitch"));
						}
					}

					if (ceItemLore.contains(ChatColor.translateAlternateColorCodes('&',
							plugin.getConfig().getString("ceBook13.EnchantedLoreLevel2")))) {

						int chance = rand.nextInt(plugin.getConfig().getInt("ceBook13.Chance")) + 1;

						if (chance == 1) {

							if (hurt.hasPotionEffect(PotionEffectType
									.getByName(plugin.getConfig().getString("ceBook13.PotionEffect")))) {
								Collection<PotionEffect> effects = hurt.getActivePotionEffects();
								for (PotionEffect p : effects) {
									p.getDuration();
									if (p.getDuration() > 20000 && p.getType().equals(PotionEffectType
											.getByName(plugin.getConfig().getString("ceBook13.PotionEffect")))) {
										hurt.removePotionEffect(PotionEffectType
												.getByName(plugin.getConfig().getString("ceBook13.PotionEffect")));
									}
								}
							}

							hurt.addPotionEffect(new PotionEffect(
									PotionEffectType.getByName(plugin.getConfig().getString("ceBook13.PotionEffect")),
									plugin.getConfig().getInt("ceBook13.Duration"), 1));
							hurt.playSound(player.getLocation(),
									Sound.valueOf(plugin.getConfig().getString("ceBook13.HurtSound")),
									plugin.getConfig().getInt("ceBook13.HurtVolume"),
									plugin.getConfig().getInt("ceBook13.HurtPitch"));

							if (plugin.getConfig().getBoolean("ceBook13.MessageEnabled") == true) {
								hurt.sendMessage(ChatColor.translateAlternateColorCodes('&',
										plugin.getConfig().getString("ceBook13.EnchantProcMessage")
												.replaceAll("%player%", player.getName())));
							}

							player.playSound(player.getLocation(),
									Sound.valueOf(plugin.getConfig().getString("ceBook13.GiverSound")),
									plugin.getConfig().getInt("ceBook13.GiverVolume"),
									plugin.getConfig().getInt("ceBook13.GiverPitch"));
						}
					}

					if (ceItemLore.contains(ChatColor.translateAlternateColorCodes('&',
							plugin.getConfig().getString("ceBook13.EnchantedLoreLevel3")))) {

						int chance = rand.nextInt(plugin.getConfig().getInt("ceBook13.Chance")) + 1;

						if (chance == 1) {

							if (hurt.hasPotionEffect(PotionEffectType
									.getByName(plugin.getConfig().getString("ceBook13.PotionEffect")))) {
								Collection<PotionEffect> effects = hurt.getActivePotionEffects();
								for (PotionEffect p : effects) {
									p.getDuration();
									if (p.getDuration() > 20000 && p.getType().equals(PotionEffectType
											.getByName(plugin.getConfig().getString("ceBook13.PotionEffect")))) {
										hurt.removePotionEffect(PotionEffectType
												.getByName(plugin.getConfig().getString("ceBook13.PotionEffect")));
									}
								}
							}

							hurt.addPotionEffect(new PotionEffect(
									PotionEffectType.getByName(plugin.getConfig().getString("ceBook13.PotionEffect")),
									plugin.getConfig().getInt("ceBook13.Duration"), 2));
							hurt.playSound(player.getLocation(),
									Sound.valueOf(plugin.getConfig().getString("ceBook13.HurtSound")),
									plugin.getConfig().getInt("ceBook13.HurtVolume"),
									plugin.getConfig().getInt("ceBook13.HurtPitch"));

							if (plugin.getConfig().getBoolean("ceBook13.MessageEnabled") == true) {
								hurt.sendMessage(ChatColor.translateAlternateColorCodes('&',
										plugin.getConfig().getString("ceBook13.EnchantProcMessage")
												.replaceAll("%player%", player.getName())));
							}

							player.playSound(player.getLocation(),
									Sound.valueOf(plugin.getConfig().getString("ceBook13.GiverSound")),
									plugin.getConfig().getInt("ceBook13.GiverVolume"),
									plugin.getConfig().getInt("ceBook13.GiverPitch"));
						}
					}

					if (ceItemLore.contains(ChatColor.translateAlternateColorCodes('&',
							plugin.getConfig().getString("ceBook13.EnchantedLoreLevel4")))) {

						int chance = rand.nextInt(plugin.getConfig().getInt("ceBook13.Chance")) + 1;

						if (chance == 1) {

							if (hurt.hasPotionEffect(PotionEffectType
									.getByName(plugin.getConfig().getString("ceBook13.PotionEffect")))) {
								Collection<PotionEffect> effects = hurt.getActivePotionEffects();
								for (PotionEffect p : effects) {
									p.getDuration();
									if (p.getDuration() > 20000 && p.getType().equals(PotionEffectType
											.getByName(plugin.getConfig().getString("ceBook13.PotionEffect")))) {
										hurt.removePotionEffect(PotionEffectType
												.getByName(plugin.getConfig().getString("ceBook13.PotionEffect")));
									}
								}
							}

							hurt.addPotionEffect(new PotionEffect(
									PotionEffectType.getByName(plugin.getConfig().getString("ceBook13.PotionEffect")),
									plugin.getConfig().getInt("ceBook13.Duration"), 3));
							hurt.playSound(player.getLocation(),
									Sound.valueOf(plugin.getConfig().getString("ceBook13.HurtSound")),
									plugin.getConfig().getInt("ceBook13.HurtVolume"),
									plugin.getConfig().getInt("ceBook13.HurtPitch"));

							if (plugin.getConfig().getBoolean("ceBook13.MessageEnabled") == true) {
								hurt.sendMessage(ChatColor.translateAlternateColorCodes('&',
										plugin.getConfig().getString("ceBook13.EnchantProcMessage")
												.replaceAll("%player%", player.getName())));
							}

							player.playSound(player.getLocation(),
									Sound.valueOf(plugin.getConfig().getString("ceBook13.GiverSound")),
									plugin.getConfig().getInt("ceBook13.GiverVolume"),
									plugin.getConfig().getInt("ceBook13.GiverPitch"));
						}
					}

					if (ceItemLore.contains(ChatColor.translateAlternateColorCodes('&',
							plugin.getConfig().getString("ceBook13.EnchantedLoreLevel5")))) {

						int chance = rand.nextInt(plugin.getConfig().getInt("ceBook13.Chance")) + 1;

						if (chance == 1) {

							if (hurt.hasPotionEffect(PotionEffectType
									.getByName(plugin.getConfig().getString("ceBook13.PotionEffect")))) {
								Collection<PotionEffect> effects = hurt.getActivePotionEffects();
								for (PotionEffect p : effects) {
									p.getDuration();
									if (p.getDuration() > 20000 && p.getType().equals(PotionEffectType
											.getByName(plugin.getConfig().getString("ceBook13.PotionEffect")))) {
										hurt.removePotionEffect(PotionEffectType
												.getByName(plugin.getConfig().getString("ceBook13.PotionEffect")));
									}
								}
							}

							hurt.addPotionEffect(new PotionEffect(
									PotionEffectType.getByName(plugin.getConfig().getString("ceBook13.PotionEffect")),
									plugin.getConfig().getInt("ceBook13.Duration"), 4));
							hurt.playSound(player.getLocation(),
									Sound.valueOf(plugin.getConfig().getString("ceBook13.HurtSound")),
									plugin.getConfig().getInt("ceBook13.HurtVolume"),
									plugin.getConfig().getInt("ceBook13.HurtPitch"));

							if (plugin.getConfig().getBoolean("ceBook13.MessageEnabled") == true) {
								hurt.sendMessage(ChatColor.translateAlternateColorCodes('&',
										plugin.getConfig().getString("ceBook13.EnchantProcMessage")
												.replaceAll("%player%", player.getName())));
							}

							player.playSound(player.getLocation(),
									Sound.valueOf(plugin.getConfig().getString("ceBook13.GiverSound")),
									plugin.getConfig().getInt("ceBook13.GiverVolume"),
									plugin.getConfig().getInt("ceBook13.GiverPitch"));
						}
					}
				}
			}
		}
	}

	@EventHandler
	public void onUpgrade(InventoryClickEvent event) {

		if (plugin.getConfig().getBoolean("ceBook13.Enabled") == true) {

			Player player = (Player) event.getWhoClicked();
			ItemMeta bookMeta = event.getCursor().getItemMeta();

			// ------------------- CODE FOR UPGRADING BOOKS -------------------
			if ((event.getAction() == InventoryAction.PLACE_ALL) || (event.getAction() == InventoryAction.PLACE_ONE)
					|| (event.getAction() == InventoryAction.PLACE_SOME)) {
				if (event.getCursor() == null) {
					return;
				}
				if (event.getCurrentItem() == null) {
					return;
				}
				if (event.getCurrentItem().hasItemMeta() == false) {
					return;
				}
				if (event.getCursor().hasItemMeta() == false) {
					return;
				}

				if (plugin.getConfig().getInt("ceBook13.MaxLevel") > 1) {

					if (bookMeta.getDisplayName().equals(ChatColor.translateAlternateColorCodes('&',
							plugin.getConfig().getString("ceBook13.BookLevel1")))) {

						if (event.getCurrentItem().getItemMeta().hasLore() && event.getCursor().getItemMeta().hasLore()
								&& event.getCursor().getType().equals(Material.BOOK)
								&& event.getCurrentItem().getItemMeta().getDisplayName() == bookMeta.getDisplayName()) {

							int currentItemAmount = event.getCurrentItem().getAmount();
							int cursorItemAmount = event.getCursor().getAmount();

							if (currentItemAmount % cursorItemAmount == 0) {

								int newCursorItemAmount = (currentItemAmount + cursorItemAmount) / 2;

								player.playSound(player.getLocation(),
										Sound.valueOf(plugin.getConfig().getString("UpgradeSound")),
										plugin.getConfig().getInt("UpgradeVolume"),
										plugin.getConfig().getInt("UpgradePitch"));

								ItemStack newCursorItem = new ItemStack(Material.BOOK);
								ItemMeta newCursorItemMeta = newCursorItem.getItemMeta();
								newCursorItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&',
										plugin.getConfig().getString("ceBook13.BookLevel2")));
								ArrayList<String> newCursorItemLore = new ArrayList<String>();
								for (String lore : plugin.getConfig().getStringList("ceBook13.BookLore")) {
									newCursorItemLore.add(ChatColor.translateAlternateColorCodes('&', lore));
								}
								newCursorItemMeta.addEnchant(Enchantment.LURE, 10, true);
								newCursorItemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
								newCursorItem.setAmount(newCursorItemAmount);
								newCursorItemMeta.setLore(newCursorItemLore);
								newCursorItem.setItemMeta(newCursorItemMeta);

								player.getInventory().removeItem(event.getCurrentItem());
								player.setItemOnCursor(null);
								player.getInventory().addItem(newCursorItem);
								player.sendMessage(ChatColor.translateAlternateColorCodes('&',
										plugin.getConfig().getString("UpgradeMessage")));
								event.setCancelled(true);
							} else {
								player.sendMessage(ChatColor.translateAlternateColorCodes('&',
										plugin.getConfig().getString("FailedUpgradeMessage")));
								player.playSound(player.getLocation(),
										Sound.valueOf(plugin.getConfig().getString("FailedUpgradeSound")),
										plugin.getConfig().getInt("FailedUpgradeVolume"),
										plugin.getConfig().getInt("FailedUpgradePitch"));
							}
						}
					}
				}

				if (plugin.getConfig().getInt("ceBook13.MaxLevel") > 2) {

					if (bookMeta.getDisplayName().equals(ChatColor.translateAlternateColorCodes('&',
							plugin.getConfig().getString("ceBook13.BookLevel2")))) {

						if (event.getCurrentItem().getItemMeta().hasLore() && event.getCursor().getItemMeta().hasLore()
								&& event.getCursor().getType().equals(Material.BOOK)
								&& event.getCurrentItem().getItemMeta().getDisplayName() == bookMeta.getDisplayName()) {

							int currentItemAmount = event.getCurrentItem().getAmount();
							int cursorItemAmount = event.getCursor().getAmount();

							if (currentItemAmount % cursorItemAmount == 0) {

								int newCursorItemAmount = (currentItemAmount + cursorItemAmount) / 2;

								player.playSound(player.getLocation(),
										Sound.valueOf(plugin.getConfig().getString("UpgradeSound")),
										plugin.getConfig().getInt("UpgradeVolume"),
										plugin.getConfig().getInt("UpgradePitch"));

								ItemStack newCursorItem = new ItemStack(Material.BOOK);
								ItemMeta newCursorItemMeta = newCursorItem.getItemMeta();
								newCursorItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&',
										plugin.getConfig().getString("ceBook13.BookLevel3")));
								ArrayList<String> newCursorItemLore = new ArrayList<String>();
								for (String lore : plugin.getConfig().getStringList("ceBook13.BookLore")) {
									newCursorItemLore.add(ChatColor.translateAlternateColorCodes('&', lore));
								}
								newCursorItemMeta.addEnchant(Enchantment.LURE, 10, true);
								newCursorItemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
								newCursorItem.setAmount(newCursorItemAmount);
								newCursorItemMeta.setLore(newCursorItemLore);
								newCursorItem.setItemMeta(newCursorItemMeta);

								player.getInventory().removeItem(event.getCurrentItem());
								player.setItemOnCursor(null);
								player.getInventory().addItem(newCursorItem);
								player.sendMessage(ChatColor.translateAlternateColorCodes('&',
										plugin.getConfig().getString("UpgradeMessage")));
								event.setCancelled(true);
							} else {
								player.sendMessage(ChatColor.translateAlternateColorCodes('&',
										plugin.getConfig().getString("FailedUpgradeMessage")));
								player.playSound(player.getLocation(),
										Sound.valueOf(plugin.getConfig().getString("FailedUpgradeSound")),
										plugin.getConfig().getInt("FailedUpgradeVolume"),
										plugin.getConfig().getInt("FailedUpgradePitch"));
							}
						}
					}
				}

				if (plugin.getConfig().getInt("ceBook13.MaxLevel") > 3) {

					if (bookMeta.getDisplayName().equals(ChatColor.translateAlternateColorCodes('&',
							plugin.getConfig().getString("ceBook13.BookLevel3")))) {

						if (event.getCurrentItem().getItemMeta().hasLore() && event.getCursor().getItemMeta().hasLore()
								&& event.getCursor().getType().equals(Material.BOOK)
								&& event.getCurrentItem().getItemMeta().getDisplayName() == bookMeta.getDisplayName()) {

							int currentItemAmount = event.getCurrentItem().getAmount();
							int cursorItemAmount = event.getCursor().getAmount();

							if (currentItemAmount % cursorItemAmount == 0) {

								int newCursorItemAmount = (currentItemAmount + cursorItemAmount) / 2;

								player.playSound(player.getLocation(),
										Sound.valueOf(plugin.getConfig().getString("UpgradeSound")),
										plugin.getConfig().getInt("UpgradeVolume"),
										plugin.getConfig().getInt("UpgradePitch"));

								ItemStack newCursorItem = new ItemStack(Material.BOOK);
								ItemMeta newCursorItemMeta = newCursorItem.getItemMeta();
								newCursorItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&',
										plugin.getConfig().getString("ceBook13.BookLevel4")));
								ArrayList<String> newCursorItemLore = new ArrayList<String>();
								for (String lore : plugin.getConfig().getStringList("ceBook13.BookLore")) {
									newCursorItemLore.add(ChatColor.translateAlternateColorCodes('&', lore));
								}
								newCursorItemMeta.addEnchant(Enchantment.LURE, 10, true);
								newCursorItemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
								newCursorItem.setAmount(newCursorItemAmount);
								newCursorItemMeta.setLore(newCursorItemLore);
								newCursorItem.setItemMeta(newCursorItemMeta);

								player.getInventory().removeItem(event.getCurrentItem());
								player.setItemOnCursor(null);
								player.getInventory().addItem(newCursorItem);
								player.sendMessage(ChatColor.translateAlternateColorCodes('&',
										plugin.getConfig().getString("UpgradeMessage")));
								event.setCancelled(true);
							} else {
								player.sendMessage(ChatColor.translateAlternateColorCodes('&',
										plugin.getConfig().getString("FailedUpgradeMessage")));
								player.playSound(player.getLocation(),
										Sound.valueOf(plugin.getConfig().getString("FailedUpgradeSound")),
										plugin.getConfig().getInt("FailedUpgradeVolume"),
										plugin.getConfig().getInt("FailedUpgradePitch"));
							}
						}
					}
				}

				if (plugin.getConfig().getInt("ceBook13.MaxLevel") > 4) {

					if (bookMeta.getDisplayName().equals(ChatColor.translateAlternateColorCodes('&',
							plugin.getConfig().getString("ceBook13.BookLevel4")))) {

						if (event.getCurrentItem().getItemMeta().hasLore() && event.getCursor().getItemMeta().hasLore()
								&& event.getCursor().getType().equals(Material.BOOK)
								&& event.getCurrentItem().getItemMeta().getDisplayName() == bookMeta.getDisplayName()) {

							int currentItemAmount = event.getCurrentItem().getAmount();
							int cursorItemAmount = event.getCursor().getAmount();

							if (currentItemAmount % cursorItemAmount == 0) {

								int newCursorItemAmount = (currentItemAmount + cursorItemAmount) / 2;

								player.playSound(player.getLocation(),
										Sound.valueOf(plugin.getConfig().getString("UpgradeSound")),
										plugin.getConfig().getInt("UpgradeVolume"),
										plugin.getConfig().getInt("UpgradePitch"));

								ItemStack newCursorItem = new ItemStack(Material.BOOK);
								ItemMeta newCursorItemMeta = newCursorItem.getItemMeta();
								newCursorItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&',
										plugin.getConfig().getString("ceBook13.BookLevel5")));
								ArrayList<String> newCursorItemLore = new ArrayList<String>();
								for (String lore : plugin.getConfig().getStringList("ceBook13.BookLore")) {
									newCursorItemLore.add(ChatColor.translateAlternateColorCodes('&', lore));
								}
								newCursorItemMeta.addEnchant(Enchantment.LURE, 10, true);
								newCursorItemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
								newCursorItem.setAmount(newCursorItemAmount);
								newCursorItemMeta.setLore(newCursorItemLore);
								newCursorItem.setItemMeta(newCursorItemMeta);

								player.getInventory().removeItem(event.getCurrentItem());
								player.setItemOnCursor(null);
								player.getInventory().addItem(newCursorItem);
								player.sendMessage(ChatColor.translateAlternateColorCodes('&',
										plugin.getConfig().getString("UpgradeMessage")));
								event.setCancelled(true);
							} else {
								player.sendMessage(ChatColor.translateAlternateColorCodes('&',
										plugin.getConfig().getString("FailedUpgradeMessage")));
								player.playSound(player.getLocation(),
										Sound.valueOf(plugin.getConfig().getString("FailedUpgradeSound")),
										plugin.getConfig().getInt("FailedUpgradeVolume"),
										plugin.getConfig().getInt("FailedUpgradePitch"));
							}
						}
					}
				}
			}
		}
	}
}
