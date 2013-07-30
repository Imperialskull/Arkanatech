package imperialskull.at1.item;

import imperialskull.at1.Arkanatech;
import imperialskull.at1.lib.Reference;
import imperialskull.at1.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemFilter extends Item {

public ItemFilter(int par1) {
    super(par1);
    this.setMaxStackSize(1);
    this.setMaxDamage(10);
    this.setUnlocalizedName(Strings.FILTER);
    this.setCreativeTab(Arkanatech.tabsAT1);  
    }

@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister iconRegister) {

    itemIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + Strings.FILTER);

}
}
