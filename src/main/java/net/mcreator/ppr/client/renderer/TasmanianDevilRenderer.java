
package net.mcreator.ppr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ppr.entity.TasmanianDevilEntity;
import net.mcreator.ppr.client.model.ModelTasmanianDevil;

public class TasmanianDevilRenderer extends MobRenderer<TasmanianDevilEntity, ModelTasmanianDevil<TasmanianDevilEntity>> {
	public TasmanianDevilRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTasmanianDevil(context.bakeLayer(ModelTasmanianDevil.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TasmanianDevilEntity entity) {
		return new ResourceLocation("ppr:textures/tasmaniandevil.png");
	}
}
