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

// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelred_panda<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ppr", "modelred_panda"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightLeg1;
	public final ModelPart RightLeg2;
	public final ModelPart LeftLeg1;
	public final ModelPart LeftLeg2;

	public Modelred_panda(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightLeg1 = root.getChild("RightLeg1");
		this.RightLeg2 = root.getChild("RightLeg2");
		this.LeftLeg1 = root.getChild("LeftLeg1");
		this.LeftLeg2 = root.getChild("LeftLeg2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(33, 0).addBox(-3.9375F, -4.0F, -8.875F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-5.9375F, -6.0F, -6.875F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(2.8125F, -6.0F, -6.875F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-1.9375F, 0.0F, -10.875F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.0625F, 15.3F, -6.125F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -7.0F, 4.0F, 9.0F, 8.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 18.0F, -12.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 23).addBox(-3.0F, -2.65F, -0.5F, 6.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.25F, 17.5F, -0.6109F, 0.0F, 0.0F));
		PartDefinition RightLeg1 = partdefinition.addOrReplaceChild("RightLeg1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 0.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 18.5F, -6.5F));
		PartDefinition RightLeg2 = partdefinition.addOrReplaceChild("RightLeg2",
				CubeListBuilder.create().texOffs(23, 23).addBox(-1.5F, 0.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 18.5F, 5.5F));
		PartDefinition LeftLeg1 = partdefinition.addOrReplaceChild("LeftLeg1",
				CubeListBuilder.create().texOffs(34, 36).addBox(-1.5F, 0.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 18.5F, -6.5F));
		PartDefinition LeftLeg2 = partdefinition.addOrReplaceChild("LeftLeg2",
				CubeListBuilder.create().texOffs(34, 28).addBox(-1.5F, 0.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 18.5F, 5.5F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		Head.render(poseStack, buffer, packedLight, packedOverlay);
		Body.render(poseStack, buffer, packedLight, packedOverlay);
		RightLeg1.render(poseStack, buffer, packedLight, packedOverlay);
		RightLeg2.render(poseStack, buffer, packedLight, packedOverlay);
		LeftLeg1.render(poseStack, buffer, packedLight, packedOverlay);
		LeftLeg2.render(poseStack, buffer, packedLight, packedOverlay);
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
