
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ppr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.ppr.item.PoisonDartItem;
import net.mcreator.ppr.item.DodoEggItem;
import net.mcreator.ppr.item.BlowgunItem;
import net.mcreator.ppr.PprMod;

public class PprModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PprMod.MODID);
	public static final RegistryObject<Item> ILLAGER_HUNTER = REGISTRY.register("illager_hunter_spawn_egg",
			() -> new ForgeSpawnEggItem(PprModEntities.ILLAGER_HUNTER, -13882324, -14801893, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> POISON_DART = REGISTRY.register("poison_dart", () -> new PoisonDartItem());
	public static final RegistryObject<Item> BLOWGUN = REGISTRY.register("blowgun", () -> new BlowgunItem());
	public static final RegistryObject<Item> DODO_BIRD = REGISTRY.register("dodo_bird_spawn_egg",
			() -> new ForgeSpawnEggItem(PprModEntities.DODO_BIRD, -8890047, -1119264, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> DODO_EGG = REGISTRY.register("dodo_egg", () -> new DodoEggItem());
	public static final RegistryObject<Item> MOA = REGISTRY.register("moa_spawn_egg",
			() -> new ForgeSpawnEggItem(PprModEntities.MOA, -9873589, -15276, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BLUE_MACAW = REGISTRY.register("blue_macaw_spawn_egg",
			() -> new ForgeSpawnEggItem(PprModEntities.BLUE_MACAW, -10126337, -6770177, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TASMANIAN_DEVIL = REGISTRY.register("tasmanian_devil_spawn_egg",
			() -> new ForgeSpawnEggItem(PprModEntities.TASMANIAN_DEVIL, -15856113, -15263451, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BACTRIAN_CAMEL = REGISTRY.register("bactrian_camel_spawn_egg",
			() -> new ForgeSpawnEggItem(PprModEntities.BACTRIAN_CAMEL, -6058660, -2373734, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SUMATRAN_ORANGUTAN = REGISTRY.register("sumatran_orangutan_spawn_egg",
			() -> new ForgeSpawnEggItem(PprModEntities.SUMATRAN_ORANGUTAN, -1994440, -15856114, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MOUNTAIN_GORILLA = REGISTRY.register("mountain_gorilla_spawn_egg",
			() -> new ForgeSpawnEggItem(PprModEntities.MOUNTAIN_GORILLA, -15000803, -14869476, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> IBERIAN_LYNX = REGISTRY.register("iberian_lynx_spawn_egg",
			() -> new ForgeSpawnEggItem(PprModEntities.IBERIAN_LYNX, -9808576, -13094350, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ASIAN_ELEPHANT = REGISTRY.register("asian_elephant_spawn_egg",
			() -> new ForgeSpawnEggItem(PprModEntities.ASIAN_ELEPHANT, -14344419, -12765642, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BENGAL_TIGER = REGISTRY.register("bengal_tiger_spawn_egg",
			() -> new ForgeSpawnEggItem(PprModEntities.BENGAL_TIGER, -2067175, -15527149, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> HAWAIIAN_MONK_SEAL = REGISTRY.register("hawaiian_monk_seal_spawn_egg",
			() -> new ForgeSpawnEggItem(PprModEntities.HAWAIIAN_MONK_SEAL, -11844797, -10462630,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> RED_PANDA = REGISTRY.register("red_panda_spawn_egg",
			() -> new ForgeSpawnEggItem(PprModEntities.RED_PANDA, -831488, -14345705, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
