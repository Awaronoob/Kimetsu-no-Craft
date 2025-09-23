package net.awaronoob.kimetsucraft.datagen;

import net.awaronoob.kimetsucraft.block.ModBlocks;
import net.awaronoob.kimetsucraft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SCARLET_ORE, oreDrops(ModBlocks.SCARLET_ORE, ModItems.RAW_SCARLET_INGOT));
        addDrop(ModBlocks.SCARLET_BLOCK);
    }
}
