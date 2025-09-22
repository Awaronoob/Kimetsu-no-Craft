package net.awaronoob.kimetsucraft;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KimetsuNoCraft implements ModInitializer {
	public static final String MOD_ID = "kimetsucraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("starting to initialize " + MOD_ID);
	}
}