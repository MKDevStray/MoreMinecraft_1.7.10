package me.straysify.moreitems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import me.straysify.moreitems.boss.Shadow;
import me.straysify.moreitems.ModMain;
import me.straysify.moreitems.boss.EntityShadow;
import me.straysify.moreitems.boss.EntityShadowMob;


public class ItemSoulCard extends Item {
	
	private double tpX;
	private double tpZ;
	private double tpY;
	private double shadowY;

	public ItemSoulCard(Item paper) {
		// TODO Auto-generated constructor stub
	}
	
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		EntityShadow fireball2 = new EntityShadow(world);
		world.playSoundAtEntity(entityplayer, "mi:m4shoot", 1.0F, 1.0F);
		world.spawnParticle("hugeexplosion", entityplayer.posX, entityplayer.posY, entityplayer.posZ, 1, 1, 1);
		world.spawnParticle("cloud", entityplayer.posX, entityplayer.posY, entityplayer.posZ, 1, 1, 1);
//		tpX = entityplayer.posX - 5;
//		tpY = entityplayer.posY + 1;
//		tpZ = entityplayer.posZ - 5;
//		entityplayer.setPosition(tpX, tpY, tpZ);
//		shadowY = entityplayer.posY + 10;
//		world.spawnEntityInWorld(fireball2);
		
		
		return itemstack;
	}

}
