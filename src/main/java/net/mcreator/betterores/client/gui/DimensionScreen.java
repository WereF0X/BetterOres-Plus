package net.mcreator.betterores.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.betterores.world.inventory.DimensionMenu;
import net.mcreator.betterores.network.DimensionButtonMessage;
import net.mcreator.betterores.BetteroresMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class DimensionScreen extends AbstractContainerScreen<DimensionMenu> {
	private final static HashMap<String, Object> guistate = DimensionMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_overworld;
	Button button_nether;
	Button button_end;

	public DimensionScreen(DimensionMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("betterores:textures/screens/dimension.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.betterores.dimension.label_dimension_shifter"), 43, 12, -10092442, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.betterores.dimension.label_choose_a_dimension_to_teleport_t"), 10, 23, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_overworld = Button.builder(Component.translatable("gui.betterores.dimension.button_overworld"), e -> {
			if (true) {
				BetteroresMod.PACKET_HANDLER.sendToServer(new DimensionButtonMessage(0, x, y, z));
				DimensionButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 49, this.topPos + 53, 72, 20).build();
		guistate.put("button:button_overworld", button_overworld);
		this.addRenderableWidget(button_overworld);
		button_nether = Button.builder(Component.translatable("gui.betterores.dimension.button_nether"), e -> {
			if (true) {
				BetteroresMod.PACKET_HANDLER.sendToServer(new DimensionButtonMessage(1, x, y, z));
				DimensionButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 56, this.topPos + 86, 56, 20).build();
		guistate.put("button:button_nether", button_nether);
		this.addRenderableWidget(button_nether);
		button_end = Button.builder(Component.translatable("gui.betterores.dimension.button_end"), e -> {
			if (true) {
				BetteroresMod.PACKET_HANDLER.sendToServer(new DimensionButtonMessage(2, x, y, z));
				DimensionButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 65, this.topPos + 121, 40, 20).build();
		guistate.put("button:button_end", button_end);
		this.addRenderableWidget(button_end);
	}
}
