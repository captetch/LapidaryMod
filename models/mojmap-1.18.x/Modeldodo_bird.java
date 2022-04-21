// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldodo_bird<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "dodo_bird"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightWing;
	private final ModelPart LeftWing;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modeldodo_bird(ModelPart root) {
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
				CubeListBuilder.create().texOffs(22, 16)
						.addBox(-2.0F, -9.25F, -3.1125F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(0, 6)
						.addBox(-1.0F, -8.25F, -4.7125F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.3F)).texOffs(0, 16)
						.addBox(-1.0F, -8.25F, -6.3125F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.3F)).texOffs(0, 26)
						.addBox(-1.5F, -6.25F, -2.3625F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.25F, 16.25F, -4.1375F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -11.0F, -5.0F, 8.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 4.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.5412F, 5.6934F, -1.2217F, 0.0F, 0.0F));

		PartDefinition RightWing = partdefinition.addOrReplaceChild("RightWing", CubeListBuilder.create()
				.texOffs(22, 24).addBox(-2.5F, -0.5F, -3.5F, 1.0F, 5.0F, 7.0F, new CubeDeformation(0.01F)),
				PartPose.offset(-2.5F, 13.5F, -1.5F));

		PartDefinition LeftWing = partdefinition.addOrReplaceChild("LeftWing", CubeListBuilder.create().texOffs(13, 19)
				.addBox(1.5F, -0.5F, -3.5F, 1.0F, 5.0F, 7.0F, new CubeDeformation(0.01F)),
				PartPose.offset(2.5F, 13.5F, -1.5F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(14, 16)
						.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.5F, 4.0F, -2.0F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, 20.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-0.5F, 1.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(-1.5F, 5.0F, -2.0F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.5F, 19.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, buffer, packedLight, packedOverlay);
		Body.render(poseStack, buffer, packedLight, packedOverlay);
		RightWing.render(poseStack, buffer, packedLight, packedOverlay);
		LeftWing.render(poseStack, buffer, packedLight, packedOverlay);
		RightLeg.render(poseStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}