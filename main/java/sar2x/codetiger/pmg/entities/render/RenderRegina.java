package sar2x.codetiger.pmg.entities.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import sar2x.codetiger.pmg.entities.EntityRegina;
import sar2x.codetiger.pmg.entities.models.ModelRegina;
import sar2x.codetiger.pmg.util.Reference;

public class RenderRegina extends RenderLiving<EntityRegina> {
	
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/regina.png");
	
	public RenderRegina(RenderManager manager) {
		super(manager,new ModelRegina(),0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityRegina entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityRegina entityLiving,float p_77043_2_,float rotationYaw,float partialTicks) {
		super.applyRotations(entityLiving,p_77043_2_,rotationYaw,partialTicks);
	}
}
