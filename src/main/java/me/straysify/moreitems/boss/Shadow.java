package me.straysify.moreitems.boss;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Shadow extends ModelBase {
ModelRenderer mainbody;
ModelRenderer topbody;
ModelRenderer tenticle1;
ModelRenderer tenticle2;
ModelRenderer tenticle3;
ModelRenderer tenticle4;
ModelRenderer tenticle5;
ModelRenderer verytopbody;

public Shadow()
{
textureWidth = 128;
textureHeight = 64;

  mainbody = new ModelRenderer(this, 70, 0);
  mainbody.addBox(0F, 0F, 0F, 10, 2, 10);
  mainbody.setRotationPoint(-5F, 13F, -5F);
  mainbody.setTextureSize(128, 64);
  mainbody.mirror = true;
  setRotation(mainbody, 0F, 0F, 0F);
  topbody = new ModelRenderer(this, 35, 0);
  topbody.addBox(0F, 0F, 0F, 8, 2, 8);
  topbody.setRotationPoint(-4F, 12F, -4F);
  topbody.setTextureSize(128, 64);
  topbody.mirror = true;
  setRotation(topbody, 0F, 0F, 0F);
  tenticle1 = new ModelRenderer(this, 29, 0);
  tenticle1.addBox(0F, 0F, 0F, 1, 9, 1);
  tenticle1.setRotationPoint(-4F, 14F, -4F);
  tenticle1.setTextureSize(128, 64);
  tenticle1.mirror = true;
  setRotation(tenticle1, 0F, 0F, 0F);
  tenticle2 = new ModelRenderer(this, 23, 0);
  tenticle2.addBox(0F, 0F, 0F, 1, 9, 1);
  tenticle2.setRotationPoint(3F, 14F, 3F);
  tenticle2.setTextureSize(128, 64);
  tenticle2.mirror = true;
  setRotation(tenticle2, 0F, 0F, 0F);
  tenticle3 = new ModelRenderer(this, 18, 0);
  tenticle3.addBox(0F, 0F, 0F, 1, 9, 1);
  tenticle3.setRotationPoint(-0.5F, 14F, -0.5F);
  tenticle3.setTextureSize(128, 64);
  tenticle3.mirror = true;
  setRotation(tenticle3, 0F, 0F, 0F);
  tenticle4 = new ModelRenderer(this, 18, 12);
  tenticle4.addBox(0F, 0F, 0F, 1, 9, 1);
  tenticle4.setRotationPoint(3F, 14F, -4F);
  tenticle4.setTextureSize(128, 64);
  tenticle4.mirror = true;
  setRotation(tenticle4, 0F, 0F, 0F);
  tenticle5 = new ModelRenderer(this, 23, 12);
  tenticle5.addBox(0F, 0F, 0F, 1, 9, 1);
  tenticle5.setRotationPoint(-4F, 14F, 3F);
  tenticle5.setTextureSize(128, 64);
  tenticle5.mirror = true;
  setRotation(tenticle5, 0F, 0F, 0F);
  verytopbody = new ModelRenderer(this, 0, 0);
  verytopbody.addBox(0F, 0F, 0F, 4, 1, 4);
  verytopbody.setRotationPoint(-2F, 11F, -2F);
  verytopbody.setTextureSize(128, 64);
  verytopbody.mirror = true;
  setRotation(verytopbody, 0F, 0F, 0F);
}

public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
{
super.render(entity, f, f1, f2, f3, f4, f5);
setRotationAngles(f, f1, f2, f3, f4, f5, entity);
mainbody.render(f5);
topbody.render(f5);
tenticle1.render(f5);
tenticle2.render(f5);
tenticle3.render(f5);
tenticle4.render(f5);
tenticle5.render(f5);
verytopbody.render(f5);
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
}

}
