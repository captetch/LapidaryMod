
package net.mcreator.ppr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ppr.entity.SumatranOrangutanEntity;
import net.mcreator.ppr.client.model.ModelOrangutangun;

public class SumatranOrangutanRenderer extends MobRenderer<SumatranOrangutanEntity, ModelOrangutangun<SumatranOrangutanEntity>> {
	public SumatranOrangutanRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelOrangutangun(context.bakeLayer(ModelOrangutangun.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SumatranOrangutanEntity entity) {
		return new ResourceLocation("ppr:textures/orangutangun.png");
	}
}
