package me.straysify.moreitems.block;

import me.straysify.moreitems.ModMain;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class RenderLamp extends TileEntitySpecialRenderer {
	
	private Lamp model;
	
	private static final ResourceLocation texture = new ResourceLocation(ModMain.modid + ":" + "textures/blocks/lamptest.png");
	private ResourceLocation getBlockTexture(BlockLamp lamp) {
		return texture;
		
	}
	
	public RenderLamp() {
		this.model = new Lamp();
	}
	
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, 
			double z, float f) {
		
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
		GL11.glRotatef(180, 0F, 0F, 1F);
		this.bindTexture(texture);
		GL11.glPushMatrix();
		this.model.renderModel(0.0625F);
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}

	private void bindTexture(String string) {
		// TODO Auto-generated method stub
		
	}

}
