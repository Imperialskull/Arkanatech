package imperialskull.at1.creativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import imperialskull.at1.lib.BlockIds;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabAT1 extends CreativeTabs {
    public CreativeTabAT1(int par1, String par2Str) {

        super(par1, par2Str);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    
    public int getTabIconItemIndex(){
        return BlockIds.PLASTICBLOCK_DEFAULT;
    }

}
