package me.straysify.moreitems.mob;

import me.straysify.moreitems.ModMain;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
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
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityMageMob extends EntityMob implements IRangedAttackMob {

	public EntityMageMob(World par1World) {
		super(par1World);
		this.setSize(0.8F, 2.4F);
		this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIArrowAttack(this, 0.6D, 50, 10.0F));
        this.tasks.addTask(4, new EntityAIWander(this, 0.5D));
        this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.targetTasks.addTask(7, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(8, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.tasks.addTask(9, new EntityAIWatchClosest2(this, EntityPlayer.class, 3.0F, 1.0F));
        this.tasks.addTask(10, new EntityAIWatchClosest2(this, EntityVillager.class, 5.0F, 0.02F));
        this.tasks.addTask(11, new EntityAIAttackOnCollide(this, EntityPlayer.class, 2.0D, false));
        
	}
	
	public boolean isAIEnabled() {
		return true;
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200.0F);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5D);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
	}
	
    protected String getHurtSound()
    {
        return "mob.villager.hurt";
    }

	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase p_82196_1_,
			float p_82196_2_) {
		EntityPotion entitypotion = new EntityPotion(this.worldObj, this, 32732);
        entitypotion.rotationPitch -= -20.0F;
        double d0 = p_82196_1_.posX + p_82196_1_.motionX - this.posX;
        double d1 = p_82196_1_.posY + (double)p_82196_1_.getEyeHeight() - 1.100000023841858D - this.posY;
        double d2 = p_82196_1_.posZ + p_82196_1_.motionZ - this.posZ;
        float f1 = MathHelper.sqrt_double(d0 * d0 + d2 * d2);

        if (f1 >= 8.0F && !p_82196_1_.isPotionActive(Potion.moveSlowdown))
        {
            entitypotion.setPotionDamage(32698);
        }
        else if (p_82196_1_.getHealth() >= 8.0F && !p_82196_1_.isPotionActive(Potion.poison))
        {
            entitypotion.setPotionDamage(32660);
        }
        else if (f1 <= 3.0F && !p_82196_1_.isPotionActive(Potion.weakness) && this.rand.nextFloat() < 0.25F)
        {
            entitypotion.setPotionDamage(32696);
        }

        entitypotion.setThrowableHeading(d0, d1 + (double)(f1 * 0.2F), d2, 0.75F, 8.0F);
        this.worldObj.spawnEntityInWorld(entitypotion);
		
	}
	
	public Item getDropItem() {
		return ModMain.mythicalIngot;
	}
}
