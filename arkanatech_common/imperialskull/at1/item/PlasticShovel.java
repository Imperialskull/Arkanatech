package imperialskull.at1.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import imperialskull.at1.Arkanatech;
import imperialskull.at1.lib.Reference;
import imperialskull.at1.lib.Strings;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;

public class PlasticShovel extends ItemSpade {

    public PlasticShovel(int id, EnumToolMaterial par2EnumToolMaterial) {
        super(id, par2EnumToolMaterial);
        this.setUnlocalizedName(Strings.PLASTIC_SHOVEL);
        this.setCreativeTab(Arkanatech.tabsAT1);

    }
    

    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {

        itemIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + Strings.PLASTIC_SHOVEL);

}
    
}
