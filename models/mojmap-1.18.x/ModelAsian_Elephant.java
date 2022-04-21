// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelAsian_Elephant<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "asian_elephant"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart LeftLeg1;
	private final ModelPart RightLeg1;
	private final ModelPart LeftLeg2;
	private final ModelPart RightLeg2;

	public ModelAsian_Elephant(ModelPart root) {
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

		PartDefinition Head = partdefinition
				.addOrReplaceChild(
						"Head", CubeListBuilder.create().texOffs(0, 92).addBox(-5.8573F, -1.9796F, -21.6874F, 11.0F,
								18.0F, 11.0F, new CubeDeformation(0.0F)),
						PartPose.offset(1.8573F, -11.0204F, -9.3126F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.5F, -5.5F, -5.85F, 5.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(71, 0)
						.addBox(10.3F, -5.5F, -5.85F, 5.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.2573F, 16.7397F, -18.8252F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(60, 51)
						.addBox(4.0F, -1.0F, -9.0F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.01F)).texOffs(33, 92)
						.addBox(16.8F, -1.0F, -9.0F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-12.7573F, 8.0204F, -10.6874F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 121).addBox(-9.0F, -9.0F, 0.5F, 18.0F, 18.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.4326F, -1.9796F, -6.489F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(112, 67).addBox(-38.0F, -9.0F, -14.5F, 18.0F, 18.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.4326F, -1.9796F, -6.489F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(58, 74).addBox(-9.0F, -9.0F, -10.0F, 18.0F, 18.0F, 18.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.1427F, -1.8277F, -8.951F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(132, 0).addBox(-3.5F, -9.8F, 0.8F, 7.0F, 18.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3573F, 24.0204F, -16.1874F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(130, 86).addBox(-2.5F, -11.75F, 2.25F, 5.0F, 12.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3573F, 36.2163F, -3.3193F, 1.0472F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-11.0F, -16.9935F, 12.0742F, 22.0F, 24.0F, 27.0F, new CubeDeformation(0.01F)),
				PartPose.offset(2.0F, -3.0F, -20.0F));

		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(85, 38).addBox(-9.0F, -5.5F, -9.75F, 18.0F, 16.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.4935F, 16.8242F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 51).addBox(-11.0F, -7.0F, -14.2F, 22.0F, 25.0F, 16.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.9935F, 50.5742F, -0.3054F, 0.0F, 0.0F));

		PartDefinition LeftLeg1 = partdefinition.addOrReplaceChild("LeftLeg1", CubeListBuilder.create()
				.texOffs(112, 110).addBox(-4.5F, -1.0F, -4.0F, 9.0F, 20.0F, 8.0F, new CubeDeformation(0.01F)),
				PartPose.offset(8.5F, 5.0065F, -3.9258F));

		PartDefinition RightLeg1 = partdefinition.addOrReplaceChild("RightLeg1", CubeListBuilder.create()
				.texOffs(78, 110).addBox(-4.5F, 1.0F, -4.0F, 9.0F, 20.0F, 8.0F, new CubeDeformation(0.01F)),
				PartPose.offset(-4.5F, 3.0065F, -3.9258F));

		PartDefinition LeftLeg2 = partdefinition.addOrReplaceChild("LeftLeg2", CubeListBuilder.create().texOffs(98, 0)
				.addBox(-4.5F, -2.0F, -4.0F, 9.0F, 20.0F, 8.0F, new CubeDeformation(0.01F)),
				PartPose.offset(8.5F, 6.0065F, 23.0742F));

		PartDefinition RightLeg2 = partdefinition.addOrReplaceChild("RightLeg2", CubeListBuilder.create()
				.texOffs(44, 110).addBox(-4.5F, 0.0F, -4.0F, 9.0F, 20.0F, 8.0F, new CubeDeformation(0.01F)),
				PartPose.offset(-4.5F, 4.0065F, 23.0742F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, buffer, packedLight, packedOverlay);
		Body.render(poseStack, buffer, packedLight, packedOverlay);
		LeftLeg1.render(poseStack, buffer, packedLight, packedOverlay);
		RightLeg1.render(poseStack, buffer, packedLight, packedOverlay);
		LeftLeg2.render(poseStack, buffer, packedLight, packedOverlay);
		RightLeg2.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RightLeg1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftLeg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.LeftLeg1.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}