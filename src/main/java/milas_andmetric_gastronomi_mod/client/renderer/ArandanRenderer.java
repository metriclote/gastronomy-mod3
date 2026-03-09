package milas_andmetric_gastronomi_mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import milas_andmetric_gastronomi_mod.entity.ArandanEntity;

import milas_andmetric_gastronomi_mod.client.model.Modelarandano;

public class ArandanRenderer extends MobRenderer<ArandanEntity, LivingEntityRenderState, Modelarandano> {
	private ArandanEntity entity = null;

	public ArandanRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelarandano(context.bakeLayer(Modelarandano.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ArandanEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("milas_and_metric_gastronomy_mod:textures/entities/arandani__v2.png");
	}
}