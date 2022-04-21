// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmoa<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "moa"),
			"main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;

	public Modelmoa(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 20).addBox(
				-3.0F, -7.5F, -8.5F, 6.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, -4.5F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.0F, 0.5F, 9.25F, 10.0F, 9.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
						.addBox(0.0F, -3.5F, 4.25F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, 3.5F, -11.0F));

		PartDefinition cube_r1 = Body
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(14, 20).addBox(-4.0F, -2.1F, -4.5F, 8.0F, 0.0F, 9.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, 0.5F, 24.75F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(29, 33).addBox(-3.0F, -3.0F, -4.5F, 6.0F, 8.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 3.5F, 10.75F, -0.3054F, 0.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 26)
						.addBox(-1.0F, 10.5319F, -6.7937F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(0.0F, 10.5319F, -1.7937F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(29, 26)
						.addBox(1.0F, 10.5319F, -6.7937F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 27)
						.addBox(-1.0F, 10.5319F, -3.7937F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.1F)).texOffs(23, 26)
						.addBox(0.0F, 10.5319F, -6.7937F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 11.331F, 3.513F));

		PartDefinition cube_r3 = LeftLeg.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 20).addBox(-2.0F, -6.0F, 0.0F, 2.0F, 7.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 11.5319F, -2.5437F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(39, 16).addBox(-1.5F, -4.5F, -4.0F, 4.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 5.169F, 0.737F, -0.4363F, 0.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(16, 38)
						.addBox(-1.0F, 9.5319F, -2.7937F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.1F)).texOffs(12, 35)
						.addBox(0.0F, 9.5319F, -0.7937F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 40)
						.addBox(-1.0F, 9.5319F, -5.7937F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(23, 35)
						.addBox(0.0F, 9.5319F, -5.7937F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 40)
						.addBox(1.0F, 9.5319F, -5.7937F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 12.331F, 2.513F));

		PartDefinition cube_r5 = RightLeg.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -6.0F, 0.0F, 2.0F, 7.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 10.5319F, -1.5437F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r6 = RightLeg.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(31, 0).addBox(-6.5F, -4.5F, -4.0F, 4.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, 4.169F, 1.737F, -0.4363F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, buffer, packedLight, packedOverlay);
		Body.render(poseStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(poseStack, buffer, packedLight, packedOverlay);
		RightLeg.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}