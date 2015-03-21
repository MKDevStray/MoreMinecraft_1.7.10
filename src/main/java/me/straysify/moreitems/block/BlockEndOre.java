package me.straysify.moreitems.block;

import java.util.Random;

import me.straysify.moreitems.ModMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BlockEndOre extends Block {
	
	
	public World worldObj;

	public BlockEndOre(Material rock) {
		super(rock);
		this.setHarvestLevel("pickaxe", 2);
		this.setResistance(99.0F);
		this.setHardness(3.0F);
	}
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune) {
		return ModMain.endCrystal;
	}

}
