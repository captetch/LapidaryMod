// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcamel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "camel"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightLeg1;
	private final ModelPart RightLeg2;
	private final ModelPart LeftLeg1;
	private final ModelPart LeftLeg2;

	public Modelcamel(ModelPart root) {
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
				CubeListBuilder.create().texOffs(28, 73)
						.addBox(-3.5F, -16.95F, -9.8F, 7.0F, 20.0F, 7.0F, new CubeDeformation(0.1F)).texOffs(91, 73)
						.addBox(-3.0F, -16.7F, -15.8F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 62)
						.addBox(-3.5F, -16.95F, -9.8F, 7.0F, 21.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(-3.5F, -20.95F, -6.8F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.5F, -20.95F, -6.8F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.95F, -10.2F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(2, 33)
						.addBox(-4.0F, -13.0F, 0.0F, 14.0F, 18.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(2, 2)
						.addBox(-4.0F, -13.0F, 0.0F, 14.0F, 18.0F, 11.0F, new CubeDeformation(0.1F)).texOffs(2, 2)
						.addBox(-4.0F, -13.0F, 13.0F, 14.0F, 18.0F, 11.0F, new CubeDeformation(0.1F)).texOffs(2, 33)
						.addBox(-4.0F, -13.0F, 13.0F, 14.0F, 18.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(57, 23)
						.addBox(-4.0F, -9.0F, 11.0F, 14.0F, 14.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(52, 63)
						.addBox(-4.0F, -9.0F, 11.0F, 14.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(57, 23)
						.addBox(-4.0F, -9.0F, -2.0F, 14.0F, 14.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(52, 63)
						.addBox(-4.0F, -9.0F, -2.0F, 14.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(57, 23)
						.addBox(-4.0F, -9.0F, 24.0F, 14.0F, 14.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(52, 63)
						.addBox(-4.0F, -9.0F, 24.0F, 14.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 6.0F, -12.0F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(21, 10).addBox(-6.5F, -8.5F, -5.5F, 3.0F, 15.0F, 3.0F,
						new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(8.5F, -1.5F, 32.5F, 0.5236F, 0.0F, 0.0F));

		PartDefinition RightLeg1 = partdefinition.addOrReplaceChild("RightLeg1", CubeListBuilder.create()
				.texOffs(87, 55).addBox(-2.5F, 0.5F, -2.5F, 5.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.5F, 10.5F, -11.0F));

		PartDefinition RightLeg2 = partdefinition.addOrReplaceChild("RightLeg2", CubeListBuilder.create()
				.texOffs(56, 80).addBox(-2.5F, 0.5F, -2.5F, 5.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.5F, 10.5F, 11.0F));

		PartDefinition LeftLeg1 = partdefinition.addOrReplaceChild("LeftLeg1", CubeListBuilder.create().texOffs(76, 80)
				.addBox(-2.5F, 1.5F, -2.5F, 5.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.5F, 9.5F, -11.0F));

		PartDefinition LeftLeg2 = partdefinition.addOrReplaceChild("LeftLeg2", CubeListBuilder.create().texOffs(0, 90)
				.addBox(-2.5F, 0.5F, -2.5F, 5.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.5F, 10.5F, 11.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, buffer, packedLight, packedOverlay);
		Body.render(poseStack, buffer, packedLight, packedOverlay);
		RightLeg1.render(poseStack, buffer, packedLight, packedOverlay);
		RightLeg2.render(poseStack, buffer, packedLight, packedOverlay);
		LeftLeg1.render(poseStack, buffer, packedLight, packedOverlay);
		LeftLeg2.render(poseStack, buffer, packedLight, packedOverlay);
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