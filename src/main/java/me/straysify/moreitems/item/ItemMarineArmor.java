package me.straysify.moreitems.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemMarineArmor extends ItemArmor {

	public ItemMarineArmor(ArmorMaterial armorMaterial, int renderIndex,
			int armorType) {
		super(armorMaterial, renderIndex, armorType);
		
	}
	

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if(this.armorType == 2) {
			return "mi:textures/models/armor/Marine_2.png";
		}
		return "mi:textures/models/armor/Marine_1.png";
	}

}
