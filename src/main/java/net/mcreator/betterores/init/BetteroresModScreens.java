
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterores.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.betterores.client.gui.RecipesScreen;
import net.mcreator.betterores.client.gui.Recipes4Screen;
import net.mcreator.betterores.client.gui.Recipes3Screen;
import net.mcreator.betterores.client.gui.Recipes2Screen;
import net.mcreator.betterores.client.gui.LocationsScreen;
import net.mcreator.betterores.client.gui.DimensionScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BetteroresModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(BetteroresModMenus.DIMENSION.get(), DimensionScreen::new);
			MenuScreens.register(BetteroresModMenus.RECIPES.get(), RecipesScreen::new);
			MenuScreens.register(BetteroresModMenus.RECIPES_2.get(), Recipes2Screen::new);
			MenuScreens.register(BetteroresModMenus.RECIPES_3.get(), Recipes3Screen::new);
			MenuScreens.register(BetteroresModMenus.RECIPES_4.get(), Recipes4Screen::new);
			MenuScreens.register(BetteroresModMenus.LOCATIONS.get(), LocationsScreen::new);
		});
	}
}
