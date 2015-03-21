package me.straysify.moreitems.block;

import io.netty.handler.codec.http.HttpHeaders.Names;

import javax.swing.Icon;

import me.straysify.moreitems.ModMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class infusionTable extends Block {
	
	@SideOnly(Side.CLIENT)
	public static IIcon topIcon;
	@SideOnly(Side.CLIENT)
	public static IIcon bottomIcon;
	@SideOnly(Side.CLIENT)
	public static IIcon sideIcon;
	
	@SideOnly(Side.CLIENT)
	private IIcon infusionTableTop;
	

	public infusionTable() {
		super(Material.wood);
		
		this.setHardness(3.5F);
		this.setResistance(5.0F);
		this.setCreativeTab(ModMain.tabMIBlocks);
		this.setBlockTextureName("mi:infusiontable");
	}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int q, float a, float b, float c) {
		if (!player.isSneaking()) {
			player.openGui(ModMain.modInstance, ModMain.guiIDInfusionTable, world, x, y, z);
			return true;
		}
		else 
		{
			return false;
		}
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon) {
	topIcon = icon.registerIcon("mi:infusiontable_top");
	bottomIcon = icon.registerIcon("mi:infusiontable_bottom");
	sideIcon = icon.registerIcon("mi:infusiontable_side");
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata) {
	if(side == 0) {
	return bottomIcon;
	} else if(side == 1) {
	return topIcon;
	} else {
	return sideIcon;
	}
	}
}
