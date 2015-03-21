package me.straysify.moreitems.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary.Type;

public class BiomeRegistry {
	public static void ModMain5() {
		initializeBiome();
		registerBiome();
	}
	
	
	public static BiomeGenBase biomeShadow;
	
	public static void initializeBiome() {
		
		biomeShadow = new BiomeGenShadow(137).setBiomeName("Shadow").setTemperatureRainfall(1.2F, 0.9F);
		
	}
	
	public static void registerBiome() {
		
		BiomeDictionary.registerBiomeType(biomeShadow, Type.PLAINS);
		BiomeManager.addSpawnBiome(biomeShadow);
		
	}

}
