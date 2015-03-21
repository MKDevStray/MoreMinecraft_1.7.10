package me.straysify.moreitems.mob;

import me.straysify.moreitems.ModMain;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityMage {
	
	public static void ModMain4() {
		registerEntity();
	}
	
	public static void registerEntity() {
		
		createEntity(EntityMageMob.class, "EntityMage", 0x0F528C, 0x910A8D);
		
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, ModMain.modInstance, 64, 1, true);
		EntityRegistry.addSpawn(entityClass, 10, 0, 1, EnumCreatureType.monster, BiomeGenBase.roofedForest);
		EntityRegistry.addSpawn(entityClass, 10, 0, 1, EnumCreatureType.monster, BiomeGenBase.savanna);
		EntityRegistry.addSpawn(entityClass, 10, 0, 1, EnumCreatureType.monster, BiomeGenBase.swampland);
		EntityRegistry.addSpawn(entityClass, 10, 0, 1, EnumCreatureType.monster, BiomeGenBase.plains);
		
		createEgg(randomId, solidColor, spotColor);
	}
	
	private static void createEgg(int randomId, int solidColor, int spotColor) {
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
	}

}
