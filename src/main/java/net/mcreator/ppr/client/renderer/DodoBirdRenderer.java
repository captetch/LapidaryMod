
package net.mcreator.ppr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ppr.entity.DodoBirdEntity;
import net.mcreator.ppr.client.model.Modeldodo_bird;

public class DodoBirdRenderer extends MobRenderer<DodoBirdEntity, Modeldodo_bird<DodoBirdEntity>> {
	public DodoBirdRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldodo_bird(context.bakeLayer(Modeldodo_bird.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DodoBirdEntity entity) {
		return new ResourceLocation("ppr:textures/dodo_bird.png");
	}
}
