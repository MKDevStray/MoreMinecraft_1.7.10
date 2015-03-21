package me.straysify.moreitems;

import me.straysify.moreitems.biome.BiomeRegistry;
import me.straysify.moreitems.biome.WorldTypeShadow;
import me.straysify.moreitems.block.BlockArcticCamo;
import me.straysify.moreitems.block.BlockBarrier;
import me.straysify.moreitems.block.BlockC4;
import me.straysify.moreitems.block.BlockCherryLeaf;
import me.straysify.moreitems.block.BlockCherryLog;
import me.straysify.moreitems.block.BlockCherryPlanks;
import me.straysify.moreitems.block.BlockCherrySapling;
import me.straysify.moreitems.block.BlockClusterExplosive;
import me.straysify.moreitems.block.BlockCondensedC4;
import me.straysify.moreitems.block.BlockCreeperExplosive;
import me.straysify.moreitems.block.BlockDesertCamo;
import me.straysify.moreitems.block.BlockDigitalCamo;
import me.straysify.moreitems.block.BlockEndOre;
import me.straysify.moreitems.block.BlockFireShard;
import me.straysify.moreitems.block.BlockFragExplosive;
import me.straysify.moreitems.block.BlockInfusedSapphire;
import me.straysify.moreitems.block.BlockLandMine;
import me.straysify.moreitems.block.BlockLavaExplosive;
import me.straysify.moreitems.block.BlockMagicShard;
import me.straysify.moreitems.block.BlockMarineCamo;
import me.straysify.moreitems.block.BlockMiningExplosive;
import me.straysify.moreitems.block.BlockMobExplosive;
import me.straysify.moreitems.block.BlockNavyCamo;
import me.straysify.moreitems.block.BlockNuke;
import me.straysify.moreitems.block.BlockSapphireBlock;
import me.straysify.moreitems.block.BlockShadowGrass;
import me.straysify.moreitems.block.BlockShadowLeaf;
import me.straysify.moreitems.block.BlockShadowLog;
import me.straysify.moreitems.block.BlockShadowSapling;
import me.straysify.moreitems.block.BlockSulfurOre;
import me.straysify.moreitems.block.BlockTimeBomb;
import me.straysify.moreitems.block.BlockUraniumOre;
import me.straysify.moreitems.block.BlockWeatherBomb;
import me.straysify.moreitems.block.BlockWoodlandCamo;
import me.straysify.moreitems.block.RenderLamp;
import me.straysify.moreitems.block.infusionTable;
import me.straysify.moreitems.boss.EntityShadow;
import me.straysify.moreitems.boss.EntityShadowMob;
import me.straysify.moreitems.boss.RenderShadowMob;
import me.straysify.moreitems.boss.Shadow;
import me.straysify.moreitems.entity.Bullet;
import me.straysify.moreitems.entity.Entity44Bullet;
import me.straysify.moreitems.entity.EntityBullet;
import me.straysify.moreitems.entity.EntityC4;
import me.straysify.moreitems.entity.EntityClusterExplosive;
import me.straysify.moreitems.entity.EntityClusterSecondary;
import me.straysify.moreitems.entity.EntityCondensedC4;
import me.straysify.moreitems.entity.EntityCreeperExplosive;
import me.straysify.moreitems.entity.EntityLavaExplosive;
import me.straysify.moreitems.entity.EntityM67Grenade;
import me.straysify.moreitems.entity.EntityM9Bullet;
import me.straysify.moreitems.entity.EntityMiningExplosive;
import me.straysify.moreitems.entity.EntityMobExplosive;
import me.straysify.moreitems.entity.EntityNukePrimed;
import me.straysify.moreitems.entity.EntitySmokeGrenade;
import me.straysify.moreitems.entity.EntityTimeBomb;
import me.straysify.moreitems.entity.EntityWeatherBomb;
import me.straysify.moreitems.entity.M67Grenade;
import me.straysify.moreitems.entity.RenderBullet;
import me.straysify.moreitems.entity.RenderM67Grenade;
import me.straysify.moreitems.entity.RenderMobExplosive;
import me.straysify.moreitems.entity.RenderNuke;
import me.straysify.moreitems.entity.RenderSmokeGrenade;
import me.straysify.moreitems.item.Item44Bullet;
import me.straysify.moreitems.item.Item50CalBullet;
import me.straysify.moreitems.item.ItemBinoculars;
import me.straysify.moreitems.item.ItemBlazeBook;
import me.straysify.moreitems.item.ItemBlazeIngot;
import me.straysify.moreitems.item.ItemBullet;
import me.straysify.moreitems.item.ItemBulletCasing;
import me.straysify.moreitems.item.ItemCocoaMilk;
import me.straysify.moreitems.item.ItemDesertEagle;
import me.straysify.moreitems.item.ItemEmeraldArmor;
import me.straysify.moreitems.item.ItemEmeraldAxe;
import me.straysify.moreitems.item.ItemEmeraldHoe;
import me.straysify.moreitems.item.ItemEmeraldPickaxe;
import me.straysify.moreitems.item.ItemEmeraldShovel;
import me.straysify.moreitems.item.ItemEmeraldSword;
import me.straysify.moreitems.item.ItemEndCrystal;
import me.straysify.moreitems.item.ItemFireCrystal;
import me.straysify.moreitems.item.ItemFireShard;
import me.straysify.moreitems.item.ItemFireStaff;
import me.straysify.moreitems.item.ItemFlyRing;
import me.straysify.moreitems.item.ItemHealthCrystal;
import me.straysify.moreitems.item.ItemHermesBoots;
import me.straysify.moreitems.item.ItemHotCocoa;
import me.straysify.moreitems.item.ItemLawLauncher;
import me.straysify.moreitems.item.ItemLawRocket;
import me.straysify.moreitems.item.ItemM249;
import me.straysify.moreitems.item.ItemM4;
import me.straysify.moreitems.item.ItemM4Navy;
import me.straysify.moreitems.item.ItemM9Bullet;
import me.straysify.moreitems.item.ItemM9Pistol;
import me.straysify.moreitems.item.ItemMagicCrystal;
import me.straysify.moreitems.item.ItemMagicShard;
import me.straysify.moreitems.item.ItemMarineArmor;
import me.straysify.moreitems.item.ItemMeltedCocoa;
import me.straysify.moreitems.item.ItemMug;
import me.straysify.moreitems.item.ItemMythicalArmor;
import me.straysify.moreitems.item.ItemMythicalIngot;
import me.straysify.moreitems.item.ItemMythicalSword;
import me.straysify.moreitems.item.ItemNavyArmor;
import me.straysify.moreitems.item.ItemNetherStick;
import me.straysify.moreitems.item.ItemNetherSword;
import me.straysify.moreitems.item.ItemNightVision;
import me.straysify.moreitems.item.ItemSapphire;
import me.straysify.moreitems.item.ItemSapphireAxe;
import me.straysify.moreitems.item.ItemSapphireHoe;
import me.straysify.moreitems.item.ItemSapphirePickaxe;
import me.straysify.moreitems.item.ItemSapphireShovel;
import me.straysify.moreitems.item.ItemSapphireSword;
import me.straysify.moreitems.item.ItemShadowSword;
import me.straysify.moreitems.item.ItemSmokeGrenade;
import me.straysify.moreitems.item.ItemSulfur;
import me.straysify.moreitems.item.ItemUranium;
import me.straysify.moreitems.item.ItemUraniumRod;
import me.straysify.moreitems.item.ItemWarmCocoa;
import me.straysify.moreitems.item.ItemWitherStaff;
import me.straysify.moreitems.item.Itembarret;
import me.straysify.moreitems.mob.Crab;
import me.straysify.moreitems.mob.EntityCrab;
import me.straysify.moreitems.mob.EntityCrabMob;
import me.straysify.moreitems.mob.EntityFish;
import me.straysify.moreitems.mob.EntityFishMob;
import me.straysify.moreitems.mob.EntityMage;
import me.straysify.moreitems.mob.EntityMageMob;
import me.straysify.moreitems.mob.EntityShadowCreeper;
import me.straysify.moreitems.mob.Fish;
import me.straysify.moreitems.mob.Mage;
import me.straysify.moreitems.mob.RenderCrabMob;
import me.straysify.moreitems.mob.RenderFishMob;
import me.straysify.moreitems.mob.RenderMageMob;
import me.straysify.moreitems.mob.RenderShadowCreeper;
import me.straysify.moreitems.mob.ShadowCreeper;
import me.straysify.moreitems.tileentity.TileEntityLamp;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid = "mi", name = "More Items", version = "Release")
public class ModMain {
	
