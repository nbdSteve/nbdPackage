package com.nbdSteve.nbdPackage.Commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.nbdSteve.nbdPackage.EnchanterGUI;
import com.nbdSteve.nbdPackage.Main;

import net.md_5.bungee.api.ChatColor;

public class Commands implements CommandExecutor {

	private Main plugin;

	public Commands(Main plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {

			Player player = ((Player) sender).getPlayer();
			
			if (command.getName().equalsIgnoreCase("enchanter")) {
				if (args.length == 0) {
					EnchanterGUI i = new EnchanterGUI();
					i.enchanterGUI(player);
					return true;
				}
			}
			
			if (command.getName().equalsIgnoreCase("customenchant")) {
				if (args.length == 0) {
					EnchanterGUI i = new EnchanterGUI();
					i.enchanterGUI(player);
					return true;
				}
			}
			
			if (command.getName().equalsIgnoreCase("ca")) {
				if (args.length == 0) {
					EnchanterGUI i = new EnchanterGUI();
					i.enchanterGUI(player);
					return true;
				}
			}

			if (command.getName().equalsIgnoreCase("ce")) {
				if (args.length == 0) {
					EnchanterGUI i = new EnchanterGUI();
					i.enchanterGUI(player);
					return true;
				}

				if (args.length == 1) {
					if (args[0].equalsIgnoreCase("reload") && player.hasPermission("nbdpackage.admin")) {
						plugin.reloadConfig();
						((Main) plugin).loadFund();
						player.sendMessage(ChatColor.translateAlternateColorCodes('&',
								plugin.getConfig().getString("ReloadMessage")));
						return true;
					}
				}
			}

			if (command.getName().equalsIgnoreCase("givenbd") && player.hasPermission("nbdpackage.admin")) {

				if (args.length == 0) {
					EnchanterGUI i = new EnchanterGUI();
					i.enchanterGUI(player);
					return true;
				}

				if (args.length == 1) {
					if (args[0].equalsIgnoreCase("reload")) {
						plugin.reloadConfig();
						player.sendMessage(ChatColor.translateAlternateColorCodes('&',
								plugin.getConfig().getString("ReloadMessage")));
					}

					if (args[0].equalsIgnoreCase("book")) {
						player.sendMessage(
								"§c§l§nERROR!§7 Please enter a valid book number, player and level to complete this command");
					}

					if (args[0].equalsIgnoreCase("armor")) {
						player.sendMessage(
								"§c§l§nERROR!§7 Please enter a valid set number, player and armor piece to complete this command");
					}
				}

				if (args.length == 4) {

					Player target = plugin.getServer().getPlayer(args[2]);

					if (args[0].equalsIgnoreCase("book")) {
						
						int bookLevel = Integer.valueOf(args[3]);
						int ceBook = Integer.valueOf(args[1]);
						
						if (ceBook > 0 && ceBook < 22) {
							if (target != null) {
								if (bookLevel >= 0) {

									String bookNumberString = ("ceBook%number%.BookLore").replace("%number%", args[1]);
									String bookLevelString = ("ceBook%number%.BookLevel%level%")
											.replace("%number%", args[1]).replace("%level%", args[3]);

									ItemStack book = new ItemStack(Material.BOOK);
									ItemMeta bookMeta = book.getItemMeta();

									bookMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&',
											plugin.getConfig().getString(bookLevelString)));
									List<String> bookLore = new ArrayList<>();
									for (String lore : plugin.getConfig().getStringList(bookNumberString)) {
										bookLore.add(ChatColor.translateAlternateColorCodes('&', lore));
									}
									bookMeta.addEnchant(Enchantment.LURE, 10, true);
									bookMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
									bookMeta.setLore(bookLore);
									book.setItemMeta(bookMeta);

									target.getInventory().addItem(book);
									
									player.sendMessage(
											"§a§l§nSUCCESS!§7 You have given §f" + target.getName() + " §7their enchantment book!");
									
									if (plugin.getConfig().getBoolean("TargetMessageEnabled") == true) {
										target.sendMessage(ChatColor.translateAlternateColorCodes('&',
												plugin.getConfig().getString("TargetMessage")
														.replace("%target%", args[2])
														.replace("%sender%", sender.getName())));
									}
								} else {
									player.sendMessage(
											"§c§l§nERROR!§7 Please enter a valid book level, levels range from §f1-5§7.");
								}
							} else {
								player.sendMessage(
										"§c§l§nERROR!§7 Please enter a valid target for this command &o(a player name).");
							}
						} else {
							player.sendMessage(
									"§c§l§nERROR!§7 Please enter a valid book number, this must be between §f1-18§7.");
						}
					}

					if (args[0].equalsIgnoreCase("armor")) {
						
						int armorSet = Integer.valueOf(args[1]);
						
						if (armorSet > 0 && armorSet < 6) {
							if (target != null) {
								if (args[3].equalsIgnoreCase("helmet") || args[3].equalsIgnoreCase("chestplate")
										|| args[3].equalsIgnoreCase("leggings") || args[3].equalsIgnoreCase("boots")) {

									String armorSetString = ("ArmorSet%number%.UniqueName").replace("%number%",
											args[1]);
									String armorLoreString = ("ArmorSet%number%.Lore").replace("%number%", args[1]);
									String armorPiece = ("DIAMOND_%piece%").replace("%piece%", (args[3]).toUpperCase());

									ItemStack armor = new ItemStack(Material.valueOf(armorPiece));
									ItemMeta armorMeta = armor.getItemMeta();
									List<String> armorLore = new ArrayList<>();
									armorLore.add(" ");
									armorLore.add(ChatColor.translateAlternateColorCodes('&',
											plugin.getConfig().getString(armorSetString)));
									for (String lore : plugin.getConfig().getStringList(armorLoreString)) {
										armorLore.add(ChatColor.translateAlternateColorCodes('&', lore));
									}
									armorMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
									armorMeta.addEnchant(Enchantment.DURABILITY, 3, true);
									armorMeta.setLore(armorLore);
									armor.setItemMeta(armorMeta);

									target.getInventory().addItem(armor);

									player.sendMessage(
											"§a§l§nSUCCESS!§7 You have given §f" + target.getName() + " §7their armor piece!");
									
									if (plugin.getConfig().getBoolean("TargetMessageEnabled") == true) {
										target.sendMessage(ChatColor.translateAlternateColorCodes('&',
												plugin.getConfig().getString("TargetMessage")
														.replace("%target%", args[2])
														.replace("%sender%", sender.getName())));
									}
								} else {
									player.sendMessage(
											"§c§l§nERROR!§7 Please enter a valid armor piece §7&o(helmet, chestplate, leggings or boots).");
								}
							} else {
								player.sendMessage(
										"§c§l§nERROR!§7 Please enter a valid target for this command §o(a player name).");
							}
						} else {
							player.sendMessage(
									"§c§l§nERROR!§7 Please enter a valid armor set number, this must be between §f1-4§7.");
						}
					}
				}

			} else {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',
						plugin.getConfig().getString("NoPermissionMessage")));
			}
		}
		return true;
	}
}
