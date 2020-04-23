package sar2x.codetiger.pmg.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelCow - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelCentaur extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Udders;
    public ModelRenderer Leg1;
    public ModelRenderer Leg2;
    public ModelRenderer Leg3;
    public ModelRenderer Leg4;
    public ModelRenderer VillagerHead;
    public ModelRenderer Arm1;
    public ModelRenderer Arm2;
    public ModelRenderer MiddleArm;
    public ModelRenderer VillagerBody;
    public ModelRenderer VillagerBody2;
    public ModelRenderer VillagerHead_1;

    public ModelCentaur() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.VillagerBody = new ModelRenderer(this, 16, 20);
        this.VillagerBody.setRotationPoint(0.0F, -15.0F, 0.0F);
        this.VillagerBody.addBox(-4.0F, 0.0F, -3.0F, 8, 12, 6, 0.0F);
        this.Arm1 = new ModelRenderer(this, 44, 22);
        this.Arm1.setRotationPoint(0.0F, -12.0F, -1.0F);
        this.Arm1.addBox(-8.0F, -2.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(Arm1, -0.7499679795819634F, 0.0F, 0.0F);
        this.Leg1 = new ModelRenderer(this, 0, 16);
        this.Leg1.setRotationPoint(4.0F, 12.0F, 7.0F);
        this.Leg1.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.MiddleArm = new ModelRenderer(this, 40, 38);
        this.MiddleArm.setRotationPoint(0.0F, -12.0F, -1.0F);
        this.MiddleArm.addBox(-4.0F, 2.0F, -2.0F, 8, 4, 4, 0.0F);
        this.setRotateAngle(MiddleArm, -0.7499679795819634F, 0.0F, 0.0F);
        this.VillagerHead = new ModelRenderer(this, 0, 0);
        this.VillagerHead.setRotationPoint(0.0F, -15.0F, 0.0F);
        this.VillagerHead.addBox(-4.0F, -10.0F, -4.0F, 8, 10, 8, 0.0F);
        this.Arm2 = new ModelRenderer(this, 44, 22);
        this.Arm2.setRotationPoint(0.0F, -12.0F, -1.0F);
        this.Arm2.addBox(4.0F, -2.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(Arm2, -0.7499679795819634F, 0.0F, 0.0F);
        this.Udders = new ModelRenderer(this, 52, 0);
        this.Udders.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.Udders.addBox(-2.0F, 2.0F, -8.0F, 4, 6, 1, 0.0F);
        this.setRotateAngle(Udders, 1.5707963267948966F, 0.0F, 0.0F);
        this.Leg2 = new ModelRenderer(this, 0, 16);
        this.Leg2.setRotationPoint(4.0F, 12.0F, -6.0F);
        this.Leg2.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.Leg3 = new ModelRenderer(this, 0, 16);
        this.Leg3.setRotationPoint(-4.0F, 12.0F, 7.0F);
        this.Leg3.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.VillagerBody2 = new ModelRenderer(this, 0, 38);
        this.VillagerBody2.setRotationPoint(0.0F, -15.0F, 0.0F);
        this.VillagerBody2.addBox(-4.0F, 0.0F, -3.0F, 8, 18, 6, 0.5F);
        this.Leg4 = new ModelRenderer(this, 0, 16);
        this.Leg4.setRotationPoint(-4.0F, 12.0F, -6.0F);
        this.Leg4.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.VillagerHead_1 = new ModelRenderer(this, 24, 0);
        this.VillagerHead_1.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.VillagerHead_1.addBox(-1.0F, -1.0F, -6.0F, 2, 4, 2, 0.0F);
        this.Body = new ModelRenderer(this, 18, 4);
        this.Body.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.Body.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10, 0.0F);
        this.setRotateAngle(Body, 1.5707963267948966F, 0.0F, 0.0F);
        this.VillagerHead.addChild(this.VillagerHead_1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.VillagerBody.render(f5);
        this.Arm1.render(f5);
        this.Leg1.render(f5);
        this.MiddleArm.render(f5);
        this.VillagerHead.render(f5);
        this.Arm2.render(f5);
        this.Udders.render(f5);
        this.Leg2.render(f5);
        this.Leg3.render(f5);
        this.VillagerBody2.render(f5);
        this.Leg4.render(f5);
        this.Body.render(f5);
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
