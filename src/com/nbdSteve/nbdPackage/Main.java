package com.nbdSteve.nbdPackage;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import com.nbdSteve.nbdPackage.Armor.ArmorEquip;
import com.nbdSteve.nbdPackage.Armor.ArmorSet1;
import com.nbdSteve.nbdPackage.Armor.ArmorSet2;
import com.nbdSteve.nbdPackage.Armor.ArmorSet3;
import com.nbdSteve.nbdPackage.Armor.ArmorSet4;
import com.nbdSteve.nbdPackage.Armor.ArmorSet5;
import com.nbdSteve.nbdPackage.Commands.Commands;
import com.nbdSteve.nbdPackage.Enchants.CeBook1;
import com.nbdSteve.nbdPackage.Enchants.CeBook10;
import com.nbdSteve.nbdPackage.Enchants.CeBook11;
import com.nbdSteve.nbdPackage.Enchants.CeBook12;
import com.nbdSteve.nbdPackage.Enchants.CeBook13;
import com.nbdSteve.nbdPackage.Enchants.CeBook14;
import com.nbdSteve.nbdPackage.Enchants.CeBook15;
import com.nbdSteve.nbdPackage.Enchants.CeBook16;
import com.nbdSteve.nbdPackage.Enchants.CeBook17;
import com.nbdSteve.nbdPackage.Enchants.CeBook18;
import com.nbdSteve.nbdPackage.Enchants.CeBook19;
import com.nbdSteve.nbdPackage.Enchants.CeBook2;
import com.nbdSteve.nbdPackage.Enchants.CeBook20;
import com.nbdSteve.nbdPackage.Enchants.CeBook21;
import com.nbdSteve.nbdPackage.Enchants.CeBook3;
import com.nbdSteve.nbdPackage.Enchants.CeBook4;
import com.nbdSteve.nbdPackage.Enchants.CeBook5;
import com.nbdSteve.nbdPackage.Enchants.CeBook6;
import com.nbdSteve.nbdPackage.Enchants.CeBook7;
import com.nbdSteve.nbdPackage.Enchants.CeBook8;
import com.nbdSteve.nbdPackage.Enchants.CeBook9;
import com.nbdSteve.nbdPackage.Fund.Fund;
import com.nbdSteve.nbdPackage.api.ArmorListener;
import com.sk89q.worldguard.bukkit.WorldGuardPlugin;

import net.milkbowl.vault.economy.Economy;

public class Main extends JavaPlugin {
	
	public WorldGuardPlugin worldGuardPlugin;
	private static Economy econ;

	File ffile;
	private FileConfiguration fund;
	
	@Override
	public void onEnable() {
		
		if (!setupEconomy()) {
			this.getLogger().severe("Disabled due to no Vault dependency found!");
			Bukkit.getPluginManager().disablePlugin(this);
			return;
		}
		
		worldGuardPlugin = getWorldGuard();
		loadConfig();
		createFund();
		
		getCommand("ce").setExecutor(new Commands(this));
		getCommand("ca").setExecutor(new Commands(this));
		getCommand("enchanter").setExecutor(new Commands(this));
		getCommand("customenchant").setExecutor(new Commands(this));
		getCommand("givenbd").setExecutor(new Commands(this));
		getCommand("fund").setExecutor(new Fund(this));
		
		getServer().getPluginManager().registerEvents(new EnchanterGUI(), this);
		getServer().getPluginManager().registerEvents(new ArmorListener(), this);
		getServer().getPluginManager().registerEvents(new ArmorEquip(), this);
		
		getServer().getPluginManager().registerEvents(new ArmorSet1(), this);
		getServer().getPluginManager().registerEvents(new ArmorSet2(), this);
		getServer().getPluginManager().registerEvents(new ArmorSet3(), this);
		getServer().getPluginManager().registerEvents(new ArmorSet4(), this);
		getServer().getPluginManager().registerEvents(new ArmorSet5(), this);
		
		getServer().getPluginManager().registerEvents(new CeBook1(), this);
		getServer().getPluginManager().registerEvents(new CeBook2(), this);
		getServer().getPluginManager().registerEvents(new CeBook3(), this);
		getServer().getPluginManager().registerEvents(new CeBook4(), this);
		getServer().getPluginManager().registerEvents(new CeBook5(), this);
		getServer().getPluginManager().registerEvents(new CeBook6(), this);
		getServer().getPluginManager().registerEvents(new CeBook7(), this);
		getServer().getPluginManager().registerEvents(new CeBook8(), this);
		getServer().getPluginManager().registerEvents(new CeBook9(), this);
		getServer().getPluginManager().registerEvents(new CeBook10(), this);
		getServer().getPluginManager().registerEvents(new CeBook11(), this);
		getServer().getPluginManager().registerEvents(new CeBook12(), this);
		getServer().getPluginManager().registerEvents(new CeBook13(), this);
		getServer().getPluginManager().registerEvents(new CeBook14(), this);
		getServer().getPluginManager().registerEvents(new CeBook15(), this);
		getServer().getPluginManager().registerEvents(new CeBook16(), this);
		getServer().getPluginManager().registerEvents(new CeBook17(), this);
		getServer().getPluginManager().registerEvents(new CeBook18(), this);
		getServer().getPluginManager().registerEvents(new CeBook19(), this);
		getServer().getPluginManager().registerEvents(new CeBook20(), this);
		getServer().getPluginManager().registerEvents(new CeBook21(), this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
	private void createFund() {
		
		ffile = new File(getDataFolder(), "fund.yml");
		
		if (!ffile.exists()) {
			ffile.getParentFile().mkdirs();
			saveResource("fund.yml", false);
		}
		
		fund = new YamlConfiguration();
		try {
			fund.load(ffile);
		} catch (Exception e){
			e.printStackTrace();
		}
		
	}
	
	public FileConfiguration getFund() {
		return this.fund;
	}
	
	public void loadFund() {
		try {
			fund.load(ffile);
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public void saveFund() {
		try {
			fund.save(ffile);
			fund.load(ffile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void loadConfig() {
		getConfig().options().copyDefaults(true);
		saveDefaultConfig();
	}

	private boolean setupEconomy() {
		if (Bukkit.getPluginManager().getPlugin("Vault") == null) {
			return false;
		}
		RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
		if (rsp == null) {
			return false;
		}
		econ = rsp.getProvider();
		return econ != null;
	}

	public static Economy getEconomy() {
		return econ;
	}
	
	public WorldGuardPlugin getWorldGuard() {
		Plugin plugin = Bukkit.getPluginManager().getPlugin("WorldGuard");
		if (plugin == null || !(plugin instanceof WorldGuardPlugin)) {
			return null;
		}
		return (WorldGuardPlugin) plugin;
	}
}
