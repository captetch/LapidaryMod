package net.mcreator.ppr.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class BlowgunProjectileHitsPlayerProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!(sourceentity == entity) && entity instanceof LivingEntity && !((entity.getVehicle()) == sourceentity)
				&& !((sourceentity.getVehicle()) == entity)) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 600, 1, (false), (false)));
		}
	}
}
