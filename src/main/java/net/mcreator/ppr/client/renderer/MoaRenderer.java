
package net.mcreator.ppr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ppr.entity.MoaEntity;
import net.mcreator.ppr.client.model.Modelmoa;

public class MoaRenderer extends MobRenderer<MoaEntity, Modelmoa<MoaEntity>> {
	public MoaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmoa(context.bakeLayer(Modelmoa.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MoaEntity entity) {
		return new ResourceLocation("ppr:textures/moa.png");
	}
}
