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
public class Modelblue_macaw<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ppr", "modelblue_macaw"), "main");
	public final ModelPart Body;
	public final ModelPart Head;
	public final ModelPart RightWing;
	public final ModelPart LeftWing;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelblue_macaw(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
		this.RightWing = root.getChild("RightWing");
		this.LeftWing = root.getChild("LeftWing");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -5.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(14, 0).addBox(-1.5F, -2.0F, 2.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.6202F, 5.8995F, 1.4399F, 0.0F, 0.0F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.5F, -0.75F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -5.5F, 1.5F, 0.5236F, 0.0F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(17, 5).addBox(-0.5F, -4.6667F, -2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(0.0F, -8.6667F, -1.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(-1.5F, -5.6667F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, 19.6667F, -4.0F));
		PartDefinition RightWing = partdefinition.addOrReplaceChild("RightWing", CubeListBuilder.create(), PartPose.offset(1.0F, 17.066F, -3.3609F));
		PartDefinition cube_r3 = RightWing.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(12, 6).addBox(-3.0F, -1.5F, -0.75F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(3.5F, 1.434F, -0.1391F, 0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r4 = RightWing.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(17, 14).addBox(-0.5F, -2.5F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 3.8904F, 4.3917F, 0.9163F, 0.0F, 0.0F));
		PartDefinition LeftWing = partdefinition.addOrReplaceChild("LeftWing", CubeListBuilder.create(), PartPose.offset(-2.0F, 17.066F, -3.3609F));
		PartDefinition cube_r5 = LeftWing.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(12, 6).addBox(-3.0F, -1.5F, -0.75F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(1.5F, 1.434F, -0.1391F, 0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r6 = LeftWing.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(17, 14).addBox(-0.5F, -2.5F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 3.8904F, 4.3917F, 0.9163F, 0.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild(
				"RightLeg", CubeListBuilder.create().texOffs(20, 9).addBox(-0.5F, 0.75F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(0, 0).addBox(-0.5F, 3.75F, -2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 20.25F, -1.25F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
				"LeftLeg", CubeListBuilder.create().texOffs(0, 1).addBox(-0.5F, 2.75F, -2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(17, 19).addBox(-0.5F, -0.25F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, 21.25F, -1.25F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		Body.render(poseStack, buffer, packedLight, packedOverlay);
		Head.render(poseStack, buffer, packedLight, packedOverlay);
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
		this.LeftWing.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightWing.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
