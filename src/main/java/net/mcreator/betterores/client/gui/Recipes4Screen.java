package net.mcreator.betterores.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.betterores.world.inventory.Recipes4Menu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class Recipes4Screen extends AbstractContainerScreen<Recipes4Menu> {
	private final static HashMap<String, Object> guistate = Recipes4Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public Recipes4Screen(Recipes4Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("betterores:textures/screens/recipes_4.png");

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

		guiGraphics.blit(new ResourceLocation("betterores:textures/screens/as.png"), this.leftPos + 15, this.topPos + 20, 0, 0, 150, 70, 150, 70);

		guiGraphics.blit(new ResourceLocation("betterores:textures/screens/w.png"), this.leftPos + 12, this.topPos + 83, 0, 0, 150, 70, 150, 70);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.betterores.recipes_4.label_recipes"), 72, 6, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.betterores.recipes_4.label_m"), 75, 19, -10092442, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.betterores.recipes_4.label_empty"), 85, 20, -11513776, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.betterores.recipes_4.label_i"), 84, 19, -10066330, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.betterores.recipes_4.label_x"), 93, 19, -39424, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
