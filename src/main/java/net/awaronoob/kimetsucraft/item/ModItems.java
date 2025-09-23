package net.awaronoob.kimetsucraft.item;

import net.awaronoob.kimetsucraft.KimetsuNoCraft;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    private static final String MID = KimetsuNoCraft.MOD_ID;

    public static final Item SCARLET_INGOT = registerItem("scarlet_ingot", new Item(new Item.Settings()));
    public static final Item RAW_SCARLET_INGOT = registerItem("raw_scarlet_ingot", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MID, name), item);
    }

    public static void registerModItems() {
        KimetsuNoCraft.LOGGER.info("Registering Mod Items for " + MID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SCARLET_INGOT);
            entries.add(RAW_SCARLET_INGOT);
        });
    }
}
