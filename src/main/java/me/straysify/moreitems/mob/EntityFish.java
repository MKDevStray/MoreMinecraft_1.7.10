package me.straysify.moreitems.mob;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.world.World;
	

	public class EntityFish extends EntityWaterMob
	{

	    public EntityFish(World par1World)
	    {
	    	super(par1World);
	        this.setSize(0.5F, 0.5F);
	        this.tasks.addTask(1, new EntityFishWander(this, 0.3F));
	        this.tasks.addTask(1, new EntityAISwimmingFish(this));
	    }
	    
	    protected void applyEntityAttributes() {
			super.applyEntityAttributes();
			this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0F);
			this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.0D);
			this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(10.0D);
		}
	    
	    public boolean isAIEnabled() {
	    	return true;
	    }
	    
	    public boolean canBreatheUnderwater () {
	    	return true;
	    }


	   
}