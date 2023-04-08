package me.cyberneticsman.dbf;

import lombok.Getter;
import me.cyberneticsman.dbf.core.player.DragonPlayer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

public class DragonBlockFabric implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.


	Set<DragonPlayer> dragonPlayers = new HashSet<>();


	public static final String ModId = "dbf";
	public static final Logger LOGGER = LoggerFactory.getLogger(ModId);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
			DragonPlayer dragonplayer = new DragonPlayer(handler.player);
			dragonPlayers.add(dragonplayer);
		});
	}
}
