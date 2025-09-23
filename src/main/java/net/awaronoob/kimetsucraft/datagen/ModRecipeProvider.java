package net.awaronoob.kimetsucraft.datagen;

import net.awaronoob.kimetsucraft.block.ModBlocks;
import net.awaronoob.kimetsucraft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        List<ItemConvertible> NICHIRIN_INGOT_SMELTABLES = List.of(ModItems.RAW_SCARLET_INGOT, ModBlocks.SCARLET_ORE);

        offerSmelting(recipeExporter, NICHIRIN_INGOT_SMELTABLES, RecipeCategory.MISC, ModItems.SCARLET_INGOT, 1.0f, 200, "nichirin_ingot");
        offerBlasting(recipeExporter, NICHIRIN_INGOT_SMELTABLES, RecipeCategory.MISC, ModItems.SCARLET_INGOT, 1.0f, 100, "nichirin_ingot");

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SCARLET_INGOT, RecipeCategory.MISC, ModBlocks.SCARLET_BLOCK);


    }
}
