package imperialskull.at1.block;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import imperialskull.at1.Arkanatech;
import imperialskull.at1.lib.Reference;
import imperialskull.at1.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class BlockPlastic extends Block {
    
    @SideOnly(Side.CLIENT)
    private Icon[] icons;
    
    
    public BlockPlastic(int id, Material material) {
        super(id,Material.rock);
        this.setUnlocalizedName(Strings.PLASTICBLOCK_NAME);
        this.setCreativeTab(Arkanatech.tabsAT1);
        this.setHardness(1F);
        this.setResistance(17000000000F);
    }
    
    /*Passed down to crafting manager for 16 color blocks, gets the ID of the dye and
    Assigns the block matching metadata (some Mojang-fu)*/
    public static int getColourFromDye(int par0)
    {
        return ~par0 & 15;
    }
    
    public static int getColourFromBlock(int par0)
    {
        return ~par0 & 15;
    }
    
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2)
    {
           return icons[par2];
    }


    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister){
        icons = new Icon[16];
        
        for(int i = 0; i < 16; ++i){
            icons[i] = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase()+ ":"+Strings.PLASTICBLOCK_NAME + Strings.COLOURS[i]);
        }
    }
    
    @Override
    @SuppressWarnings({"rawtypes", "unchecked"})
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int id, CreativeTabs creativetab, List list){
        
        for (int meta = 0; meta < 16; ++meta){
            list.add(new ItemStack(id, 1, meta));
        }
    }
    

    @Override
    public int damageDropped(int par1)
    {
        return par1;
    }
    


}