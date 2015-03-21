package me.straysify.moreitems.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemWitherStaff extends Item {

	public ItemWitherStaff(Item blazerod) {
		this.setMaxStackSize(1);
	}
	
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
	world.playSoundAtEntity(entityplayer, "mob.wither.shoot", 0.5F, 0.4F);
	itemstack.damageItem(10, entityplayer);
	if (!world.isRemote)
	{
	Vec3 look = entityplayer.getLookVec();
	EntityWitherSkull fireball2 = new EntityWitherSkull(world, entityplayer, 0, 0, 0);
	fireball2.setPosition(
	entityplayer.posX + look.xCoord * 1,
	entityplayer.posY + look.yCoord + 1,
	entityplayer.posZ + look.zCoord * 1);
	fireball2.accelerationX = look.xCoord * 0.1;
	fireball2.accelerationY = look.yCoord * 0.1;
	fireball2.accelerationZ = look.zCoord * 0.1;
	world.spawnEntityInWorld(fireball2);
	//Second skull
	Vec3 look1 = entityplayer.getLookVec();
	EntityWitherSkull fireball1 = new EntityWitherSkull(world, entityplayer, 0, 0, 0);
	fireball1.setPosition(
	entityplayer.posX + look.xCoord + 1,
	entityplayer.posY + look.yCoord + 1,
	entityplayer.posZ + look.zCoord * 1);
	fireball1.accelerationX = look.xCoord * 0.1;
	fireball1.accelerationY = look.yCoord * 0.1;
	fireball1.accelerationZ = look.zCoord * 0.1;
	world.spawnEntityInWorld(fireball1);
	//Third skull
	Vec3 look2 = entityplayer.getLookVec();
	EntityWitherSkull fireball3 = new EntityWitherSkull(world, entityplayer, 0, 0, 0);
	fireball3.setPosition(
	entityplayer.posX + look.xCoord - 1,
	entityplayer.posY + look.yCoord + 1,
	entityplayer.posZ + look.zCoord * 1);
	fireball3.accelerationX = look.xCoord * 0.1;
	fireball3.accelerationY = look.yCoord * 0.1;
	fireball3.accelerationZ = look.zCoord * 0.1;
	world.spawnEntityInWorld(fireball3);
	//More skulls
	Vec3 look4 = entityplayer.getLookVec();
	EntityWitherSkull fireball4 = new EntityWitherSkull(world, entityplayer, 0, 0, 0);
	fireball4.setPosition(
	entityplayer.posX + look.xCoord * 1,
	entityplayer.posY + look.yCoord + 1,
	entityplayer.posZ + look.zCoord * 2);
	fireball4.accelerationX = look.xCoord * 0.1;
	fireball4.accelerationY = look.yCoord * 0.1;
	fireball4.accelerationZ = look.zCoord * 0.1;
	world.spawnEntityInWorld(fireball4);
	//Second skull
	Vec3 look5 = entityplayer.getLookVec();
	EntityWitherSkull fireball5 = new EntityWitherSkull(world, entityplayer, 0, 0, 0);
	fireball5.setPosition(
	entityplayer.posX + look.xCoord + 1,
	entityplayer.posY + look.yCoord + 1,
	entityplayer.posZ + look.zCoord * 2);
	fireball5.accelerationX = look.xCoord * 0.1;
	fireball5.accelerationY = look.yCoord * 0.1;
	fireball5.accelerationZ = look.zCoord * 0.1;
	world.spawnEntityInWorld(fireball5);
	//Third skull
	Vec3 look6 = entityplayer.getLookVec();
	EntityWitherSkull fireball6 = new EntityWitherSkull(world, entityplayer, 0, 0, 0);
	fireball6.setPosition(
	entityplayer.posX + look.xCoord - 1,
	entityplayer.posY + look.yCoord + 1,
	entityplayer.posZ + look.zCoord * 2);
	fireball6.accelerationX = look.xCoord * 0.1;
	fireball6.accelerationY = look.yCoord * 0.1;
	fireball6.accelerationZ = look.zCoord * 0.1;
	world.spawnEntityInWorld(fireball6);
	}
	return itemstack;
	}
	//Uncomment to enable the item shining.
//	@SideOnly(Side.CLIENT)
//   public boolean hasEffect(ItemStack par1ItemStack)
//   {
//       return true;
//   }

}
