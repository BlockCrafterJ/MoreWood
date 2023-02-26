package net.bcj.morewood;

import net.bcj.morewood.util.ModFlammableBlocks;
import net.bcj.morewood.util.ModStrippableBlocks;
import net.bcj.morewood.world.feature.ModWorldGenPlace;
import net.bcj.morewood.world.feature.ModWorldGenRegister;
import net.bcj.morewood.world.feature.tree.BlueMahoeSaplingGenerator;
import net.bcj.morewood.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreWood implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("morewood");
	public static final Block BLUE_MAHOE_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
	public static final Block BLUE_MAHOE_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG));
	public static final Block BLUE_MAHOE_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block STRIPPED_BLUE_MAHOE_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG));
	public static final Block STRIPPED_BLUE_MAHOE_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block BLUE_MAHOE_LEAVES = new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES));
	public static final Block BLUE_MAHOE_SAPLING = new SaplingBlock(new BlueMahoeSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Thanks for using MoreWood by Block Crafter J!");

		Registry.register(Registry.BLOCK, new Identifier("morewood", "blue_mahoe_planks"), BLUE_MAHOE_PLANKS);
		Registry.register(Registry.BLOCK, new Identifier("morewood", "blue_mahoe_log"), BLUE_MAHOE_LOG);
		Registry.register(Registry.BLOCK, new Identifier("morewood", "blue_mahoe_wood"), STRIPPED_BLUE_MAHOE_WOOD);
		Registry.register(Registry.BLOCK, new Identifier("morewood", "stripped_blue_mahoe_log"), STRIPPED_BLUE_MAHOE_LOG);
		Registry.register(Registry.BLOCK, new Identifier("morewood", "stripped_blue_mahoe_wood"), BLUE_MAHOE_WOOD);
		Registry.register(Registry.BLOCK, new Identifier("morewood", "blue_mahoe_leaves"), BLUE_MAHOE_LEAVES);
		Registry.register(Registry.BLOCK, new Identifier("morewood", "blue_mahoe_sapling"), BLUE_MAHOE_SAPLING);

		Registry.register(Registry.ITEM, new Identifier("morewood", "blue_mahoe_planks"), new BlockItem(BLUE_MAHOE_PLANKS, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("morewood", "blue_mahoe_log"), new BlockItem(BLUE_MAHOE_LOG, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("morewood", "blue_mahoe_wood"), new BlockItem(BLUE_MAHOE_WOOD, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("morewood", "stripped_blue_mahoe_log"), new BlockItem(STRIPPED_BLUE_MAHOE_LOG, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("morewood", "stripped_blue_mahoe_wood"), new BlockItem(STRIPPED_BLUE_MAHOE_WOOD, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("morewood", "blue_mahoe_leaves"), new BlockItem(BLUE_MAHOE_LEAVES, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("morewood", "blue_mahoe_sapling"), new BlockItem(BLUE_MAHOE_SAPLING, new FabricItemSettings()));

		ModFlammableBlocks.registerFlammableBlocks();
		ModStrippableBlocks.registerStrippables();
		ModWorldGen.generateWorldGen();

		new ModWorldGenRegister();
		new ModWorldGenPlace();
	}
}
