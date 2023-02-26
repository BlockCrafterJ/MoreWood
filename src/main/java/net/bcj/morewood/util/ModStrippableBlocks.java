package net.bcj.morewood.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

import static net.bcj.morewood.MoreWood.*;

public class ModStrippableBlocks {
    public static void registerStrippables() {
        StrippableBlockRegistry.register(BLUE_MAHOE_LOG, STRIPPED_BLUE_MAHOE_LOG);
        StrippableBlockRegistry.register(BLUE_MAHOE_WOOD, STRIPPED_BLUE_MAHOE_WOOD);
    }
}
