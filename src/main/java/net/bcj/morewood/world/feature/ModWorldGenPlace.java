package net.bcj.morewood.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class ModWorldGenPlace {
    public static final RegistryEntry<PlacedFeature> BLUE_MAHOE_PLACED = PlacedFeatures.register("dogwood_placed",
            ModWorldGenRegister.BLUE_MAHOE_SPAWN,
            VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));
}
