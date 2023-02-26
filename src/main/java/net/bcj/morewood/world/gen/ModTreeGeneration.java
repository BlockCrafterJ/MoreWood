package net.bcj.morewood.world.gen;

import net.bcj.morewood.world.feature.ModWorldGenPlace;
import net.bcj.morewood.world.feature.ModWorldGenRegister;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, ModWorldGenPlace.BLUE_MAHOE_PLACED.getKey().get());
    }
}
