
package net.mcreator.ppr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ppr.entity.BactrianCamelEntity;
import net.mcreator.ppr.client.model.Modelcamel;

public class BactrianCamelRenderer extends MobRenderer<BactrianCamelEntity, Modelcamel<BactrianCamelEntity>> {
	public BactrianCamelRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcamel(context.bakeLayer(Modelcamel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BactrianCamelEntity entity) {
		return new ResourceLocation("ppr:textures/camel.png");
	}
}
