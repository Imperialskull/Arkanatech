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
    
    //Item Constants
    
    public static int craftingItemsID = ItemIds.CRAFT_ITEMS_DEFAULT;
    public static int plasticPickID = ItemIds.PLASTICPICK_DEFAULT;
    public static int plasticAxeID = ItemIds.PLASTICAXE_DEFAULT;
    public static int plasticShovelID = ItemIds.PLASTICSHOVEL_DEFAULT;
    public static int plasticSwordID = ItemIds.PLASTICSWORD_DEFAULT;
    


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
    
    
    
    
    //ITEM CFG CREATION
    
    craftingItemsID = config.getItem("Crafting items", craftingItemsID).getInt();
    plasticAxeID= config.getItem("Plastic Axe",plasticAxeID).getInt();
    plasticPickID= config.getItem("Plastic Pick",plasticPickID).getInt();
    plasticShovelID= config.getItem("Plastic Shovel",plasticShovelID).getInt();
    plasticSwordID= config.getItem("Plastic Sword",plasticSwordID).getInt();
   
    
    
   
    
    config.save();
    

    }
}

