package net.kreis.storyline.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kreis.storyline.StoryLine;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class items {

    public static final Item SHIFTING_SCALE = registerItem("shifting_scale",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item MEMORY_FRAGMENT = registerItem("memory_fragment",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item DICE_OF_FATE = registerItem("dice_of_fate",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item GEARS_OF_FATE = registerItem("gears_of_fate",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item CAUSALITY_COLLAPSER = registerItem("causality_collapser",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item SINGULARITY = registerItem("singularity",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item NATURAL_SPARK = registerItem("natural_spark",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item CORPOREAL_SPARK = registerItem("corporeal_spark",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item VITAL_SPARK = registerItem("vital_spark",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(StoryLine.MOD_ID, name), item);
        //This call is registering the item that we are passing in through this method.
        //It is passing it under our namespace, StoryLine, which we dynamically call through MOD_ID
    }

    public static void registerItems() {
        //This is registering all of the items in this class file.
        //Additionally logs the process it is currently going through.
        StoryLine.LOGGER.info("Registering new items for " + StoryLine.MOD_ID);
    }

}
