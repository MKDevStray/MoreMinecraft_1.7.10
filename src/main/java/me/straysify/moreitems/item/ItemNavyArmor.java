package me.straysify.moreitems.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemNavyArmor extends ItemArmor {

	public ItemNavyArmor(ArmorMaterial armorMaterial, int renderIndex,
			int armorType) {
		super(armorMaterial, renderIndex, armorType);
		
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if(this.armorType == 2) {
			return "mi:textures/models/armor/Navy_2.png";
		}
		return "mi:textures/models/armor/Navy_1.png";
	}

}
