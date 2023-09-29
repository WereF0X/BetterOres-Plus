
package net.mcreator.betterores.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EnderiteItem extends Item {
	public EnderiteItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
