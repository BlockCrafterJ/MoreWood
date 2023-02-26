package net.bcj.morewood.world.feature.tree;

import net.bcj.morewood.world.feature.ModWorldGenRegister;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class BlueMahoeSaplingGenerator extends SaplingGenerator {

    @Nullable
    @Override
    protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModWorldGenRegister.BLUE_MAHOE_TREE;
    }
}
