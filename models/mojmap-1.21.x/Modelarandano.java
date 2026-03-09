// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelarandano<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "arandano"), "main");
	private final ModelPart pies;
	private final ModelPart cuerpo;
	private final ModelPart ojo;

	public Modelarandano(ModelPart root) {
		this.pies = root.getChild("pies");
		this.cuerpo = root.getChild("cuerpo");
		this.ojo = root.getChild("ojo");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition pies = partdefinition.addOrReplaceChild("pies", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = pies.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(24, 30).addBox(-15.0F, -6.0F, 2.0F, 6.0F, 6.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, 1.0F, 1.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r2 = pies
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 30).addBox(-24.0F, -3.0F, 2.0F, 6.0F, 6.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(10.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cuerpo = partdefinition.addOrReplaceChild("cuerpo",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-14.0F, -18.0F, -1.0F, 15.0F, 15.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-8.0F, -21.0F, 6.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r3 = cuerpo.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(52, 45)
						.addBox(-19.0F, -13.0F, 14.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 42)
						.addBox(-18.0F, -13.0F, 14.0F, 11.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 42)
						.addBox(-18.0F, -14.0F, 14.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r4 = cuerpo
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(36, 52).addBox(0.0F, -15.0F, 14.0F, 4.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r5 = cuerpo.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(48, 52)
						.addBox(5.0F, -13.0F, 14.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-6.0F, -13.0F, 14.0F, 11.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r6 = cuerpo.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(24, 52).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -17.0F, 7.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r7 = cuerpo.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(12, 52).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, -17.0F, 7.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition ojo = partdefinition.addOrReplaceChild("ojo",
				CubeListBuilder.create().texOffs(48, 30)
						.addBox(-4.0F, -14.0F, -3.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 36)
						.addBox(-13.0F, -14.0F, -3.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		pies.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cuerpo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ojo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}