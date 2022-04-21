
package net.mcreator.ppr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ppr.entity.IlagerHunterEntity;
import net.mcreator.ppr.client.model.Modelillager_hunter;

public class IlagerHunterRenderer extends MobRenderer<IlagerHunterEntity, Modelillager_hunter<IlagerHunterEntity>> {
	public IlagerHunterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelillager_hunter(context.bakeLayer(Modelillager_hunter.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(IlagerHunterEntity entity) {
		return new ResourceLocation("ppr:textures/pillager_hunter.png");
	}
}
