
package net.mcreator.betterores.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.betterores.init.BetteroresModItems;

public class DragoniteHoeItem extends HoeItem {
	public DragoniteHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 326;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 17;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BetteroresModItems.DRAGONITE.get()));
			}
		}, 0, -3f, new Item.Properties());
	}
}
