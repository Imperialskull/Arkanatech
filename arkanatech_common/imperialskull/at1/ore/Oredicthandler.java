package imperialskull.at1.ore;

import cpw.mods.fml.common.registry.GameRegistry;
import imperialskull.at1.item.ArkaneItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Oredicthandler {
	
	 public static void oreRegistration(){
		 
		 OreDictionary.registerOre("itemSilk", new ItemStack(Item.silk));
		 OreDictionary.registerOre("itemSilk", new ItemStack(ArkaneItems.craftingItem,1,10));
		 OreDictionary.registerOre("ingotPlastic", new ItemStack(ArkaneItems.craftingItem,1,0));
	 
	 }
	 
	 public static void oreRecipes(){
		 
		 GameRegistry.addRecipe(new ShapedOreRecipe(Item.bow, true, new Object[]{
                 " SF","S F"," SF", 
                 Character.valueOf('F'), "itemSilk",
                 Character.valueOf('S'), new ItemStack(Item.stick)}));
		 
		 GameRegistry.addRecipe(new ShapedOreRecipe(Block.cloth, true, new Object[]{
                 " FF"," FF", 
                 Character.valueOf('F'), "itemSilk",
                 }));
		 
		 GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Item.feather,4), true, new Object[]{
                 "FPF","FPF"," P ", 
                 Character.valueOf('F'), "itemSilk",
                 Character.valueOf('P'), new ItemStack(Item.stick)}));
		 
		 
		 
		 
	 }
	 
	 
	 
	 }

