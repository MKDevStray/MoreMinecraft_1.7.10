package me.straysify.moreitems.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class M67Grenade extends ModelBase
{
  //fields
    ModelRenderer Shape1;
  
  public M67Grenade()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 10, 0);
      Shape1.addBox(0F, 0F, 0F, 12, 12, 12);
      Shape1.setRotationPoint(-6F, 12F, -6F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
  }
  
  public void render(Entity entity1, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity1, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity1);
    Shape1.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity1)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity1);
  }

}
