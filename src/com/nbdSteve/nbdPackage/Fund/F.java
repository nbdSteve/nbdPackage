package com.nbdSteve.nbdPackage.Fund;

import java.text.DecimalFormat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import com.nbdSteve.nbdPackage.Main;

import net.milkbowl.vault.economy.Economy;

public class F {

	private static Plugin plugin = Main.getPlugin(Main.class);
	Economy econ = Main.getEconomy();
	
	public static void onFund() {
		
		double totalFund = Double.parseDouble(((Main) plugin).getFund().getString("FundGoal"));
		double currentFunded = Double
				.parseDouble(((Main) plugin).getFund().getString("CurrentFund"));
		
		if (totalFund == currentFunded) {
			((Main) plugin).getFund().set("Funded", true);
			Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&',
					((Main) plugin).getFund().getString("FundedMessage")));
			((Main) plugin).saveFund();
			
			for (Player pl : Bukkit.getOnlinePlayers()) {
				pl.playSound(pl.getLocation(), Sound.valueOf(((Main) plugin).getFund().getString("FundedSound")),
						((Main) plugin).getFund().getInt("FundedVolume"),
						((Main) plugin).getFund().getInt("FundedPitch"));
			}
		}
	}
	
	public static String GUIItem() {
		return ((Main) plugin).getFund().getString("NotFundedGUI.Item");
	}
	
	public static int GUIItemData() {
		return (byte) ((Main) plugin).getFund().getInt("NotFundedGUI.ItemData");
	}

	public static boolean funded() {

		if (!((Main) plugin).getFund().getBoolean("Funded")) {
			return false;
		} else {
			return true;
		}
	}
	
	public static String itemName() {
		return ChatColor.translateAlternateColorCodes('&', ((Main) plugin).getFund().getString("NotFundedGUI.Name"));
	}
	
	public static String fundedMessage() {
		return ChatColor.translateAlternateColorCodes('&',((Main) plugin).getFund().getString("NotFundedMessage"));
	}
	
	public static CharSequence percentFunded() {
		double currentFunded = Double.parseDouble(((Main) plugin).getFund().getString("CurrentFund"));
		double totalFund = Double.parseDouble(((Main) plugin).getFund().getString("FundGoal"));

		DecimalFormat pdf = new DecimalFormat("#.##");
		double fundPercentage = (currentFunded / totalFund) * 100;

		if (fundPercentage <= 0) {
			fundPercentage = 0;
		}

		String fundPercentMsg = pdf.format(fundPercentage);
		return fundPercentMsg;
	}
	
	public static CharSequence currentFund() {
		double currentFunded = Double.parseDouble(((Main) plugin).getFund().getString("CurrentFund"));
		DecimalFormat pdf = new DecimalFormat("#,###");
		
		String currentFund = pdf.format(currentFunded);
		return currentFund;
	}
}
