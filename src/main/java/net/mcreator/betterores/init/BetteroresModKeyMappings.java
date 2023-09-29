
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterores.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.betterores.network.RecMessage;
import net.mcreator.betterores.network.LocationsrMessage;
import net.mcreator.betterores.BetteroresMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BetteroresModKeyMappings {
	public static final KeyMapping REC = new KeyMapping("key.betterores.rec", GLFW.GLFW_KEY_Y, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				BetteroresMod.PACKET_HANDLER.sendToServer(new RecMessage(0, 0));
				RecMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping LOCATIONSR = new KeyMapping("key.betterores.locationsr", GLFW.GLFW_KEY_U, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				BetteroresMod.PACKET_HANDLER.sendToServer(new LocationsrMessage(0, 0));
				LocationsrMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(REC);
		event.register(LOCATIONSR);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				REC.consumeClick();
				LOCATIONSR.consumeClick();
			}
		}
	}
}
