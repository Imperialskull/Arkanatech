package imperialskull.at1.armor;

import imperialskull.at1.lib.Reference;
import imperialskull.at1.lib.Strings;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class PlasticArmor extends ItemArmor {

    public PlasticArmor(int id, EnumArmorMaterial par2EnumArmorMaterial,
            int par3, int par4) {
        super(id, par2EnumArmorMaterial, par3, par4);
        }
    
    public void registerIcons(IconRegister iRegister)
    {
    if(this.armorType == 0)
    itemIcon = iRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + Strings.PLASTIC_HELM);

    else if(this.armorType == 1)
    itemIcon = iRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + Strings.PLASTIC_CHEST);

    else if(this.armorType == 2)
    itemIcon = iRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + Strings.PLASTIC_LEGS);

    else if(this.armorType == 3)
    itemIcon = iRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + Strings.PLASTIC_BOOTS);

    }
    
    @Override
    public String getArmorTexture(ItemStack armor, Entity entity, int slot, int layer)
    {
    if(slot == 0 || slot == 1 || slot == 3)
    return "at1:textures/armor/PlasticArmor_1.png";
    else if(slot == 2)
    return "at1:textures/armor/PlasticArmor_2.png";
    else
    return null;
    }

}
