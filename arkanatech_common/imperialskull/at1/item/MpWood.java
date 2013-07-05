package imperialskull.at1.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import imperialskull.at1.Arkanatech;
import imperialskull.at1.lib.Reference;
import imperialskull.at1.lib.Strings;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class MpWood extends Item {

    public MpWood(int id) {
        super(id);
        this.setMaxStackSize(1);
        this.setMaxDamage(10);
        this.setUnlocalizedName(Strings.WOOD_MP_NAME);
        this.setCreativeTab(Arkanatech.tabsAT1);  
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {

        itemIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + Strings.WOOD_MP_NAME);

}
};
