
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterores.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.betterores.block.FeatherOreBlock;
import net.mcreator.betterores.block.FeatherBlockBlock;
import net.mcreator.betterores.block.EnderiteOreBlock;
import net.mcreator.betterores.block.EnderiteBlockBlock;
import net.mcreator.betterores.block.DragoniteOreBlock;
import net.mcreator.betterores.block.DragoniteBlockBlock;
import net.mcreator.betterores.BetteroresMod;

public class BetteroresModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BetteroresMod.MODID);
	public static final RegistryObject<Block> ENDERITE_BLOCK = REGISTRY.register("enderite_block", () -> new EnderiteBlockBlock());
	public static final RegistryObject<Block> ENDERITE_ORE = REGISTRY.register("enderite_ore", () -> new EnderiteOreBlock());
	public static final RegistryObject<Block> FEATHER_ORE = REGISTRY.register("feather_ore", () -> new FeatherOreBlock());
	public static final RegistryObject<Block> FEATHER_BLOCK = REGISTRY.register("feather_block", () -> new FeatherBlockBlock());
	public static final RegistryObject<Block> DRAGONITE_ORE = REGISTRY.register("dragonite_ore", () -> new DragoniteOreBlock());
	public static final RegistryObject<Block> DRAGONITE_BLOCK = REGISTRY.register("dragonite_block", () -> new DragoniteBlockBlock());
}
