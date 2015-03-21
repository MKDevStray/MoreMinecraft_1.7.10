package me.straysify.moreitems.item;

import me.straysify.moreitems.ModMain;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFlyRing extends Item {

	public ItemFlyRing(Item goldIngot) {
		// TODO Auto-generated constructor stub
	}
	
	public void onUpdate(ItemStack stack, World world, EntityPlayer player, int par4, boolean par5) {
		
		ItemStack slot1 = player.inventory.getStackInSlot(8);
		if(slot1 != null) {
			if(slot1.getItem() == ModMain.healthCrystal) {
				player.capabilities.allowFlying = true;
			}
		}
		else
		{
			player.capabilities.allowFlying = false;
			
		}
		
	}

}
