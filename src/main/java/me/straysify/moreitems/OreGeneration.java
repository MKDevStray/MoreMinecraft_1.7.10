package me.straysify.moreitems;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class OreGeneration implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case -1:
			generateEnd(world, random, chunkX, chunkZ);
			break;
		case 0:
			generateOverworld(world, random, chunkX, chunkZ);
			break;
		case 1:
			generateNether(world, random, chunkX, chunkZ);
			break;
		}

	}

	public void generateNether(World world, Random rand, int x, int z) {
		generateOre(ModMain.endOre, world, rand, x, z, 4, 8, 15, 1, 100, Blocks.end_stone);

	}

	public void generateOverworld(World world, Random rand, int x, int z) {
		generateOre(ModMain.infusedSapphire, world, rand, x, z, 4, 8, 10, 6, 60, Blocks.stone);

	}

	public void generateEnd(World world, Random rand, int x, int z) {
		generateOre(ModMain.endOre, world, rand, x, z, 4, 8, 15, 1, 100, Blocks.end_stone);

	}
	
	public void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int minVeinSize,
			int maxVeinSize, int chance, int minY, int maxY, Block generateIn) {
		int veinSize = minVeinSize + random.nextInt(maxVeinSize - minVeinSize);
		int heightRange = maxY - minY;
		WorldGenMinable gen = new WorldGenMinable(block, veinSize, generateIn);
		for(int i = 0; i < chance; i++) {
			int xRand = chunkX * 16 + random.nextInt(16);
			int yRand = random.nextInt(heightRange) + minY;
			int zRand = chunkZ * 16 + random.nextInt(16);
			gen.generate(world, random, xRand, yRand, zRand);
		}
	}

}
