package com.nbdSteve.nbdPackage;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import com.nbdSteve.nbdPackage.Fund.F;

public class EnchanterGUI implements Listener {

	private Plugin plugin = Main.getPlugin(Main.class);

	@SuppressWarnings("deprecation")
	public void enchanterGUI(Player player) {

		Inventory i = plugin.getServer().createInventory(null, plugin.getConfig().getInt("EnchanterSize"),
				ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("EnchanterName")));

		if (F.funded()) {

			// Filler items
			ItemStack filler1 = new ItemStack(Material.LEGACY_STAINED_GLASS_PANE, 1, (byte) 7);
			ItemMeta filler1meta = filler1.getItemMeta();
			filler1meta.setDisplayName(" ");
			filler1.setItemMeta(filler1meta);

			ItemStack filler2 = new ItemStack(Material.LEGACY_STAINED_GLASS_PANE, 1, (byte) 15);
			ItemMeta filler2meta = filler2.getItemMeta();
			filler2meta.setDisplayName(" ");
			filler2.setItemMeta(filler2meta);

			// -------------------------------------------------------------------------
			// Code for first armor set
			ItemStack armorSet1 = new ItemStack(Material.DIAMOND_BOOTS, 1);
			ItemMeta armorSet1Meta = armorSet1.getItemMeta();
			List<String> armorSet1Lore = new ArrayList<>();
			armorSet1Lore.add(" ");
			armorSet1Lore.add(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet1.UniqueName")));
			for (String lore : plugin.getConfig().getStringList("ArmorSet1.Lore")) {
				armorSet1Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			if (!(F.funded())) {
				for (String FundedLore : ((Main) plugin).getFund().getStringList("NotFundedGUI.Lore")) {
					armorSet1Lore.add(ChatColor.translateAlternateColorCodes('&', FundedLore).replace("%percentFunded%",
							String.valueOf(F.percentFunded())));
				}
			} else {
				for (String GUIlore : plugin.getConfig().getStringList("ArmorSet1.GUILore")) {
					armorSet1Lore.add(ChatColor.translateAlternateColorCodes('&', GUIlore));
				}
			}
			armorSet1Meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
			armorSet1Meta.addEnchant(Enchantment.DURABILITY, 3, true);
			armorSet1Meta.setLore(armorSet1Lore);
			armorSet1.setItemMeta(armorSet1Meta);

			ItemStack armorSet1x = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
			ItemMeta armorSet1xMeta = armorSet1x.getItemMeta();
			List<String> armorSet1xLore = new ArrayList<>();
			armorSet1xLore.add(" ");
			armorSet1xLore.add(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet1.UniqueName")));
			for (String lore : plugin.getConfig().getStringList("ArmorSet1.Lore")) {
				armorSet1xLore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			if (!(F.funded())) {
				for (String FundedLore : ((Main) plugin).getFund().getStringList("NotFundedGUI.Lore")) {
					armorSet1xLore.add(ChatColor.translateAlternateColorCodes('&', FundedLore)
							.replace("%percentFunded%", String.valueOf(F.percentFunded())));
				}
			} else {
				for (String GUIlore : plugin.getConfig().getStringList("ArmorSet1.GUILore")) {
					armorSet1xLore.add(ChatColor.translateAlternateColorCodes('&', GUIlore));
				}
			}
			armorSet1xMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
			armorSet1xMeta.addEnchant(Enchantment.DURABILITY, 3, true);
			armorSet1xMeta.setLore(armorSet1xLore);
			armorSet1x.setItemMeta(armorSet1xMeta);

			ItemStack armorSet1y = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
			ItemMeta armorSet1yMeta = armorSet1y.getItemMeta();
			List<String> armorSet1yLore = new ArrayList<>();
			armorSet1yLore.add(" ");
			armorSet1yLore.add(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet1.UniqueName")));
			for (String lore : plugin.getConfig().getStringList("ArmorSet1.Lore")) {
				armorSet1yLore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			if (!(F.funded())) {
				for (String FundedLore : ((Main) plugin).getFund().getStringList("NotFundedGUI.Lore")) {
					armorSet1yLore.add(ChatColor.translateAlternateColorCodes('&', FundedLore)
							.replace("%percentFunded%", String.valueOf(F.percentFunded())));
				}
			} else {
				for (String GUIlore : plugin.getConfig().getStringList("ArmorSet1.GUILore")) {
					armorSet1yLore.add(ChatColor.translateAlternateColorCodes('&', GUIlore));
				}
			}
			armorSet1yMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
			armorSet1yMeta.addEnchant(Enchantment.DURABILITY, 3, true);
			armorSet1yMeta.setLore(armorSet1yLore);
			armorSet1y.setItemMeta(armorSet1yMeta);

			ItemStack armorSet1z = new ItemStack(Material.DIAMOND_HELMET, 1);
			ItemMeta armorSet1zMeta = armorSet1z.getItemMeta();
			List<String> armorSet1zLore = new ArrayList<>();
			armorSet1zLore.add(" ");
			armorSet1zLore.add(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet1.UniqueName")));
			for (String lore : plugin.getConfig().getStringList("ArmorSet1.Lore")) {
				armorSet1zLore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			if (!(F.funded())) {
				for (String FundedLore : ((Main) plugin).getFund().getStringList("NotFundedGUI.Lore")) {
					armorSet1zLore.add(ChatColor.translateAlternateColorCodes('&', FundedLore)
							.replace("%percentFunded%", String.valueOf(F.percentFunded())));
				}
			} else {
				for (String GUIlore : plugin.getConfig().getStringList("ArmorSet1.GUILore")) {
					armorSet1zLore.add(ChatColor.translateAlternateColorCodes('&', GUIlore));
				}
			}
			armorSet1zMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
			armorSet1zMeta.addEnchant(Enchantment.DURABILITY, 3, true);
			armorSet1zMeta.setLore(armorSet1zLore);
			armorSet1z.setItemMeta(armorSet1zMeta);
			// End code for first armor set
			// -------------------------------------------------------------------------

			// -------------------------------------------------------------------------
			// Code for second armor set
			ItemStack armorSet2 = new ItemStack(Material.DIAMOND_BOOTS, 1);
			ItemMeta armorSet2Meta = armorSet2.getItemMeta();
			List<String> armorSet2Lore = new ArrayList<>();
			armorSet2Lore.add(" ");
			armorSet2Lore.add(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet2.UniqueName")));
			for (String lore : plugin.getConfig().getStringList("ArmorSet2.Lore")) {
				armorSet2Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			if (!(F.funded())) {
				for (String FundedLore : ((Main) plugin).getFund().getStringList("NotFundedGUI.Lore")) {
					armorSet2Lore.add(ChatColor.translateAlternateColorCodes('&', FundedLore).replace("%percentFunded%",
							String.valueOf(F.percentFunded())));
				}
			} else {
				for (String GUIlore : plugin.getConfig().getStringList("ArmorSet2.GUILore")) {
					armorSet2Lore.add(ChatColor.translateAlternateColorCodes('&', GUIlore));
				}
			}
			armorSet2Meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
			armorSet2Meta.addEnchant(Enchantment.DURABILITY, 3, true);
			armorSet2Meta.setLore(armorSet2Lore);
			armorSet2.setItemMeta(armorSet2Meta);

			ItemStack armorSet2x = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
			ItemMeta armorSet2xMeta = armorSet2x.getItemMeta();
			List<String> armorSet2xLore = new ArrayList<>();
			armorSet2xLore.add(" ");
			armorSet2xLore.add(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet2.UniqueName")));
			for (String lore : plugin.getConfig().getStringList("ArmorSet2.Lore")) {
				armorSet2xLore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			if (!(F.funded())) {
				for (String FundedLore : ((Main) plugin).getFund().getStringList("NotFundedGUI.Lore")) {
					armorSet2xLore.add(ChatColor.translateAlternateColorCodes('&', FundedLore)
							.replace("%percentFunded%", String.valueOf(F.percentFunded())));
				}
			} else {
				for (String GUIlore : plugin.getConfig().getStringList("ArmorSet2.GUILore")) {
					armorSet2xLore.add(ChatColor.translateAlternateColorCodes('&', GUIlore));
				}
			}
			armorSet2xMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
			armorSet2xMeta.addEnchant(Enchantment.DURABILITY, 3, true);
			armorSet2xMeta.setLore(armorSet2xLore);
			armorSet2x.setItemMeta(armorSet2xMeta);

			ItemStack armorSet2y = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
			ItemMeta armorSet2yMeta = armorSet2y.getItemMeta();
			List<String> armorSet2yLore = new ArrayList<>();
			armorSet2yLore.add(" ");
			armorSet2yLore.add(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet2.UniqueName")));
			for (String lore : plugin.getConfig().getStringList("ArmorSet2.Lore")) {
				armorSet2yLore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			if (!(F.funded())) {
				for (String FundedLore : ((Main) plugin).getFund().getStringList("NotFundedGUI.Lore")) {
					armorSet2yLore.add(ChatColor.translateAlternateColorCodes('&', FundedLore)
							.replace("%percentFunded%", String.valueOf(F.percentFunded())));
				}
			} else {
				for (String GUIlore : plugin.getConfig().getStringList("ArmorSet2.GUILore")) {
					armorSet2yLore.add(ChatColor.translateAlternateColorCodes('&', GUIlore));
				}
			}
			armorSet2yMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
			armorSet2yMeta.addEnchant(Enchantment.DURABILITY, 3, true);
			armorSet2yMeta.setLore(armorSet2yLore);
			armorSet2y.setItemMeta(armorSet2yMeta);

			ItemStack armorSet2z = new ItemStack(Material.DIAMOND_HELMET, 1);
			ItemMeta armorSet2zMeta = armorSet2z.getItemMeta();
			List<String> armorSet2zLore = new ArrayList<>();
			armorSet2zLore.add(" ");
			armorSet2zLore.add(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet2.UniqueName")));
			for (String lore : plugin.getConfig().getStringList("ArmorSet2.Lore")) {
				armorSet2zLore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			if (!(F.funded())) {
				for (String FundedLore : ((Main) plugin).getFund().getStringList("NotFundedGUI.Lore")) {
					armorSet2zLore.add(ChatColor.translateAlternateColorCodes('&', FundedLore)
							.replace("%percentFunded%", String.valueOf(F.percentFunded())));
				}
			} else {
				for (String GUIlore : plugin.getConfig().getStringList("ArmorSet2.GUILore")) {
					armorSet2zLore.add(ChatColor.translateAlternateColorCodes('&', GUIlore));
				}
			}
			armorSet2zMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
			armorSet2zMeta.addEnchant(Enchantment.DURABILITY, 3, true);
			armorSet2zMeta.setLore(armorSet2zLore);
			armorSet2z.setItemMeta(armorSet2zMeta);
			// End code for second armor set
			// -------------------------------------------------------------------------

			// -------------------------------------------------------------------------
			// Code for third armor set
			ItemStack armorSet3 = new ItemStack(Material.DIAMOND_BOOTS, 1);
			ItemMeta armorSet3Meta = armorSet3.getItemMeta();
			List<String> armorSet3Lore = new ArrayList<>();
			armorSet3Lore.add(" ");
			armorSet3Lore.add(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet3.UniqueName")));
			for (String lore : plugin.getConfig().getStringList("ArmorSet3.Lore")) {
				armorSet3Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			if (!(F.funded())) {
				for (String FundedLore : ((Main) plugin).getFund().getStringList("NotFundedGUI.Lore")) {
					armorSet3Lore.add(ChatColor.translateAlternateColorCodes('&', FundedLore).replace("%percentFunded%",
							String.valueOf(F.percentFunded())));
				}
			} else {
				for (String GUIlore : plugin.getConfig().getStringList("ArmorSet3.GUILore")) {
					armorSet3Lore.add(ChatColor.translateAlternateColorCodes('&', GUIlore));
				}
			}
			armorSet3Meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
			armorSet3Meta.addEnchant(Enchantment.DURABILITY, 3, true);
			armorSet3Meta.setLore(armorSet3Lore);
			armorSet3.setItemMeta(armorSet3Meta);

			ItemStack armorSet3x = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
			ItemMeta armorSet3xMeta = armorSet3x.getItemMeta();
			List<String> armorSet3xLore = new ArrayList<>();
			armorSet3xLore.add(" ");
			armorSet3xLore.add(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet3.UniqueName")));
			for (String lore : plugin.getConfig().getStringList("ArmorSet3.Lore")) {
				armorSet3xLore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			if (!(F.funded())) {
				for (String FundedLore : ((Main) plugin).getFund().getStringList("NotFundedGUI.Lore")) {
					armorSet3xLore.add(ChatColor.translateAlternateColorCodes('&', FundedLore)
							.replace("%percentFunded%", String.valueOf(F.percentFunded())));
				}
			} else {
				for (String GUIlore : plugin.getConfig().getStringList("ArmorSet3.GUILore")) {
					armorSet3xLore.add(ChatColor.translateAlternateColorCodes('&', GUIlore));
				}
			}
			armorSet3xMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
			armorSet3xMeta.addEnchant(Enchantment.DURABILITY, 3, true);
			armorSet3xMeta.setLore(armorSet3xLore);
			armorSet3x.setItemMeta(armorSet3xMeta);

			ItemStack armorSet3y = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
			ItemMeta armorSet3yMeta = armorSet3y.getItemMeta();
			List<String> armorSet3yLore = new ArrayList<>();
			armorSet3yLore.add(" ");
			armorSet3yLore.add(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet3.UniqueName")));
			for (String lore : plugin.getConfig().getStringList("ArmorSet3.Lore")) {
				armorSet3yLore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			if (!(F.funded())) {
				for (String FundedLore : ((Main) plugin).getFund().getStringList("NotFundedGUI.Lore")) {
					armorSet3yLore.add(ChatColor.translateAlternateColorCodes('&', FundedLore)
							.replace("%percentFunded%", String.valueOf(F.percentFunded())));
				}
			} else {
				for (String GUIlore : plugin.getConfig().getStringList("ArmorSet3.GUILore")) {
					armorSet3yLore.add(ChatColor.translateAlternateColorCodes('&', GUIlore));
				}
			}
			armorSet3yMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
			armorSet3yMeta.addEnchant(Enchantment.DURABILITY, 3, true);
			armorSet3yMeta.setLore(armorSet3yLore);
			armorSet3y.setItemMeta(armorSet3yMeta);

			ItemStack armorSet3z = new ItemStack(Material.DIAMOND_HELMET, 1);
			ItemMeta armorSet3zMeta = armorSet3z.getItemMeta();
			List<String> armorSet3zLore = new ArrayList<>();
			armorSet3zLore.add(" ");
			armorSet3zLore.add(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet3.UniqueName")));
			for (String lore : plugin.getConfig().getStringList("ArmorSet3.Lore")) {
				armorSet3zLore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			if (!(F.funded())) {
				for (String FundedLore : ((Main) plugin).getFund().getStringList("NotFundedGUI.Lore")) {
					armorSet3zLore.add(ChatColor.translateAlternateColorCodes('&', FundedLore)
							.replace("%percentFunded%", String.valueOf(F.percentFunded())));
				}
			} else {
				for (String GUIlore : plugin.getConfig().getStringList("ArmorSet3.GUILore")) {
					armorSet3zLore.add(ChatColor.translateAlternateColorCodes('&', GUIlore));
				}
			}
			armorSet3zMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
			armorSet3zMeta.addEnchant(Enchantment.DURABILITY, 3, true);
			armorSet3zMeta.setLore(armorSet3zLore);
			armorSet3z.setItemMeta(armorSet3zMeta);
			// End code for third armor set
			// -------------------------------------------------------------------------

			// -------------------------------------------------------------------------
			// Code for fourth armor set
			ItemStack armorSet4 = new ItemStack(Material.DIAMOND_BOOTS, 1);
			ItemMeta armorSet4Meta = armorSet4.getItemMeta();
			List<String> armorSet4Lore = new ArrayList<>();
			armorSet4Lore.add(" ");
			armorSet4Lore.add(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet4.UniqueName")));
			for (String lore : plugin.getConfig().getStringList("ArmorSet4.Lore")) {
				armorSet4Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			if (!(F.funded())) {
				for (String FundedLore : ((Main) plugin).getFund().getStringList("NotFundedGUI.Lore")) {
					armorSet4Lore.add(ChatColor.translateAlternateColorCodes('&', FundedLore).replace("%percentFunded%",
							String.valueOf(F.percentFunded())));
				}
			} else {
				for (String GUIlore : plugin.getConfig().getStringList("ArmorSet4.GUILore")) {
					armorSet4Lore.add(ChatColor.translateAlternateColorCodes('&', GUIlore));
				}
			}
			armorSet4Meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
			armorSet4Meta.addEnchant(Enchantment.DURABILITY, 3, true);
			armorSet4Meta.setLore(armorSet4Lore);
			armorSet4.setItemMeta(armorSet4Meta);

			ItemStack armorSet4x = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
			ItemMeta armorSet4xMeta = armorSet4x.getItemMeta();
			List<String> armorSet4xLore = new ArrayList<>();
			armorSet4xLore.add(" ");
			armorSet4xLore.add(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet4.UniqueName")));
			for (String lore : plugin.getConfig().getStringList("ArmorSet4.Lore")) {
				armorSet4xLore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			if (!(F.funded())) {
				for (String FundedLore : ((Main) plugin).getFund().getStringList("NotFundedGUI.Lore")) {
					armorSet4xLore.add(ChatColor.translateAlternateColorCodes('&', FundedLore)
							.replace("%percentFunded%", String.valueOf(F.percentFunded())));
				}
			} else {
				for (String GUIlore : plugin.getConfig().getStringList("ArmorSet4.GUILore")) {
					armorSet4xLore.add(ChatColor.translateAlternateColorCodes('&', GUIlore));
				}
			}
			armorSet4xMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
			armorSet4xMeta.addEnchant(Enchantment.DURABILITY, 3, true);
			armorSet4xMeta.setLore(armorSet4xLore);
			armorSet4x.setItemMeta(armorSet4xMeta);

			ItemStack armorSet4y = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
			ItemMeta armorSet4yMeta = armorSet4y.getItemMeta();
			List<String> armorSet4yLore = new ArrayList<>();
			armorSet4yLore.add(" ");
			armorSet4yLore.add(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet4.UniqueName")));
			for (String lore : plugin.getConfig().getStringList("ArmorSet4.Lore")) {
				armorSet4yLore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			if (!(F.funded())) {
				for (String FundedLore : ((Main) plugin).getFund().getStringList("NotFundedGUI.Lore")) {
					armorSet4yLore.add(ChatColor.translateAlternateColorCodes('&', FundedLore)
							.replace("%percentFunded%", String.valueOf(F.percentFunded())));
				}
			} else {
				for (String GUIlore : plugin.getConfig().getStringList("ArmorSet4.GUILore")) {
					armorSet4yLore.add(ChatColor.translateAlternateColorCodes('&', GUIlore));
				}
			}
			armorSet4yMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
			armorSet4yMeta.addEnchant(Enchantment.DURABILITY, 3, true);
			armorSet4yMeta.setLore(armorSet4yLore);
			armorSet4y.setItemMeta(armorSet4yMeta);

			ItemStack armorSet4z = new ItemStack(Material.DIAMOND_HELMET, 1);
			ItemMeta armorSet4zMeta = armorSet4z.getItemMeta();
			List<String> armorSet4zLore = new ArrayList<>();
			armorSet4zLore.add(" ");
			armorSet4zLore.add(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet4.UniqueName")));
			for (String lore : plugin.getConfig().getStringList("ArmorSet4.Lore")) {
				armorSet4zLore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			if (!(F.funded())) {
				for (String FundedLore : ((Main) plugin).getFund().getStringList("NotFundedGUI.Lore")) {
					armorSet4zLore.add(ChatColor.translateAlternateColorCodes('&', FundedLore)
							.replace("%percentFunded%", String.valueOf(F.percentFunded())));
				}
			} else {
				for (String GUIlore : plugin.getConfig().getStringList("ArmorSet4.GUILore")) {
					armorSet4zLore.add(ChatColor.translateAlternateColorCodes('&', GUIlore));
				}
			}
			armorSet4zMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
			armorSet4zMeta.addEnchant(Enchantment.DURABILITY, 3, true);
			armorSet4zMeta.setLore(armorSet4zLore);
			armorSet4z.setItemMeta(armorSet4zMeta);
			// End code for fourth armor set
			// -------------------------------------------------------------------------
			
			// -------------------------------------------------------------------------
			// Code for fourth armor set
			ItemStack armorSet5 = new ItemStack(Material.DIAMOND_BOOTS, 1);
			ItemMeta armorSet5Meta = armorSet5.getItemMeta();
			List<String> armorSet5Lore = new ArrayList<>();
			armorSet5Lore.add(" ");
			armorSet5Lore.add(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet5.UniqueName")));
			for (String lore : plugin.getConfig().getStringList("ArmorSet5.Lore")) {
				armorSet5Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			if (!(F.funded())) {
				for (String FundedLore : ((Main) plugin).getFund().getStringList("NotFundedGUI.Lore")) {
					armorSet5Lore.add(ChatColor.translateAlternateColorCodes('&', FundedLore).replace("%percentFunded%",
							String.valueOf(F.percentFunded())));
				}
			} else {
				for (String GUIlore : plugin.getConfig().getStringList("ArmorSet5.GUILore")) {
					armorSet5Lore.add(ChatColor.translateAlternateColorCodes('&', GUIlore));
				}
			}
			armorSet5Meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
			armorSet5Meta.addEnchant(Enchantment.DURABILITY, 3, true);
			armorSet5Meta.setLore(armorSet5Lore);
			armorSet5.setItemMeta(armorSet5Meta);

			ItemStack armorSet5x = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
			ItemMeta armorSet5xMeta = armorSet5x.getItemMeta();
			List<String> armorSet5xLore = new ArrayList<>();
			armorSet5xLore.add(" ");
			armorSet5xLore.add(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet5.UniqueName")));
			for (String lore : plugin.getConfig().getStringList("ArmorSet5.Lore")) {
				armorSet5xLore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			if (!(F.funded())) {
				for (String FundedLore : ((Main) plugin).getFund().getStringList("NotFundedGUI.Lore")) {
					armorSet5xLore.add(ChatColor.translateAlternateColorCodes('&', FundedLore)
							.replace("%percentFunded%", String.valueOf(F.percentFunded())));
				}
			} else {
				for (String GUIlore : plugin.getConfig().getStringList("ArmorSet5.GUILore")) {
					armorSet5xLore.add(ChatColor.translateAlternateColorCodes('&', GUIlore));
				}
			}
			armorSet5xMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
			armorSet5xMeta.addEnchant(Enchantment.DURABILITY, 3, true);
			armorSet5xMeta.setLore(armorSet5xLore);
			armorSet5x.setItemMeta(armorSet5xMeta);

			ItemStack armorSet5y = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
			ItemMeta armorSet5yMeta = armorSet5y.getItemMeta();
			List<String> armorSet5yLore = new ArrayList<>();
			armorSet5yLore.add(" ");
			armorSet5yLore.add(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet5.UniqueName")));
			for (String lore : plugin.getConfig().getStringList("ArmorSet5.Lore")) {
				armorSet5yLore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			if (!(F.funded())) {
				for (String FundedLore : ((Main) plugin).getFund().getStringList("NotFundedGUI.Lore")) {
					armorSet5yLore.add(ChatColor.translateAlternateColorCodes('&', FundedLore)
							.replace("%percentFunded%", String.valueOf(F.percentFunded())));
				}
			} else {
				for (String GUIlore : plugin.getConfig().getStringList("ArmorSet5.GUILore")) {
					armorSet5yLore.add(ChatColor.translateAlternateColorCodes('&', GUIlore));
				}
			}
			armorSet5yMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
			armorSet5yMeta.addEnchant(Enchantment.DURABILITY, 3, true);
			armorSet5yMeta.setLore(armorSet5yLore);
			armorSet5y.setItemMeta(armorSet5yMeta);

			ItemStack armorSet5z = new ItemStack(Material.DIAMOND_HELMET, 1);
			ItemMeta armorSet5zMeta = armorSet5z.getItemMeta();
			List<String> armorSet5zLore = new ArrayList<>();
			armorSet5zLore.add(" ");
			armorSet5zLore.add(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ArmorSet5.UniqueName")));
			for (String lore : plugin.getConfig().getStringList("ArmorSet5.Lore")) {
				armorSet5zLore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			if (!(F.funded())) {
				for (String FundedLore : ((Main) plugin).getFund().getStringList("NotFundedGUI.Lore")) {
					armorSet5zLore.add(ChatColor.translateAlternateColorCodes('&', FundedLore)
							.replace("%percentFunded%", String.valueOf(F.percentFunded())));
				}
			} else {
				for (String GUIlore : plugin.getConfig().getStringList("ArmorSet5.GUILore")) {
					armorSet5zLore.add(ChatColor.translateAlternateColorCodes('&', GUIlore));
				}
			}
			armorSet5zMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
			armorSet5zMeta.addEnchant(Enchantment.DURABILITY, 3, true);
			armorSet5zMeta.setLore(armorSet5zLore);
			armorSet5z.setItemMeta(armorSet5zMeta);
			// End code for fourth armor set
			// -------------------------------------------------------------------------

			// -------------------------------------------------------------------------
			// Code for custom enchantment book 1
			ItemStack ceBook1 = new ItemStack(Material.BOOK, 1);
			ItemMeta ceBook1Meta = ceBook1.getItemMeta();
			ceBook1Meta.setDisplayName(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ceBook1.Name")));
			List<String> ceBook1Lore = new ArrayList<>();
			for (String lore : plugin.getConfig().getStringList("ceBook1.Lore")) {
				ceBook1Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			ceBook1Meta.addEnchant(Enchantment.LURE, 10, true);
			ceBook1Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ceBook1Meta.setLore(ceBook1Lore);
			ceBook1.setItemMeta(ceBook1Meta);

			// Code for custom enchantment book 2
			ItemStack ceBook2 = new ItemStack(Material.BOOK, 1);
			ItemMeta ceBook2Meta = ceBook2.getItemMeta();
			ceBook2Meta.setDisplayName(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ceBook2.Name")));
			List<String> ceBook2Lore = new ArrayList<>();
			for (String lore : plugin.getConfig().getStringList("ceBook2.Lore")) {
				ceBook2Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			ceBook2Meta.addEnchant(Enchantment.LURE, 10, true);
			ceBook2Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ceBook2Meta.setLore(ceBook2Lore);
			ceBook2.setItemMeta(ceBook2Meta);

			// Code for custom enchantment book 3
			ItemStack ceBook3 = new ItemStack(Material.BOOK, 1);
			ItemMeta ceBook3Meta = ceBook3.getItemMeta();
			ceBook3Meta.setDisplayName(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ceBook3.Name")));
			List<String> ceBook3Lore = new ArrayList<>();
			for (String lore : plugin.getConfig().getStringList("ceBook3.Lore")) {
				ceBook3Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			ceBook3Meta.addEnchant(Enchantment.LURE, 10, true);
			ceBook3Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ceBook3Meta.setLore(ceBook3Lore);
			ceBook3.setItemMeta(ceBook3Meta);

			// Code for custom enchantment book 4
			ItemStack ceBook4 = new ItemStack(Material.BOOK, 1);
			ItemMeta ceBook4Meta = ceBook4.getItemMeta();
			ceBook4Meta.setDisplayName(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ceBook4.Name")));
			List<String> ceBook4Lore = new ArrayList<>();
			for (String lore : plugin.getConfig().getStringList("ceBook4.Lore")) {
				ceBook4Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			ceBook4Meta.addEnchant(Enchantment.LURE, 10, true);
			ceBook4Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ceBook4Meta.setLore(ceBook4Lore);
			ceBook4.setItemMeta(ceBook4Meta);

			// Code for custom enchantment book 5
			ItemStack ceBook5 = new ItemStack(Material.BOOK, 1);
			ItemMeta ceBook5Meta = ceBook5.getItemMeta();
			ceBook5Meta.setDisplayName(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ceBook5.Name")));
			List<String> ceBook5Lore = new ArrayList<>();
			for (String lore : plugin.getConfig().getStringList("ceBook5.Lore")) {
				ceBook5Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			ceBook5Meta.addEnchant(Enchantment.LURE, 10, true);
			ceBook5Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ceBook5Meta.setLore(ceBook5Lore);
			ceBook5.setItemMeta(ceBook5Meta);

			// Code for custom enchantment book 6
			ItemStack ceBook6 = new ItemStack(Material.BOOK, 1);
			ItemMeta ceBook6Meta = ceBook6.getItemMeta();
			ceBook6Meta.setDisplayName(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ceBook6.Name")));
			List<String> ceBook6Lore = new ArrayList<>();
			for (String lore : plugin.getConfig().getStringList("ceBook6.Lore")) {
				ceBook6Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			ceBook6Meta.addEnchant(Enchantment.LURE, 10, true);
			ceBook6Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ceBook6Meta.setLore(ceBook6Lore);
			ceBook6.setItemMeta(ceBook6Meta);

			// Code for custom enchantment book 7
			ItemStack ceBook7 = new ItemStack(Material.BOOK, 1);
			ItemMeta ceBook7Meta = ceBook7.getItemMeta();
			ceBook7Meta.setDisplayName(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ceBook7.Name")));
			List<String> ceBook7Lore = new ArrayList<>();
			for (String lore : plugin.getConfig().getStringList("ceBook7.Lore")) {
				ceBook7Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			ceBook7Meta.addEnchant(Enchantment.LURE, 10, true);
			ceBook7Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ceBook7Meta.setLore(ceBook7Lore);
			ceBook7.setItemMeta(ceBook7Meta);

			// Code for custom enchantment book 8
			ItemStack ceBook8 = new ItemStack(Material.BOOK, 1);
			ItemMeta ceBook8Meta = ceBook8.getItemMeta();
			ceBook8Meta.setDisplayName(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ceBook8.Name")));
			List<String> ceBook8Lore = new ArrayList<>();
			for (String lore : plugin.getConfig().getStringList("ceBook8.Lore")) {
				ceBook8Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			ceBook8Meta.addEnchant(Enchantment.LURE, 10, true);
			ceBook8Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ceBook8Meta.setLore(ceBook8Lore);
			ceBook8.setItemMeta(ceBook8Meta);

			// Code for custom enchantment book 9
			ItemStack ceBook9 = new ItemStack(Material.BOOK, 1);
			ItemMeta ceBook9Meta = ceBook9.getItemMeta();
			ceBook9Meta.setDisplayName(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ceBook9.Name")));
			List<String> ceBook9Lore = new ArrayList<>();
			for (String lore : plugin.getConfig().getStringList("ceBook9.Lore")) {
				ceBook9Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			ceBook9Meta.addEnchant(Enchantment.LURE, 10, true);
			ceBook9Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ceBook9Meta.setLore(ceBook9Lore);
			ceBook9.setItemMeta(ceBook9Meta);

			// Code for custom enchantment book 10
			ItemStack ceBook10 = new ItemStack(Material.BOOK, 1);
			ItemMeta ceBook10Meta = ceBook10.getItemMeta();
			ceBook10Meta.setDisplayName(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ceBook10.Name")));
			List<String> ceBook10Lore = new ArrayList<>();
			for (String lore : plugin.getConfig().getStringList("ceBook10.Lore")) {
				ceBook10Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			ceBook10Meta.addEnchant(Enchantment.LURE, 10, true);
			ceBook10Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ceBook10Meta.setLore(ceBook10Lore);
			ceBook10.setItemMeta(ceBook10Meta);

			// Code for custom enchantment book 11
			ItemStack ceBook11 = new ItemStack(Material.BOOK, 1);
			ItemMeta ceBook11Meta = ceBook11.getItemMeta();
			ceBook11Meta.setDisplayName(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ceBook11.Name")));
			List<String> ceBook11Lore = new ArrayList<>();
			for (String lore : plugin.getConfig().getStringList("ceBook11.Lore")) {
				ceBook11Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			ceBook11Meta.addEnchant(Enchantment.LURE, 10, true);
			ceBook11Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ceBook11Meta.setLore(ceBook11Lore);
			ceBook11.setItemMeta(ceBook11Meta);

			// Code for custom enchantment book 12
			ItemStack ceBook12 = new ItemStack(Material.BOOK, 1);
			ItemMeta ceBook12Meta = ceBook12.getItemMeta();
			ceBook12Meta.setDisplayName(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ceBook12.Name")));
			List<String> ceBook12Lore = new ArrayList<>();
			for (String lore : plugin.getConfig().getStringList("ceBook12.Lore")) {
				ceBook12Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			ceBook12Meta.addEnchant(Enchantment.LURE, 10, true);
			ceBook12Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ceBook12Meta.setLore(ceBook12Lore);
			ceBook12.setItemMeta(ceBook12Meta);

			// Code for custom enchantment book 13
			ItemStack ceBook13 = new ItemStack(Material.BOOK, 1);
			ItemMeta ceBook13Meta = ceBook13.getItemMeta();
			ceBook13Meta.setDisplayName(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ceBook13.Name")));
			List<String> ceBook13Lore = new ArrayList<>();
			for (String lore : plugin.getConfig().getStringList("ceBook13.Lore")) {
				ceBook13Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			ceBook13Meta.addEnchant(Enchantment.LURE, 10, true);
			ceBook13Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ceBook13Meta.setLore(ceBook13Lore);
			ceBook13.setItemMeta(ceBook13Meta);

			// Code for custom enchantment book 14
			ItemStack ceBook14 = new ItemStack(Material.BOOK, 1);
			ItemMeta ceBook14Meta = ceBook14.getItemMeta();
			ceBook14Meta.setDisplayName(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ceBook14.Name")));
			List<String> ceBook14Lore = new ArrayList<>();
			for (String lore : plugin.getConfig().getStringList("ceBook14.Lore")) {
				ceBook14Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			ceBook14Meta.addEnchant(Enchantment.LURE, 10, true);
			ceBook14Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ceBook14Meta.setLore(ceBook14Lore);
			ceBook14.setItemMeta(ceBook14Meta);

			// Code for custom enchantment book 15
			ItemStack ceBook15 = new ItemStack(Material.BOOK, 1);
			ItemMeta ceBook15Meta = ceBook15.getItemMeta();
			ceBook15Meta.setDisplayName(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ceBook15.Name")));
			List<String> ceBook15Lore = new ArrayList<>();
			for (String lore : plugin.getConfig().getStringList("ceBook15.Lore")) {
				ceBook15Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			ceBook15Meta.addEnchant(Enchantment.LURE, 10, true);
			ceBook15Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ceBook15Meta.setLore(ceBook15Lore);
			ceBook15.setItemMeta(ceBook15Meta);

			// Code for custom enchantment book 16
			ItemStack ceBook16 = new ItemStack(Material.BOOK, 1);
			ItemMeta ceBook16Meta = ceBook16.getItemMeta();
			ceBook16Meta.setDisplayName(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ceBook16.Name")));
			List<String> ceBook16Lore = new ArrayList<>();
			for (String lore : plugin.getConfig().getStringList("ceBook16.Lore")) {
				ceBook16Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			ceBook16Meta.addEnchant(Enchantment.LURE, 10, true);
			ceBook16Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ceBook16Meta.setLore(ceBook16Lore);
			ceBook16.setItemMeta(ceBook16Meta);

			// Code for custom enchantment book 17
			ItemStack ceBook17 = new ItemStack(Material.BOOK, 1);
			ItemMeta ceBook17Meta = ceBook17.getItemMeta();
			ceBook17Meta.setDisplayName(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ceBook17.Name")));
			List<String> ceBook17Lore = new ArrayList<>();
			for (String lore : plugin.getConfig().getStringList("ceBook17.Lore")) {
				ceBook17Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			ceBook17Meta.addEnchant(Enchantment.LURE, 10, true);
			ceBook17Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ceBook17Meta.setLore(ceBook17Lore);
			ceBook17.setItemMeta(ceBook17Meta);

			// Code for custom enchantment book 18
			ItemStack ceBook18 = new ItemStack(Material.BOOK, 1);
			ItemMeta ceBook18Meta = ceBook18.getItemMeta();
			ceBook18Meta.setDisplayName(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ceBook18.Name")));
			List<String> ceBook18Lore = new ArrayList<>();
			for (String lore : plugin.getConfig().getStringList("ceBook18.Lore")) {
				ceBook18Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			ceBook18Meta.addEnchant(Enchantment.LURE, 10, true);
			ceBook18Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ceBook18Meta.setLore(ceBook18Lore);
			ceBook18.setItemMeta(ceBook18Meta);

			// Code for custom enchantment book 19
			ItemStack ceBook19 = new ItemStack(Material.BOOK, 1);
			ItemMeta ceBook19Meta = ceBook19.getItemMeta();
			ceBook19Meta.setDisplayName(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ceBook19.Name")));
			List<String> ceBook19Lore = new ArrayList<>();
			for (String lore : plugin.getConfig().getStringList("ceBook19.Lore")) {
				ceBook19Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			ceBook19Meta.addEnchant(Enchantment.LURE, 10, true);
			ceBook19Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ceBook19Meta.setLore(ceBook19Lore);
			ceBook19.setItemMeta(ceBook19Meta);

			// Code for custom enchantment book 20
			ItemStack ceBook20 = new ItemStack(Material.BOOK, 1);
			ItemMeta ceBook20Meta = ceBook20.getItemMeta();
			ceBook20Meta.setDisplayName(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ceBook20.Name")));
			List<String> ceBook20Lore = new ArrayList<>();
			for (String lore : plugin.getConfig().getStringList("ceBook20.Lore")) {
				ceBook20Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			ceBook20Meta.addEnchant(Enchantment.LURE, 10, true);
			ceBook20Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ceBook20Meta.setLore(ceBook20Lore);
			ceBook20.setItemMeta(ceBook20Meta);

			// Code for custom enchantment book 21
			ItemStack ceBook21 = new ItemStack(Material.BOOK, 1);
			ItemMeta ceBook21Meta = ceBook21.getItemMeta();
			ceBook21Meta.setDisplayName(
					ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ceBook21.Name")));
			List<String> ceBook21Lore = new ArrayList<>();
			for (String lore : plugin.getConfig().getStringList("ceBook21.Lore")) {
				ceBook21Lore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			ceBook21Meta.addEnchant(Enchantment.LURE, 10, true);
			ceBook21Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			ceBook21Meta.setLore(ceBook21Lore);
			ceBook21.setItemMeta(ceBook21Meta);
			// End code for custom enchantment books
			// -------------------------------------------------------------------------

			if (plugin.getConfig().getBoolean("ArmorSet1.Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("ArmorSet1.HelmetSlotInGUI"), armorSet1z);
				i.setItem(plugin.getConfig().getInt("ArmorSet1.ChestplateSlotInGUI"), armorSet1y);
				i.setItem(plugin.getConfig().getInt("ArmorSet1.LeggingsSlotInGUI"), armorSet1x);
				i.setItem(plugin.getConfig().getInt("ArmorSet1.BootsSlotInGUI"), armorSet1);
			}

			if (plugin.getConfig().getBoolean("ArmorSet2.Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("ArmorSet2.HelmetSlotInGUI"), armorSet2z);
				i.setItem(plugin.getConfig().getInt("ArmorSet2.ChestplateSlotInGUI"), armorSet2y);
				i.setItem(plugin.getConfig().getInt("ArmorSet2.LeggingsSlotInGUI"), armorSet2x);
				i.setItem(plugin.getConfig().getInt("ArmorSet2.BootsSlotInGUI"), armorSet2);
			}

			if (plugin.getConfig().getBoolean("ArmorSet3.Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("ArmorSet3.HelmetSlotInGUI"), armorSet3z);
				i.setItem(plugin.getConfig().getInt("ArmorSet3.ChestplateSlotInGUI"), armorSet3y);
				i.setItem(plugin.getConfig().getInt("ArmorSet3.LeggingsSlotInGUI"), armorSet3x);
				i.setItem(plugin.getConfig().getInt("ArmorSet3.BootsSlotInGUI"), armorSet3);
			}

			if (plugin.getConfig().getBoolean("ArmorSet4.Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("ArmorSet4.HelmetSlotInGUI"), armorSet4z);
				i.setItem(plugin.getConfig().getInt("ArmorSet4.ChestplateSlotInGUI"), armorSet4y);
				i.setItem(plugin.getConfig().getInt("ArmorSet4.LeggingsSlotInGUI"), armorSet4x);
				i.setItem(plugin.getConfig().getInt("ArmorSet4.BootsSlotInGUI"), armorSet4);
			}
			
			if (plugin.getConfig().getBoolean("ArmorSet5.Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("ArmorSet5.HelmetSlotInGUI"), armorSet5z);
				i.setItem(plugin.getConfig().getInt("ArmorSet5.ChestplateSlotInGUI"), armorSet5y);
				i.setItem(plugin.getConfig().getInt("ArmorSet5.LeggingsSlotInGUI"), armorSet5x);
				i.setItem(plugin.getConfig().getInt("ArmorSet5.BootsSlotInGUI"), armorSet5);
			}

			if (plugin.getConfig().getBoolean("ceBook1.Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("ceBook1.SlotInGUI"), ceBook1);
			}
			if (plugin.getConfig().getBoolean("ceBook2.Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("ceBook2.SlotInGUI"), ceBook2);
			}
			if (plugin.getConfig().getBoolean("ceBook3.Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("ceBook3.SlotInGUI"), ceBook3);
			}
			if (plugin.getConfig().getBoolean("ceBook4.Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("ceBook4.SlotInGUI"), ceBook4);
			}
			if (plugin.getConfig().getBoolean("ceBook5.Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("ceBook5.SlotInGUI"), ceBook5);
			}
			if (plugin.getConfig().getBoolean("ceBook6.Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("ceBook6.SlotInGUI"), ceBook6);
			}
			if (plugin.getConfig().getBoolean("ceBook7.Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("ceBook7.SlotInGUI"), ceBook7);
			}
			if (plugin.getConfig().getBoolean("ceBook8.Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("ceBook8.SlotInGUI"), ceBook8);
			}
			if (plugin.getConfig().getBoolean("ceBook9.Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("ceBook9.SlotInGUI"), ceBook9);
			}
			if (plugin.getConfig().getBoolean("ceBook10.Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("ceBook10.SlotInGUI"), ceBook10);
			}
			if (plugin.getConfig().getBoolean("ceBook11.Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("ceBook11.SlotInGUI"), ceBook11);
			}
			if (plugin.getConfig().getBoolean("ceBook12.Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("ceBook12.SlotInGUI"), ceBook12);
			}
			if (plugin.getConfig().getBoolean("ceBook13.Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("ceBook13.SlotInGUI"), ceBook13);
			}
			if (plugin.getConfig().getBoolean("ceBook14.Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("ceBook14.SlotInGUI"), ceBook14);
			}
			if (plugin.getConfig().getBoolean("ceBook15.Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("ceBook15.SlotInGUI"), ceBook15);
			}
			if (plugin.getConfig().getBoolean("ceBook16.Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("ceBook16.SlotInGUI"), ceBook16);
			}
			if (plugin.getConfig().getBoolean("ceBook17.Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("ceBook17.SlotInGUI"), ceBook17);
			}
			if (plugin.getConfig().getBoolean("ceBook18.Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("ceBook18.SlotInGUI"), ceBook18);
			}
			if (plugin.getConfig().getBoolean("ceBook19.Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("ceBook19.SlotInGUI"), ceBook19);
			}
			if (plugin.getConfig().getBoolean("ceBook20.Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("ceBook20.SlotInGUI"), ceBook20);
			}
			if (plugin.getConfig().getBoolean("ceBook21.Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("ceBook21.SlotInGUI"), ceBook21);
			}

			if (plugin.getConfig().getBoolean("FillerGlass1Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("FillerGlass1GUISlot1"), filler1);
				i.setItem(plugin.getConfig().getInt("FillerGlass1GUISlot2"), filler1);
				i.setItem(plugin.getConfig().getInt("FillerGlass1GUISlot3"), filler1);
				i.setItem(plugin.getConfig().getInt("FillerGlass1GUISlot4"), filler1);
				i.setItem(plugin.getConfig().getInt("FillerGlass1GUISlot5"), filler1);
				i.setItem(plugin.getConfig().getInt("FillerGlass1GUISlot6"), filler1);
				i.setItem(plugin.getConfig().getInt("FillerGlass1GUISlot7"), filler1);
				i.setItem(plugin.getConfig().getInt("FillerGlass1GUISlot8"), filler1);
				i.setItem(plugin.getConfig().getInt("FillerGlass1GUISlot9"), filler1);
				i.setItem(plugin.getConfig().getInt("FillerGlass1GUISlot10"), filler1);
				i.setItem(plugin.getConfig().getInt("FillerGlass1GUISlot11"), filler1);
				i.setItem(plugin.getConfig().getInt("FillerGlass1GUISlot12"), filler1);
				i.setItem(plugin.getConfig().getInt("FillerGlass1GUISlot13"), filler1);
				i.setItem(plugin.getConfig().getInt("FillerGlass1GUISlot14"), filler1);
				i.setItem(plugin.getConfig().getInt("FillerGlass1GUISlot15"), filler1);
				i.setItem(plugin.getConfig().getInt("FillerGlass1GUISlot16"), filler1);
				i.setItem(plugin.getConfig().getInt("FillerGlass1GUISlot17"), filler1);
				i.setItem(plugin.getConfig().getInt("FillerGlass1GUISlot18"), filler1);
			}

			if (plugin.getConfig().getBoolean("FillerGlass2Enabled") == true) {
				i.setItem(plugin.getConfig().getInt("FillerGlass2GUISlot1"), filler2);
				i.setItem(plugin.getConfig().getInt("FillerGlass2GUISlot2"), filler2);
				i.setItem(plugin.getConfig().getInt("FillerGlass2GUISlot3"), filler2);
				i.setItem(plugin.getConfig().getInt("FillerGlass2GUISlot4"), filler2);
				i.setItem(plugin.getConfig().getInt("FillerGlass2GUISlot5"), filler2);
				i.setItem(plugin.getConfig().getInt("FillerGlass2GUISlot6"), filler2);
				i.setItem(plugin.getConfig().getInt("FillerGlass2GUISlot7"), filler2);
				i.setItem(plugin.getConfig().getInt("FillerGlass2GUISlot8"), filler2);
				i.setItem(plugin.getConfig().getInt("FillerGlass2GUISlot9"), filler2);
				i.setItem(plugin.getConfig().getInt("FillerGlass2GUISlot10"), filler2);
				i.setItem(plugin.getConfig().getInt("FillerGlass2GUISlot11"), filler2);
				i.setItem(plugin.getConfig().getInt("FillerGlass2GUISlot12"), filler2);
				i.setItem(plugin.getConfig().getInt("FillerGlass2GUISlot13"), filler2);
				i.setItem(plugin.getConfig().getInt("FillerGlass2GUISlot14"), filler2);
				i.setItem(plugin.getConfig().getInt("FillerGlass2GUISlot15"), filler2);
				i.setItem(plugin.getConfig().getInt("FillerGlass2GUISlot16"), filler2);
				i.setItem(plugin.getConfig().getInt("FillerGlass2GUISlot17"), filler2);
				i.setItem(plugin.getConfig().getInt("FillerGlass2GUISlot18"), filler2);
			}

		} else {

			ItemStack item = new ItemStack(Material.valueOf(F.GUIItem()), 1, (byte) (F.GUIItemData()));
			ItemMeta itemMeta = item.getItemMeta();
			itemMeta.setDisplayName(F.itemName());
			List<String> itemLore = new ArrayList<>();
			for (String lore : plugin.getConfig().getStringList("item.Lore")) {
				itemLore.add(ChatColor.translateAlternateColorCodes('&', lore));
			}
			for (String FundedLore : ((Main) plugin).getFund().getStringList("NotFundedGUI.Lore")) {
				itemLore.add(ChatColor.translateAlternateColorCodes('&', FundedLore).replace("%percentFunded%",
						String.valueOf(F.percentFunded())).replace("%currentFund%", String.valueOf(F.currentFund())));
			}
			if (((Main) plugin).getFund().getBoolean("NotFundedGUI.Enchanted")) {
				itemMeta.addEnchant(Enchantment.LURE, 1, true);
				itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			}
			itemMeta.setLore(itemLore);
			item.setItemMeta(itemMeta);

			int GUISize = plugin.getConfig().getInt("EnchanterSize");
			int x = 0;

			while (x < GUISize) {
				i.setItem(x, item);
				x++;
			}
		}
		player.openInventory(i);
	}
}