	public static String modid = "mi";
	
	//Emerald Tools
	public static Item emeraldSword;
	public static Item emeraldPickaxe;
	public static Item emeraldAxe;
	public static Item emeraldShovel;
	public static Item emeraldHoe;
	//Emerald Tool Materials
	public static final Item.ToolMaterial emeraldToolMaterial = EnumHelper.addToolMaterial("emeraldToolMaterial", 4, 2152, 15.0F, 5.0F, 10);
	public static final Item.ToolMaterial emeraldSwordMaterial = EnumHelper.addToolMaterial("emeraldSwordMaterial", 1, 2784, 2.0F, 14.0F, 10);
	public static final Item.ToolMaterial emeraldSpadeMaterial = EnumHelper.addToolMaterial("emeraldSpadeMaterial", 4, 2152, 20.0F, 5.0F, 10);
	//Netherrack Stick
	public static Item netherStick;
	//Blaze Ingot
	public static Item blazeIngot;
	//Netherrack Tools
	public static Item netherSword;
	//Netherrack Sword Material
	static final Item.ToolMaterial netherSwordMaterial = EnumHelper.addToolMaterial("netherSwordMaterial", 1, 3152, 1.0F, 5.0F, 10);
	//Blaze Book
	public static Item blazeBook;
	//Ores
	public static Block infusedSapphire;
	public static Block fireShardOre;
	//Sapphire
	public static Item sapphire;
	//Sapphire Tool Materials
	public static final Item.ToolMaterial sapphireToolMaterial = EnumHelper.addToolMaterial("sapphireToolMaterial", 3, 1562, 8.0F, 1.0F, 30);
	public static final Item.ToolMaterial sapphireSwordMaterial = EnumHelper.addToolMaterial("sapphireSwordMaterial", 1, 1984, 1.0F, 2.5F, 30);
	
	//Ender Tools
	public static final Item.ToolMaterial endToolMaterial = EnumHelper.addToolMaterial("endToolMaterial", 4, 1586, 11.0F, 1.0F, 30);
	//Sapphire Tools
	public static Item sapphireSword;
	public static Item sapphirePickaxe;
	public static Item sapphireAxe;
	public static Item sapphireShovel;
	public static Item sapphireHoe;
	//Define Magical Items
	public static Item fireStaff;
	public static Item fireShard;
	public static Item fireCrystal;
	public static Item magicShard;
	public static Item magicCrystal;
	public static Block magicShardOre;
	public static Item witherStaff;
	public static Block whiteLamp;
	public static Block sapphireBlock;
    public static Block litWhiteLamp;
    public static Block barrier;
    //Emerald Armor
    public static Item emeraldHelmet;
    public static Item emeraldChestplate;
    public static Item emeraldLeggings;
    public static Item emeraldBoots;
    //Emerald Armor Material
    public static final ItemArmor.ArmorMaterial emeraldArmorMaterial = EnumHelper.addArmorMaterial("emeraldArmorMaterial", 3428, new int[]{6,11,9,7}, 30);
    public static final ItemArmor.ArmorMaterial hermesBootsMaterial = EnumHelper.addArmorMaterial("hermesBootsMaterial", 5982, new int []{6, 11, 9, 7}, 30);
    public static final ItemArmor.ArmorMaterial mythicalArmorMaterial = EnumHelper.addArmorMaterial("mythicalArmorMaterial", 8764, new int[]{7, 12, 10, 8}, 30);
    public static final ItemArmor.ArmorMaterial marineArmorMaterial = EnumHelper.addArmorMaterial("marineArmorMaterial", 9854, new int[]{6, 11, 9, 7}, 0);
    //Shadow Sword
    public static Item shadowSword;
    public static final Item.ToolMaterial shadowSwordMaterial = EnumHelper.addToolMaterial("shadowSwordMaterial", 1, 3426, 1.0F, 20.0F, 30);
    public static final Item.ToolMaterial mythicalSwordMaterial = EnumHelper.addToolMaterial("mythicalSwordMaterial", 1, 5682, 1.0F, 28.0F, 30);
    //Ender Ore
    public static Block endOre;
    public static Item endCrystal;
    //Soul Card
    public static Item soulCard;
    
    //Shadow Grass Block
    public static Block shadowGrassBlock;
	
	@Instance
	public static ModMain modInstance;
	
	public static Block infusionTable;
	public static final int guiIDInfusionTable = 1;
	
	public static Block blockLamp;
	//Custom Explosives
	public static Block blockLandMine;
	public static Block blockNuke;
	public static Block blockFragExplosive;
	public static Block blockClusterExplosive;
	public static Block blockMiningExplosive;
	public static Block blockMobExplosive;
	public static Block blockLavaExplosive;
	public static Block blockC4;
	public static Block blockCondensedC4;
	public static Block creeperExplosive;
	
