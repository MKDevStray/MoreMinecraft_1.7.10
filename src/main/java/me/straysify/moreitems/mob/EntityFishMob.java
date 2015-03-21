package me.straysify.moreitems.mob;

import me.straysify.moreitems.ModMain;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityFishMob {
	public static void ModMain2() {
		registerEntity();
	}
	
	public static void registerEntity() {
		
		createEntity(EntityFish.class, "EntityFish", 0x001EFF, 0x00D5FF);
		
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, ModMain.modInstance, 64, 1, true);
		EntityRegistry.addSpawn(entityClass, 90, 5, 15, EnumCreatureType.waterCreature, BiomeGenBase.ocean);
		
		createEgg(randomId, solidColor, spotColor);
	}
	
	private static void createEgg(int randomId, int solidColor, int spotColor) {
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
	}


}
