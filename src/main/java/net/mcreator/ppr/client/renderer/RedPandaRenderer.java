
package net.mcreator.ppr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ppr.entity.RedPandaEntity;
import net.mcreator.ppr.client.model.Modelred_panda;

public class RedPandaRenderer extends MobRenderer<RedPandaEntity, Modelred_panda<RedPandaEntity>> {
	public RedPandaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelred_panda(context.bakeLayer(Modelred_panda.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RedPandaEntity entity) {
		return new ResourceLocation("ppr:textures/red_panda.png");
	}
}
