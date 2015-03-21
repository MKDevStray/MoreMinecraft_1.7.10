package me.straysify.moreitems;

import cpw.mods.fml.common.network.IGuiHandler;
import me.straysify.moreitems.container.ContainerInfusionTable;
import me.straysify.moreitems.gui.GuiInfusionTable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {
	
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(ID == ModMain.guiIDInfusionTable) {
			return ID == ModMain.guiIDInfusionTable && world.getBlock(x, y, z) == ModMain.infusionTable ? new ContainerInfusionTable(player.inventory, world, x, y, z) : null;
		}
		
		return null;
	}

	public Object getClientGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		
		if(ID == ModMain.guiIDInfusionTable) {
			return ID == ModMain.guiIDInfusionTable && world.getBlock(x, y, z) == ModMain.infusionTable ? new GuiInfusionTable(player.inventory, world, x, y, z) : null;
		}
		
		return null;
	}

}
