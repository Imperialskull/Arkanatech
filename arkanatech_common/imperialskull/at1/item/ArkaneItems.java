package imperialskull.at1.item;

import cpw.mods.fml.common.registry.LanguageRegistry;
import imperialskull.at1.lib.ItemIds;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ArkaneItems {
    
    /*making statics for mod Items*/
    
    public static Item craftingItem;
    
    public static void init(){
        
        /*adds the items to the game-state*/
        
        craftingItem = new CraftingItems(ItemIds.CRAFT_ITEMS_DEFAULT);
        
        
        

            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 0),"Raw Plastic Lump");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 1),"Clear Plastic Lump");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 2),"Plastic Rod");

    }
        
        

        
        /*vRECIPES GO HEREv*/
        
  
    

}
