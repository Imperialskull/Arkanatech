package imperialskull.at1.item;

import cpw.mods.fml.common.registry.LanguageRegistry;
import imperialskull.at1.lib.ArkaneMaterials;
import imperialskull.at1.lib.ItemIds;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ArkaneItems {
    
    /*making statics for mod Items*/
    
    public static Item craftingItem;
    public static Item plasticSword;
    public static Item plasticPick;
    
    public static void init(){
        
        /*adds the items to the game-state*/
        
        craftingItem = new CraftingItems(ItemIds.CRAFT_ITEMS_DEFAULT);
        plasticSword = new PlasticSword(ItemIds.PLASTICSWORD_DEFAULT,ArkaneMaterials.toolMatPlastic);
        plasticPick = new PlasticPick(ItemIds.PLASTICPICK_DEFAULT,ArkaneMaterials.toolMatPlastic);
        
        
        
        LanguageRegistry.addName(plasticSword, "Plastic Sword");
        LanguageRegistry.addName(plasticPick, "Plastic Pick");
        
        /* a metadata specific version of LangRegistry for items, switch this to a loop later */
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 0),"Raw Plastic Lump");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 1),"Clear Plastic Lump");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 2),"Plastic Rod");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 3),"Wood Flower");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 4),"Gelatin Powder");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 5),"Graphite Dust");

    }
        
        

        
        /*vRECIPES GO HEREv*/
        
  
    

}
