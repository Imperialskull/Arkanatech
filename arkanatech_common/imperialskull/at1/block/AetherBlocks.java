package imperialskull.at1.block;

import imperialskull.at1.lib.Strings;
import imperialskull.at1.lib.BlockIds;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;



public class AetherBlocks {
    
    /*declare Block Instancing here*/
    public static Block plastic;
    public static Block plexiglass;
    public static Block plexiglow;
    
    public static void init(){
        /*Declaring all block IDs (reference system)*/
        plastic = new BlockPlastic(BlockIds.PLASTICBLOCK_DEFAULT, null);
        plexiglass = new BlockPlexiglass(BlockIds.PLEXIGLASS_DEFUALT, Material.glass, false);
        plexiglow = new BlockPlexiglow(BlockIds.PLEXIGLOW_DEFUALT, Material.glass, false);

        
        /*Declare blocks for game registry AKA add me! */
        GameRegistry.registerBlock(plastic,ItemBlockPlastic.class, Strings.PLASTICBLOCK_NAME);
        GameRegistry.registerBlock(plexiglass,ItemBlockPlastic.class,Strings.PLEXIGLASS_NAME);
        GameRegistry.registerBlock(plexiglow,ItemBlockPlastic.class,Strings.PLEXIGLOW_NAME);
        
        /*Declare blocks ingame name lang. registry (blocks) */
        
        for (int i = 0; i < 16; i++) {
            LanguageRegistry.addName(new ItemStack(plastic, 1, i), Strings.COLOURS[new ItemStack(plastic,1,i).getItemDamage()]+" Plastic Block");
            LanguageRegistry.addName(new ItemStack(plexiglass, 1, i), Strings.COLOURS[new ItemStack(plexiglass,1,i).getItemDamage()]+" Plexiglass Block");
            LanguageRegistry.addName(new ItemStack(plexiglow, 1, i), Strings.COLOURS[new ItemStack(plexiglow,1,i).getItemDamage()]+" Plexiglow Block");
            
            
        }
        
        
        /*Declare recipe INIT (blocks)*/
        
        initBlockRecipes();
        
    }
    /* add in crafting recipes (vanilla handler) here */
    private static void initBlockRecipes(){
        
        
    }

        
    
    

}
