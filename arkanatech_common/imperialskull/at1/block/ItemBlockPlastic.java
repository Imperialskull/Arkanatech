package imperialskull.at1.block;

import imperialskull.at1.lib.Strings;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

public class ItemBlockPlastic extends ItemBlock  {
    
    public ItemBlockPlastic (int meta){
        super(meta);
        this.setHasSubtypes(true);
    }
    
    public int getMetadata(int meta)
    {
        return meta;
    }
    
    public String getUnlocalizedName(ItemStack itemStack) {

        int meta = MathHelper.clamp_int(itemStack.getItemDamage(), 0, 16);
        return super.getUnlocalizedName() + Strings.COLOURS[meta];
    }
    

}
