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
    public static Item plasticShovel;
    public static Item plasticAxe;
    public static Item plasticHoe;
    public static Item woodmortarpestle;
    public static Item arkanejello;
    public static Item itemPlexidoor;
    

    
    public static void init(){
        
        /*adds the items to the game-state*/
        itemPlexidoor = new ItemPlexidoor(ItemIds.PLEXIDOOR_ITEM_DEFAULT);
        craftingItem = new CraftingItems(ItemIds.CRAFT_ITEMS_DEFAULT);
        woodmortarpestle = new MpWood(ItemIds.WOOD_MORTAR_PESTLE_DEFUALT);
        arkanejello = new ArkaneJello(ItemIds.JELLO_DEFAULT, 6, 0.8F, true);
        plasticSword = new PlasticSword(ItemIds.PLASTICSWORD_DEFAULT,ArkaneMaterials.toolMatPlastic);
        plasticPick = new PlasticPick(ItemIds.PLASTICPICK_DEFAULT,ArkaneMaterials.toolMatPlastic);
        plasticShovel = new PlasticShovel(ItemIds.PLASTICSHOVEL_DEFAULT,ArkaneMaterials.toolMatPlastic);
        plasticAxe = new PlasticAxe(ItemIds.PLASTICAXE_DEFAULT,ArkaneMaterials.toolMatPlastic);
        plasticHoe = new PlasticHoe(ItemIds.PLASTICHOE_DEFAULT,ArkaneMaterials.toolMatPlastic);
        
        
        
        LanguageRegistry.addName(itemPlexidoor," Plexiglass Door");
        LanguageRegistry.addName(arkanejello, "Jello");
        LanguageRegistry.addName(woodmortarpestle, "Wood Mortar & Pestle");
        LanguageRegistry.addName(plasticSword, "Plastic Sword");
        LanguageRegistry.addName(plasticPick, "Plastic Pick");
        LanguageRegistry.addName(plasticShovel, "Plastic Shovel");
        LanguageRegistry.addName(plasticAxe, "Plastic Axe");
        LanguageRegistry.addName(plasticHoe, "Plastic Hoe");
        
        
        /* a metadata specific version of LangRegistry for items, switch this to a loop later */
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 0),"Raw Plastic Lump");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 1),"Clear Plastic Lump");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 2),"Plastic Rod");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 3),"Wood Flower");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 4),"Gelatin Powder");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 5),"Graphite Dust");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 6),"Gelatin Bowl");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 7),"Mould");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 8),"Filled Mould");

    }
        
        

        


  
    

}
