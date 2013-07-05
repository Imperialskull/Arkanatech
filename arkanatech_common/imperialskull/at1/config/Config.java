package imperialskull.at1.config;

import imperialskull.at1.Arkanatech;
import imperialskull.at1.lib.BlockIds;
import imperialskull.at1.lib.ItemIds;

import java.io.File;
import java.io.IOException;

import net.minecraftforge.common.Configuration;



public class Config {
    
    //Block constants
    
    public static int plasticBlockID = BlockIds.PLASTICBLOCK_DEFAULT;
    public static int plexiGlassID = BlockIds.PLEXIGLASS_DEFUALT;
    public static int plexiGlowID = BlockIds.PLEXIGLOW_DEFUALT;
    public static int plexiDoorID = BlockIds.PLEXIDOOR_DEFAULT;
    
    //Item Constants
    
    public static int craftingItemsID = ItemIds.CRAFT_ITEMS_DEFAULT;
    public static int woodmortarPestleID = ItemIds.WOOD_MORTAR_PESTLE_DEFUALT;
    public static int arkanejelloID = ItemIds.JELLO_DEFAULT;
    public static int itemPlexiDoorID = ItemIds.PLEXIDOOR_ITEM_DEFAULT;
    
    //Tool itemIDs
    public static int plasticPickID = ItemIds.PLASTICPICK_DEFAULT;
    public static int plasticAxeID = ItemIds.PLASTICAXE_DEFAULT;
    public static int plasticShovelID = ItemIds.PLASTICSHOVEL_DEFAULT;
    public static int plasticSwordID = ItemIds.PLASTICSWORD_DEFAULT;
    public static int plasticHoeID = ItemIds.PLASTICHOE_DEFAULT;
    
    //armor itemIDs
    
    public static int plasticHelmID = ItemIds.PLASTICHELM_DEFAULT;
    public static int plasticChestID = ItemIds.PLASTICCHEST_DEFAULT;
    public static int plasticLegsID = ItemIds.PLASTICLEGS_DEFAULT;
    public static int plasticBootsID = ItemIds.PLASTICBOOTS_DEFAULT;
    


    public static void initConfig(){
        
        File cfgFile = new File(Arkanatech.proxy.getMinecraftDir()+"/config/Arkanatech.cfg");
        
        try
        {
            cfgFile.createNewFile();
            System.out.println("Creating configuration for Arkanatech");
        } 
        catch (IOException e)
        {
            System.out.println(e);
        }
    
    Configuration config = new Configuration(cfgFile);
    config.load();
    
    /* Block CFG CREATION */
    
    plasticBlockID = config.getBlock("Plastic Block",plasticBlockID).getInt();
    plexiGlassID = config.getBlock("Plexiglass Block",plexiGlassID).getInt();
    plexiGlowID= config.getBlock("Plexiglow Block",plexiGlowID).getInt();
    plexiDoorID=config.getBlock("plexidoor BLOCK", plexiDoorID).getInt();
    
    
    
    
    //ITEM CFG CREATION
    itemPlexiDoorID = config.getItem("Plexidoor ITEM",itemPlexiDoorID).getInt();
    arkanejelloID = config.getItem("jello", arkanejelloID).getInt();
    craftingItemsID = config.getItem("Crafting items", craftingItemsID).getInt();
    woodmortarPestleID = config.getItem("wood mortar & pestle", woodmortarPestleID).getInt();
    
    //tools
    plasticAxeID= config.getItem("Plastic Axe",plasticAxeID).getInt();
    plasticPickID= config.getItem("Plastic Pick",plasticPickID).getInt();
    plasticShovelID= config.getItem("Plastic Shovel",plasticShovelID).getInt();
    plasticSwordID= config.getItem("Plastic Sword",plasticSwordID).getInt();
    plasticHoeID= config.getItem("Plastic Hoe",plasticHoeID).getInt();
    
    //armor
    plasticHelmID=config.getItem("plastic Helm",plasticHelmID).getInt();
    plasticChestID=config.getItem("Plastic Chestplate", plasticChestID).getInt();
    plasticLegsID=config.getItem("Plastic Leggings", plasticLegsID).getInt();
    plasticBootsID=config.getItem("Plastic Boots", plasticBootsID).getInt();
   
    
    
   
    
    config.save();
    

    }
}