	//Sulfur/Uranium
	public static Block sulfurOre;
	public static Item sulfur;
	public static Block uraniumOre;
	public static Item uranium;
	public static Item uraniumRod;
	public static Block weatherBomb;
	public static Block timeBomb;
	
	//Custom Food
	public static Item chocolateBar;
	public static Item hotCocoa;
	public static Item mug;
	public static Item meltedCocoa;
	public static Item cocoaMilk;
	public static Item warmCocoa;
	public static Item cherry;
	
	public static Item mythicalSword;
	
	public static Item hermesBoots;
	public static Item mythicalIngot;
	public static Item mythicalHelmet;
	public static Item mythicalChestplate;
	public static Item mythicalLeggings;
	public static Item mythicalBoots;
	
	public static Block cherryLog;
	public static Block cherryLeaf;
	public static Block cherrySapling;
	public static Block cherryPlanks;
	
	public static Item marineHelmet;
	public static Item marineChest;
	public static Item marineLegs;
	public static Item marineBoots;
	
	public static Item navyHelmet;
	public static Item navyChest;
	public static Item navyLegs;
	public static Item navyBoots;
	
	public static Block woodlandCamoBlock;
	public static Block digitalCamoBlock;
	public static Block arcticCamoBlock;
	public static Block navyCamoBlock;
	public static Block desertCamoBlock;
	public static Block marineCamoBlock;
	
	public static Item nightVision;
	public static Item binoculars;
	public static Item m4navy;
	
	public static Item bullet;
	public static Item bulletCasing;
	public static Item m4;
	public static Item m67grenade;
	public static Item bullet50;
	public static Item lawLauncher;
	public static Item barret;
	public static Item lawRocket;
	public static Item m9Pistol;
	public static Item m9Bullet;
	public static Item desertEagle;
	public static Item bullet44;
	public static Item m249saw;
	
	public static Item smokeGrenade;
	
	public static Block shadowLog;
	public static Block shadowLeaf;
	public static Block shadowSapling;
	
	public static Item healthCrystal;
	public static Item flyRing;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//Item/Block Initial Registering
		
		//Custom Explosives
		blockLandMine = new BlockLandMine(Material.tnt).setBlockName("BlockLandMine").setBlockTextureName("mi:landmine").setCreativeTab(tabMIExplosives);
		blockNuke = new BlockNuke(Material.tnt).setBlockName("BlockNuke").setBlockTextureName("mi:nuke").setCreativeTab(tabMIExplosives);
		blockFragExplosive = new BlockFragExplosive(Material.tnt).setBlockName("BlockFragExplosive").setBlockTextureName("mi:frag").setCreativeTab(tabMIExplosives);
		blockClusterExplosive = new BlockClusterExplosive(Material.tnt).setBlockName("BlockClusterExplosive").setBlockTextureName("mi:cluster").setCreativeTab(tabMIExplosives);
		blockMiningExplosive = new BlockMiningExplosive(Material.tnt).setBlockName("BlockMiningExplosive").setBlockTextureName("mi:miningexplosive").setCreativeTab(tabMIExplosives);
		blockMobExplosive = new BlockMobExplosive(Material.tnt).setBlockName("BlockMobExplosive").setBlockTextureName("mi:mobexplosive").setCreativeTab(tabMIExplosives);
		blockLavaExplosive = new BlockLavaExplosive(Material.tnt).setBlockName("BlockLavaExplosive").setBlockTextureName("mi:lavaexplosive").setCreativeTab(tabMIExplosives);
		blockC4 = new BlockC4(Material.tnt).setBlockName("BlockC4").setBlockTextureName("mi:c4").setCreativeTab(tabMIExplosives);
		blockCondensedC4 = new BlockCondensedC4(Material.tnt).setBlockName("BlockCondensedC4").setBlockTextureName("mi:cc4").setCreativeTab(tabMIExplosives);
		weatherBomb = new BlockWeatherBomb(Material.tnt).setBlockName("BlockWeatherBomb").setBlockTextureName("mi:weatherbomb").setCreativeTab(tabMIExplosives);
		timeBomb = new BlockTimeBomb(Material.tnt).setBlockName("BlockTimeBomb").setBlockTextureName("mi:timebomb").setCreativeTab(tabMIExplosives);
		creeperExplosive = new BlockCreeperExplosive(Material.tnt).setBlockName("BlockCreeperExplosive").setBlockTextureName("mi:creeperexplosive").setCreativeTab(tabMIExplosives);
		
		healthCrystal = new ItemHealthCrystal(Items.apple).setUnlocalizedName("ItemHealthCrystal").setTextureName("mi:healthcrystal").setCreativeTab(tabMIFood);
		flyRing = new ItemFlyRing(Items.gold_ingot).setUnlocalizedName("ItemFlyRing").setTextureName("mi:flyring").setCreativeTab(tabMIMagic);
		
		//Custom Food
		chocolateBar = new ItemFood(2, 0.6F, false).setUnlocalizedName("ItemChocolateBar").setTextureName("mi:chocolatebar").setCreativeTab(tabMIFood);
		hotCocoa = new ItemHotCocoa(Items.emerald).setUnlocalizedName("ItemHotCocoa").setTextureName("mi:hotcocoa").setCreativeTab(tabMIFood);
		mug = new ItemMug(Items.emerald).setUnlocalizedName("ItemMug").setTextureName("mi:mug").setCreativeTab(tabMIFood);
		meltedCocoa = new ItemMeltedCocoa(Items.gold_ingot).setUnlocalizedName("ItemMeltedCocoa").setTextureName("mi:meltedcocoa").setCreativeTab(tabMIFood);
		cocoaMilk = new ItemCocoaMilk(Items.gold_ingot).setUnlocalizedName("ItemCocoaMilk").setTextureName("mi:cocoamilk").setCreativeTab(tabMIFood);
		warmCocoa = new ItemWarmCocoa(Items.gold_ingot).setUnlocalizedName("ItemWarmCocoa").setTextureName("mi:warmcocoa").setCreativeTab(tabMIFood);
		cherry = new ItemFood(3, 0.6F, false).setUnlocalizedName("ItemCherry").setTextureName("mi:cherry").setCreativeTab(tabMIFood);
		
		hermesBoots = new ItemHermesBoots(hermesBootsMaterial, 0, 3).setUnlocalizedName("ItemHermesBoots").setTextureName("mi:hermesbootsicon").setCreativeTab(tabMITools);
		mythicalIngot = new ItemMythicalIngot(Items.iron_ingot).setUnlocalizedName("ItemMythicalIngot").setTextureName("mi:mythicalingot").setCreativeTab(tabMIMats);
		
