package imperialskull.at1.Tools;

import imperialskull.at1.Arkanatech;
import imperialskull.at1.lib.Reference;
import imperialskull.at1.lib.Strings;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ToolGilplastichoe extends ItemHoe {

    public ToolGilplastichoe(int id, EnumToolMaterial par2EnumToolMaterial) {
        super(id, par2EnumToolMaterial);
        this.setUnlocalizedName(Strings.GL_PLASTIC_HOE);
        this.setCreativeTab(Arkanatech.tabsAT1);
    }
    

  
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {

        itemIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + Strings.GL_PLASTIC_HOE);

}
}
