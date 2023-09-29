
package net.mcreator.betterores.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.betterores.init.BetteroresModItems;

public class EnderiteAxeItem extends AxeItem {
	public EnderiteAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 293;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 16;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BetteroresModItems.ENDERITE.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
