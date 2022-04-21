
package net.mcreator.ppr.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.BlockPos;

import net.mcreator.ppr.procedures.HawaiinMonkSealRightClickedOnEntityProcedure;
import net.mcreator.ppr.procedures.HawaiinMonkSealOnEntityTickUpdateProcedure;
import net.mcreator.ppr.init.PprModEntities;

import java.util.Set;

@Mod.EventBusSubscriber
public class HawaiinMonkSealEntity extends PathfinderMob {
	private static final Set<ResourceLocation> SPAWN_BIOMES = Set.of(new ResourceLocation("warm_ocean"), new ResourceLocation("lukewarm_ocean"),
			new ResourceLocation("deep_lukewarm_ocean"));

	@SubscribeEvent
	public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
		if (SPAWN_BIOMES.contains(event.getName()))
			event.getSpawns().getSpawner(MobCategory.WATER_CREATURE)
					.add(new MobSpawnSettings.SpawnerData(PprModEntities.HAWAIIAN_MONK_SEAL.get(), 9, 1, 3));
	}

	public HawaiinMonkSealEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(PprModEntities.HAWAIIAN_MONK_SEAL.get(), world);
	}

	public HawaiinMonkSealEntity(EntityType<HawaiinMonkSealEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (HawaiinMonkSealEntity.this.isInWater())
					HawaiinMonkSealEntity.this.setDeltaMovement(HawaiinMonkSealEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !HawaiinMonkSealEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - HawaiinMonkSealEntity.this.getX();
					double dy = this.wantedY - HawaiinMonkSealEntity.this.getY();
					double dz = this.wantedZ - HawaiinMonkSealEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * HawaiinMonkSealEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					HawaiinMonkSealEntity.this.setYRot(this.rotlerp(HawaiinMonkSealEntity.this.getYRot(), f, 10));
					HawaiinMonkSealEntity.this.yBodyRot = HawaiinMonkSealEntity.this.getYRot();
					HawaiinMonkSealEntity.this.yHeadRot = HawaiinMonkSealEntity.this.getYRot();
					if (HawaiinMonkSealEntity.this.isInWater()) {
						HawaiinMonkSealEntity.this.setSpeed((float) HawaiinMonkSealEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						HawaiinMonkSealEntity.this.setXRot(this.rotlerp(HawaiinMonkSealEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(HawaiinMonkSealEntity.this.getXRot() * (float) (Math.PI / 180.0));
						HawaiinMonkSealEntity.this.setZza(f3 * f1);
						HawaiinMonkSealEntity.this.setYya((float) (f1 * dy));
					} else {
						HawaiinMonkSealEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					HawaiinMonkSealEntity.this.setSpeed(0);
					HawaiinMonkSealEntity.this.setYya(0);
					HawaiinMonkSealEntity.this.setZza(0);
				}
			}
		};
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new WaterBoundPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new RandomSwimmingGoal(this, 1.5, 40));
		this.goalSelector.addGoal(2, new PanicGoal(this, 1.2));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ppr:seal_roar"));
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fish.swim")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ppr:seal_roar"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.silverfish.death"));
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
		super.mobInteract(sourceentity, hand);
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;

		HawaiinMonkSealRightClickedOnEntityProcedure.execute(world, x, y, z, entity, sourceentity);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		HawaiinMonkSealOnEntityTickUpdateProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	public boolean canBreatheUnderwater() {
		return true;
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	@Override
	public boolean isPushedByFluid() {
		return false;
	}

	public static void init() {
		SpawnPlacements.register(PprModEntities.HAWAIIAN_MONK_SEAL.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos,
						random) -> (world.getBlockState(pos).is(Blocks.WATER) && world.getBlockState(pos.above()).is(Blocks.WATER)));
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 30);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0.3);
		return builder;
	}
}
