package sar2x.codetiger.pmg.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelPlayer - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelRegina extends ModelBase {
    public ModelRenderer RightArm;
    public ModelRenderer RightLeg;
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer LeftLeg;
    public ModelRenderer RightLeg_1;
    public ModelRenderer Body_1;

    public ModelRegina() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.RightLeg_1 = new ModelRenderer(this, 16, 48);
        this.RightLeg_1.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.RightLeg_1.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.RightLeg = new ModelRenderer(this, 0, 16);
        this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.RightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.RightArm = new ModelRenderer(this, 40, 16);
        this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.RightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.Body = new ModelRenderer(this, 16, 16);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.LeftLeg = new ModelRenderer(this, 32, 48);
        this.LeftLeg.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.LeftLeg.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.Body_1 = new ModelRenderer(this, 16, 32);
        this.Body_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body_1.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.RightLeg_1.render(f5);
        this.RightLeg.render(f5);
        this.Head.render(f5);
        this.RightArm.render(f5);
        this.Body.render(f5);
        this.LeftLeg.render(f5);
        this.Body_1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
