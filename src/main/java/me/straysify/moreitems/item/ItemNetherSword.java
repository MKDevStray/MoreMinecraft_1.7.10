package me.straysify.moreitems.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ItemNetherSword extends ItemSword {

	public ItemNetherSword(ToolMaterial material) {
		super(material);
	}
	public void onUpdate(ItemStack itemstack, World par2World, Entity par3Entity, int par4, boolean par5)
	{
	if(itemstack.isItemEnchanted() == false)
	{
	itemstack.addEnchantment(Enchantment.fireAspect, 5);
	}
	}
	
	 @SideOnly(Side.CLIENT)
     public boolean hasEffect(ItemStack par1ItemStack)
    {
        return true;
    }
}
