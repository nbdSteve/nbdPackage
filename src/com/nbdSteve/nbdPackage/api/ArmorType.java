package com.nbdSteve.nbdPackage.api;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import com.nbdSteve.nbdPackage.Support.Version;

/**
 * @Author Borlea
 * @Github https://github.com/borlea/
 * @Website http://thederpygolems.ca/
 * Jul 30, 2015 6:46:16 PM
 */
public enum ArmorType {

	HELMET(5), CHESTPLATE(6), LEGGINGS(7), BOOTS(8);

	private final int slot;

	private ArmorType(int slot) {
		this.slot = slot;
	}

	/**
	 * Attempts to match the ArmorType for the specified ItemStack.
	 *
	 * @param itemStack The ItemStack to parse the type of.
	 * @return The parsed ArmorType. (null if none were found.)
	 */
	@SuppressWarnings("deprecation")
	public final static ArmorType matchType(final ItemStack itemStack) {
		if(itemStack == null) {
			return null;
		}
		if(itemStack.getType().name().toLowerCase().contains("skull")) {
			return HELMET;
		}
		
		if(Version.getCurrentVersion().comparedTo(Version.v1_9_R1) >= 0) {
			if(itemStack.getType() == Material.valueOf("ELYTRA")) {
				return CHESTPLATE;
			}
		}
		
		switch(itemStack.getType()) {
			case DIAMOND_HELMET:
			case LEGACY_GOLD_HELMET:
			case IRON_HELMET:
			case CHAINMAIL_HELMET:
			case LEATHER_HELMET:
				return HELMET;
			case DIAMOND_CHESTPLATE:
			case LEGACY_GOLD_CHESTPLATE:
			case IRON_CHESTPLATE:
			case CHAINMAIL_CHESTPLATE:
			case LEATHER_CHESTPLATE:
				return CHESTPLATE;
			case DIAMOND_LEGGINGS:
			case LEGACY_GOLD_LEGGINGS:
			case IRON_LEGGINGS:
			case CHAINMAIL_LEGGINGS:
			case LEATHER_LEGGINGS:
				return LEGGINGS;
			case DIAMOND_BOOTS:
			case LEGACY_GOLD_BOOTS:
			case IRON_BOOTS:
			case CHAINMAIL_BOOTS:
			case LEATHER_BOOTS:
				return BOOTS;
			default:
				return null;
		}
	}

	public int getSlot() {
		return slot;
	}

}