		shadowLog = new BlockShadowLog(Material.wood).setBlockName("BlockShadowLog").setBlockTextureName("mi:shadowlog").setCreativeTab(tabMIBlocks);
		shadowLeaf = new BlockShadowLeaf(Material.leaves).setBlockName("BlockShadowLeaf").setBlockTextureName("mi:shadowleaf").setCreativeTab(tabMIBlocks);
		shadowSapling = new BlockShadowSapling(Material.plants).setBlockName("BlockShadowSapling").setBlockTextureName("mi:shadowsapling").setCreativeTab(tabMIBlocks);
		
		mythicalHelmet = new ItemMythicalArmor(mythicalArmorMaterial, 0, 0).setUnlocalizedName("ItemMythicalHelmet").setTextureName("mi:mythicalhelmet").setCreativeTab(tabMITools);
		mythicalChestplate = new ItemMythicalArmor(mythicalArmorMaterial, 0, 1).setUnlocalizedName("ItemMythicalChestplate").setTextureName("mi:mythicalchestplate").setCreativeTab(tabMITools);
		mythicalLeggings = new ItemMythicalArmor(mythicalArmorMaterial, 0, 2).setUnlocalizedName("ItemMythicalLeggings").setTextureName("mi:mythicalleggings").setCreativeTab(tabMITools);
		mythicalBoots = new ItemMythicalArmor(mythicalArmorMaterial, 0, 3).setUnlocalizedName("ItemMythicalBoots").setTextureName("mi:mythicalboots").setCreativeTab(tabMITools);
		
		cherryLog = new BlockCherryLog(Material.wood).setBlockName("BlockCherryLog").setBlockTextureName("mi:cherrylog").setCreativeTab(tabMIBlocks);
		cherryLeaf = new BlockCherryLeaf(Material.leaves).setBlockName("BlockCherryLeaf").setBlockTextureName("mi:cherryleaf").setCreativeTab(tabMIBlocks);
		cherrySapling = new BlockCherrySapling(Material.plants).setBlockName("BlockCherrySapling").setBlockTextureName("mi:cherrysapling").setCreativeTab(tabMIBlocks);
		cherryPlanks = new BlockCherryPlanks(Material.wood).setBlockName("BlockCherryPlanks").setBlockTextureName("mi:cherryplank").setCreativeTab(tabMIBlocks);
		
		marineHelmet = new ItemMarineArmor(marineArmorMaterial, 0, 0).setUnlocalizedName("MarineHelmet").setTextureName("mi:marinehelmet").setCreativeTab(tabMIMilitaryGear);
		marineChest = new ItemMarineArmor(marineArmorMaterial, 0, 1).setUnlocalizedName("MarineChest").setTextureName("mi:marinechest").setCreativeTab(tabMIMilitaryGear);
		marineLegs = new ItemMarineArmor(marineArmorMaterial, 0, 2).setUnlocalizedName("MarineLegs").setTextureName("mi:marinelegs").setCreativeTab(tabMIMilitaryGear);
		marineBoots = new ItemMarineArmor(marineArmorMaterial, 0, 3).setUnlocalizedName("MarineBoots").setTextureName("mi:marineboots").setCreativeTab(tabMIMilitaryGear);
		
		navyHelmet = new ItemNavyArmor(marineArmorMaterial, 0, 0).setUnlocalizedName("NavyHelmet").setTextureName("mi:navyhelmet").setCreativeTab(tabMIMilitaryGear);
		navyChest = new ItemNavyArmor(marineArmorMaterial, 0, 1).setUnlocalizedName("NavyChest").setTextureName("mi:navychest").setCreativeTab(tabMIMilitaryGear);
		navyLegs = new ItemNavyArmor(marineArmorMaterial, 0, 2).setUnlocalizedName("NavyLegs").setTextureName("mi:navylegs").setCreativeTab(tabMIMilitaryGear);
		navyBoots = new ItemNavyArmor(marineArmorMaterial, 0, 3).setUnlocalizedName("NavyBoots").setTextureName("mi:navyboots").setCreativeTab(tabMIMilitaryGear);
		
		binoculars = new ItemBinoculars(Items.gold_ingot).setUnlocalizedName("ItemBinoculars").setTextureName("mi:binoculars").setCreativeTab(tabMIMilitaryGear);
		nightVision = new ItemNightVision(marineArmorMaterial, 0, 0).setUnlocalizedName("ItemNightVision").setTextureName("mi:nightvisionitem").setCreativeTab(tabMIMilitaryGear);
		
		m4 = new ItemM4(Items.gold_ingot).setUnlocalizedName("ItemM4").setTextureName("mi:m4").setCreativeTab(tabMIGuns);
		m4navy = new ItemM4Navy(Items.gold_ingot).setUnlocalizedName("ItemM4Navy").setTextureName("mi:m4navy").setCreativeTab(tabMIGunSkins);
		m9Pistol = new ItemM9Pistol(Items.gold_ingot).setUnlocalizedName("ItemM9Pistol").setTextureName("mi:m9pistol").setCreativeTab(tabMIGuns);
		m9Bullet = new ItemM9Bullet(Items.gold_ingot).setUnlocalizedName("ItemM9Bullet").setTextureName("mi:m9bullet").setCreativeTab(tabMIAmmo);
		bullet = new ItemBullet(Items.gold_ingot).setUnlocalizedName("ItemBullet").setTextureName("mi:bullet").setCreativeTab(tabMIAmmo);
		bulletCasing = new ItemBulletCasing(Items.gold_ingot).setUnlocalizedName("ItemBulletCasing").setTextureName("mi:bulletcasing").setCreativeTab(tabMIAmmo);
		//m67grenade = new ItemM67Grenade(Items.snowball).setUnlocalizedName("ItemM67Grenade").setTextureName("mi:m67grenade").setCreativeTab(tabMIExplosives);
		lawLauncher = new ItemLawLauncher(Items.blaze_rod).setUnlocalizedName("ItemLawLauncher").setTextureName("mi:lawitem").setCreativeTab(tabMIGuns);
		lawRocket = new ItemLawRocket(Items.snowball).setUnlocalizedName("ItemLawRocket").setTextureName("mi:lawrocket").setCreativeTab(tabMIAmmo);
		desertEagle = new ItemDesertEagle(Items.gold_ingot).setUnlocalizedName("ItemDesertEagle").setTextureName("mi:deserteagle").setCreativeTab(tabMIGuns);
		m249saw = new ItemM249(Items.gold_ingot).setUnlocalizedName("ItemM249").setTextureName("mi:m249").setCreativeTab(tabMIGuns);
		barret = new Itembarret(Items.gold_ingot).setUnlocalizedName("ItemBarret").setTextureName("mi:barret").setCreativeTab(tabMIGuns);
		bullet50 = new Item50CalBullet(Items.gold_ingot).setUnlocalizedName("Item50CalBullet").setTextureName("mi:50bullet").setCreativeTab(tabMIAmmo);
		smokeGrenade = new ItemSmokeGrenade(Items.snowball).setUnlocalizedName("ItemSmokeGrenade").setTextureName("mi:smokegrenade").setCreativeTab(tabMIMilitaryGear);
		
