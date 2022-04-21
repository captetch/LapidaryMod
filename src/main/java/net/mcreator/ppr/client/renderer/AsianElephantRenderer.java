
package net.mcreator.ppr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ppr.entity.AsianElephantEntity;
import net.mcreator.ppr.client.model.ModelAsian_Elephant;

public class AsianElephantRenderer extends MobRenderer<AsianElephantEntity, ModelAsian_Elephant<AsianElephantEntity>> {
	public AsianElephantRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelAsian_Elephant(context.bakeLayer(ModelAsian_Elephant.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(AsianElephantEntity entity) {
		return new ResourceLocation("ppr:textures/asian_elephant.png");
	}
}
