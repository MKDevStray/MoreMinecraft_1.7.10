package me.straysify.moreitems.biome;

import java.util.Random;

import me.straysify.moreitems.ModMain;
import me.straysify.moreitems.generator.WorldGenShadowTree;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenShadow extends BiomeGenBase {
	
	protected static final WorldGenShadowTree WorldGenShadowTree = new WorldGenShadowTree(true);
	

	public BiomeGenShadow(int id) {
		super(id);
		
		this.theBiomeDecorator.treesPerChunk = 2;
		this.theBiomeDecorator.grassPerChunk = 2;
		
		this.topBlock = ModMain.shadowGrassBlock;
		this.fillerBlock = ModMain.shadowGrassBlock;
		
		this.setColor(0x000000);
		
	}
	
    public WorldGenShadowTree getRandomWorldGenForTrees(Random par1Random)
    {
    return (WorldGenShadowTree)(par1Random.nextInt(5) == 0 ? this.WorldGenShadowTree : (par1Random.nextInt(10) == 0 ? this.WorldGenShadowTree : WorldGenShadowTree));
    }
	

}
