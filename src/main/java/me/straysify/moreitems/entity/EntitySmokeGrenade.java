package me.straysify.moreitems.entity;

import java.util.List;

import me.straysify.moreitems.effect.EntityGSmokeEffect;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntitySmokeGrenade extends EntityThrowable
{
    private static final String __OBFID = "CL_000017232";
    private boolean ignited = false;
    private int field_145788_c = -1;
    private int field_145786_d = -1;
    private int field_145787_e = -1;
    private Block field_145785_f;
    protected boolean inGround;
    public int throwableShake;
    /** The entity that threw this throwable item. */
    private EntityLivingBase thrower;
    private String throwerName;
    private int ticksInGround;
    private int ticksInAir;

    public EntitySmokeGrenade(World p_i1773_1_)
    {
        super(p_i1773_1_);
    }

    public EntitySmokeGrenade(World p_i1774_1_, EntityLivingBase p_i1774_2_)
    {
        super(p_i1774_1_, p_i1774_2_);
    }

    public EntitySmokeGrenade(World p_i1775_1_, double p_i1775_2_, double p_i1775_4_, double p_i1775_6_)
    {
        super(p_i1775_1_, p_i1775_2_, p_i1775_4_, p_i1775_6_);
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition p_70184_1_)
    {
    	this.worldObj.playSoundAtEntity(this, "mi:smokedetonate", 1.0F, 1.0F);
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX, this.posY, this.posZ));
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX, this.posY, this.posZ));
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX + 5, this.posY, this.posZ));
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX + 5, this.posY, this.posZ));
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX - 5, this.posY, this.posZ));
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX - 5, this.posY, this.posZ));
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX, this.posY, this.posZ + 5));
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX, this.posY, this.posZ + 5));
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX, this.posY, this.posZ - 5));
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX, this.posY, this.posZ - 5));
    	
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX, this.posY, this.posZ));
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX, this.posY, this.posZ));
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX + 5, this.posY, this.posZ));
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX + 5, this.posY, this.posZ));
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX - 5, this.posY, this.posZ));
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX - 5, this.posY, this.posZ));
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX, this.posY, this.posZ + 5));
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX, this.posY, this.posZ + 5));
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX, this.posY, this.posZ - 5));
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX, this.posY, this.posZ - 5));
    	
//    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX + 2, this.posY + 2, this.posZ + 2));
//    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX - 2, this.posY + 2, this.posZ + 2));
//    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX + 2, this.posY + 2, this.posZ - 2));
//    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX - 2, this.posY + 2, this.posZ - 2));
    	
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX, this.posY, this.posZ));
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX, this.posY, this.posZ));
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX + 4, this.posY, this.posZ));
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX + 4, this.posY, this.posZ));
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX - 4, this.posY, this.posZ));
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX - 4, this.posY, this.posZ));
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX, this.posY, this.posZ + 4));
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX, this.posY, this.posZ + 4));
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX, this.posY, this.posZ - 4));
    	Minecraft.getMinecraft().effectRenderer.addEffect(new EntityGSmokeEffect(this.worldObj, this.posX, this.posY, this.posZ - 4));
    	
    
    	
    	this.setVelocity(0, 0, 0);
    	this.throwableShake = 0;
    	this.setDead();
    	this.inGround = true;
        if (p_70184_1_.entityHit != null)
        {
            byte b0 = 3;

            if (p_70184_1_.entityHit instanceof EntityBlaze)
            {
                b0 = 3;
            }

            p_70184_1_.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 3.0F);
            
        }
