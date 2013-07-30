package imperialskull.at1.item;

import imperialskull.at1.Tools.ToolGilplasticaxe;
import imperialskull.at1.Tools.ToolGilplastichoe;
import imperialskull.at1.Tools.ToolGilplasticpick;
import imperialskull.at1.Tools.ToolGilplasticshovel;
import imperialskull.at1.Tools.ToolGilplasticsword;
import imperialskull.at1.Tools.ToolRefplasticaxe;
import imperialskull.at1.Tools.ToolRefplastichoe;
import imperialskull.at1.Tools.ToolRefplasticpick;
import imperialskull.at1.Tools.ToolRefplasticshovel;
import imperialskull.at1.Tools.ToolRefplasticsword;
import imperialskull.at1.Tools.ToolSynthAxePlastic;
import imperialskull.at1.Tools.ToolSynthHoePlastic;
import imperialskull.at1.Tools.ToolSynthPickPlastic;
import imperialskull.at1.Tools.ToolSynthShovelPlastic;
import imperialskull.at1.Tools.ToolSynthSwordPlastic;
import imperialskull.at1.lib.ArkaneMaterials;
import imperialskull.at1.lib.ItemIds;
import imperialskull.at1.lib.Strings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.LanguageRegistry;

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
    public static Item filter;
    public static Item sakplasticpick;
    public static Item sakplasticaxe;
    public static Item sakplasticshovel;
    public static Item sakplasticsword;
    public static Item sakplastichoe;
    public static Item refplasticsword;
    public static Item refplasticpick;
    public static Item refplasticshovel;
    public static Item refplasticaxe;
    public static Item refplastichoe;
    public static Item gilplasticsword;
    public static Item gilplasticpick;
    public static Item gilplasticshovel;
    public static Item gilplasticaxe;
    public static Item gilplastichoe;
    

    
    public static void init(){
    	

        
        /*adds the items to the game-state*/
        itemPlexidoor = new ItemPlexidoor(ItemIds.PLEXIDOOR_ITEM_DEFAULT);
        craftingItem = new CraftingItems(ItemIds.CRAFT_ITEMS_DEFAULT);
        woodmortarpestle = new MpWood(ItemIds.WOOD_MORTAR_PESTLE_DEFUALT);
        arkanejello = new ArkaneJello(ItemIds.JELLO_DEFAULT, 6, 0.8F, true);
        filter = new ItemFilter(ItemIds.FILTER_DEFAULT);
        plasticSword = new PlasticSword(ItemIds.PLASTICSWORD_DEFAULT,ArkaneMaterials.toolMatPlastic);
        plasticPick = new PlasticPick(ItemIds.PLASTICPICK_DEFAULT,ArkaneMaterials.toolMatPlastic);
        plasticShovel = new PlasticShovel(ItemIds.PLASTICSHOVEL_DEFAULT,ArkaneMaterials.toolMatPlastic);
        plasticAxe = new PlasticAxe(ItemIds.PLASTICAXE_DEFAULT,ArkaneMaterials.toolMatPlastic);
        plasticHoe = new PlasticHoe(ItemIds.PLASTICHOE_DEFAULT,ArkaneMaterials.toolMatPlastic);
        
        potionjera = new ItemPotionJera(5000);
        sakplasticpick = new ToolSynthPickPlastic(ItemIds.SAKPM_PICK_DEFAULT,ArkaneMaterials.toolMatSAKPlastic);
        sakplasticaxe = new ToolSynthAxePlastic(ItemIds.SAKPM_AXE_DEFAULT,ArkaneMaterials.toolMatSAKPlastic);
        sakplasticshovel = new ToolSynthShovelPlastic(ItemIds.SAKPM_SHOVEL_DEFAULT,ArkaneMaterials.toolMatSAKPlastic);
        sakplasticsword = new ToolSynthSwordPlastic(ItemIds.SAKPM_SWORD_DEFAULT,ArkaneMaterials.toolMatSAKPlastic);
        sakplastichoe = new ToolSynthHoePlastic(ItemIds.SAKPM_HOE_DEFAULT,ArkaneMaterials.toolMatSAKPlastic);
        
        refplasticsword = new ToolRefplasticsword(ItemIds.REFPLASTIC_SWORD_DEFAULT,ArkaneMaterials.toolMatRefPlastic);
        refplasticpick = new ToolRefplasticpick(ItemIds.REFPLASTIC_PICK_DEFAULT, ArkaneMaterials.toolMatRefPlastic);
        refplasticshovel = new ToolRefplasticshovel(ItemIds.REFPLASTIC_SHOVEL_DEFAULT, ArkaneMaterials.toolMatRefPlastic);
        refplasticaxe = new ToolRefplasticaxe(ItemIds.REFPLASTIC_AXE_DEFAULT, ArkaneMaterials.toolMatRefPlastic);
        refplastichoe = new ToolRefplastichoe(ItemIds.REFPLASTIC_HOE_DEFAULT, ArkaneMaterials.toolMatRefPlastic);
        
        gilplasticsword = new ToolGilplasticsword(ItemIds.GILPLASIC_SWORD_DEFUALT, ArkaneMaterials.toolMatGldPlastic);
        gilplasticpick = new ToolGilplasticpick(ItemIds.GILPLASTIC_PICK_DEFUALT, ArkaneMaterials.toolMatGldPlastic);
        gilplasticaxe = new ToolGilplasticaxe(ItemIds.GILPLASTIC_AXE_DEFAULT, ArkaneMaterials.toolMatGldPlastic);
        gilplastichoe = new ToolGilplasticshovel(ItemIds.GILPLASTIC_SHOVEL_DEFAULT, ArkaneMaterials.toolMatGldPlastic);
        gilplasticshovel = new ToolGilplastichoe(ItemIds.GILPLASTIC_HOE_DEFAULT, ArkaneMaterials.toolMatGldPlastic);
        
        
        LanguageRegistry.addName(filter,"Filter");
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
        LanguageRegistry.addName(refplasticpick, Strings.REINFORCED + " Plastic Pick");
        LanguageRegistry.addName(refplasticsword, Strings.REINFORCED + " Plastic Sword");
        LanguageRegistry.addName(refplasticshovel, Strings.REINFORCED + " Plastic Shovel");
        LanguageRegistry.addName(refplasticaxe, Strings.REINFORCED+" Plastic Axe");
        LanguageRegistry.addName(refplastichoe, Strings.REINFORCED+" Plastic Hoe");
        LanguageRegistry.addName(gilplasticsword, Strings.GILDED+" Plastic Sword");
        LanguageRegistry.addName(gilplasticaxe, Strings.GILDED+" Plastic Axe");
        LanguageRegistry.addName(gilplasticshovel, Strings.GILDED+" Plastic Shovel");
        LanguageRegistry.addName(gilplasticpick, Strings.GILDED+" Plastic Pick");
        LanguageRegistry.addName(gilplastichoe, Strings.GILDED+" Plastic Hoe");

        
        
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
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 11), "Stone Dust");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 12), "Copper Dust");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 13), "Tin Dust");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 14), "Bronze Dust");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 15), "Iron Laden Dust");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 16), "Iron Dust");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 17), "Gold Dust");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 18), "Emerarld Dust");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 19), "Diamond Dust");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 20), "Obsidian Dust");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 21), "Stone Stick");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 22), "Iron Stick");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 23), "Bronze Stick");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 24), "Gold Stick");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 25), "Emerald Stick");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 26), "Diamond Stick");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 27), "Obsidian Stick");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 28), "Glowstone Stick");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 29), "Stick Mould");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 30), "Iron-Filled Stick Mould");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 31), "Bronze-Filled Stick Mould");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 32), "Gold-Filled Stick Mould");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 33), "Emerald-Filled Stick Mould");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 34), "Diamond-Filled Stick Mould");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 35), "Obsidian-Filled Stick Mould");
            LanguageRegistry.addName(new ItemStack(craftingItem, 1, 36), "Glowstone-Filled Stick Mould");
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
 
    }
        
        

        


  
    

}
