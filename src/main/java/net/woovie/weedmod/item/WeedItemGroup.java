package net.woovie.weedmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class WeedItemGroup {

    /* ItemGroup (Tooltip and spawn menu in creative) Creation */
    public static final ItemGroup WEED_GROUP = FabricItemGroupBuilder.create(
            new Identifier("weedmod", "group")
    )
    .icon(() -> new ItemStack(WeedItems.WEED_LEAF))
    .build();
}
