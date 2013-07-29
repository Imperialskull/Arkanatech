package imperialskull.at1.block;

import imperialskull.at1.lib.BlockIds;
import imperialskull.at1.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;



public class ArkaneBlocks {        
    

        

    /*declare Block Instancing here*/
    public static Block plastic;
    public static Block plexiglass;
    public static Block plexiglow;
    public static Block plexidoor;
    public static Block arkaneC4;
    public static Block plasticWall;
    public static Block microwave;
    public static Block blockrunejera;



    
    public static void init(){
    	

        

        

       
        /*Declaring all block IDs (reference system)*/
        plastic = new BlockPlastic(BlockIds.PLASTICBLOCK_DEFAULT, null);
        arkaneC4 = new ArkaneC4(BlockIds.ARKANEC4_DEFAULT, null);
        blockrunejera = new BlockRuneJera(510,null);
        plexiglass = new BlockPlexiglass(BlockIds.PLEXIGLASS_DEFUALT, Material.glass, false);
        plexiglow = new BlockPlexiglow(BlockIds.PLEXIGLOW_DEFUALT, Material.glass, false);
        plexidoor = new BlockPlexidoor(BlockIds.PLEXIDOOR_DEFAULT,Material.glass,false);


        
        /*Declare blocks for game registry AKA add me! */

        GameRegistry.registerBlock(plastic,ItemBlockPlastic.class, Strings.PLASTICBLOCK_NAME);
        GameRegistry.registerBlock(plexiglass,ItemBlockPlastic.class,Strings.PLEXIGLASS_NAME);
        GameRegistry.registerBlock(plexiglow,ItemBlockPlastic.class,Strings.PLEXIGLOW_NAME);
        GameRegistry.registerBlock(arkaneC4,Strings.C4_NAME);
        GameRegistry.registerBlock(blockrunejera,Strings.BLOCKRUNE_JERA);

        
        
        
        LanguageRegistry.addName(arkaneC4, "C4");
        LanguageRegistry.addName(blockrunejera, "Runic Block of Jera");
        LanguageRegistry.instance().addStringLocalization("entity.primedC4.name","C4");
        /*Declare blocks ingame name lang. registry (blocks) */
        
        for (int i = 0; i < 16; i++) {
            LanguageRegistry.addName(new ItemStack(plastic, 1, i), Strings.COLOURS[new ItemStack(plastic,1,i).getItemDamage()]+" Plastic Block");
            LanguageRegistry.addName(new ItemStack(plexiglass, 1, i), Strings.COLOURS[new ItemStack(plexiglass,1,i).getItemDamage()]+" Plexiglass Block");
            LanguageRegistry.addName(new ItemStack(plexiglow, 1, i), Strings.COLOURS[new ItemStack(plexiglow,1,i).getItemDamage()]+" Plexiglow Block");
        
            
            
        }
        
    }
}
        
        
        
        


 
