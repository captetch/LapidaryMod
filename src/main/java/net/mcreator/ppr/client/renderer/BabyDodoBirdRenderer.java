
package net.mcreator.ppr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ppr.entity.BabyDodoBirdEntity;
import net.mcreator.ppr.client.model.Modelbaby_dodo_bird;

public class BabyDodoBirdRenderer extends MobRenderer<BabyDodoBirdEntity, Modelbaby_dodo_bird<BabyDodoBirdEntity>> {
	public BabyDodoBirdRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbaby_dodo_bird(context.bakeLayer(Modelbaby_dodo_bird.LAYER_LOCATION)), 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(BabyDodoBirdEntity entity) {
		return new ResourceLocation("ppr:textures/baby_dodo_bird.png");
	}
}
