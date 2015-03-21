package me.straysify.moreitems;

import java.util.Random;

import me.straysify.moreitems.generator.WorldGenCherryTree;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class MMCWorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

		switch(world.provider.dimensionId){
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
			
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateNether(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
		
	}
	private void generateSurface(World world, Random random, int BlockX, int BlockZ) {

		for(int i = 0; i < 20; i++){
			int Xcoord1 = BlockX + random.nextInt(16);
			int Ycoord1 = random.nextInt(90);
			int Zcoord1 = BlockZ + random.nextInt(16);
			if(world.getWorldInfo().getTerrainType() == WorldType.DEFAULT) {
			(new WorldGenCherryTree(false, 6, 0, 0, false)).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
			
			if(world.getWorldInfo().getTerrainType() == WorldType.DEFAULT) {
				(new WorldGenCherryTree(false, 6, 0, 0, false)).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
		}
		}
			}
	}
}