		bullet44 = new Item44Bullet(Items.gold_ingot).setUnlocalizedName("Item44Bullet").setTextureName("mi:44bullet").setCreativeTab(tabMIAmmo);
		
		mythicalSword = new ItemMythicalSword(mythicalSwordMaterial).setUnlocalizedName("ItemMythicalSword").setTextureName("mi:mythicalsword").setCreativeTab(tabMITools);
		
		digitalCamoBlock = new BlockDigitalCamo(Material.cloth).setBlockName("BlockDigitalCamo").setBlockTextureName("mi:digitalcamoblock").setCreativeTab(tabMIMilitaryGear);
		arcticCamoBlock = new BlockArcticCamo(Material.cloth).setBlockName("BlockArcticCamo").setBlockTextureName("mi:arcticcamoblock").setCreativeTab(tabMIMilitaryGear);
		woodlandCamoBlock = new BlockWoodlandCamo(Material.cloth).setBlockName("BlockWoodlandCamo").setBlockTextureName("mi:woodlandcamoblock").setCreativeTab(tabMIMilitaryGear);
		navyCamoBlock = new BlockNavyCamo(Material.cloth).setBlockName("BlockNavyCamo").setBlockTextureName("mi:navycamoblock").setCreativeTab(tabMIMilitaryGear);
		desertCamoBlock = new BlockDesertCamo(Material.cloth).setBlockName("BlockDesertCamo").setBlockTextureName("mi:desertcamoblock").setCreativeTab(tabMIMilitaryGear);
		marineCamoBlock = new BlockMarineCamo(Material.cloth).setBlockName("BlockMarineCamo").setBlockTextureName("mi:marinecamoblock").setCreativeTab(tabMIMilitaryGear);
		
		//Define Tool Materials, Name, Texture, and Creative Tab
		emeraldPickaxe =  new ItemEmeraldPickaxe(emeraldToolMaterial).setUnlocalizedName("ItemEmeraldPickaxe").setTextureName("mi:emeraldpickaxe").setCreativeTab(tabMITools);
		emeraldAxe = new ItemEmeraldAxe(emeraldToolMaterial).setUnlocalizedName("ItemEmeraldAxe").setTextureName("mi:emeraldaxe").setCreativeTab(tabMITools);
		emeraldShovel = new ItemEmeraldShovel(emeraldSpadeMaterial).setUnlocalizedName("ItemEmeraldShovel").setTextureName("mi:emeraldspade").setCreativeTab(tabMITools);
		emeraldHoe = new ItemEmeraldHoe(emeraldToolMaterial).setUnlocalizedName("ItemEmeraldHoe").setTextureName("mi:emeraldhoe").setCreativeTab(tabMITools);
		emeraldSword = new ItemEmeraldSword(emeraldSwordMaterial).setUnlocalizedName("ItemEmeraldSword").setTextureName("mi:emeraldsword").setCreativeTab(tabMITools);
		//Sapphires
		infusedSapphire = new BlockInfusedSapphire(Material.rock).setBlockName("BlockInfusedSapphire").setBlockTextureName("mi:isapphireore").setCreativeTab(tabMIBlocks);
		sapphire = new ItemSapphire(Items.emerald).setUnlocalizedName("ItemSapphire").setTextureName("mi:sapphire").setCreativeTab(tabMIMats);
		//Nether stuffs EntitySnowball
		netherSword = new ItemNetherSword(netherSwordMaterial).setUnlocalizedName("ItemNetherSword").setTextureName("mi:nethersword").setCreativeTab(tabMITools);
		netherStick = new ItemNetherStick(Items.stick).setUnlocalizedName("ItemNetherStick").setTextureName("mi:netherstick").setCreativeTab(tabMIMats);
		blazeIngot = new ItemBlazeIngot(Items.iron_ingot).setUnlocalizedName("ItemBlazeIngot").setTextureName("mi:blazeingot").setCreativeTab(tabMIMats);
		blazeBook = new ItemBlazeBook(Items.book).setUnlocalizedName("ItemBlazeBook").setTextureName("mi:blazebook").setCreativeTab(tabMIMagic);
		
		//Sapphire Tools
		sapphirePickaxe = new ItemSapphirePickaxe(sapphireToolMaterial).setUnlocalizedName("ItemSapphirePickaxe").setTextureName("mi:sapphirepickaxe").setCreativeTab(tabMITools);
		sapphireAxe = new ItemSapphireAxe(sapphireToolMaterial).setUnlocalizedName("ItemSapphireAxe").setTextureName("mi:sapphireaxe").setCreativeTab(tabMITools);
		sapphireShovel = new ItemSapphireShovel(sapphireToolMaterial).setUnlocalizedName("ItemSapphireShovel").setTextureName("mi:sapphireshovel").setCreativeTab(tabMITools);
		sapphireHoe = new ItemSapphireHoe(sapphireToolMaterial).setUnlocalizedName("ItemSapphireHoe").setTextureName("mi:sapphirehoe").setCreativeTab(tabMITools);
		sapphireSword = new ItemSapphireSword(sapphireSwordMaterial).setUnlocalizedName("ItemSapphireSword").setTextureName("mi:sapphiresword").setCreativeTab(tabMITools);
		sapphireBlock = new BlockSapphireBlock(Material.iron).setBlockName("BlockSapphireBlock").setBlockTextureName("mi:sapphireblock").setCreativeTab(tabMIBlocks);
		
		//Magical Item Initial Registering
		fireStaff = new ItemFireStaff(Items.blaze_rod).setUnlocalizedName("ItemFireStaff").setTextureName("mi:firestaff").setCreativeTab(tabMIMagic);
		fireShardOre = new BlockFireShard(Material.rock).setBlockName("BlockFireShard").setBlockTextureName("mi:fireshardore").setCreativeTab(tabMIBlocks);
		
