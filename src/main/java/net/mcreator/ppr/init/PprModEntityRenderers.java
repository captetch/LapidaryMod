
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ppr.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.ppr.client.renderer.TasmanianDevilRenderer;
import net.mcreator.ppr.client.renderer.SumatranOrangutanRenderer;
import net.mcreator.ppr.client.renderer.RedPandaRenderer;
import net.mcreator.ppr.client.renderer.MountainGorillaRenderer;
import net.mcreator.ppr.client.renderer.MoaRenderer;
import net.mcreator.ppr.client.renderer.IlagerHunterRenderer;
import net.mcreator.ppr.client.renderer.IberianLynxRenderer;
import net.mcreator.ppr.client.renderer.HawaiinMonkSealRenderer;
import net.mcreator.ppr.client.renderer.DodoBirdRenderer;
import net.mcreator.ppr.client.renderer.BlueMacawRenderer;
import net.mcreator.ppr.client.renderer.BengalTigerRenderer;
import net.mcreator.ppr.client.renderer.BactrianCamelRenderer;
import net.mcreator.ppr.client.renderer.BabyDodoBirdRenderer;
import net.mcreator.ppr.client.renderer.AsianElephantRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PprModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PprModEntities.ILLAGER_HUNTER.get(), IlagerHunterRenderer::new);
		event.registerEntityRenderer(PprModEntities.BLOWGUN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PprModEntities.DODO_BIRD.get(), DodoBirdRenderer::new);
		event.registerEntityRenderer(PprModEntities.DODO_EGG.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PprModEntities.BABY_DODO_BIRD.get(), BabyDodoBirdRenderer::new);
		event.registerEntityRenderer(PprModEntities.MOA.get(), MoaRenderer::new);
		event.registerEntityRenderer(PprModEntities.BLUE_MACAW.get(), BlueMacawRenderer::new);
		event.registerEntityRenderer(PprModEntities.TASMANIAN_DEVIL.get(), TasmanianDevilRenderer::new);
		event.registerEntityRenderer(PprModEntities.BACTRIAN_CAMEL.get(), BactrianCamelRenderer::new);
		event.registerEntityRenderer(PprModEntities.SUMATRAN_ORANGUTAN.get(), SumatranOrangutanRenderer::new);
		event.registerEntityRenderer(PprModEntities.MOUNTAIN_GORILLA.get(), MountainGorillaRenderer::new);
		event.registerEntityRenderer(PprModEntities.IBERIAN_LYNX.get(), IberianLynxRenderer::new);
		event.registerEntityRenderer(PprModEntities.ASIAN_ELEPHANT.get(), AsianElephantRenderer::new);
		event.registerEntityRenderer(PprModEntities.BENGAL_TIGER.get(), BengalTigerRenderer::new);
		event.registerEntityRenderer(PprModEntities.HAWAIIAN_MONK_SEAL.get(), HawaiinMonkSealRenderer::new);
		event.registerEntityRenderer(PprModEntities.RED_PANDA.get(), RedPandaRenderer::new);
	}
}
