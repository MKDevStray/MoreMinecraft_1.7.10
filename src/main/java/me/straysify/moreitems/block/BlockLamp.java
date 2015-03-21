package me.straysify.moreitems.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.straysify.moreitems.ModMain;
import me.straysify.moreitems.tileentity.TileEntityLamp;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockLamp extends Block {

	public BlockLamp(Material material) {
		super(material);
		this.setHardness(1.0F);
		this.setCreativeTab(ModMain.tabMIBlocks);
		this.setLightLevel(3.0F);
	}
	
	public TileEntity createNewTileEntity(World arg0, int arg1) {
		return new TileEntityLamp();
	}
	
	public int getRenderType() {
		return -1;
	}
	
	public boolean isOpaqueCube() {
		return false;
	}
	
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister icon) {
		this.blockIcon = icon.registerIcon("mi:lamptest");
	}
	

}
