package me.straysify.moreitems.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCherryPlanks extends Block {

	public BlockCherryPlanks(Material wood) {
		super(wood);
		this.setHardness(2.0F);
		this.setStepSound(soundTypeWood);
	}


}
