package me.straysify.moreitems.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBarrier extends Block {

	public BlockBarrier(Material rock) {
		super(rock);
		this.setHardness(999999);
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}

}
