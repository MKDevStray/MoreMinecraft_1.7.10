package me.straysify.moreitems.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityMobExplosive extends Entity {
	
	/** How long the fuse is */
    public int fuse;
    private EntityLivingBase tntPlacedBy;
    private static final String __OBFID = "CL_00001681";

    public EntityMobExplosive(World p_i1729_1_)
    {
        super(p_i1729_1_);
        this.preventEntitySpawning = true;
        this.setSize(0.98F, 0.98F);
        this.yOffset = this.height / 2.0F;
        this.fuse = 100;
    }

    public EntityMobExplosive(World p_i1730_1_, double p_i1730_2_, double p_i1730_4_, double p_i1730_6_, EntityLivingBase p_i1730_8_)
    {
        this(p_i1730_1_);
        this.setPosition(p_i1730_2_, p_i1730_4_, p_i1730_6_);
        float f = (float)(Math.random() * Math.PI * 2.0D);
        this.motionX = (double)(-((float)Math.sin((double)f)) * 0.02F);
        this.motionY = 0.20000000298023224D;
        this.motionZ = (double)(-((float)Math.cos((double)f)) * 0.02F);
        this.fuse = 100;
        this.prevPosX = p_i1730_2_;
        this.prevPosY = p_i1730_4_;
        this.prevPosZ = p_i1730_6_;
        this.tntPlacedBy = p_i1730_8_;
    }

    protected void entityInit() {}

    /**
     * returns if this entity triggers Block.onEntityWalking on the blocks they walk on. used for spiders and wolves to
     * prevent them from trampling crops
     */
    protected boolean canTriggerWalking()
    {
        return false;
    }

    /**
     * Returns true if other Entities should be prevented from moving through this Entity.
     */
    public boolean canBeCollidedWith()
    {
        return !this.isDead;
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.motionY -= 0.03999999910593033D;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= 0.9800000190734863D;
        this.motionY *= 0.9800000190734863D;
        this.motionZ *= 0.9800000190734863D;

        if (this.onGround)
        {
            this.motionX *= 0.699999988079071D;
            this.motionZ *= 0.699999988079071D;
            this.motionY *= -0.5D;
            
         
        }

        if (this.fuse-- <= 0)
        {
            this.setDead();

            if (!this.worldObj.isRemote)
            {
                this.explode();
            }
        }
        else
        {
            this.worldObj.spawnParticle("smoke", this.posX, this.posY + 0.3D, this.posZ, 0.0D, 0.0D, 0.0D);
        }
    }

    private void explode()
    {
        float f = 1.0F;
        this.worldObj.createExplosion(this, this.posX, this.posY + 3, this.posZ, f, true);
        this.worldObj.spawnEntityInWorld(this);
        
        EntitySlime e1 = new EntitySlime(worldObj);
    	e1.setPosition(
    	this.posX + 3,
    	this.posY + 2,
    	this.posZ);
    	worldObj.spawnEntityInWorld(e1);
    	
    	EntityEnderman e2 = new EntityEnderman(worldObj);
    	e2.setPosition(
    	this.posX + 6,
    	this.posY + 2,
    	this.posZ);
    	worldObj.spawnEntityInWorld(e2);
    	
    	EntitySnowman e3 = new EntitySnowman(worldObj);
    	e3.setPosition(
    	this.posX + 9,
    	this.posY + 2,
    	this.posZ);
    	worldObj.spawnEntityInWorld(e3);
    	
    	EntityWolf e4 = new EntityWolf(worldObj);
    	e4.setPosition(
    	this.posX - 3,
    	this.posY + 2,
    	this.posZ);
    	worldObj.spawnEntityInWorld(e4);
    	
    	EntityMooshroom e5 = new EntityMooshroom(worldObj);
    	e5.setPosition(
    	this.posX - 6,
    	this.posY + 2,
    	this.posZ);
    	worldObj.spawnEntityInWorld(e5);
    	
    	EntityWitch e6 = new EntityWitch(worldObj);
    	e6.setPosition(
    	this.posX - 9,
    	this.posY + 2,
    	this.posZ);
    	worldObj.spawnEntityInWorld(e6);
    	
    	EntityIronGolem e7 = new EntityIronGolem(worldObj);
    	e7.setPosition(
    	this.posX,
    	this.posY + 2,
    	this.posZ + 3);
    	worldObj.spawnEntityInWorld(e7);
    	
    	EntityMagmaCube e8 = new EntityMagmaCube(worldObj);
    	e8.setPosition(
    	this.posX,
    	this.posY + 2,
    	this.posZ + 6);
    	worldObj.spawnEntityInWorld(e8);
    	
    	EntityBlaze e9 = new EntityBlaze(worldObj);
    	e9.setPosition(
    	this.posX,
    	this.posY + 2,
    	this.posZ + 9);
    	worldObj.spawnEntityInWorld(e9);
    	
    	EntityGhast e10 = new EntityGhast(worldObj);
    	e10.setPosition(
    	this.posX,
    	this.posY + 2,
    	this.posZ - 3);
    	worldObj.spawnEntityInWorld(e10);
    	
    	EntityPigZombie e11 = new EntityPigZombie(worldObj);
    	e11.setPosition(
    	this.posX,
    	this.posY + 2,
    	this.posZ - 6);
    	worldObj.spawnEntityInWorld(e11);
    	
    	EntityEnderman e12 = new EntityEnderman(worldObj);
    	e12.setPosition(
    	this.posX,
    	this.posY + 2,
    	this.posZ - 9);
    	worldObj.spawnEntityInWorld(e12);
    	
    	EntityHorse e13 = new EntityHorse(worldObj);
    	e13.setPosition(
    	this.posX + 3,
    	this.posY + 2,
    	this.posZ + 3);
    	worldObj.spawnEntityInWorld(e13);
    	
    	EntityCaveSpider e14 = new EntityCaveSpider(worldObj);
    	e14.setPosition(
    	this.posX + 3,
    	this.posY + 2,
    	this.posZ - 3);
    	worldObj.spawnEntityInWorld(e14);
    	
    	EntitySpider e15 = new EntitySpider(worldObj);
    	e15.setPosition(
    	this.posX - 3,
    	this.posY + 2,
    	this.posZ + 3);
    	worldObj.spawnEntityInWorld(e15);
    	
    	EntityWolf e16 = new EntityWolf(worldObj);
    	e16.setPosition(
    	this.posX - 3,
    	this.posY + 2,
    	this.posZ - 3);
    	worldObj.spawnEntityInWorld(e16);
    	
    	EntityMooshroom e17 = new EntityMooshroom(worldObj);
    	e17.setPosition(
    	this.posX + 3,
    	this.posY + 2,
    	this.posZ + 6);
    	worldObj.spawnEntityInWorld(e17);
    	
    	EntityIronGolem e18 = new EntityIronGolem(worldObj);
    	e18.setPosition(
    	this.posX + 6,
    	this.posY + 2,
    	this.posZ + 3);
    	worldObj.spawnEntityInWorld(e18);
    	
    	EntitySheep e19 = new EntitySheep(worldObj);
    	e19.setPosition(
    	this.posX + 6,
    	this.posY + 2,
    	this.posZ - 6);
    	worldObj.spawnEntityInWorld(e19);
    	
    	EntityVillager e20 = new EntityVillager(worldObj);
    	e20.setPosition(
    	this.posX + 6,
    	this.posY + 2,
    	this.posZ + 6);
    	worldObj.spawnEntityInWorld(e20);
    	
    	int x1 = (int) this.posX;
    	int y1 = (int) this.posY;
    	int z1 = (int) this.posZ;
    	
        
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    protected void writeEntityToNBT(NBTTagCompound p_70014_1_)
    {
        p_70014_1_.setByte("Fuse", (byte)this.fuse);
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    protected void readEntityFromNBT(NBTTagCompound p_70037_1_)
    {
        this.fuse = p_70037_1_.getByte("Fuse");
    }

    @SideOnly(Side.CLIENT)
    public float getShadowSize()
    {
        return 0.0F;
    }

    /**
     * returns null or the entityliving it was placed or ignited by
     */
    public EntityLivingBase getTntPlacedBy()
    {
        return this.tntPlacedBy;
    }

	public static void ModMain11() {
		registerEntity();
		
	}

	private static void registerEntity() {
		// TODO Auto-generated method stub
		
	}


	

}
