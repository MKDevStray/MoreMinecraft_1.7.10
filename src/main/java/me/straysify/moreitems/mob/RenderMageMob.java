package me.straysify.moreitems.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import me.straysify.moreitems.ModMain;

public class RenderMageMob extends RenderLiving {
	
	private static final ResourceLocation mobTextures = new ResourceLocation("mi:textures/entity/magemob.png");

	public RenderMageMob(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		// TODO Auto-generated constructor stub
	}

	protected ResourceLocation getEntityTexture(EntityMageMob entity) {
		// TODO Auto-generated method stub
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getEntityTexture((EntityMageMob)entity);
	}

}
