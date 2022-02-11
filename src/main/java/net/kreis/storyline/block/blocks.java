package net.kreis.storyline.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kreis.storyline.StoryLine;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class blocks {

    public static final Block LIGHT_ZYCHORIUM_BLOCK = registerBlock("light_zychorium_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(-1.0F,3600000.0F).dropsNothing()), ItemGroup.MISC);



    public static void registerModBlocks() {
        StoryLine.LOGGER.info("Registering new blocks for" + StoryLine.MOD_ID);
    }

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(StoryLine.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(StoryLine.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
}
