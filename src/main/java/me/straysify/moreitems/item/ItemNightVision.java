package me.straysify.moreitems.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.straysify.moreitems.ModMain;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemNightVision extends ItemArmor {

	public ItemNightVision(ArmorMaterial armorMaterial, int renderIndex,
			int armorType) {
		super(armorMaterial, renderIndex, armorType);
		
	}
	
	public void onUpdate(ItemStack itemstack, World par2World, Entity par3Entity, int par4, boolean par5)
	{
	if(itemstack.isItemEnchanted() == false)
	{
	itemstack.addEnchantment(Enchantment.respiration, 1);
	}
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		return "mi:textures/models/armor/nightvisionarmor.png";
	}
	
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
   {
       return false;
   }
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
		ItemStack helmet = player.getCurrentArmor(3);
		if(player.getCurrentArmor(3) != null) {
		if(helmet.getItem() == ModMain.nightVision) {
			player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 240, 4));
			
		}
	
		}
	}
	
}
