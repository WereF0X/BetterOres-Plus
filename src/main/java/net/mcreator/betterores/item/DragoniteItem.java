
package net.mcreator.betterores.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DragoniteItem extends Item {
	public DragoniteItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
