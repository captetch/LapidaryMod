
package net.mcreator.ppr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ppr.entity.MountainGorillaEntity;
import net.mcreator.ppr.client.model.Modelmountain_gorilla;

public class MountainGorillaRenderer extends MobRenderer<MountainGorillaEntity, Modelmountain_gorilla<MountainGorillaEntity>> {
	public MountainGorillaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmountain_gorilla(context.bakeLayer(Modelmountain_gorilla.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MountainGorillaEntity entity) {
		return new ResourceLocation("ppr:textures/mountain_gorilla.png");
	}
}
