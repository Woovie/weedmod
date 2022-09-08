package net.woovie.weedmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.woovie.weedmod.Weedmod;
import net.woovie.weedmod.item.WeedCrop;
import net.woovie.weedmod.item.WeedItemGroup;

public class WeedBlocks {
    // public static final Block WEED_JAR = registerBlock("weed_jar",
    //        new Block(FabricBlockSettings.of(Material.GLASS).strength(1f).requiresTool()), WeedItemGroup.WEED_GROUP);

    public static final Block WEED_CROP = registerBlock(
            "weed_crop",
            new WeedCrop(
            AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly()
            .breakInstantly().sounds(BlockSoundGroup.CROP)),
            WeedItemGroup.WEED_GROUP
    );

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Weedmod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(Weedmod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        Weedmod.LOGGER.debug("Registering mod blocks for" + Weedmod.MOD_ID);
    }
}
