package me.straysify.moreitems.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemFireStaff extends Item {

	public ItemFireStaff(Item blazeRod) {
		this.setMaxStackSize(1);
	}
	
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		world.playSoundAtEntity(entityplayer, "mob.wither.shoot", 0.5F, 0.4F);
	itemstack.damageItem(15, entityplayer);
	if (!world.isRemote)
	{
	Vec3 look = entityplayer.getLookVec();
	EntityLargeFireball fireball2 = new EntityLargeFireball(world, entityplayer, 0, 0, 0);
	fireball2.setPosition(
	entityplayer.posX + look.xCoord * 1,
	entityplayer.posY + look.yCoord + 1,
	entityplayer.posZ + look.zCoord * 2);
	fireball2.accelerationX = look.xCoord * 0.1;
	fireball2.accelerationY = look.yCoord * 0.1;
	fireball2.accelerationZ = look.zCoord * 0.1;
	world.spawnEntityInWorld(fireball2);
	}
	return itemstack;
	}

}
