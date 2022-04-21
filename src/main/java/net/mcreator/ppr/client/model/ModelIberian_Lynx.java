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
public class ModelIberian_Lynx<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ppr", "model_iberian_lynx"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart LeftLeg1;
	public final ModelPart RightLeg1;
	public final ModelPart LeftLeg2;
	public final ModelPart RightLeg2;

	public ModelIberian_Lynx(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.LeftLeg1 = root.getChild("LeftLeg1");
		this.RightLeg1 = root.getChild("RightLeg1");
		this.LeftLeg2 = root.getChild("LeftLeg2");
		this.RightLeg2 = root.getChild("RightLeg2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(18, 35).addBox(2.4889F, -3.6078F, -4.4807F, 3.0F, 7.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(0, 5).addBox(-1.5111F, -0.6078F, -7.9807F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(27, 8)
						.addBox(-4.5111F, -0.6078F, -7.4807F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 35)
						.addBox(-5.5111F, -3.6078F, -4.4807F, 3.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(26, 27)
						.addBox(1.4889F, -0.6078F, -7.4807F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 18).addBox(-2.5111F, -3.6078F,
								-6.9807F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5111F, 12.6078F, -3.0193F));
		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(15, 18).addBox(2.25F, -0.75F, 1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)).texOffs(0, 18)
						.addBox(2.25F, -2.75F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-1.0111F, -6.1078F, -5.9807F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(20, 18).addBox(-2.0F, 0.25F, -3.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0111F, -1.1078F, 0.5193F, -0.6981F, 0.0F, 0.0F));
		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(7, 0).addBox(-1.25F, -2.25F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).texOffs(33, 18)
						.addBox(-2.25F, -0.25F, 1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-1.0111F, -6.1078F, -5.9807F, 0.0F, 0.0F, -0.2618F));
		PartDefinition Body = partdefinition
				.addOrReplaceChild(
						"Body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -0.75F, 7.0F, 8.0F, 7.0F, 11.0F, new CubeDeformation(0.0F))
								.texOffs(0, 0).addBox(-1.0F, 0.25F, 18.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.5F, 12.5F, -11.0F));
		PartDefinition LeftLeg1 = partdefinition.addOrReplaceChild("LeftLeg1",
				CubeListBuilder.create().texOffs(29, 27).addBox(-0.5F, 0.75F, -2.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 18.0F, -1.9F));
		PartDefinition RightLeg1 = partdefinition.addOrReplaceChild("RightLeg1",
				CubeListBuilder.create().texOffs(0, 28).addBox(-1.5F, 0.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 18.25F, -2.5F));
		PartDefinition LeftLeg2 = partdefinition.addOrReplaceChild("LeftLeg2",
				CubeListBuilder.create().texOffs(27, 0).addBox(-1.5F, 0.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 18.25F, 5.5F));
		PartDefinition RightLeg2 = partdefinition.addOrReplaceChild("RightLeg2",
				CubeListBuilder.create().texOffs(17, 27).addBox(-1.5F, 0.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 18.25F, 5.5F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		Head.render(poseStack, buffer, packedLight, packedOverlay);
		Body.render(poseStack, buffer, packedLight, packedOverlay);
		LeftLeg1.render(poseStack, buffer, packedLight, packedOverlay);
		RightLeg1.render(poseStack, buffer, packedLight, packedOverlay);
		LeftLeg2.render(poseStack, buffer, packedLight, packedOverlay);
		RightLeg2.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RightLeg1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftLeg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.LeftLeg1.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
