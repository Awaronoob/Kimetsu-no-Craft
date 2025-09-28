package net.awaronoob.kimetsucraft;

import net.awaronoob.kimetsucraft.block.ModBlocks;
import net.awaronoob.kimetsucraft.item.ModItems;
import net.awaronoob.kimetsucraft.networking.payload.TestC2SPayload;
import net.awaronoob.kimetsucraft.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KimetsuNoCraft implements ModInitializer {
	public static final String MOD_ID = "kimetsucraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("starting to initialize " + MOD_ID);

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        ModWorldGeneration.generateModWorldGen();

        PayloadTypeRegistry.playC2S().register(TestC2SPayload.ID, TestC2SPayload.CODEC);


	}
}