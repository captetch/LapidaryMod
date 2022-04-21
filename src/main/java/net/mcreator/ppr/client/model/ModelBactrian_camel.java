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
public class ModelBactrian_camel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ppr", "model_bactrian_camel"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart LeftLeg1;
	public final ModelPart LeftLeg2;
	public final ModelPart RightLeg1;
	public final ModelPart RightLeg2;

	public ModelBactrian_camel(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.LeftLeg1 = root.getChild("LeftLeg1");
		this.LeftLeg2 = root.getChild("LeftLeg2");
		this.RightLeg1 = root.getChild("RightLeg1");
		this.RightLeg2 = root.getChild("RightLeg2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(70, 4).addBox(-3.0183F, -20.4167F, -7.9669F, 6.0F, 6.0F, 9.0F, new CubeDeformation(0.0F))
						.texOffs(59, 27).addBox(-3.0183F, -14.4167F, -4.7669F, 6.0F, 15.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(59, 59)
						.addBox(-4.0183F, -21.4167F, -4.6169F, 8.0F, 22.0F, 7.0F, new CubeDeformation(0.2F)).texOffs(66, 49).addBox(-2.5183F,
								-18.4167F, -11.7169F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0183F, 11.4167F, -10.2831F));
		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(47, 13).addBox(-7.5F, -1.0F, 4.75F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.9817F, -19.4167F, -1.2169F, 0.0F, -0.7418F, 0.0F));
		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(47, 34).addBox(-1.5F, -1.0F, -2.25F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.9817F, -19.4167F, -1.2169F, 0.0F, 0.7418F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 34).addBox(-5.0F, 4.0F, 8.0F, 14.0F, 13.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, 4.0F, 8.0F, 14.0F, 15.0F, 19.0F, new CubeDeformation(0.01F)).texOffs(0, 66)
						.addBox(-2.0F, -1.0F, 9.0F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(47, 0)
						.addBox(-2.0F, -1.0F, 18.0F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -4.0F, -16.0F));
		PartDefinition LeftLeg1 = partdefinition.addOrReplaceChild("LeftLeg1",
				CubeListBuilder.create().texOffs(32, 66).addBox(-2.5F, -0.5F, -2.0F, 5.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.5F, 13.5F, -6.0F));
		PartDefinition LeftLeg2 = partdefinition.addOrReplaceChild("LeftLeg2",
				CubeListBuilder.create().texOffs(0, 34).addBox(-2.5F, -0.5F, -2.0F, 5.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.5F, 13.5F, 9.0F));
		PartDefinition RightLeg1 = partdefinition.addOrReplaceChild("RightLeg1",
				CubeListBuilder.create().texOffs(78, 19).addBox(-2.5F, 0.5F, -2.0F, 5.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, 12.5F, -6.0F));
		PartDefinition RightLeg2 = partdefinition.addOrReplaceChild("RightLeg2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, 1.5F, -2.0F, 5.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, 11.5F, 9.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		Head.render(poseStack, buffer, packedLight, packedOverlay);
		Body.render(poseStack, buffer, packedLight, packedOverlay);
		LeftLeg1.render(poseStack, buffer, packedLight, packedOverlay);
		LeftLeg2.render(poseStack, buffer, packedLight, packedOverlay);
		RightLeg1.render(poseStack, buffer, packedLight, packedOverlay);
		RightLeg2.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftLeg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLeg1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftLeg1.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
