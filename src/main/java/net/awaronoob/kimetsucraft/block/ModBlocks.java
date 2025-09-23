package net.awaronoob.kimetsucraft.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.awaronoob.kimetsucraft.KimetsuNoCraft;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;

public class ModBlocks {
    private static final String MID = KimetsuNoCraft.MOD_ID;

    public static final Block SCARLET_ORE = registerBlock("scarlet_ore",
            new ExperienceDroppingBlock(
                    ConstantIntProvider.create(0),
                    AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.5F, 3.2F)));

    public static final Block SCARLET_BLOCK = registerBlock("scarlet_block",
            new ExperienceDroppingBlock(
                    ConstantIntProvider.create(0),
                    AbstractBlock.Settings.create().mapColor(MapColor.IRON_GRAY).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresTool().strength(5.5F, 6.2F).sounds(BlockSoundGroup.METAL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        KimetsuNoCraft.LOGGER.info("Registering Mod Blocks for " + MID);

        //Add block items to the "building blocks" creative mode tab (BUILDING_BLOCKS)
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(SCARLET_BLOCK);
        });

        //Add block items to the "natural" creative mode tab (NATURAL)
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(SCARLET_ORE);
        });
    }
}