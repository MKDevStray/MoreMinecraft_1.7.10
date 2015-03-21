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

public class ItemMythicalArmor extends ItemArmor {

	public ItemMythicalArmor(ArmorMaterial armorMaterial, int renderIndex,
			int armorType) {
		super(armorMaterial, renderIndex, armorType);
		
	}
	
	public void onUpdate(ItemStack itemstack, World par2World, Entity par3Entity, int par4, boolean par5)
	{
	if(itemstack.isItemEnchanted() == false)
	{
	itemstack.addEnchantment(Enchantment.unbreaking, 5);
	}
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if(this.armorType == 2) {
			return "mi:textures/models/armor/mythicalarmorlayer2.png";
		}
		return "mi:textures/models/armor/mythicalarmorlayer1.png";
	}
	
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
   {
       return true;
   }
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
		ItemStack boots = player.getCurrentArmor(0);
		ItemStack legs = player.getCurrentArmor(1);
		ItemStack chest = player.getCurrentArmor(2);
		ItemStack helmet = player.getCurrentArmor(3);
		if(player.getCurrentArmor(0) != null && player.getCurrentArmor(1) != null && player.getCurrentArmor(2) != null && player.getCurrentArmor(3) != null) {
		if(boots.getItem() == ModMain.mythicalBoots && chest.getItem() == ModMain.mythicalChestplate && legs.getItem() == ModMain.mythicalLeggings && helmet.getItem() == ModMain.mythicalHelmet) {
			player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 0, 2));
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 300, 0));
			player.addPotionEffect(new PotionEffect(Potion.waterBreathing.getId(), 20, 0));
			player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 400, 0));
			player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 20, 2));
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 20, 2));
			player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 20, 2));
			
		}
	
		}
	}
	
}
