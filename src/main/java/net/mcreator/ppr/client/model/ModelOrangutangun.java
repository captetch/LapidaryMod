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
public class ModelOrangutangun<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ppr", "model_orangutangun"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public ModelOrangutangun(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 8).addBox(-2.0F, -1.2667F, -5.6667F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -1.4667F, -4.6667F, 6.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 25)
						.addBox(-4.0F, -6.2667F, -3.6667F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.5498F, -5.44F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 25).addBox(-5.0F, -4.75F, -7.0F, 10.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.8702F, 11.2243F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -4.5F, -6.0F, 10.0F, 11.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -17.293F, -0.4894F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(48, 0).addBox(4.0F, -3.8041F, -2.8582F, 6.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 17)
						.addBox(5.0F, 14.6959F, -5.4582F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(26, 28)
						.addBox(5.0F, 17.6959F, -2.4582F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 4.0873F, -3.2485F));
		PartDefinition cube_r3 = LeftArm.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(50, 40).addBox(-3.0F, -5.25F, -15.0F, 6.0F, 11.0F, 6.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(7.0F, 16.1959F, 8.2918F, -0.5236F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(26, 40).addBox(-11.0F, -1.8041F, -2.8582F, 6.0F, 11.0F, 6.0F, new CubeDeformation(0.0F))
						.texOffs(34, 0).addBox(-10.0F, 16.6959F, -5.4582F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(26, 25)
						.addBox(-10.0F, 19.6959F, -2.4582F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.0873F, -3.2485F));
		PartDefinition cube_r4 = RightArm.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 41).addBox(-3.0F, -5.25F, -15.0F, 6.0F, 11.0F, 6.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-8.0F, 18.1959F, 8.2918F, -0.5236F, 0.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 58).addBox(-8.5F, 8.4736F, 0.0082F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, 11.5264F, 8.2161F));
		PartDefinition cube_r5 = RightLeg.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(40, 57).addBox(-2.5F, -4.0F, -2.0F, 5.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 1.8534F, -0.9918F, 0.2618F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(55, 25).addBox(5.5F, 8.4736F, -0.9918F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, 11.5264F, 9.2161F));
		PartDefinition cube_r6 = LeftLeg.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(18, 57).addBox(-2.5F, -4.0F, -2.0F, 5.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 1.8534F, -1.9918F, 0.2618F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		Head.render(poseStack, buffer, packedLight, packedOverlay);
		Body.render(poseStack, buffer, packedLight, packedOverlay);
		LeftArm.render(poseStack, buffer, packedLight, packedOverlay);
		RightArm.render(poseStack, buffer, packedLight, packedOverlay);
		RightLeg.render(poseStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
