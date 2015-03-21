package me.straysify.moreitems.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemBinoculars extends Item {
	
	public ItemBinoculars(Item goldIngot) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
		super.onUpdate(stack, world, entity, par4, par5);
		{
			EntityPlayer player = (EntityPlayer) entity;
			ItemStack equipped = player.getCurrentEquippedItem();
			if(equipped == stack) {
				player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 5, 9));
		}
		}
	}

}
