package imperialskull.at1.block;

import imperialskull.at1.Arkanatech;
import imperialskull.at1.lib.Reference;
import imperialskull.at1.lib.Strings;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;

public class BlockPlexiglow extends BlockBreakable {
    
    @SideOnly(Side.CLIENT)
    private Icon[] icons;
    
    public BlockPlexiglow (int id, Material material, Boolean par3){
        super(id, "glass", material, par3);
        this.setCreativeTab(Arkanatech.tabsAT1);
        this.setHardness(1F);
        this.setResistance(17000000000F);
        this.setLightOpacity(0);
        this.setLightValue(1F);
        this.setStepSound(soundGlassFootstep);
        this.setUnlocalizedName(Strings.PLEXIGLOW_NAME);
    }
    

    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 1;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }


    public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l) {
        return super.shouldSideBeRendered(iblockaccess, i, j, k, 1 - l);
      }
    
    @Override
    public int damageDropped(int par1)
    {
        return par1;
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
            icons[i] = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase()+ ":"+Strings.PLEXIGLOW_NAME + Strings.COLOURS[i]);
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


}