		sulfurOre = new BlockSulfurOre(Material.rock).setBlockName("BlockSulfurOre").setBlockTextureName("mi:sulfurore").setCreativeTab(tabMIBlocks);
		sulfur = new ItemSulfur(Items.gunpowder).setUnlocalizedName("ItemSulfur").setTextureName("mi:itemsulfur").setCreativeTab(tabMIMats);
		
		uraniumOre = new BlockUraniumOre(Material.rock).setBlockName("BlockUraniumOre").setBlockTextureName("mi:uraniumore").setCreativeTab(tabMIBlocks);
		uranium = new ItemUranium(Items.gunpowder).setUnlocalizedName("ItemUranium").setTextureName("mi:itemuranium").setCreativeTab(tabMIMats);
		uraniumRod = new ItemUraniumRod(Items.blaze_rod).setUnlocalizedName("ItemUraniumRod").setTextureName("mi:uraniumrod").setCreativeTab(tabMIMats); 
		
		//blockLamp = new BlockLamp(Material.glass).setBlockName("BlockLamp");
		
		fireShard = new ItemFireShard(Items.emerald).setUnlocalizedName("ItemFireShard").setTextureName("mi:fireshard").setCreativeTab(tabMIMagic);
		fireCrystal = new ItemFireCrystal(Items.emerald).setUnlocalizedName("ItemFireCrystal").setTextureName("mi:firecrystal").setCreativeTab(tabMIMagic);
		magicShard = new ItemMagicShard(Items.emerald).setUnlocalizedName("ItemMagicShard").setTextureName("mi:magicshard").setCreativeTab(tabMIMagic);
		magicCrystal = new ItemMagicCrystal(Items.emerald).setUnlocalizedName("ItemMagicCrystal").setTextureName("mi:magiccrystal").setCreativeTab(tabMIMagic);
		magicShardOre = new BlockMagicShard(Material.rock).setBlockName("BlockMagicShard").setBlockTextureName("mi:magicshardore").setCreativeTab(tabMIBlocks);
		witherStaff = new ItemWitherStaff(Items.blaze_rod).setUnlocalizedName("ItemWitherStaff").setTextureName("mi:witherstaff").setCreativeTab(tabMIMagic);
		
		//Barrier
		barrier = new BlockBarrier(Material.rock).setBlockName("BlockBarrier").setBlockTextureName("mi:barrier").setCreativeTab(tabMIBlocks);
		
		//Shadow Grass Block
		shadowGrassBlock = new BlockShadowGrass(Material.ground).setBlockName("BlockShadowGrass").setBlockTextureName("mi:shadowgrassblock").setCreativeTab(tabMIBlocks);
		
		//Emerald Armor
		emeraldHelmet = new ItemEmeraldArmor(emeraldArmorMaterial, 0, 0).setUnlocalizedName("ItemEmeraldHelmet").setTextureName("mi:emeraldhelmet").setCreativeTab(tabMITools);
		emeraldChestplate = new ItemEmeraldArmor(emeraldArmorMaterial, 0, 1).setUnlocalizedName("ItemEmeraldChestplate").setTextureName("mi:emeraldchestplate").setCreativeTab(tabMITools);
		emeraldLeggings = new ItemEmeraldArmor(emeraldArmorMaterial, 0, 2).setUnlocalizedName("ItemEmeraldLeggings").setTextureName("mi:emeraldleggings").setCreativeTab(tabMITools);
		emeraldBoots = new ItemEmeraldArmor(emeraldArmorMaterial, 0, 3).setUnlocalizedName("ItemEmeraldBoots").setTextureName("mi:emeraldboots").setCreativeTab(tabMITools);
		
		//Shadow Sword
		
		shadowSword = new ItemShadowSword(shadowSwordMaterial).setUnlocalizedName("ItemShadowSword").setTextureName("mi:shadowsword").setCreativeTab(tabMITools);
		
		//Ender Ore
		endOre = new BlockEndOre(Material.rock).setBlockName("BlockEndOre").setBlockTextureName("mi:endore").setCreativeTab(tabMIBlocks);
		endCrystal = new ItemEndCrystal(Items.emerald).setUnlocalizedName("ItemEndCrystal").setTextureName("mi:endcrystal").setCreativeTab(tabMIMats);
		
		//Soul Card
		soulCard = new ItemSoulCard(Items.paper).setUnlocalizedName("ItemSoulCard").setTextureName("mi:soulcard").setCreativeTab(tabMIMagic);
		//Infusion Table
		infusionTable = new infusionTable().setBlockName("InfusionTable");
		
		
		//Entity Registering
		EntityMage.ModMain4();
		RenderingRegistry.registerEntityRenderingHandler(EntityMageMob.class, new RenderMageMob(new Mage(), 0));
		EntityCrab.ModMain3();
		RenderingRegistry.registerEntityRenderingHandler(EntityCrabMob.class, new RenderCrabMob(new Crab(), 1));
		EntityFishMob.ModMain2();
		RenderingRegistry.registerEntityRenderingHandler(EntityFish.class, new RenderFishMob(new Fish(), 0));
		EntityShadow.ModMain1();
		RenderingRegistry.registerEntityRenderingHandler(EntityShadowMob.class, new RenderShadowMob(new Shadow(), 0));
		BiomeRegistry.ModMain5();
		RenderingRegistry.registerEntityRenderingHandler(EntityNukePrimed.class, new RenderNuke());
		EntityNukePrimed.ModMain6();
		RenderingRegistry.registerEntityRenderingHandler(EntityClusterExplosive.class, new RenderNuke());
		EntityClusterExplosive.ModMain7();
		RenderingRegistry.registerEntityRenderingHandler(EntityLavaExplosive.class, new RenderNuke());
		EntityLavaExplosive.ModMain8();
		RenderingRegistry.registerEntityRenderingHandler(EntityC4.class, new RenderNuke());
		EntityC4.ModMain9();
		RenderingRegistry.registerEntityRenderingHandler(EntityCondensedC4.class, new RenderNuke());
		EntityCondensedC4.ModMain10();
		RenderingRegistry.registerEntityRenderingHandler(EntityMobExplosive.class, new RenderMobExplosive());
		EntityMobExplosive.ModMain11();
		//RenderingRegistry.registerEntityRenderingHandler(EntityBullet.class, new RenderBullet(new Bullet(), 5));
		EntityBullet.ModMain();
		RenderingRegistry.registerEntityRenderingHandler(EntityBullet.class, new RenderBullet(new Bullet(), 5));
		RenderingRegistry.registerEntityRenderingHandler(EntitySmokeGrenade.class, new RenderSmokeGrenade(new Bullet(), 8));
		EntityM67Grenade.ModMain28();
		RenderingRegistry.registerEntityRenderingHandler(EntityM67Grenade.class, new RenderM67Grenade(new M67Grenade(), 6));
		EntityM67Grenade.ModMain28();
		EntityM9Bullet.ModMain29();
		RenderingRegistry.registerEntityRenderingHandler(EntityM9Bullet.class, new RenderBullet(new Bullet(), 7));
		RenderingRegistry.registerEntityRenderingHandler(Entity44Bullet.class, new RenderBullet(new Bullet(), 8));
		RenderingRegistry.registerEntityRenderingHandler(EntityShadowCreeper.class, new RenderShadowCreeper(new ShadowCreeper(), 9));
		EntityShadowCreeper.ModMain();
		
