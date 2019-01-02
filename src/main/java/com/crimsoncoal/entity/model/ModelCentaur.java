package com.crimsoncoal.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelCow - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelCentaur extends ModelBase {
    public ModelRenderer field_78148_b0;
    public ModelRenderer field_78148_b1;
    public ModelRenderer field_78146_d;
    public ModelRenderer field_78144_f;
    public ModelRenderer field_78149_c;
    public ModelRenderer field_78147_e;
    public ModelRenderer field_78191_a;
    public ModelRenderer field_78190_c0;
    public ModelRenderer field_78190_c1;
    public ModelRenderer field_78189_b1;
    public ModelRenderer field_78191_aChild;

    public ModelCentaur() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.field_78146_d = new ModelRenderer(this, 0, 16);
        this.field_78146_d.setRotationPoint(4.0F, 12.0F, 7.0F);
        this.field_78146_d.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.field_78148_b1 = new ModelRenderer(this, 52, 0);
        this.field_78148_b1.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.field_78148_b1.addBox(-2.0F, 2.0F, -8.0F, 4, 6, 1, 0.0F);
        this.setRotateAngle(field_78148_b1, 1.5707963705062866F, 0.0F, 0.0F);
        this.field_78147_e = new ModelRenderer(this, 0, 16);
        this.field_78147_e.setRotationPoint(-4.0F, 12.0F, -6.0F);
        this.field_78147_e.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.field_78190_c0 = new ModelRenderer(this, 44, 22);
        this.field_78190_c0.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.field_78190_c0.addBox(-8.0F, -5.0F, -10.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(field_78190_c0, -0.7499679795819634F, 0.0F, 0.0F);
        this.field_78190_c1 = new ModelRenderer(this, 44, 22);
        this.field_78190_c1.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.field_78190_c1.addBox(4.0F, -5.0F, -10.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(field_78190_c1, -0.7499679795819634F, 0.0F, 0.0F);
        this.field_78148_b0 = new ModelRenderer(this, 18, 4);
        this.field_78148_b0.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.field_78148_b0.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10, 0.0F);
        this.setRotateAngle(field_78148_b0, 1.5707963705062866F, 0.0F, 0.0F);
        this.field_78191_aChild = new ModelRenderer(this, 24, 0);
        this.field_78191_aChild.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.field_78191_aChild.addBox(-1.0F, -9.0F, -10.0F, 2, 4, 2, 0.0F);
        this.field_78191_a = new ModelRenderer(this, 0, 0);
        this.field_78191_a.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78191_a.addBox(-4.0F, -18.9F, -8.0F, 8, 10, 8, 0.0F);
        this.field_78189_b1 = new ModelRenderer(this, 0, 38);
        this.field_78189_b1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78189_b1.addBox(-4.0F, -9.0F, -7.0F, 8, 18, 6, 0.5F);
        this.field_78149_c = new ModelRenderer(this, 0, 16);
        this.field_78149_c.setRotationPoint(-4.0F, 12.0F, 7.0F);
        this.field_78149_c.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.field_78144_f = new ModelRenderer(this, 0, 16);
        this.field_78144_f.setRotationPoint(4.0F, 12.0F, -6.0F);
        this.field_78144_f.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.field_78191_a.addChild(this.field_78191_aChild);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.field_78146_d.render(f5);
        this.field_78148_b1.render(f5);
        this.field_78147_e.render(f5);
        this.field_78190_c0.render(f5);
        this.field_78190_c1.render(f5);
        this.field_78148_b0.render(f5);
        this.field_78191_a.render(f5);
        this.field_78189_b1.render(f5);
        this.field_78149_c.render(f5);
        this.field_78144_f.render(f5);
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
