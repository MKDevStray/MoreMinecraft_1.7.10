package me.straysify.moreitems.item;

import me.straysify.moreitems.ModMain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemHealthCrystal extends Item
{
    /** Number of ticks to run while 'EnumAction'ing until result. */
    public final int itemUseDuration;
    /** The amount this food item heals the player. */
    private final int healAmount;
    /** Whether wolves like this food (true for raw and cooked porkchop). */
    private final boolean isWolfsFavoriteMeat;
    /** If this field is true, the food can be consumed even if the player don't need to eat. */
    private boolean alwaysEdible;
    /** represents the potion effect that will occurr upon eating this food. Set by setPotionEffect */
    private int potionId;
    /** set by setPotionEffect */
    private int potionDuration;
    /** set by setPotionEffect */
    private int potionAmplifier;
    /** probably of the set potion effect occurring */
    private float potionEffectProbability;
    private static final String __OBFID = "CL_00000036";

    public ItemHealthCrystal(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_)
    {
        this.itemUseDuration = 32;
        this.healAmount = p_i45339_1_;
        this.isWolfsFavoriteMeat = p_i45339_3_;
        this.setCreativeTab(CreativeTabs.tabFood);
    }



	public ItemHealthCrystal(Item apple) {
		this.itemUseDuration = 16;
        this.healAmount = 0;
        this.isWolfsFavoriteMeat = false;
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
public void onUpdate(ItemStack stack, World world, EntityPlayer player, int par4, boolean par5) {
		
		ItemStack slot1 = player.inventory.getStackInSlot(8);
		if(slot1 != null) {
			if(slot1.getItem() == ModMain.healthCrystal) {
				player.capabilities.allowFlying = true;
			}
		}
		else
		{
			player.capabilities.allowFlying = false;
			
		}
		
	}



	public ItemStack onEaten(ItemStack p_77654_1_, World p_77654_2_, EntityPlayer player)
    {
        player.setHealth(20.0F);
        --p_77654_1_.stackSize;
//        p_77654_2_.playSoundAtEntity(p_77654_3_, "random.burp", 0.5F, p_77654_2_.rand.nextFloat() * 0.1F + 0.9F);
        this.onFoodEaten(p_77654_1_, p_77654_2_, player);
        return p_77654_1_;
    }

    protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_, EntityPlayer p_77849_3_)
    {
        if (!p_77849_2_.isRemote && this.potionId > 0 && p_77849_2_.rand.nextFloat() < this.potionEffectProbability)
        {
            p_77849_3_.addPotionEffect(new PotionEffect(this.potionId, this.potionDuration * 20, this.potionAmplifier));
        }
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack p_77626_1_)
    {
        return 16;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack p_77661_1_)
    {
        return EnumAction.eat;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
    {
        if (p_77659_3_.canEat(this.alwaysEdible))
        {
            p_77659_3_.setItemInUse(p_77659_1_, this.getMaxItemUseDuration(p_77659_1_));
        }

        return p_77659_1_;
    }

    public int func_150905_g(ItemStack p_150905_1_)
    {
        return this.healAmount;
    }

    /**
     * Whether wolves like this food (true for raw and cooked porkchop).
     */


    /**
     * Set the field 'alwaysEdible' to true, and make the food edible even if the player don't need to eat.
     */
    public ItemHealthCrystal setAlwaysEdible()
    {
        this.alwaysEdible = true;
        return this;
    }
}