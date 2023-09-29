
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterores.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.betterores.world.features.ores.FeatherOreFeature;
import net.mcreator.betterores.world.features.ores.EnderiteOreFeature;
import net.mcreator.betterores.world.features.ores.DragoniteOreFeature;
import net.mcreator.betterores.BetteroresMod;

@Mod.EventBusSubscriber
public class BetteroresModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, BetteroresMod.MODID);
	public static final RegistryObject<Feature<?>> ENDERITE_ORE = REGISTRY.register("enderite_ore", EnderiteOreFeature::new);
	public static final RegistryObject<Feature<?>> FEATHER_ORE = REGISTRY.register("feather_ore", FeatherOreFeature::new);
	public static final RegistryObject<Feature<?>> DRAGONITE_ORE = REGISTRY.register("dragonite_ore", DragoniteOreFeature::new);
}
