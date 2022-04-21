package net.mcreator.ppr.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelbaby_dodo<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ppr", "modelbaby_dodo"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelbaby_dodo(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild(
				"Head", CubeListBuilder.create().texOffs(17, 17).addBox(-1.0F, -2.75F, -2.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(0, 9).addBox(-1.5F, -3.75F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 17.9364F, -1.5449F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, 0.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(14, 5)
						.addBox(0.0F, -4.0F, 0.5F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(8, 11)
						.addBox(-5.0F, -4.0F, 0.5F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 22.0F, -2.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(13, 0).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -4.8136F, 0.7051F, -1.6144F, 0.0F, 0.0F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 15).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -3.4848F, 5.2779F, 0.0873F, 0.0F, 0.0F));
		PartDefinition RightLeg = partdefinition
				.addOrReplaceChild(
						"RightLeg", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 1.5F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
								.texOffs(7, 9).addBox(-1.0F, 3.5F, -1.25F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 20.5F, 0.25F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
				"LeftLeg", CubeListBuilder.create().texOffs(8, 18).addBox(-0.5F, 1.5F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(12, 12).addBox(-1.0F, 3.5F, -1.25F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 20.5F, 0.25F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		Head.render(poseStack, buffer, packedLight, packedOverlay);
		Body.render(poseStack, buffer, packedLight, packedOverlay);
		RightLeg.render(poseStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
