package net.bcj.morewood.world.feature;

import net.bcj.morewood.MoreWood;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModWorldGenRegister {
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> BLUE_MAHOE_TREE =
            ConfiguredFeatures.register("blue_mahoe_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(MoreWood.BLUE_MAHOE_LOG),
                    new StraightTrunkPlacer(6, 8, 4),
                    BlockStateProvider.of(MoreWood.BLUE_MAHOE_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).build());

    public static final RegistryEntry<PlacedFeature> BLUE_MAHOE_CHECKED = PlacedFeatures.register("dogwood_checked",
            BLUE_MAHOE_TREE, List.of(PlacedFeatures.wouldSurvive(MoreWood.BLUE_MAHOE_SAPLING)));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> BLUE_MAHOE_SPAWN =
            ConfiguredFeatures.register("blue_mahoe_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(BLUE_MAHOE_CHECKED, 0.5f)),
                            BLUE_MAHOE_CHECKED));
}
