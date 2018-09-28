package com.nbdSteve.nbdPackage.Support;

import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import com.massivecraft.factions.Board;
import com.massivecraft.factions.FLocation;
import com.massivecraft.factions.FPlayers;
import com.massivecraft.factions.Faction;
import com.massivecraft.factions.struct.Relation;

public class SavageFactions {

	public static boolean isFriendly(Player player, Player other) {
		Faction p = FPlayers.getInstance().getByPlayer(player).getFaction();
		Faction o = FPlayers.getInstance().getByPlayer(other).getFaction();
		if (o.isPeaceful()) {
			return true;
		}
		if (FPlayers.getInstance().getByPlayer(other) == null
				|| FPlayers.getInstance().getByPlayer(other).getFaction() == null) {
			return false;
		}
		Relation r = FPlayers.getInstance().getByPlayer(player)
				.getRelationTo(FPlayers.getInstance().getByPlayer(other));
		if (ChatColor.stripColor(o.getTag()).equalsIgnoreCase("Wilderness"))
			return false;
		if (p == o)
			return true;
		if (r.isAlly())
			return true;
		if (r.isTruce())
			return true;
		return false;
	}

	public static boolean inTerritory(Player P) {
		if (ChatColor.stripColor(FPlayers.getInstance().getByPlayer(P).getFaction().getTag())
				.equalsIgnoreCase("Wilderness"))
			return false;
		if (FPlayers.getInstance().getByPlayer(P).isInOwnTerritory()) {
			return true;
		}
		if (FPlayers.getInstance().getByPlayer(P).isInAllyTerritory()) {
			return true;
		}
		return false;
	}

	public static boolean canBreakBlock(Player player, Block block) {
		if (FPlayers.getInstance().getByPlayer(player).getFaction() != null) {
			Faction P = FPlayers.getInstance().getByPlayer(player).getFaction();
			FLocation loc = new FLocation(block.getLocation());
			Faction B = Board.getInstance().getFactionAt(loc);
			if (ChatColor.stripColor(B.getTag()).equalsIgnoreCase("Wilderness") || P == B) {
				return true;
			}
		}
		return false;
	}

}
