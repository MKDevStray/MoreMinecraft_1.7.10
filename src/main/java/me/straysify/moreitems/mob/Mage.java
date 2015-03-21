// Date: 2/1/2015 8:09:36 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package me.straysify.moreitems.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Mage extends ModelBase
{
  //fields
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer body;
    ModelRenderer head;
    ModelRenderer nose;
    ModelRenderer arm;
  
  public Mage()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      rightleg = new ModelRenderer(this, 52, 19);
      rightleg.addBox(0F, 0F, 0F, 4, 6, 4);
      rightleg.setRotationPoint(0F, 18F, -2F);
      rightleg.setTextureSize(128, 64);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 34, 19);
      leftleg.addBox(0F, 0F, 0F, 4, 6, 4);
      leftleg.setRotationPoint(-4F, 18F, -2F);
      leftleg.setTextureSize(128, 64);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      body = new ModelRenderer(this, 0, 0);
      body.addBox(0F, 0F, 0F, 10, 20, 6);
      body.setRotationPoint(-5F, -2F, -3F);
      body.setTextureSize(128, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      head = new ModelRenderer(this, 35, 0);
      head.addBox(0F, 0F, 0F, 8, 10, 8);
      head.setRotationPoint(-4F, -12F, -4F);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      nose = new ModelRenderer(this, 0, 29);
      nose.addBox(0F, 0F, 0F, 2, 4, 2);
      nose.setRotationPoint(-1F, -5F, -6F);
      nose.setTextureSize(128, 64);
      nose.mirror = true;
      setRotation(nose, 0F, 0F, 0F);
      arm = new ModelRenderer(this, 71, 0);
      arm.addBox(0F, 0F, 0F, 18, 7, 3);
      arm.setRotationPoint(-9F, -1.5F, -0.5F);
      arm.setTextureSize(128, 64);
      arm.mirror = true;
      setRotation(arm, -0.7330383F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    rightleg.render(f5);
    leftleg.render(f5);
    body.render(f5);
    head.render(f5);
    nose.render(f5);
    arm.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float f6 = (180F / (float)Math.PI);
    this.leftleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.rightleg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
  }

}