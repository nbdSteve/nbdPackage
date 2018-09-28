package com.nbdSteve.nbdPackage.Fund;

import java.text.DecimalFormat;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import com.nbdSteve.nbdPackage.Main;

import net.md_5.bungee.api.ChatColor;
import net.milkbowl.vault.economy.Economy;

public class Fund implements CommandExecutor {

	Economy econ = Main.getEconomy();
	private Plugin plugin = Main.getPlugin(Main.class);

	public Fund(Main plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {

			Player player = (Player) sender;

			if (player.hasPermission("nbdpackage.fund")) {
				if (command.getName().equalsIgnoreCase("fund")) {
					if (args.length == 0) {

						double currentFunded = Double.parseDouble(((Main) plugin).getFund().getString("CurrentFund"));
						double totalFund = Double.parseDouble(((Main) plugin).getFund().getString("FundGoal"));

						DecimalFormat df = new DecimalFormat("#,###");
						DecimalFormat pdf = new DecimalFormat("#.##");
						double fundPercentage = (currentFunded / totalFund) * 100;

						if (fundPercentage <= 0) {
							fundPercentage = 0;
						}

						String fundPercentMsg = pdf.format(fundPercentage);
						String currentFund = df.format(currentFunded);
						String totalFundMsg = df.format(totalFund);

						for (String FundCommand : ((Main) plugin).getFund().getStringList("FundCommand.FundMessage")) {
							player.sendMessage(ChatColor.translateAlternateColorCodes('&', FundCommand)
									.replace("%totalFund%", totalFundMsg).replace("%fundPercent%", fundPercentMsg)
									.replace("%currentFund%", currentFund));
						}

					}

					if (args.length == 1) {

						double currentFunded = Double.parseDouble(((Main) plugin).getFund().getString("CurrentFund"));
						double totalFund = Double.parseDouble(((Main) plugin).getFund().getString("FundGoal"));

						DecimalFormat df = new DecimalFormat("#,###");
						DecimalFormat pdf = new DecimalFormat("#.##");
						double fundPercentage = (currentFunded / totalFund) * 100;

						if (fundPercentage <= 0) {
							fundPercentage = 0;
						}

						String fundPercentMsg = pdf.format(fundPercentage);
						String currentFund = df.format(currentFunded);
						String totalFundMsg = df.format(totalFund);

						if (args[0].equalsIgnoreCase("help")) {
							for (String FundHelp : ((Main) plugin).getFund().getStringList("FundHelp.Message")) {
								player.sendMessage(ChatColor.translateAlternateColorCodes('&', FundHelp)
										.replace("%totalFund%", totalFundMsg).replace("%fundPercent%", fundPercentMsg)
										.replace("%currentFund%", currentFund));
							}
						} else if (args[0].equalsIgnoreCase("whatis")){
							for (String FundWhatis : ((Main) plugin).getFund().getStringList("FundCommand.FundWhatis")) {
								player.sendMessage(ChatColor.translateAlternateColorCodes('&', FundWhatis)
										.replace("%totalFund%", totalFundMsg).replace("%fundPercent%", fundPercentMsg)
										.replace("%currentFund%", currentFund));
							}
						} else if (args[0].equalsIgnoreCase("reload") && player.hasPermission("nbdpackage.admin")) {
							((Main) plugin).loadFund();
							player.sendMessage(ChatColor.translateAlternateColorCodes('&',
									plugin.getConfig().getString("ReloadMessage")));
						} else {
							player.sendMessage(ChatColor.translateAlternateColorCodes('&',
									((Main) plugin).getFund().getString("InvalidCommandMessage")));
						}
					}

					if (args.length == 2) {

						if (args[0].equalsIgnoreCase("set")) {

							if (player.hasPermission("nbdpackage.admin")) {
								try {
									Double.parseDouble(args[1]);
								} catch (NumberFormatException e) {
									player.sendMessage(ChatColor.translateAlternateColorCodes('&',
											((Main) plugin).getFund().getString("InvalidCommandMessage")));
									return true;
								}

								double newFund = Double.parseDouble(args[1]);
								((Main) plugin).getFund().set("FundGoal", String.valueOf(newFund));
								((Main) plugin).saveFund();

								player.sendMessage(ChatColor.translateAlternateColorCodes('&',
										((Main) plugin).getFund().getString("FundUpdatedMessage")));
							} else {
								player.sendMessage(ChatColor.translateAlternateColorCodes('&',
										plugin.getConfig().getString("NoPermissionMessage")));
							}
						}

						if (args[0].equalsIgnoreCase("add")) {

							try {
								Double.parseDouble(args[1]);
							} catch (NumberFormatException e) {
								player.sendMessage(ChatColor.translateAlternateColorCodes('&',
										((Main) plugin).getFund().getString("InvalidCommandMessage")));
								return true;
							}

							double fundAmount = Double.parseDouble(args[1]);

							double totalFund = Double.parseDouble(((Main) plugin).getFund().getString("FundGoal"));
							double currentFunded = Double
									.parseDouble(((Main) plugin).getFund().getString("CurrentFund"));
							double newFunded = currentFunded + fundAmount;

							double remainingFund = totalFund - currentFunded;

							if (fundAmount >= Double
									.parseDouble(((Main) plugin).getFund().getString("MinimumFundAmount"))) {

								if (!((newFunded > totalFund) || (currentFunded > totalFund))) {

									if (econ.getBalance(player) >= fundAmount) {
										econ.withdrawPlayer(player, fundAmount);

										DecimalFormat df = new DecimalFormat("#,###");
										String fundAmountMSG = df.format(fundAmount);

										player.sendMessage(ChatColor.translateAlternateColorCodes('&',
												((Main) plugin).getFund().getString("FundAddedMessage")
														.replace("%fundAdded%", fundAmountMSG)));

										((Main) plugin).getFund().set("CurrentFund", String.valueOf(newFunded));
										((Main) plugin).saveFund();

										F.onFund();

									} else {
										player.sendMessage(ChatColor.translateAlternateColorCodes('&',
												plugin.getConfig().getString("InsufficientMessage")));
									}
								} else if (currentFunded >= totalFund) {
									DecimalFormat df = new DecimalFormat("#,###");
									String alreadyFundedMSG = df.format(totalFund);

									player.sendMessage(ChatColor.translateAlternateColorCodes('&',
											((Main) plugin).getFund().getString("AlreadyFundedMessage")
													.replace("%totalFund%", alreadyFundedMSG)));
								} else {
									DecimalFormat df = new DecimalFormat("#,###");
									String remainingFundMSG = df.format(remainingFund);

									player.sendMessage(ChatColor.translateAlternateColorCodes('&',
											((Main) plugin).getFund().getString("FundCompleteMessage")
													.replace("%remainingAmount%", remainingFundMSG)));
								}
							} else {
								player.sendMessage(ChatColor.translateAlternateColorCodes('&',
										((Main) plugin).getFund().getString("FundTooSmallMessage").replace("%minFund%",
												((Main) plugin).getFund().getString("MinimumFundAmount"))));
							}
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
