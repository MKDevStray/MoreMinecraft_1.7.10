package me.straysify.moreitems.mob;

import me.straysify.moreitems.ModMain;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityCrab {
	public static void ModMain3() {
		registerEntity();
	}
	
	public static void registerEntity() {
		
		createEntity(EntityCrabMob.class, "EntityCrab", 0xEDBA40, 0xFAFAFA);
		
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, ModMain.modInstance, 64, 1, true);
		EntityRegistry.addSpawn(entityClass, 90, 0, 6, EnumCreatureType.waterCreature, BiomeGenBase.ocean);
		EntityRegistry.addSpawn(entityClass, 90, 0, 6, EnumCreatureType.waterCreature, BiomeGenBase.deepOcean);
		
		createEgg(randomId, solidColor, spotColor);
	}
	
	private static void createEgg(int randomId, int solidColor, int spotColor) {
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
	}

}
