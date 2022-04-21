
package net.mcreator.ppr.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
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
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.BlockPos;

import net.mcreator.ppr.procedures.DodoBirdRightClickedOnEntityProcedure;
import net.mcreator.ppr.procedures.DodoBirdOnInitialEntitySpawnProcedure;
import net.mcreator.ppr.init.PprModEntities;

import java.util.Set;

@Mod.EventBusSubscriber
public class DodoBirdEntity extends PathfinderMob {
	private static final Set<ResourceLocation> SPAWN_BIOMES = Set.of(new ResourceLocation("savanna_plateau"), new ResourceLocation("savanna"),
			new ResourceLocation("windswept_savanna"), new ResourceLocation("swamp"));

	@SubscribeEvent
	public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
		if (SPAWN_BIOMES.contains(event.getName()))
			event.getSpawns().getSpawner(MobCategory.CREATURE).add(new MobSpawnSettings.SpawnerData(PprModEntities.DODO_BIRD.get(), 10, 1, 1));
	}

	public DodoBirdEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(PprModEntities.DODO_BIRD.get(), world);
	}

	public DodoBirdEntity(EntityType<DodoBirdEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new TemptGoal(this, 1, Ingredient.of(Items.APPLE), false));
		this.goalSelector.addGoal(2, new TemptGoal(this, 1, Ingredient.of(Items.SWEET_BERRIES), false));
		this.goalSelector.addGoal(3, new TemptGoal(this, 1, Ingredient.of(Items.MELON_SLICE), false));
		this.goalSelector.addGoal(4, new TemptGoal(this, 1, Ingredient.of(Items.GLOW_BERRIES), false));
		this.goalSelector.addGoal(5, new RemoveBlockGoal(Blocks.CARROTS, this, 3, (int) 10));
		this.goalSelector.addGoal(6, new RemoveBlockGoal(Blocks.POTATOES, this, 3, (int) 10));
		this.goalSelector.addGoal(7, new RemoveBlockGoal(Blocks.BEETROOTS, this, 3, (int) 10));
		this.goalSelector.addGoal(8, new RemoveBlockGoal(Blocks.PUMPKIN_STEM, this, 3, (int) 10));
		this.goalSelector.addGoal(9, new RemoveBlockGoal(Blocks.ATTACHED_PUMPKIN_STEM, this, 3, (int) 10));
		this.goalSelector.addGoal(10, new RemoveBlockGoal(Blocks.MELON_STEM, this, 3, (int) 10));
		this.goalSelector.addGoal(11, new RemoveBlockGoal(Blocks.ATTACHED_MELON_STEM, this, 3, (int) 10));
		this.goalSelector.addGoal(12, new RemoveBlockGoal(Blocks.WHEAT, this, 3, (int) 10));
		this.goalSelector.addGoal(13, new RemoveBlockGoal(Blocks.SUGAR_CANE, this, 3, (int) 10));
		this.goalSelector.addGoal(14, new PanicGoal(this, 1.2));
		this.goalSelector.addGoal(15, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(16, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(17, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.chicken.ambient"));
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.chicken.step")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.chicken.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.chicken.death"));
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

		DodoBirdRightClickedOnEntityProcedure.execute(world, x, y, z, entity, sourceentity);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		DodoBirdOnInitialEntitySpawnProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
	}

	public static void init() {
		SpawnPlacements.register(PprModEntities.DODO_BIRD.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos,
						random) -> (world.getBlockState(pos.below()).getMaterial() == Material.GRASS && world.getRawBrightness(pos, 0) > 8));
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 20);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		return builder;
	}
}
