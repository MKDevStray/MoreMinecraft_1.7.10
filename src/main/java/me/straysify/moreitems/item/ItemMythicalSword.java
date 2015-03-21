package me.straysify.moreitems.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMythicalSword extends ItemSword {

	public ItemMythicalSword(ToolMaterial material) {
		super(material);
		// TODO Auto-generated constructor stub
	}
	
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
   {
       return true;
   }
//	@Override
//	public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
//		super.onUpdate(stack, world, entity, par4, par5);
//		{
//			EntityPlayer player = (EntityPlayer) entity;
//			ItemStack equipped = player.getCurrentEquippedItem();
//			if(equipped == stack) {
//				player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 540, 1));
//			}
//		}
//	}

}
