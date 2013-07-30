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
    public static int itemfilterID = ItemIds.FILTER_DEFAULT;
    
    //Tool itemIDs
    public static int plasticPickID = ItemIds.PLASTICPICK_DEFAULT;
    public static int plasticAxeID = ItemIds.PLASTICAXE_DEFAULT;
    public static int plasticShovelID = ItemIds.PLASTICSHOVEL_DEFAULT;
    public static int plasticSwordID = ItemIds.PLASTICSWORD_DEFAULT;
    public static int plasticHoeID = ItemIds.PLASTICHOE_DEFAULT;
    public static int sakpmaxeID = ItemIds.SAKPM_AXE_DEFAULT;
    public static int sakpmhoeID = ItemIds.SAKPM_HOE_DEFAULT;
    public static int sakpmpickID = ItemIds.SAKPM_PICK_DEFAULT;
    public static int sakpmswordID = ItemIds.SAKPM_SWORD_DEFAULT;
    public static int sakpmshovelID = ItemIds.SAKPM_SHOVEL_DEFAULT;
    public static int refplasticswordID = ItemIds.REFPLASTIC_SWORD_DEFAULT;
    public static int refplasticpickID = ItemIds.REFPLASTIC_PICK_DEFAULT;
    public static int refplasticshovelID = ItemIds.REFPLASTIC_SHOVEL_DEFAULT;
    public static int refplasticaxeID = ItemIds.REFPLASTIC_AXE_DEFAULT;
    public static int refplastichoeID = ItemIds.REFPLASTIC_HOE_DEFAULT;
    public static int gilplasticswordID = ItemIds.GILPLASIC_SWORD_DEFUALT;
    public static int gilplasticpickID = ItemIds.GILPLASTIC_PICK_DEFUALT;
    public static int gilplasticshovelID = ItemIds.GILPLASTIC_SHOVEL_DEFAULT;
    public static int gilplasticaxeID = ItemIds.GILPLASTIC_AXE_DEFAULT;
    public static int gilplastichoeID = ItemIds.GILPLASTIC_HOE_DEFAULT;
    
    //armor itemIDs
    
    public static int plasticHelmID = ItemIds.PLASTICHELM_DEFAULT;
    public static int plasticChestID = ItemIds.PLASTICCHEST_DEFAULT;
    public static int plasticLegsID = ItemIds.PLASTICLEGS_DEFAULT;
    public static int plasticBootsID = ItemIds.PLASTICBOOTS_DEFAULT;
    public static int nvgoggleID = ItemIds.NIGHTVISION_DEFAULT;
    


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
    itemfilterID = config.getItem("Filter", itemfilterID).getInt();
    
    //tools
    plasticAxeID= config.getItem("Plastic Axe",plasticAxeID).getInt();
    plasticPickID= config.getItem("Plastic Pick",plasticPickID).getInt();
    plasticShovelID= config.getItem("Plastic Shovel",plasticShovelID).getInt();
    plasticSwordID= config.getItem("Plastic Sword",plasticSwordID).getInt();
    sakpmaxeID= config.getItem("SAK:plastic axe",sakpmaxeID).getInt();
    sakpmhoeID= config.getItem("SAK:plastic hoe",sakpmhoeID).getInt();
    sakpmpickID= config.getItem("SAK:plastic pick",sakpmpickID).getInt();
    sakpmshovelID= config.getItem("SAK:plastic shovel",sakpmshovelID).getInt();
    sakpmswordID= config.getItem("SAK:plastic sword",sakpmswordID).getInt();
    refplasticswordID= config.getItem("Reinforced Plastic Sword",refplasticswordID).getInt();
    refplasticpickID= config.getItem("Reinforced Plastic Pick",refplasticpickID).getInt();
    refplasticshovelID= config.getItem("Reinforced Plastic Shovel",refplasticshovelID).getInt();
    refplasticaxeID= config.getItem("Reinforced Plastic Axe ",refplasticaxeID).getInt();
    refplastichoeID= config.getItem("Reinforced Plastic Hoe",refplastichoeID).getInt();
    gilplasticswordID= config.getItem("Gilded Plastic Sword",gilplasticswordID).getInt();
    gilplasticpickID= config.getItem("Gilded Plastic Pick",gilplasticpickID).getInt();
    gilplasticaxeID= config.getItem("Gilded Plastic Axe",gilplasticaxeID).getInt();
    gilplasticshovelID= config.getItem("Gilded Plastic Shovel",gilplasticshovelID).getInt();
    gilplastichoeID= config.getItem("Gilded Plastic Hoe",gilplastichoeID).getInt();
    
    
    
    //armor
    plasticHelmID=config.getItem("plastic Helm",plasticHelmID).getInt();
    plasticChestID=config.getItem("Plastic Chestplate", plasticChestID).getInt();
    plasticLegsID=config.getItem("Plastic Leggings", plasticLegsID).getInt();
    plasticBootsID=config.getItem("Plastic Boots", plasticBootsID).getInt();
    nvgoggleID=config.getItem("Night Vision Goggles",nvgoggleID).getInt();
   
    
    
   
    
    config.save();
    

    }
}

