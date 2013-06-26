package imperialskull.at1.armor;

import cpw.mods.fml.common.registry.LanguageRegistry;
import imperialskull.at1.Arkanatech;
import imperialskull.at1.lib.ArkaneMaterials;
import imperialskull.at1.lib.ItemIds;
import imperialskull.at1.lib.Strings;
import net.minecraft.item.Item;

public class ArkaneArmor {
    
    public static Item plasticHelm;
    public static Item plasticChest;
    public static Item plasticLegs;
    public static Item plasticBoots;
    
    public static void init(){
        
        plasticHelm = new PlasticArmor(ItemIds.PLASTICHELM_DEFAULT,ArkaneMaterials.armourMatPlastic,0,0)
        .setUnlocalizedName(Strings.PLASTIC_HELM)
        .setCreativeTab(Arkanatech.tabsAT1);
        
        plasticChest = new PlasticArmor(ItemIds.PLASTICCHEST_DEFAULT,ArkaneMaterials.armourMatPlastic,0,1)
        .setUnlocalizedName(Strings.PLASTIC_CHEST)
        .setCreativeTab(Arkanatech.tabsAT1);
        
        plasticLegs = new PlasticArmor(ItemIds.PLASTICLEGS_DEFAULT,ArkaneMaterials.armourMatPlastic,0,2)
        .setUnlocalizedName(Strings.PLASTIC_LEGS)
        .setCreativeTab(Arkanatech.tabsAT1);
        
        plasticBoots = new PlasticArmor(ItemIds.PLASTICBOOTS_DEFAULT,ArkaneMaterials.armourMatPlastic,0,3)
        .setUnlocalizedName(Strings.PLASTIC_BOOTS)
        .setCreativeTab(Arkanatech.tabsAT1);
        
        
        //LANG REGISTRY FOR ARMOR
        LanguageRegistry.addName(plasticHelm, "plastic Helm");
        LanguageRegistry.addName(plasticChest, "Plastic Chestplate");
        LanguageRegistry.addName(plasticLegs, "Plastic Leggings");
        LanguageRegistry.addName(plasticBoots, "Plastic Boots");
        
        //armor recipes here
    }

}
