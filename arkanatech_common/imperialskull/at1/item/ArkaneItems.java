package imperialskull.at1.item;

import cpw.mods.fml.common.registry.LanguageRegistry;
import imperialskull.at1.Tools.ToolSynthAxePlastic;
import imperialskull.at1.Tools.ToolSynthHoePlastic;
import imperialskull.at1.Tools.ToolSynthPickPlastic;
import imperialskull.at1.Tools.ToolSynthShovelPlastic;
import imperialskull.at1.Tools.ToolSynthSwordPlastic;
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
    public static Item potionjera;
    public static Item sakplasticpick;
    public static Item sakplasticaxe;
    public static Item sakplasticshovel;
    public static Item sakplasticsword;
    public static Item sakplastichoe;
    

    
    public static void init(){
    	
    	// JERA POTION NEEDS CONFIG, SAKPLASTICPICK AS WELL!!!
        
        /*adds the items to the game-state*/
        itemPlexidoor = new ItemPlexidoor(ItemIds.PLEXIDOOR_ITEM_DEFAULT);
        craftingItem = new CraftingItems(ItemIds.CRAFT_ITEMS_DEFAULT);
        woodmortarpestle = new MpWood(ItemIds.WOOD_MORTAR_PESTLE_DEFUALT);
        potionjera = new ItemPotionJera(5000);
        arkanejello = new ArkaneJello(ItemIds.JELLO_DEFAULT, 6, 0.8F, true);
        plasticSword = new PlasticSword(ItemIds.PLASTICSWORD_DEFAULT,ArkaneMaterials.toolMatPlastic);
        plasticPick = new PlasticPick(ItemIds.PLASTICPICK_DEFAULT,ArkaneMaterials.toolMatPlastic);
        plasticShovel = new PlasticShovel(ItemIds.PLASTICSHOVEL_DEFAULT,ArkaneMaterials.toolMatPlastic);
        plasticAxe = new PlasticAxe(ItemIds.PLASTICAXE_DEFAULT,ArkaneMaterials.toolMatPlastic);
        plasticHoe = new PlasticHoe(ItemIds.PLASTICHOE_DEFAULT,ArkaneMaterials.toolMatPlastic);
        sakplasticpick = new ToolSynthPickPlastic(5001,ArkaneMaterials.toolMatSAKPlastic);
        sakplasticaxe = new ToolSynthAxePlastic(5002,ArkaneMaterials.toolMatSAKPlastic);
        sakplasticshovel = new ToolSynthShovelPlastic(5003,ArkaneMaterials.toolMatSAKPlastic);
        sakplasticsword = new ToolSynthSwordPlastic(5004,ArkaneMaterials.toolMatSAKPlastic);
        sakplastichoe = new ToolSynthHoePlastic(5005,ArkaneMaterials.toolMatSAKPlastic);
        
        
        
        LanguageRegistry.addName(itemPlexidoor," Plexiglass Door");
        LanguageRegistry.addName(arkanejello, "Jello");
        LanguageRegistry.addName(woodmortarpestle, "Wood Mortar & Pestle");
        LanguageRegistry.addName(plasticSword, "Plastic Sword");
        LanguageRegistry.addName(plasticPick, "Plastic Pick");
        LanguageRegistry.addName(plasticShovel, "Plastic Shovel");
        LanguageRegistry.addName(plasticAxe, "Plastic Axe");
        LanguageRegistry.addName(plasticHoe, "Plastic Hoe");
        LanguageRegistry.addName(potionjera, "Runic Potion of Jera");
        LanguageRegistry.addName(sakplasticaxe, "SAK: Plastic Axe");
        LanguageRegistry.addName(sakplastichoe, "SAK: Plastic Hoe");
        LanguageRegistry.addName(sakplasticpick, "SAK: Plastic Pick");
        LanguageRegistry.addName(sakplasticshovel, "SAK: Plastic Shovel");
        LanguageRegistry.addName(sakplasticsword, "SAK: Plastic Sword");
        
        
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
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 9),"Synth Army Knife Body");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 10), "Synthetic String");
 
    }
        
        

        


  
    

}
