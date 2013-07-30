package imperialskull.at1.lib;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;


/*Decided to go this route rather than have an INSANELY long
list under main mod file*/

public class ArkaneMaterials {
    
    //TOOL MATERIALS GO HERE
    
    public static EnumToolMaterial toolMatPlastic = EnumHelper.addToolMaterial("PLASTIC",1, 250, 3F, 2, 5);
    public static EnumToolMaterial toolMatRefPlastic = EnumHelper.addToolMaterial("REFPLASTIC", 1, 438, 3F, 2, 5);
    public static EnumToolMaterial toolMatGldPlastic = EnumHelper.addToolMaterial("GLDPLASTIC", 1, 375, 3F, 2, 15);
    public static EnumToolMaterial toolMatBnzPlastic = EnumHelper.addToolMaterial("BNZPLASTIC", 1, 500, 3F, 2, 5);
    public static EnumToolMaterial toolMatJadPlastic = EnumHelper.addToolMaterial("JADPLASTIC", 1, 625, 3F, 2, 10);
    public static EnumToolMaterial toolMatShmPlastic = EnumHelper.addToolMaterial("SHMPLASTIC", 1, 625, 3F, 3, 10);
    public static EnumToolMaterial toolMatAugPlastic = EnumHelper.addToolMaterial("AUGPLASTIC", 1, 750, 3F, 3, 10);
    
    //SAK TOOL MATERIALS
    public static EnumToolMaterial toolMatSAKPlastic = EnumHelper.addToolMaterial("SAKPLASTIC", 1, 1250, 3F, 2, 5);
    
    //ARMOUR MATERIALS GO HERE
    
    public static EnumArmorMaterial armourMatPlastic = EnumHelper.addArmorMaterial("PLASTIC", 15, new int[]{2, 4, 3, 2}, 5);
    


}
