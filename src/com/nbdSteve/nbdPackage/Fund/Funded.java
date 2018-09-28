package com.nbdSteve.nbdPackage.Fund;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

import com.nbdSteve.nbdPackage.Main;

import net.md_5.bungee.api.ChatColor;
import net.milkbowl.vault.economy.Economy;

public class Funded {
	
	Economy econ = Main.getEconomy();
	private static Plugin plugin = Main.getPlugin(Main.class);
	
	public static void onFund() {
		
		double totalFund = Double.parseDouble(((Main) plugin).getFund().getString("FundGoal"));
		double currentFunded = Double
				.parseDouble(((Main) plugin).getFund().getString("CurrentFund"));
		
		if (totalFund == currentFunded) {
			((Main) plugin).getFund().set("Funded", true);
			Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&',
					((Main) plugin).getFund().getString("FundedMessage")));
		}
	}
}
