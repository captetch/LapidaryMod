package net.mcreator.ppr.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

public class RedPandaRightClickedOnEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.is(ItemTags.create(new ResourceLocation("forge:flowers")))) {
			if (entity.getPersistentData().getBoolean("brewingpotion") == true) {
				if (Math.random() < 0.15) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400, 2, (false), (false)));
				} else if (Math.random() < 0.15) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 400, 2, (false), (false)));
				} else if (Math.random() < 0.15) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 400, 2, (false), (false)));
				} else if (Math.random() < 0.15) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.HEAL, 400, 2, (false), (false)));
				} else if (Math.random() < 0.15) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 400, 2, (false), (false)));
				} else if (Math.random() < 0.15) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 400, 2, (false), (false)));
				} else if (Math.random() < 0.15) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 400, 2, (false), (false)));
				} else if (Math.random() < 0.15) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 400, 2, (false), (false)));
				} else if (Math.random() < 0.15) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 400, 2, (false), (false)));
				} else if (Math.random() < 0.15) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 400, 2, (false), (false)));
				} else if (Math.random() < 0.15) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, (false), (false)));
				}
				entity.getPersistentData().putBoolean("brewingpotion", (false));
			}
		}
	}
}
