package me.straysify.moreitems.block;

import java.util.Random;

import me.straysify.moreitems.ModMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockInfusedSapphire extends Block {

	public BlockInfusedSapphire(Material material) {
		super(material);
		this.setHardness(3.0F);
		this.setHarvestLevel("pickaxe", 2);
		this.setLightLevel(0.5F);
		this.setResistance(15.0F);
	}
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune) {
		return ModMain.sapphire;
	}

}
