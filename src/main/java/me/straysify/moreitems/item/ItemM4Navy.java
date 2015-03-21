package me.straysify.moreitems.item;

import me.straysify.moreitems.ModMain;
import me.straysify.moreitems.entity.EntityBullet;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemM4Navy extends Item { 

	public ItemM4Navy(Item goldIngot) {
		this.setFull3D();
		this.setDamage(new ItemStack(this), 5);
		this.setMaxStackSize(1);
	}
	
	 public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	   {
	    	   if(par3EntityPlayer.inventory.hasItem(ModMain.bullet)) {
	           //--par1ItemStack.stackSize;
	    		   if(!par3EntityPlayer.capabilities.isCreativeMode) {
	    		   par3EntityPlayer.inventory.consumeInventoryItem(ModMain.bullet);
	    		   }
//		    	   double posX = par3EntityPlayer.getLookVec().xCoord;
//		    	   double posY = par3EntityPlayer.getLookVec().yCoord;
//		    	   double posZ = par3EntityPlayer.getLookVec().zCoord;
	       par2World.playSoundAtEntity(par3EntityPlayer, "mi:m4shoot", 0.5F, 1.0F);// / (itemRand.nextFloat() * 0.4F + 0.8F));
//	       par2World.spawnParticle("flame", posX, posY, posZ, 0.0D, 0.0D, 0.0D);
	       if (!par2World.isRemote)
	       {
	           par2World.spawnEntityInWorld(new EntityBullet(par2World, par3EntityPlayer));
	           
	           
	       }
	     //  return par1ItemStack;
	   }
	    	   else if(par3EntityPlayer instanceof EntityPlayer) {
	    		   par2World.playSoundAtEntity(par3EntityPlayer, "mi:noammo", 0.7F, 1.0F);
	    	   }
		return par1ItemStack;
}
}