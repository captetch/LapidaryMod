
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ppr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.ppr.entity.TasmanianDevilEntity;
import net.mcreator.ppr.entity.SumatranOrangutanEntity;
import net.mcreator.ppr.entity.RedPandaEntity;
import net.mcreator.ppr.entity.MountainGorillaEntity;
import net.mcreator.ppr.entity.MoaEntity;
import net.mcreator.ppr.entity.IlagerHunterEntity;
import net.mcreator.ppr.entity.IberianLynxEntity;
import net.mcreator.ppr.entity.HawaiinMonkSealEntity;
import net.mcreator.ppr.entity.DodoEggEntity;
import net.mcreator.ppr.entity.DodoBirdEntity;
import net.mcreator.ppr.entity.BlueMacawEntity;
import net.mcreator.ppr.entity.BlowgunEntity;
import net.mcreator.ppr.entity.BengalTigerEntity;
import net.mcreator.ppr.entity.BactrianCamelEntity;
import net.mcreator.ppr.entity.BabyDodoBirdEntity;
import net.mcreator.ppr.entity.AsianElephantEntity;
import net.mcreator.ppr.PprMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PprModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, PprMod.MODID);
	public static final RegistryObject<EntityType<IlagerHunterEntity>> ILLAGER_HUNTER = register("illager_hunter",
			EntityType.Builder.<IlagerHunterEntity>of(IlagerHunterEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(IlagerHunterEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BlowgunEntity>> BLOWGUN = register("projectile_blowgun",
			EntityType.Builder.<BlowgunEntity>of(BlowgunEntity::new, MobCategory.MISC).setCustomClientFactory(BlowgunEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DodoBirdEntity>> DODO_BIRD = register("dodo_bird",
			EntityType.Builder.<DodoBirdEntity>of(DodoBirdEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DodoBirdEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<DodoEggEntity>> DODO_EGG = register("projectile_dodo_egg",
			EntityType.Builder.<DodoEggEntity>of(DodoEggEntity::new, MobCategory.MISC).setCustomClientFactory(DodoEggEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BabyDodoBirdEntity>> BABY_DODO_BIRD = register("baby_dodo_bird",
			EntityType.Builder.<BabyDodoBirdEntity>of(BabyDodoBirdEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyDodoBirdEntity::new)

					.sized(0.6f, 0.5f));
	public static final RegistryObject<EntityType<MoaEntity>> MOA = register("moa",
			EntityType.Builder.<MoaEntity>of(MoaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(128)
					.setUpdateInterval(3).setCustomClientFactory(MoaEntity::new)

					.sized(0.6f, 2f));
	public static final RegistryObject<EntityType<BlueMacawEntity>> BLUE_MACAW = register("blue_macaw",
			EntityType.Builder.<BlueMacawEntity>of(BlueMacawEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlueMacawEntity::new)

					.sized(0.6f, 0.5f));
	public static final RegistryObject<EntityType<TasmanianDevilEntity>> TASMANIAN_DEVIL = register("tasmanian_devil",
			EntityType.Builder.<TasmanianDevilEntity>of(TasmanianDevilEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TasmanianDevilEntity::new)

					.sized(0.6f, 0.7000000000000001f));
	public static final RegistryObject<EntityType<BactrianCamelEntity>> BACTRIAN_CAMEL = register("bactrian_camel",
			EntityType.Builder.<BactrianCamelEntity>of(BactrianCamelEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BactrianCamelEntity::new)

					.sized(1f, 2f));
	public static final RegistryObject<EntityType<SumatranOrangutanEntity>> SUMATRAN_ORANGUTAN = register("sumatran_orangutan",
			EntityType.Builder.<SumatranOrangutanEntity>of(SumatranOrangutanEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SumatranOrangutanEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MountainGorillaEntity>> MOUNTAIN_GORILLA = register("mountain_gorilla",
			EntityType.Builder.<MountainGorillaEntity>of(MountainGorillaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MountainGorillaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<IberianLynxEntity>> IBERIAN_LYNX = register("iberian_lynx",
			EntityType.Builder.<IberianLynxEntity>of(IberianLynxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(IberianLynxEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<AsianElephantEntity>> ASIAN_ELEPHANT = register("asian_elephant",
			EntityType.Builder.<AsianElephantEntity>of(AsianElephantEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AsianElephantEntity::new)

					.sized(1.5f, 3.5f));
	public static final RegistryObject<EntityType<BengalTigerEntity>> BENGAL_TIGER = register("bengal_tiger",
			EntityType.Builder.<BengalTigerEntity>of(BengalTigerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BengalTigerEntity::new)

					.sized(0.6f, 1.5f));
	public static final RegistryObject<EntityType<HawaiinMonkSealEntity>> HAWAIIAN_MONK_SEAL = register("hawaiian_monk_seal",
			EntityType.Builder.<HawaiinMonkSealEntity>of(HawaiinMonkSealEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HawaiinMonkSealEntity::new)

					.sized(0.6f, 0.5f));
	public static final RegistryObject<EntityType<RedPandaEntity>> RED_PANDA = register("red_panda",
			EntityType.Builder.<RedPandaEntity>of(RedPandaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RedPandaEntity::new)

					.sized(0.6f, 0.4f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			IlagerHunterEntity.init();
			DodoBirdEntity.init();
			BabyDodoBirdEntity.init();
			MoaEntity.init();
			BlueMacawEntity.init();
			TasmanianDevilEntity.init();
			BactrianCamelEntity.init();
			SumatranOrangutanEntity.init();
			MountainGorillaEntity.init();
			IberianLynxEntity.init();
			AsianElephantEntity.init();
			BengalTigerEntity.init();
			HawaiinMonkSealEntity.init();
			RedPandaEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ILLAGER_HUNTER.get(), IlagerHunterEntity.createAttributes().build());
		event.put(DODO_BIRD.get(), DodoBirdEntity.createAttributes().build());
		event.put(BABY_DODO_BIRD.get(), BabyDodoBirdEntity.createAttributes().build());
		event.put(MOA.get(), MoaEntity.createAttributes().build());
		event.put(BLUE_MACAW.get(), BlueMacawEntity.createAttributes().build());
		event.put(TASMANIAN_DEVIL.get(), TasmanianDevilEntity.createAttributes().build());
		event.put(BACTRIAN_CAMEL.get(), BactrianCamelEntity.createAttributes().build());
		event.put(SUMATRAN_ORANGUTAN.get(), SumatranOrangutanEntity.createAttributes().build());
		event.put(MOUNTAIN_GORILLA.get(), MountainGorillaEntity.createAttributes().build());
		event.put(IBERIAN_LYNX.get(), IberianLynxEntity.createAttributes().build());
		event.put(ASIAN_ELEPHANT.get(), AsianElephantEntity.createAttributes().build());
		event.put(BENGAL_TIGER.get(), BengalTigerEntity.createAttributes().build());
		event.put(HAWAIIAN_MONK_SEAL.get(), HawaiinMonkSealEntity.createAttributes().build());
		event.put(RED_PANDA.get(), RedPandaEntity.createAttributes().build());
	}
}
