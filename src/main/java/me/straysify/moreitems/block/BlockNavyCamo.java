package me.straysify.moreitems.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockNavyCamo extends Block {

	public BlockNavyCamo(Material cloth) {
		super(cloth);
		this.setHardness(0.2F);
		this.setStepSound(soundTypeCloth);
		this.setResistance(2.0F);
		
	}

}