//
       for (int i = 0; i < 1; ++i)
        {
           //this.worldObj.spawnParticle("snowballpoof", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
         //  this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 8.0F, true);
        }

    }

	public static void ModMain28() {
		registerEntity28();
		
	}
	
    protected float getGravityVelocity()
    {
    	if(this.inGround) {
    		return 0.0F;
    	}
    	else {
        return 0.05F;
    	}
    }

	private static void registerEntity28() {
		// TODO Auto-generated method stub
		
	}
	
    public void onUpdate()
    {
    	if(this.ticksExisted > 60) {
    		ignited = true;
    	}
    	else {
    		ignited = false;
    	}
    	
    	if(ignited == true) {
//    		this.worldObj.spawnParticle("hugeexplosion", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
//    		this.worldObj.spawnParticle("hugeexplosion", this.posX + 5, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
//    		this.worldObj.spawnParticle("hugeexplosion", this.posX - 5, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
//    		this.worldObj.spawnParticle("hugeexplosion", this.posX, this.posY, this.posZ + 5, 0.0D, 0.0D, 0.0D);
//    		this.worldObj.spawnParticle("hugeexplosion", this.posX, this.posY, this.posZ - 5, 0.0D, 0.0D, 0.0D);
    		
    		//Minecraft.getMinecraft().effectRenderer.addEffect(new EntitySmokeEffect(this.worldObj, this.posX, this.posY, this.posZ));
    	
    		
    	}
    	
        this.lastTickPosX = this.posX;
        this.lastTickPosY = this.posY;
        this.lastTickPosZ = this.posZ;
		this.worldObj.spawnParticle("smoke", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
		this.worldObj.spawnParticle("smoke", this.posX, this.posY + 0.1F, this.posZ, 0.0D, 0.0D, 0.0D);
		this.worldObj.spawnParticle("smoke", this.posX, this.posY - 0.1F, this.posZ, 0.0D, 0.0D, 0.0D);
		this.worldObj.spawnParticle("smoke", this.posX, this.posY, this.posZ - 0.1F, 0.0D, 0.0D, 0.0D);
		this.worldObj.spawnParticle("smoke", this.posX + 0.1F, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
		this.worldObj.spawnParticle("smoke", this.posX, this.posY, this.posZ + 0.1F, 0.0D, 0.0D, 0.0D);
		this.worldObj.spawnParticle("smoke", this.posX - 0.1F, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
        super.onUpdate();

        if (this.ticksExisted >= 320)
        {
            this.setDead();
        }

        if (this.throwableShake > 0)
        {
            --this.throwableShake;
        }

        if (this.inGround)
        {
        	
        	
        	
        	
        	if(this.inGround == true) {
        		
        	}
        	if(this.worldObj.getBlock(this.field_145788_c, this.field_145786_d, this.field_145787_e) == Blocks.glass) {
        		this.worldObj.setBlock(this.field_145788_c, this.field_145786_d, this.field_145787_e, Blocks.air);
        	}
            if (this.worldObj.getBlock(this.field_145788_c, this.field_145786_d, this.field_145787_e) == this.field_145785_f)
            {
                ++this.ticksInGround;

                

                return;
            }

            this.inGround = false;
            this.motionX *= (double)(this.rand.nextFloat() * 0.2F);
            this.motionY *= (double)(this.rand.nextFloat() * 0.2F);
            this.motionZ *= (double)(this.rand.nextFloat() * 0.2F);
            this.ticksInGround = 0;
            this.ticksInAir = 0;
        }
        else
        {
            ++this.ticksInAir;
        }

        Vec3 vec3 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
        Vec3 vec31 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
        MovingObjectPosition movingobjectposition = this.worldObj.rayTraceBlocks(vec3, vec31);
        vec3 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
        vec31 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);

        if (movingobjectposition != null)
        {
            vec31 = Vec3.createVectorHelper(movingobjectposition.hitVec.xCoord, movingobjectposition.hitVec.yCoord, movingobjectposition.hitVec.zCoord);
        }

        if (!this.worldObj.isRemote)
        {
            Entity entity = null;
            List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));
            double d0 = 0.0D;
            EntityLivingBase entitylivingbase = this.getThrower();

            for (int j = 0; j < list.size(); ++j)
            {
                Entity entity1 = (Entity)list.get(j);

                if (entity1.canBeCollidedWith() && (entity1 != entitylivingbase || this.ticksInAir >= 5))
                {
                    float f = 0.3F;
                    AxisAlignedBB axisalignedbb = entity1.boundingBox.expand((double)f, (double)f, (double)f);
                    MovingObjectPosition movingobjectposition1 = axisalignedbb.calculateIntercept(vec3, vec31);

                    if (movingobjectposition1 != null)
                    {
                        double d1 = vec3.distanceTo(movingobjectposition1.hitVec);

                        if (d1 < d0 || d0 == 0.0D)
                        {
                            entity = entity1;
                            d0 = d1;
                        }
                    }
                }
            }

            if (entity != null)
            {
                movingobjectposition = new MovingObjectPosition(entity);
            }
        }

        if (movingobjectposition != null)
        {
            if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && this.worldObj.getBlock(movingobjectposition.blockX, movingobjectposition.blockY, movingobjectposition.blockZ) == Blocks.portal)
            {
                this.setInPortal();
            }
            else
            {
                this.onImpact(movingobjectposition);
            }
        }
	}
}