		EntityRegistry.registerModEntity(EntityNukePrimed.class, "EntityNukePrimed", EntityRegistry.findGlobalUniqueEntityId(), this, 128, 1, true);
		EntityRegistry.registerModEntity(EntityClusterExplosive.class, "EntityClusterExplosive", EntityRegistry.findGlobalUniqueEntityId(), this, 128, 1, true);
		EntityRegistry.registerModEntity(EntityClusterSecondary.class, "EntityClusterSecondary", EntityRegistry.findGlobalUniqueEntityId(), this, 128, 1, true);
		EntityRegistry.registerModEntity(EntityMiningExplosive.class, "EntityMiningExplosive", EntityRegistry.findGlobalUniqueEntityId(), this, 128, 1, true);
		EntityRegistry.registerModEntity(EntityMobExplosive.class, "EntityMobExplosive", EntityRegistry.findGlobalUniqueEntityId(), this, 128, 1, true);
		EntityRegistry.registerModEntity(EntityLavaExplosive.class, "EntityLavaExplosive", EntityRegistry.findGlobalUniqueEntityId(), this, 128, 1, true);
		EntityRegistry.registerModEntity(EntityC4.class, "EntityC4", EntityRegistry.findGlobalUniqueEntityId(), this, 128, 1, true);
		EntityRegistry.registerModEntity(EntityCondensedC4.class, "EntityCondensedC4", EntityRegistry.findGlobalUniqueEntityId(), this, 128, 1, true);
		EntityRegistry.registerModEntity(EntityWeatherBomb.class, "EntityWeatherBomb", EntityRegistry.findGlobalUniqueEntityId(), this, 128, 1, true);
		EntityRegistry.registerModEntity(EntityTimeBomb.class, "EntityTimeBomb", EntityRegistry.findGlobalUniqueEntityId(), this, 128, 1, true);
		EntityRegistry.registerModEntity(EntityCreeperExplosive.class, "EntityCreeperExplosive", EntityRegistry.findGlobalUniqueEntityId(), this, 128, 1, true);
		EntityRegistry.registerModEntity(EntityBullet.class, "EntityBullet", EntityRegistry.findGlobalUniqueEntityId() + 1, this, 128, 1, true);
		EntityRegistry.registerModEntity(EntityM67Grenade.class, "EntityM67Grenade", EntityRegistry.findGlobalUniqueEntityId() + 53, this, 128, 1, true);
		EntityRegistry.registerModEntity(EntityShadowCreeper.class, "EntityShadowCreeper", EntityRegistry.findGlobalUniqueEntityId() + 19, this, 32, 1, true);
		EntityRegistry.registerModEntity(EntitySmokeGrenade.class, "EntitySmokeGrenade", EntityRegistry.findGlobalUniqueEntityId() + 34, this, 32, 1, true);
		
		
		
		
		
