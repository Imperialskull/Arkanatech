package imperialskull.at1.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import imperialskull.at1.Arkanatech;
import imperialskull.at1.lib.Reference;
import imperialskull.at1.lib.Strings;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class ArkaneJello extends ItemFood {

    public ArkaneJello(int par1, int par2, float par3, boolean par4) {
        super(par1, par2, par3, par4);
        this.setPotionEffect(Potion.moveSpeed.id,30,2,1.0F);
        this.setUnlocalizedName(Strings.JELLO_NAME);
        this.setCreativeTab(Arkanatech.tabsAT1);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {

        itemIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + Strings.JELLO_NAME);
    }

}
