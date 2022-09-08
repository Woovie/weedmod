package net.woovie.weedmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.woovie.weedmod.Weedmod;
import net.woovie.weedmod.block.WeedBlocks;

public class WeedItems {

    public static final Item WEED_FERTILIZER = registerItem(
        "weed_fertilizer",
        new Item(
                new FabricItemSettings().group(WeedItemGroup.WEED_GROUP)
        )
    );

    public static final Item WEED_FLOWER = registerItem(
            "weed_flower",
            new Item(
                    new FabricItemSettings().group(WeedItemGroup.WEED_GROUP)
            )
    );

    public static final Item WEED_HEMP = registerItem(
            "weed_hemp",
            new Item(
                    new FabricItemSettings().group(WeedItemGroup.WEED_GROUP)
            )
    );

    public static final Item WEED_HEMP_PAPER = registerItem(
            "weed_hemp_paper",
            new Item(
                    new FabricItemSettings().group(WeedItemGroup.WEED_GROUP)
            )
    );

    public static final Item WEED_JOINT = registerItem(
            "weed_joint",
            new Item(
                    new FabricItemSettings().group(WeedItemGroup.WEED_GROUP)
            )
    );

    public static final Item WEED_LEAF = registerItem(
            "weed_leaf",
            new Item(
                    new FabricItemSettings().group(WeedItemGroup.WEED_GROUP)
            )
    );

    public static final Item WEED_SEED = registerItem(
            "weed_seed",
            new AliasedBlockItem(
                    WeedBlocks.WEED_CROP,
                    new FabricItemSettings().group(WeedItemGroup.WEED_GROUP)
            )
    );

    public static void registerModItems() {
        Weedmod.LOGGER.debug("Registering mod items for " + Weedmod.MOD_ID);
    }

    public static Item registerItem(String name, Item item) {
            return Registry.register(Registry.ITEM, new Identifier(Weedmod.MOD_ID, name), item);
    }
}