		//Register Items
		GameRegistry.registerItem(emeraldPickaxe, emeraldPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldAxe, emeraldAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldShovel, emeraldShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldHoe, emeraldHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldSword, emeraldSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(netherSword, netherSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(netherStick, netherStick.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(smokeGrenade, smokeGrenade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(blazeIngot, blazeIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(blazeBook, blazeBook.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(infusedSapphire, infusedSapphire.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphire, sapphire.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphirePickaxe, sapphirePickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphireAxe, sapphireAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphireShovel, sapphireShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphireHoe, sapphireHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphireSword, sapphireSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(fireStaff, fireStaff.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(fireShardOre, fireShardOre.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(fireShard, fireShard.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(fireCrystal, fireCrystal.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(magicShardOre, magicShardOre.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(magicShard, magicShard.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(magicCrystal, magicCrystal.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(witherStaff, witherStaff.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(sapphireBlock, sapphireBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(barrier, barrier.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldHelmet, emeraldHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldChestplate, emeraldChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldLeggings, emeraldLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldBoots, emeraldBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(barret, barret.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(bullet50, bullet50.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(shadowSword, shadowSword.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(endOre, endOre.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(endCrystal, endCrystal.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(shadowGrassBlock, shadowGrassBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerTileEntity(TileEntityLamp.class, "BlockLamp");
		//GameRegistry.registerBlock(blockLamp, "BlockLamp");
		GameRegistry.registerBlock(infusionTable, "infusionTable");
		GameRegistry.registerItem(soulCard, soulCard.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockLandMine, blockLandMine.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockNuke, blockNuke.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockFragExplosive, blockFragExplosive.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockClusterExplosive, blockClusterExplosive.getUnlocalizedName().substring(5));
		GameRegistry.registerWorldGenerator(new OreGeneration(), 0);
		GameRegistry.registerBlock(blockMiningExplosive, blockMiningExplosive.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(sulfurOre, sulfurOre.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sulfur, sulfur.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockMobExplosive, blockMobExplosive.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockLavaExplosive, blockLavaExplosive.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockC4, blockC4.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockCondensedC4, blockCondensedC4.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(uranium, uranium.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(uraniumRod, uraniumRod.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(uraniumOre, uraniumOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(weatherBomb, weatherBomb.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(timeBomb, timeBomb.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(creeperExplosive, creeperExplosive.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(chocolateBar, chocolateBar.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(hotCocoa, hotCocoa.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mug, mug.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(bulletCasing, bulletCasing.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(meltedCocoa, meltedCocoa.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(binoculars, binoculars.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cocoaMilk, cocoaMilk.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(warmCocoa, warmCocoa.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(hermesBoots, hermesBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mythicalIngot, mythicalIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mythicalBoots, mythicalBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mythicalChestplate, mythicalChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mythicalLeggings, mythicalLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mythicalHelmet, mythicalHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(cherryLog, cherryLog.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(cherryLeaf, cherryLeaf.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(cherrySapling, cherrySapling.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(cherryPlanks, cherryPlanks.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cherry, cherry.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(m4, m4.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(bullet, bullet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(marineHelmet, marineHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(marineChest, marineChest.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(marineLegs, marineLegs.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(marineBoots, marineBoots.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(m67grenade, m67grenade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lawRocket, lawRocket.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lawLauncher, lawLauncher.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(navyHelmet, navyHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(navyChest, navyChest.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(navyLegs, navyLegs.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(navyBoots, navyBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(m9Pistol, m9Pistol.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(m9Bullet, m9Bullet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(m4navy, m4navy.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mythicalSword, mythicalSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(nightVision, nightVision.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(desertEagle, desertEagle.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(bullet44, bullet44.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(m249saw, m249saw.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(healthCrystal, healthCrystal.getUnlocalizedName().substring(5));
		
		GameRegistry.registerBlock(digitalCamoBlock, digitalCamoBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(arcticCamoBlock, arcticCamoBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(woodlandCamoBlock, woodlandCamoBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(navyCamoBlock, navyCamoBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(desertCamoBlock, desertCamoBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(marineCamoBlock, marineCamoBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(shadowSapling, shadowSapling.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(shadowLog, shadowLog.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(shadowLeaf, shadowLeaf.getUnlocalizedName().substring(5));
		
		
		GameRegistry.registerWorldGenerator(new MMCWorldGen(), 0);
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLamp.class, new RenderLamp());
		
		
		//TO-DO: Add fire staff crafting, add blaze book crafting.
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		//Proxy, TileEntity, entity, GUI, and Packet Registering/Handling
		GameRegistry.addRecipe(new ItemStack(emeraldPickaxe), new Object[]{"EEE"," S "," S ",'S', Items.stick, 'E', Items.emerald});
		GameRegistry.addRecipe(new ItemStack(emeraldSword), new Object[]{" E "," E "," S ",'S', Items.stick, 'E', Items.emerald});
		GameRegistry.addRecipe(new ItemStack(emeraldShovel), new Object[]{" E "," S "," S ",'S', Items.stick, 'E', Items.emerald});
		GameRegistry.addRecipe(new ItemStack(emeraldAxe), new Object[]{"EE ","ES "," S ",'S', Items.stick, 'E', Items.emerald});
		GameRegistry.addRecipe(new ItemStack(emeraldHoe), new Object[]{"EE "," S "," S ",'S', Items.stick, 'E', Items.emerald});
		GameRegistry.addRecipe(new ItemStack(blazeIngot), new Object[]{"NBN","GLG","NBN",'N', Blocks.netherrack,'B', Items.blaze_powder,'G', Items.glowstone_dust,'L', Items.lava_bucket});
		GameRegistry.addRecipe(new ItemStack(netherStick), new Object[]{"N","G","N",'N', Blocks.netherrack,'G', Blocks.glowstone});
		GameRegistry.addRecipe(new ItemStack(netherSword), new Object[]{"B","B","N",'B', blazeIngot,'N', netherStick});
		GameRegistry.addRecipe(new ItemStack(sapphirePickaxe), new Object[]{"SSS"," W "," W ",'S', sapphire,'W', Items.stick});
		GameRegistry.addRecipe(new ItemStack(sapphireAxe), new Object[]{"SS ","SW "," W ",'S', sapphire,'W', Items.stick});
		GameRegistry.addRecipe(new ItemStack(sapphireShovel), new Object[]{"S","W","W",'S', sapphire,'W', Items.stick});
		GameRegistry.addRecipe(new ItemStack(sapphireHoe), new Object[]{"SS "," W "," W ",'S', sapphire,'W', Items.stick});
		GameRegistry.addRecipe(new ItemStack(sapphireSword), new Object[]{"S","S","W",'S', sapphire,'W', Items.stick});
		GameRegistry.addRecipe(new ItemStack(fireCrystal), new Object[]{"FFF","FFF","FFF",'F', fireShard});
		GameRegistry.addRecipe(new ItemStack(infusionTable), new Object[] {"SMS", "SCS", "SMS", 'M', magicShard, 'S', Blocks.stone, 'C', Blocks.crafting_table});
		GameRegistry.addRecipe(new ItemStack(chocolateBar, 2), new Object[] {"XXX", 'X', new ItemStack(Items.dye, 1, 3)});
		GameRegistry.addRecipe(new ItemStack(cocoaMilk), new Object[] {"X", "Y", "Z", 'X', Items.milk_bucket, 'Y', meltedCocoa, 'Z', Items.bowl});
		GameRegistry.addRecipe(new ItemStack(warmCocoa), new Object[] {"X", "Z", 'X', cocoaMilk, 'Z', mug});
		GameRegistry.addRecipe(new ItemStack(cherryPlanks, 4), new Object[] {"W", 'W', cherryLog});
		
		//Smelting
		GameRegistry.addSmelting(new ItemStack(Items.dye, 1, 3), new ItemStack(meltedCocoa), 2.0F);
		GameRegistry.addSmelting(new ItemStack(warmCocoa), new ItemStack(hotCocoa), 5.0F);
		GameRegistry.addSmelting(new ItemStack(cherryLog), new ItemStack(Items.coal), 1.0F);
		
		
		FMLCommonHandler.instance().bus().register(new CraftingHandler());
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		WorldType SHADOW = new WorldTypeShadow(3, "shadow");
		
	}
	
	public static CreativeTabs tabMITools = new CreativeTabs("tabMITools") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(emeraldPickaxe).getItem();
		}
	};
	
	public static CreativeTabs tabMIMats = new CreativeTabs("tabMIMats") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(netherStick).getItem();
		}
	};
	
	public static CreativeTabs tabMIMagic = new CreativeTabs("tabMIMagic") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(magicCrystal).getItem();
		}
	};
	
	public static CreativeTabs tabMIBlocks = new CreativeTabs("tabMIBlocks") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(infusedSapphire).getItem();
		}
	};
	
	public static CreativeTabs tabMIExplosives = new CreativeTabs("tabMIExplosives") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(blockC4).getItem();
		}
	};
	
	public static CreativeTabs tabMIFood = new CreativeTabs("tabMIFood") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(chocolateBar).getItem();
		}
	};
	
	public static CreativeTabs tabMIGuns = new CreativeTabs("tabMIGuns") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(m4).getItem();
		}
	};
	
	public static CreativeTabs tabMIMilitaryGear = new CreativeTabs("tabMIMilitaryGear") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(marineHelmet).getItem();
		}
	};
	public static CreativeTabs tabMIAmmo = new CreativeTabs("tabMIAmmo") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(bullet).getItem();
		}
	};
	public static CreativeTabs tabMIGunSkins = new CreativeTabs("tabMIGunSkins") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(m4navy).getItem();
		}
	};

}