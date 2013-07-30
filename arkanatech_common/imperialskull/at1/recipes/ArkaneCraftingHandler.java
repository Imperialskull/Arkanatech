package imperialskull.at1.recipes;

import imperialskull.at1.item.ArkaneItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;

public class ArkaneCraftingHandler implements ICraftingHandler {

    @Override
    public void onCrafting(EntityPlayer player, ItemStack item,
            IInventory craftMatrix) {
        for(int i=0;i < craftMatrix.getSizeInventory(); i++){
            
            if(craftMatrix.getStackInSlot(i) !=null){
                ItemStack j = craftMatrix.getStackInSlot(i);
                
                if(j.getItem() !=null && j.getItem() == ArkaneItems.woodmortarpestle){
                    ItemStack k = new ItemStack(ArkaneItems.woodmortarpestle,2,(j.getItemDamage()+1));
                    
                    if(k.getItemDamage()>=k.getMaxDamage()){
                        k.stackSize--;
                    }
                    craftMatrix.setInventorySlotContents(i, k);
                }
            }
        }
        
        for(int i=0;i < craftMatrix.getSizeInventory(); i++){
            
            if(craftMatrix.getStackInSlot(i) !=null){
                ItemStack j = craftMatrix.getStackInSlot(i);
                
                if(j.getItem() !=null && j.getItem() == ArkaneItems.woodmortarpestle){
                    ItemStack k = new ItemStack(ArkaneItems.filter,2,(j.getItemDamage()+1));
                    
                    if(k.getItemDamage()>=k.getMaxDamage()){
                        k.stackSize--;
                    }
                    craftMatrix.setInventorySlotContents(i, k);
                }
            }
        }
        
    }

    @Override
    public void onSmelting(EntityPlayer player, ItemStack item) {
        // TODO Auto-generated method stub
        
    }

}
