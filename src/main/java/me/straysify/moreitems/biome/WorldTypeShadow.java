package me.straysify.moreitems.biome;

import java.util.Random;

import me.straysify.moreitems.generator.WorldGenCherryTree;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerBiomeEdge;
import net.minecraft.world.gen.layer.GenLayerZoom;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldTypeShadow extends WorldType implements IWorldGenerator {

	public WorldTypeShadow(int par1, String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public GenLayer getBiomeLayer(long worldSeed, GenLayer parentLayer) {
		GenLayer ret = new ShadowGenLayerBiome(200L, parentLayer, this);
		ret = GenLayerZoom.magnify(1000L, ret, 2);
		ret = new GenLayerBiomeEdge(1000L, ret);
		return ret;
	}
	
	private void generateSurface(World world, Random random, int BlockX, int BlockZ) {

		for(int i = 0; i < 50; i++){
			int Xcoord1 = BlockX + random.nextInt(16);
			int Ycoord1 = random.nextInt(90);
			int Zcoord1 = BlockZ + random.nextInt(16);
			
			(new WorldGenCherryTree(false, 6, 0, 0, false)).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
		}

}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		// TODO Auto-generated method stub
		
	}
	
}
