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
public class Modelbaby_dodo_bird<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ppr", "modelbaby_dodo_bird"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightWing;
	public final ModelPart LeftWing;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelbaby_dodo_bird(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightWing = root.getChild("RightWing");
		this.LeftWing = root.getChild("LeftWing");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(18, 12).addBox(-1.0F, -2.625F, -2.375F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 0)
						.addBox(-1.5F, -5.625F, -3.375F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(-1.0F, -4.625F, -4.375F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -4.625F, -5.375F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 17.625F, -2.375F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -8.0F, -4.0F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 11).addBox(-2.0F, 2.5F, -1.25F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.5412F, 5.6934F, -1.2217F, 0.0F, 0.0F));
		PartDefinition RightWing = partdefinition.addOrReplaceChild("RightWing",
				CubeListBuilder.create().texOffs(18, 18).addBox(-2.5F, -1.0F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.01F)),
				PartPose.offset(-1.5F, 17.0F, -1.5F));
		PartDefinition LeftWing = partdefinition.addOrReplaceChild("LeftWing",
				CubeListBuilder.create().texOffs(11, 14).addBox(1.5F, -1.0F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.01F)),
				PartPose.offset(1.5F, 17.0F, -1.5F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild(
				"RightLeg", CubeListBuilder.create().texOffs(2, 11).addBox(-0.5F, 0.75F, -1.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(8, 11).addBox(-1.0F, 3.75F, -3.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, 20.25F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
				"LeftLeg", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, 0.75F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(12, 11).addBox(-1.0F, 3.75F, -2.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 20.25F, -1.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		Head.render(poseStack, buffer, packedLight, packedOverlay);
		Body.render(poseStack, buffer, packedLight, packedOverlay);
		RightWing.render(poseStack, buffer, packedLight, packedOverlay);
		LeftWing.render(poseStack, buffer, packedLight, packedOverlay);
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
