package me.straysify.moreitems.item;

import me.straysify.moreitems.ModMain;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemHermesBoots extends ItemArmor {

	public ItemHermesBoots(ArmorMaterial hermesbootsmaterial, int renderIndex,
			int armorType) {
		super(hermesbootsmaterial, renderIndex, armorType);
		
	}
	

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return "mi:textures/models/armor/hermesboots.png";
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
		player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 0, 4));
		player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 0, 3));
		ItemStack boots = player.getCurrentArmor(0);
		if(boots.getItem() != null) {
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 0, 2));
		}
	}

}
