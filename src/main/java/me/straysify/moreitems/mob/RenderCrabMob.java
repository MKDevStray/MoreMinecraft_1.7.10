package me.straysify.moreitems.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderCrabMob extends RenderLiving {
	private static final ResourceLocation mobTextures = new ResourceLocation("mi:textures/entity/crab.png");

	public RenderCrabMob(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		// TODO Auto-generated constructor stub
	}

	protected ResourceLocation getEntityTexture(EntityCrabMob entity) {
		// Return the texture
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getEntityTexture((EntityCrabMob)entity);
	}

}