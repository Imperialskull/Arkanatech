package imperialskull.at1.Tools;

import imperialskull.at1.Arkanatech;
import imperialskull.at1.item.ArkaneItems;
import imperialskull.at1.lib.Reference;
import imperialskull.at1.lib.Strings;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ToolSynthAxePlastic extends ItemAxe {

    public ToolSynthAxePlastic(int id, EnumToolMaterial par2EnumToolMaterial) {
        super(id,par2EnumToolMaterial);
        this.setUnlocalizedName(Strings.SYNTH_PLASTIC_AXE);
        this.setCreativeTab(Arkanatech.tabsAT1);
    }
    

    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        par1ItemStack.itemID = ArkaneItems.sakplastichoe.itemID;
		
        return par1ItemStack;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {

        itemIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + Strings.SYNTH_PLASTIC_AXE);

}
}

