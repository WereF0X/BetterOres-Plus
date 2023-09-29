
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterores.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.betterores.world.inventory.RecipesMenu;
import net.mcreator.betterores.world.inventory.Recipes4Menu;
import net.mcreator.betterores.world.inventory.Recipes3Menu;
import net.mcreator.betterores.world.inventory.Recipes2Menu;
import net.mcreator.betterores.world.inventory.LocationsMenu;
import net.mcreator.betterores.world.inventory.DimensionMenu;
import net.mcreator.betterores.BetteroresMod;

public class BetteroresModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, BetteroresMod.MODID);
	public static final RegistryObject<MenuType<DimensionMenu>> DIMENSION = REGISTRY.register("dimension", () -> IForgeMenuType.create(DimensionMenu::new));
	public static final RegistryObject<MenuType<RecipesMenu>> RECIPES = REGISTRY.register("recipes", () -> IForgeMenuType.create(RecipesMenu::new));
	public static final RegistryObject<MenuType<Recipes2Menu>> RECIPES_2 = REGISTRY.register("recipes_2", () -> IForgeMenuType.create(Recipes2Menu::new));
	public static final RegistryObject<MenuType<Recipes3Menu>> RECIPES_3 = REGISTRY.register("recipes_3", () -> IForgeMenuType.create(Recipes3Menu::new));
	public static final RegistryObject<MenuType<Recipes4Menu>> RECIPES_4 = REGISTRY.register("recipes_4", () -> IForgeMenuType.create(Recipes4Menu::new));
	public static final RegistryObject<MenuType<LocationsMenu>> LOCATIONS = REGISTRY.register("locations", () -> IForgeMenuType.create(LocationsMenu::new));
}
