package me.straysify.moreitems.block;

import java.util.Random;

import me.straysify.moreitems.ModMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockSulfurOre extends Block {

	public BlockSulfurOre(Material par1) {
		super(par1);
		this.setHardness(3.0F);
		this.setHarvestLevel("pickaxe", 2);
		this.setResistance(15.0F);
	}
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune) {
		return ModMain.sulfur;
	}
	

}
