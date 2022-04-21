
package net.mcreator.ppr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ppr.entity.HawaiinMonkSealEntity;
import net.mcreator.ppr.client.model.ModelHawaiian_monk_seal;

public class HawaiinMonkSealRenderer extends MobRenderer<HawaiinMonkSealEntity, ModelHawaiian_monk_seal<HawaiinMonkSealEntity>> {
	public HawaiinMonkSealRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelHawaiian_monk_seal(context.bakeLayer(ModelHawaiian_monk_seal.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HawaiinMonkSealEntity entity) {
		return new ResourceLocation("ppr:textures/hawaiian_monk_seal.png");
	}
}
