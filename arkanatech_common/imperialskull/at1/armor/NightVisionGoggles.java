package imperialskull.at1.armor;

import imperialskull.at1.Arkanatech;
import imperialskull.at1.lib.Reference;
import imperialskull.at1.lib.Strings;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class NightVisionGoggles extends ItemArmor  {

	public NightVisionGoggles(int i)
			{
	    super(i, EnumArmorMaterial.IRON, 2, 0);
	    setUnlocalizedName(Strings.NIGHTVISION_NAME);
	    setCreativeTab(Arkanatech.tabsAT1);
	    setMaxStackSize(1);
	  }

	  public void onArmorTickUpdate(World world, EntityPlayer player, ItemStack itemStack) {
	    player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 300, -337));
	  }

	  public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
	    return "at1:textures/armor/NVGoggles.png";
	  }

	    @Override
	    @SideOnly(Side.CLIENT)
	    public void registerIcons(IconRegister iconRegister) {

	        itemIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + Strings.NIGHTVISION_NAME);
	  }
	}