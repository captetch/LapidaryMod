// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelHawaiian_monk_seal<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hawaiian_monk_seal"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart Tail;
	private final ModelPart RightFin;
	private final ModelPart LeftFin;

	public ModelHawaiian_monk_seal(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.Tail = root.getChild("Tail");
		this.RightFin = root.getChild("RightFin");
		this.LeftFin = root.getChild("LeftFin");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 37)
						.addBox(-1.0F, -5.0F, -12.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, -3.0F, -14.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-2.0F, -6.0F, 8.0F, 9.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 24.0F, -15.0F));

		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(26, 20)
				.addBox(-3.2677F, -3.1667F, -0.8685F, 7.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.2677F, 22.1667F, 2.8685F));

		PartDefinition cube_r1 = Tail.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 16).addBox(-11.75F, -1.0F, -5.5F, 7.0F, 3.0F, 11.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(2.7323F, -0.1667F, 13.6315F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r2 = Tail.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(28, 6).addBox(0.25F, -1.0F, -8.5F, 7.0F, 3.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7323F, -0.1667F, 13.6315F, 0.0F, 0.6981F, 0.0F));

		PartDefinition RightFin = partdefinition.addOrReplaceChild("RightFin", CubeListBuilder.create(),
				PartPose.offset(-0.321F, 23.0F, -5.6369F));

		PartDefinition cube_r3 = RightFin.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(21, 35).addBox(0.5F, -1.0F, 1.75F, 8.0F, 2.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.179F, 0.0F, 2.6369F, 0.0F, 0.6981F, 0.0F));

		PartDefinition LeftFin = partdefinition.addOrReplaceChild("LeftFin", CubeListBuilder.create(),
				PartPose.offset(4.2922F, 23.0F, -5.1085F));

		PartDefinition cube_r4 = LeftFin.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 30).addBox(-6.5F, -1.0F, 1.0F, 8.0F, 2.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.2078F, 0.0F, 2.1085F, 0.0F, -0.7418F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, buffer, packedLight, packedOverlay);
		Body.render(poseStack, buffer, packedLight, packedOverlay);
		Tail.render(poseStack, buffer, packedLight, packedOverlay);
		RightFin.render(poseStack, buffer, packedLight, packedOverlay);
		LeftFin.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftFin.yRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.Tail.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RightFin.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}