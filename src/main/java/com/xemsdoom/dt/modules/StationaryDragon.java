package com.xemsdoom.dt.modules;

import com.xemsdoom.dt.DragonTravelMain;
import com.xemsdoom.dt.XemDragon;
import net.minecraft.server.v1_5_R1.World;
import org.bukkit.craftbukkit.v1_5_R1.CraftWorld;
import org.bukkit.entity.Player;

/**
 * Handles all things related to stationary dragons,<br>
 * those dragons which are just on stations
 */
public class StationaryDragon {

	/**
	 * Creates a stationary dragon
	 */
	public static void createStatDragon(Player player) {
		World notchWorld = ((CraftWorld) player.getWorld()).getHandle();
		XemDragon XemDragon = new XemDragon(player.getLocation(), notchWorld);
		notchWorld.addEntity(XemDragon);
		player.sendMessage(MessagesLoader.replaceColors(DragonTravelMain.messages.getString("CreatedStationaryDragon")));
	}
}
