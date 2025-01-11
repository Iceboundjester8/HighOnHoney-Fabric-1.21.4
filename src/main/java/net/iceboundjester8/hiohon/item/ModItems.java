package net.iceboundjester8.hiohon.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.iceboundjester8.hiohon.HighOnHoney;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item COPPER_SHEET = registerItem("copper_sheet", new Item(new Item.Settings()));
    public static final Item COPPER_PIPE = registerItem("copper_pipe", new Item(new Item.Settings()));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(HighOnHoney.MOD_ID, name), item);
    }
    public static void registerModItems() {
        HighOnHoney.LOGGER.info("Registering Mod Items for " + HighOnHoney.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(COPPER_SHEET),
            entries.add(COPPER_PIPE);

        });
    }



}
