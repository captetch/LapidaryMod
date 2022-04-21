
package net.mcreator.ppr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ppr.entity.BlueMacawEntity;
import net.mcreator.ppr.client.model.Modelblue_macaw;

public class BlueMacawRenderer extends MobRenderer<BlueMacawEntity, Modelblue_macaw<BlueMacawEntity>> {
	public BlueMacawRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelblue_macaw(context.bakeLayer(Modelblue_macaw.LAYER_LOCATION)), 0.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(BlueMacawEntity entity) {
		return new ResourceLocation("ppr:textures/blue_macaw.png");
	}
}
