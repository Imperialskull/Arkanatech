package imperialskull.at1.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import imperialskull.at1.Arkanatech;
import imperialskull.at1.entity.EntityJeraPotion;
import imperialskull.at1.lib.Reference;
import imperialskull.at1.lib.Strings;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemPotionJera extends Item {

	public ItemPotionJera(int par1) {
	    super(par1);
	    this.setMaxDamage(0);
	    this.setMaxStackSize(16);
	    canRepair = false;
	    this.setUnlocalizedName(Strings.POTION_JERA);
	    this.setCreativeTab(Arkanatech.tabsAT1);
	}
	
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {

        itemIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + Strings.JELLO_NAME);
    }

	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}
	
    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            --par1ItemStack.stackSize;
        }

        par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!par2World.isRemote)
        {
            par2World.spawnEntityInWorld(new EntityJeraPotion(par2World, par3EntityPlayer));
        }

        return par1ItemStack;
    }
}
