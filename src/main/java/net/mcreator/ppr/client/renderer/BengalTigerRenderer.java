
package net.mcreator.ppr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ppr.entity.BengalTigerEntity;
import net.mcreator.ppr.client.model.ModelBengal_tiger;

public class BengalTigerRenderer extends MobRenderer<BengalTigerEntity, ModelBengal_tiger<BengalTigerEntity>> {
	public BengalTigerRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBengal_tiger(context.bakeLayer(ModelBengal_tiger.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BengalTigerEntity entity) {
		return new ResourceLocation("ppr:textures/bengal_tiger.png");
	}
}
