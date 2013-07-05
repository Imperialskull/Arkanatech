package imperialskull.at1.item;

import java.util.List;

import imperialskull.at1.Arkanatech;
import imperialskull.at1.lib.Reference;
import imperialskull.at1.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;

public class CraftingItems extends Item {
    
    private static final String[] CRAFT_ITEM_NAMES = new String[]
            {"plasticlump","clearplasticlump","plasticrod","woodflower",
        "gelatinpowder", "graphitedust","gelatinbowl","mould","filledmould"
        
            };
    
    @SideOnly(Side.CLIENT)
    private Icon[] icons;

     public CraftingItems(int id) {
        super(id);
        this.setHasSubtypes(true);
        this.setUnlocalizedName(Strings.CRAFT_ITEM_NAME);
        this.setCreativeTab(Arkanatech.tabsAT1);
        maxStackSize = 64;
    }
     
     @Override
     public String getUnlocalizedName(ItemStack itemStack){
         
         int meta = MathHelper.clamp_int(itemStack.getItemDamage(),0,9);
         return super.getUnlocalizedName() + CRAFT_ITEM_NAMES[meta];
     }
     
     /*assigns an icon based on meta */
     @Override
     @SideOnly(Side.CLIENT)   
     public Icon getIconFromDamage(int meta){
         
         int j = MathHelper.clamp_int(meta, 0, 9);
         return icons[j];
     }
     
     /*item icon registry*/
     
     @Override
     @SideOnly(Side.CLIENT)
     
    public void registerIcons(IconRegister iconRegister){
         
         icons = new Icon[CRAFT_ITEM_NAMES.length];
         
         for(int i=0; i < CRAFT_ITEM_NAMES.length; ++i){
             icons[i] = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase()+ ":" +CRAFT_ITEM_NAMES[i]);
         }
       }
     
     @Override
     @SuppressWarnings({ "rawtypes", "unchecked" })
     @SideOnly(Side.CLIENT)
     public void getSubItems(int id, CreativeTabs creativeTab, List list) {

         for (int meta = 0; meta < 9; ++meta) {
             list.add(new ItemStack(id, 1, meta));
         }
     }
     

     
}
     
     

