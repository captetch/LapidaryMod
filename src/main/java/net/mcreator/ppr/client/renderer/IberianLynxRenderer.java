
package net.mcreator.ppr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ppr.entity.IberianLynxEntity;
import net.mcreator.ppr.client.model.ModelIberian_Lynx;

public class IberianLynxRenderer extends MobRenderer<IberianLynxEntity, ModelIberian_Lynx<IberianLynxEntity>> {
	public IberianLynxRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelIberian_Lynx(context.bakeLayer(ModelIberian_Lynx.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(IberianLynxEntity entity) {
		return new ResourceLocation("ppr:textures/iberian_lynx.png");
	}
}
