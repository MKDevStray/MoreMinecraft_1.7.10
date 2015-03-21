package me.straysify.moreitems.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBlazeIngot extends Item {

	public ItemBlazeIngot(Item ironIngot) {
		// TODO Auto-generated constructor stub
	}
	
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
   {
       return true;
   }
	

}
