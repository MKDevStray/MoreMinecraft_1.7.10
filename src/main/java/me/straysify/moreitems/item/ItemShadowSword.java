package me.straysify.moreitems.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemShadowSword extends ItemSword {
	

	public ItemShadowSword(ToolMaterial par1) {
		super(par1);
	}
	
	
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
   {
       return true;
   }
	
	
	public boolean hitEntity(ItemStack par1stack, EntityLivingBase par1entity, EntityLivingBase par2entity)
    {
        par1stack.damageItem(1, par2entity);
        par1entity.addPotionEffect(new PotionEffect(Potion.wither.getId(), 540, 2));
        par1entity.addPotionEffect(new PotionEffect(Potion.confusion.getId(), 540, 0));
        par1entity.addPotionEffect(new PotionEffect(Potion.blindness.getId(), 540, 0));
        return true;
    }

}
