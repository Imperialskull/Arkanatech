package imperialskull.at1.lib;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;


/*Decided to go this route rather than have an INSANELY long
list under main mod file*/

public class ArkaneMaterials {
    
    //TOOL MATERIALS GO HERE
    
    public static EnumToolMaterial toolMatPlastic = EnumHelper.addToolMaterial("PLASTIC",1, 400, 3F, 2, 5);
    
    //ARMOUR MATERIALS GO HERE
    
    public static EnumArmorMaterial armourMatPlastic = EnumHelper.addArmorMaterial("PLASTIC", 15, new int[]{2, 4, 3, 2}, 5);
    


}
