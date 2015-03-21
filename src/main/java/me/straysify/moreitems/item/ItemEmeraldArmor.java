package me.straysify.moreitems.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemEmeraldArmor extends ItemArmor {

	public ItemEmeraldArmor(ArmorMaterial armorMaterial, int renderIndex,
			int armorType) {
		super(armorMaterial, renderIndex, armorType);
		
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if(this.armorType == 2) {
			return "mi:textures/models/armor/emeraldarmorlayer2.png";
		}
		return "mi:textures/models/armor/emeraldarmorlayer1.png";
	}

}
