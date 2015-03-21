package me.straysify.moreitems.boss;

import me.straysify.moreitems.ModMain;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityShadow extends EntityMob {

	public EntityShadow(World par1World) {
		super(par1World);
		// TODO Auto-generated constructor stub
	}

	public static void ModMain1() {
		registerEntity();
	}
	
	public static void registerEntity() {
		
		createEntity(EntityShadowMob.class, "EntityShadow", 0x0F528C, 0x910A8D);
		
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, ModMain.modInstance, 64, 1, true);
	}

}
