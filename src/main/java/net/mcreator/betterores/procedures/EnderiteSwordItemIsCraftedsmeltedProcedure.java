package net.mcreator.betterores.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.betterores.BetteroresMod;

public class EnderiteSwordItemIsCraftedsmeltedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.DRAGON_BREATH, x, (y + 1), z, 7, 3, 3, 3, 1);
		BetteroresMod.queueServerWork(6, () -> {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.DRAGON_BREATH, x, (y + 2), z, 7, 3, 3, 3, 1);
		});
	}
}
