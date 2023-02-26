package net.bcj.morewood.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

import static net.bcj.morewood.MoreWood.*;

public class ModFlammableBlocks {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(BLUE_MAHOE_LOG, 5, 5);
        registry.add(BLUE_MAHOE_WOOD, 5, 5);
        registry.add(BLUE_MAHOE_LEAVES, 30, 60);
        registry.add(BLUE_MAHOE_PLANKS, 5, 20);
        registry.add(STRIPPED_BLUE_MAHOE_LOG, 5, 5);
        registry.add(STRIPPED_BLUE_MAHOE_WOOD, 5, 5);
        registry.add(BLUE_MAHOE_FENCE, 5, 5);
        registry.add(BLUE_MAHOE_FENCE_GATE, 5, 5);
    }
}
