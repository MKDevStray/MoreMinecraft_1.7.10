package me.straysify.moreitems.boss;

import me.straysify.moreitems.mob.EntityMageMob;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderShadowMob extends RenderLiving {

	private static final ResourceLocation mobTextures = new ResourceLocation("mi:textures/entity/shadowmob.png");

	public RenderShadowMob(ModelBase shadow, float par2) {
		super(shadow, par2);
		
	}

	protected ResourceLocation getEntityTexture(EntityShadowMob entity) {
		// TODO Auto-generated method stub
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getEntityTexture((EntityShadowMob)entity);
	}
}
