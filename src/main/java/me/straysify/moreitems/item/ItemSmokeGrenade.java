package me.straysify.moreitems.item;

import me.straysify.moreitems.entity.EntitySmokeGrenade;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSmokeGrenade extends Item
{
    private static final String __OBFID = "CL_00000069";


    public ItemSmokeGrenade(Item snowball) {
		this.setMaxStackSize(2);
	}

	/**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
        if (!player.capabilities.isCreativeMode)
        {
            --stack.stackSize;
        }

        world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!world.isRemote)
        {
        	world.spawnEntityInWorld(new EntitySmokeGrenade(world, player));
        }

        return stack;
    }
}