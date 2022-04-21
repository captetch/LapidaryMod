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
public class ModelBengal_tiger<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ppr", "model_bengal_tiger"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart LeftLeg1;
	public final ModelPart RightLeg1;
	public final ModelPart LeftLeg2;
	public final ModelPart RightLeg2;

	public ModelBengal_tiger(ModelPart root) {
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
				CubeListBuilder.create().texOffs(0, 13).addBox(-2.0F, -1.3333F, -11.7083F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
						.texOffs(17, 52).addBox(4.0F, -1.3333F, -7.9583F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(2.75F, -7.3333F, -6.9583F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 31)
						.addBox(-3.75F, -7.3333F, -6.9583F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(49, 32)
						.addBox(-5.0F, -1.3333F, -7.9583F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(-4.0F, -5.3333F, -8.9583F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 8.3333F, -7.0417F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -8.2827F, -20.7899F, 12.0F, 11.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0327F, 11.7899F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(44, 0).addBox(-1.0F, -0.25F, -5.5F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.785F, 9.9199F, -0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(32, 31).addBox(-1.0F, 0.25F, -7.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, -1.465F, 3.1699F, -0.9599F, 0.0F, 0.0F));
		PartDefinition LeftLeg1 = partdefinition.addOrReplaceChild("LeftLeg1",
				CubeListBuilder.create().texOffs(0, 47).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 15.25F, -7.0F));
		PartDefinition RightLeg1 = partdefinition.addOrReplaceChild("RightLeg1",
				CubeListBuilder.create().texOffs(44, 45).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 14.25F, -7.0F));
		PartDefinition LeftLeg2 = partdefinition.addOrReplaceChild("LeftLeg2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 15.25F, 9.0F));
		PartDefinition RightLeg2 = partdefinition.addOrReplaceChild("RightLeg2",
				CubeListBuilder.create().texOffs(28, 45).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 14.25F, 9.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
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
