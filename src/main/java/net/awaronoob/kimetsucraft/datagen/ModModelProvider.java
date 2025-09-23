package net.awaronoob.kimetsucraft.datagen;

import net.awaronoob.kimetsucraft.block.ModBlocks;
import net.awaronoob.kimetsucraft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SCARLET_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SCARLET_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SCARLET_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SCARLET_INGOT, Models.GENERATED);
    }
}
