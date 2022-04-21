
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ppr.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.ppr.client.model.Modelred_panda;
import net.mcreator.ppr.client.model.Modelmountain_gorilla;
import net.mcreator.ppr.client.model.Modelmoa;
import net.mcreator.ppr.client.model.Modelillager_hunter;
import net.mcreator.ppr.client.model.Modeldodo_bird;
import net.mcreator.ppr.client.model.Modelcamel;
import net.mcreator.ppr.client.model.Modelblue_macaw;
import net.mcreator.ppr.client.model.Modelbaby_dodo_bird;
import net.mcreator.ppr.client.model.ModelTasmanianDevil;
import net.mcreator.ppr.client.model.ModelOrangutangun;
import net.mcreator.ppr.client.model.ModelIberian_Lynx;
import net.mcreator.ppr.client.model.ModelHawaiian_monk_seal;
import net.mcreator.ppr.client.model.ModelBengal_tiger;
import net.mcreator.ppr.client.model.ModelAsian_Elephant;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PprModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelBengal_tiger.LAYER_LOCATION, ModelBengal_tiger::createBodyLayer);
		event.registerLayerDefinition(ModelAsian_Elephant.LAYER_LOCATION, ModelAsian_Elephant::createBodyLayer);
		event.registerLayerDefinition(Modeldodo_bird.LAYER_LOCATION, Modeldodo_bird::createBodyLayer);
		event.registerLayerDefinition(Modelbaby_dodo_bird.LAYER_LOCATION, Modelbaby_dodo_bird::createBodyLayer);
		event.registerLayerDefinition(Modelillager_hunter.LAYER_LOCATION, Modelillager_hunter::createBodyLayer);
		event.registerLayerDefinition(Modelmountain_gorilla.LAYER_LOCATION, Modelmountain_gorilla::createBodyLayer);
		event.registerLayerDefinition(Modelmoa.LAYER_LOCATION, Modelmoa::createBodyLayer);
		event.registerLayerDefinition(ModelIberian_Lynx.LAYER_LOCATION, ModelIberian_Lynx::createBodyLayer);
		event.registerLayerDefinition(Modelblue_macaw.LAYER_LOCATION, Modelblue_macaw::createBodyLayer);
		event.registerLayerDefinition(Modelcamel.LAYER_LOCATION, Modelcamel::createBodyLayer);
		event.registerLayerDefinition(ModelHawaiian_monk_seal.LAYER_LOCATION, ModelHawaiian_monk_seal::createBodyLayer);
		event.registerLayerDefinition(ModelOrangutangun.LAYER_LOCATION, ModelOrangutangun::createBodyLayer);
		event.registerLayerDefinition(Modelred_panda.LAYER_LOCATION, Modelred_panda::createBodyLayer);
		event.registerLayerDefinition(ModelTasmanianDevil.LAYER_LOCATION, ModelTasmanianDevil::createBodyLayer);
	}
}
