
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterores.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.betterores.item.UnpuredragoniteItem;
import net.mcreator.betterores.item.UnpureEnderiteItem;
import net.mcreator.betterores.item.RawfeatherItem;
import net.mcreator.betterores.item.FeatherSwordItem;
import net.mcreator.betterores.item.FeatherShovelItem;
import net.mcreator.betterores.item.FeatherPickaxeItem;
import net.mcreator.betterores.item.FeatherIngotItem;
import net.mcreator.betterores.item.FeatherHoeItem;
import net.mcreator.betterores.item.FeatherAxeItem;
import net.mcreator.betterores.item.EnderiteSwordItem;
import net.mcreator.betterores.item.EnderiteShovelItem;
import net.mcreator.betterores.item.EnderitePickaxeItem;
import net.mcreator.betterores.item.EnderiteItem;
import net.mcreator.betterores.item.EnderiteHoeItem;
import net.mcreator.betterores.item.EnderiteAxeItem;
import net.mcreator.betterores.item.DragoniteSwordItem;
import net.mcreator.betterores.item.DragoniteShovelItem;
import net.mcreator.betterores.item.DragonitePickaxeItem;
import net.mcreator.betterores.item.DragoniteItem;
import net.mcreator.betterores.item.DragoniteHoeItem;
import net.mcreator.betterores.item.DragoniteAxeItem;
import net.mcreator.betterores.item.DimensionshifterItem;
import net.mcreator.betterores.BetteroresMod;

public class BetteroresModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BetteroresMod.MODID);
	public static final RegistryObject<Item> ENDERITE_BLOCK = block(BetteroresModBlocks.ENDERITE_BLOCK);
	public static final RegistryObject<Item> ENDERITE_ORE = block(BetteroresModBlocks.ENDERITE_ORE);
	public static final RegistryObject<Item> FEATHER_ORE = block(BetteroresModBlocks.FEATHER_ORE);
	public static final RegistryObject<Item> FEATHER_BLOCK = block(BetteroresModBlocks.FEATHER_BLOCK);
	public static final RegistryObject<Item> DRAGONITE_ORE = block(BetteroresModBlocks.DRAGONITE_ORE);
	public static final RegistryObject<Item> DRAGONITE_BLOCK = block(BetteroresModBlocks.DRAGONITE_BLOCK);
	public static final RegistryObject<Item> ENDERITE_AXE = REGISTRY.register("enderite_axe", () -> new EnderiteAxeItem());
	public static final RegistryObject<Item> ENDERITE_PICKAXE = REGISTRY.register("enderite_pickaxe", () -> new EnderitePickaxeItem());
	public static final RegistryObject<Item> ENDERITE_SHOVEL = REGISTRY.register("enderite_shovel", () -> new EnderiteShovelItem());
	public static final RegistryObject<Item> ENDERITE_HOE = REGISTRY.register("enderite_hoe", () -> new EnderiteHoeItem());
	public static final RegistryObject<Item> FEATHER_PICKAXE = REGISTRY.register("feather_pickaxe", () -> new FeatherPickaxeItem());
	public static final RegistryObject<Item> FEATHER_AXE = REGISTRY.register("feather_axe", () -> new FeatherAxeItem());
	public static final RegistryObject<Item> FEATHER_SHOVEL = REGISTRY.register("feather_shovel", () -> new FeatherShovelItem());
	public static final RegistryObject<Item> FEATHER_HOE = REGISTRY.register("feather_hoe", () -> new FeatherHoeItem());
	public static final RegistryObject<Item> DRAGONITE_PICKAXE = REGISTRY.register("dragonite_pickaxe", () -> new DragonitePickaxeItem());
	public static final RegistryObject<Item> DRAGONITE_AXE = REGISTRY.register("dragonite_axe", () -> new DragoniteAxeItem());
	public static final RegistryObject<Item> DRAGONITE_SHOVEL = REGISTRY.register("dragonite_shovel", () -> new DragoniteShovelItem());
	public static final RegistryObject<Item> DRAGONITE_HOE = REGISTRY.register("dragonite_hoe", () -> new DragoniteHoeItem());
	public static final RegistryObject<Item> ENDERITE_SWORD = REGISTRY.register("enderite_sword", () -> new EnderiteSwordItem());
	public static final RegistryObject<Item> FEATHER_SWORD = REGISTRY.register("feather_sword", () -> new FeatherSwordItem());
	public static final RegistryObject<Item> DRAGONITE_SWORD = REGISTRY.register("dragonite_sword", () -> new DragoniteSwordItem());
	public static final RegistryObject<Item> UNPURE_ENDERITE = REGISTRY.register("unpure_enderite", () -> new UnpureEnderiteItem());
	public static final RegistryObject<Item> ENDERITE = REGISTRY.register("enderite", () -> new EnderiteItem());
	public static final RegistryObject<Item> RAWFEATHER = REGISTRY.register("rawfeather", () -> new RawfeatherItem());
	public static final RegistryObject<Item> FEATHER_INGOT = REGISTRY.register("feather_ingot", () -> new FeatherIngotItem());
	public static final RegistryObject<Item> UNPUREDRAGONITE = REGISTRY.register("unpuredragonite", () -> new UnpuredragoniteItem());
	public static final RegistryObject<Item> DRAGONITE = REGISTRY.register("dragonite", () -> new DragoniteItem());
	public static final RegistryObject<Item> DIMENSIONSHIFTER = REGISTRY.register("dimensionshifter", () -> new DimensionshifterItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
