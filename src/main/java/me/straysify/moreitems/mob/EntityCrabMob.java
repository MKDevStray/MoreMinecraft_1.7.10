package me.straysify.moreitems.mob;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.potion.Potion;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityCrabMob extends EntityWaterMob {
	
	
	
	public EntityCrabMob (World par1World) {
		super(par1World);
		this.setSize(0.8F, 1.0F);
        this.tasks.addTask(4, new EntityAIWander(this, 0.5D));
        //this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        //this.targetTasks.addTask(7, new EntityAIHurtByTarget(this, false));
        //this.targetTasks.addTask(8, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        //this.tasks.addTask(9, new EntityAIWatchClosest2(this, EntityPlayer.class, 3.0F, 1.0F));
        //this.tasks.addTask(10, new EntityAIWatchClosest2(this, EntityVillager.class, 5.0F, 0.02F));
        //this.tasks.addTask(11, new EntityAIAttackOnCollide(this, EntityPlayer.class, 2.0D, true)); EntityWaterMob
        this.getNavigator().setCanSwim(false);
        
	}
	
	public boolean isAIEnabled() {
		return true;
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(30);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5D);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(20.0D);
	}
	
	public boolean canBreatheUnderwater() {
		return true;
	}


}
