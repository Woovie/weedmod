package net.woovie.weedmod;

import net.fabricmc.api.ModInitializer;
import net.woovie.weedmod.block.WeedBlocks;
import net.woovie.weedmod.item.WeedItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Weedmod implements ModInitializer {
    public static final String MOD_ID = "weedmod";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        WeedItems.registerModItems();
        WeedBlocks.registerModBlocks();
    }
}
