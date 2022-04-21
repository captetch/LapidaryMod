
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ppr.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PprModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("ppr", "elephant_roar"), new SoundEvent(new ResourceLocation("ppr", "elephant_roar")));
		REGISTRY.put(new ResourceLocation("ppr", "gorilla_roar"), new SoundEvent(new ResourceLocation("ppr", "gorilla_roar")));
		REGISTRY.put(new ResourceLocation("ppr", "lynx_roar"), new SoundEvent(new ResourceLocation("ppr", "lynx_roar")));
		REGISTRY.put(new ResourceLocation("ppr", "orangutan_roar"), new SoundEvent(new ResourceLocation("ppr", "orangutan_roar")));
		REGISTRY.put(new ResourceLocation("ppr", "tiger_roar"), new SoundEvent(new ResourceLocation("ppr", "tiger_roar")));
		REGISTRY.put(new ResourceLocation("ppr", "seal_roar"), new SoundEvent(new ResourceLocation("ppr", "seal_roar")));
		REGISTRY.put(new ResourceLocation("ppr", "tasmanian_devil_hit"), new SoundEvent(new ResourceLocation("ppr", "tasmanian_devil_hit")));
		REGISTRY.put(new ResourceLocation("ppr", "camel_roar"), new SoundEvent(new ResourceLocation("ppr", "camel_roar")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
