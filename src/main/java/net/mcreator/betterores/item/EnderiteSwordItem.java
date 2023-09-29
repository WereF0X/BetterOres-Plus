
package net.mcreator.betterores.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.betterores.procedures.EnderiteSwordRightclickedProcedure;
import net.mcreator.betterores.procedures.EnderiteSwordItemIsCraftedsmeltedProcedure;
import net.mcreator.betterores.init.BetteroresModItems;

public class EnderiteSwordItem extends SwordItem {
	public EnderiteSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 293;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 5f;
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
		}, 3, -2.4f, new Item.Properties());
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		EnderiteSwordRightclickedProcedure.execute(entity.getX(), entity.getY(), entity.getZ(), entity, ar.getObject());
		return ar;
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		EnderiteSwordItemIsCraftedsmeltedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ());
	}
}
