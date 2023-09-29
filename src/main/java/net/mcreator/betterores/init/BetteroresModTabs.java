
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterores.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.betterores.BetteroresMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BetteroresModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetteroresMod.MODID);
	public static final RegistryObject<CreativeModeTab> BETTER_ORES = REGISTRY.register("better_ores",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.betterores.better_ores")).icon(() -> new ItemStack(Blocks.AMETHYST_CLUSTER)).displayItems((parameters, tabData) -> {
				tabData.accept(BetteroresModItems.UNPURE_ENDERITE.get());
				tabData.accept(BetteroresModItems.ENDERITE.get());
				tabData.accept(BetteroresModItems.RAWFEATHER.get());
				tabData.accept(BetteroresModItems.FEATHER_INGOT.get());
				tabData.accept(BetteroresModItems.UNPUREDRAGONITE.get());
				tabData.accept(BetteroresModItems.DRAGONITE.get());
				tabData.accept(BetteroresModItems.DIMENSIONSHIFTER.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(BetteroresModBlocks.ENDERITE_BLOCK.get().asItem());
			tabData.accept(BetteroresModBlocks.ENDERITE_ORE.get().asItem());
			tabData.accept(BetteroresModBlocks.FEATHER_ORE.get().asItem());
			tabData.accept(BetteroresModBlocks.FEATHER_BLOCK.get().asItem());
			tabData.accept(BetteroresModBlocks.DRAGONITE_ORE.get().asItem());
			tabData.accept(BetteroresModBlocks.DRAGONITE_BLOCK.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(BetteroresModItems.ENDERITE_SWORD.get());
			tabData.accept(BetteroresModItems.FEATHER_SWORD.get());
			tabData.accept(BetteroresModItems.DRAGONITE_SWORD.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(BetteroresModItems.ENDERITE_AXE.get());
			tabData.accept(BetteroresModItems.ENDERITE_PICKAXE.get());
			tabData.accept(BetteroresModItems.ENDERITE_SHOVEL.get());
			tabData.accept(BetteroresModItems.ENDERITE_HOE.get());
			tabData.accept(BetteroresModItems.FEATHER_PICKAXE.get());
			tabData.accept(BetteroresModItems.FEATHER_AXE.get());
			tabData.accept(BetteroresModItems.FEATHER_SHOVEL.get());
			tabData.accept(BetteroresModItems.FEATHER_HOE.get());
			tabData.accept(BetteroresModItems.DRAGONITE_PICKAXE.get());
			tabData.accept(BetteroresModItems.DRAGONITE_AXE.get());
			tabData.accept(BetteroresModItems.DRAGONITE_SHOVEL.get());
			tabData.accept(BetteroresModItems.DRAGONITE_HOE.get());
		}
	}
}
