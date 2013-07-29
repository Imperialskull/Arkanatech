package imperialskull.at1.recipes;

import imperialskull.at1.armor.ArkaneArmor;
import imperialskull.at1.block.ArkaneBlocks;
import imperialskull.at1.item.ArkaneItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;

public class ArkanatechRecipes {
    
    public static void init(){

    
    ItemStack plasticLump = new ItemStack(ArkaneItems.craftingItem, 1, 0);
    ItemStack clearPlasticLump = new ItemStack(ArkaneItems.craftingItem, 1, 1);
    ItemStack plasticRod = new ItemStack(ArkaneItems.craftingItem,1, 2);
    //ItemStack plasticBlock = new ItemStack(ArkaneBlocks.plastic,1,0);



  
        
       //SHAPELESS RECIPES
       
        //plastic sticks
        GameRegistry.addShapelessRecipe(new ItemStack(ArkaneItems.craftingItem, 1,2),
                plasticLump,plasticLump);
        //plexiglass lump
        GameRegistry.addShapelessRecipe(new ItemStack(ArkaneItems.craftingItem,1,1),
                plasticLump);
        GameRegistry.addRecipe(new ItemStack(ArkaneBlocks.plastic,1,0),"LL","LL",
                'L',plasticLump);
        GameRegistry.addRecipe(new ItemStack(ArkaneBlocks.plexiglass,1,0),"CC","CC",
                'C',clearPlasticLump);        
        GameRegistry.addShapelessRecipe(new ItemStack(ArkaneBlocks.plexiglow,1,0), 
               new ItemStack(ArkaneBlocks.plexiglass,1,0),new ItemStack(Item.glowstone,1) );
        GameRegistry.addShapelessRecipe(new ItemStack(ArkaneItems.arkanejello),
                Item.bucketWater,Item.sugar,new ItemStack(ArkaneItems.craftingItem,1,4));
       
        
        

        
        //LOOP FOR ALL 16bit METADATA (COLOUR) BLOCKS
        for (int ix = 0; ix < 16; ix++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ArkaneBlocks.plexiglass, 1, BlockColored.getDyeFromBlock(ix)), new Object[] {new ItemStack(Item.dyePowder, 1, ix), new ItemStack(ArkaneBlocks.plexiglass, 1, 0)});
            GameRegistry.addShapelessRecipe(new ItemStack(ArkaneBlocks.plexiglow, 1, BlockColored.getDyeFromBlock(ix)), new Object[] {new ItemStack(Item.dyePowder, 1, ix), new ItemStack(ArkaneBlocks.plexiglow, 1, 0)});
            GameRegistry.addShapelessRecipe(new ItemStack(ArkaneBlocks.plastic, 1, BlockColored.getDyeFromBlock(ix)), new Object[] {new ItemStack(Item.dyePowder, 1, ix), new ItemStack(ArkaneBlocks.plastic, 1, 0)});
            
        };
        
        //SHAPED ITEM RECIPES
        
        GameRegistry.addRecipe(new ItemStack(ArkaneItems.woodmortarpestle), "S" ,"B",
                'S',Item.stick,'B',Item.bowlEmpty);
        GameRegistry.addRecipe(new ItemStack(ArkaneItems.craftingItem,1,7),"   ","C C"," C ",
                'C',Block.cobblestone);
        GameRegistry.addRecipe(new ItemStack(ArkaneItems.craftingItem,1,9)," IB","IRI","RI ",
        		'I',Item.ingotIron,'B',new ItemStack(Item.dyePowder,1,15),'R',new ItemStack(Item.dyePowder,1,1));
        /*--gelatin bowl recipes--*/
        GameRegistry.addRecipe(new ItemStack(ArkaneItems.craftingItem,1,6),"M","B",
                'M',Item.beefRaw,'B',Item.bowlEmpty);
        GameRegistry.addRecipe(new ItemStack(ArkaneItems.craftingItem,1,6),"M","B",
                'M',Item.chickenRaw,'B',Item.bowlEmpty);
        GameRegistry.addRecipe(new ItemStack(ArkaneItems.craftingItem,1,6),"M","B",
                'M',Item.porkRaw,'B',Item.bowlEmpty);
        GameRegistry.addRecipe(new ItemStack(ArkaneItems.craftingItem,1,6),"M","B",
                'M',Item.leather,'B',Item.bowlEmpty);
        GameRegistry.addRecipe(new ItemStack(ArkaneItems.craftingItem,1,6),"M","B",
                'M',Item.rottenFlesh,'B',Item.bowlEmpty);
        GameRegistry.addRecipe(new ItemStack(ArkaneItems.itemPlexidoor),"CC","CC","CC",
                'C',new ItemStack(ArkaneItems.craftingItem,1,1));
        GameRegistry.addShapedRecipe(new ItemStack(ArkaneItems.craftingItem,1,10),"CC",
        		'C',new ItemStack(ArkaneItems.craftingItem,1,1));
        GameRegistry.addShapedRecipe(new ItemStack(Item.arrow,4),"H","P","F",
        		'H', Item.flint,'P',new ItemStack(ArkaneItems.craftingItem,1,2),'F',Item.feather);
        
        /*--filled mould recipes-- */
        /*--(plastic)--*/
        GameRegistry.addShapelessRecipe(new ItemStack(ArkaneItems.craftingItem,1,8)
        ,Item.egg,new ItemStack(ArkaneItems.craftingItem,1,3),new ItemStack(ArkaneItems.craftingItem,1,7));
        GameRegistry.addShapelessRecipe(new ItemStack(ArkaneItems.craftingItem,1,8)
        ,new ItemStack(Item.dyePowder,1,15),new ItemStack(ArkaneItems.craftingItem,1,3),new ItemStack(ArkaneItems.craftingItem,1,7));
        GameRegistry.addShapelessRecipe(new ItemStack(ArkaneItems.craftingItem,1,8)
        ,new ItemStack(ArkaneItems.craftingItem,1,4),new ItemStack(ArkaneItems.craftingItem,1,3),new ItemStack(ArkaneItems.craftingItem,1,7));
        GameRegistry.addShapelessRecipe(new ItemStack(ArkaneItems.craftingItem,1,8)
        ,new ItemStack(ArkaneItems.craftingItem,1,3), new ItemStack(ArkaneItems.craftingItem,1,7),Item.slimeBall);
        
        
        
        //CrfHANDLED RECIPES
        /*--M&P RECIPES--*/
        GameRegistry.addRecipe(new ItemStack(ArkaneItems.craftingItem,4,3),"P","M",
                'P',Block.planks,'M',(new ItemStack(ArkaneItems.woodmortarpestle,1, Short.MAX_VALUE)));
        GameRegistry.addRecipe(new ItemStack(Item.dyePowder,5,15),"B","M",
                'B',Item.bone,'M',(new ItemStack(ArkaneItems.woodmortarpestle,1, Short.MAX_VALUE)));
        
        //TOOL RECIPES
        /*--plastic tools--*/
        GameRegistry.addRecipe(new ItemStack(ArkaneItems.plasticPick),"LCL"," S "," S ",
                'L',plasticLump, 'C',clearPlasticLump,'S',plasticRod);
        GameRegistry.addRecipe(new ItemStack(ArkaneItems.plasticAxe), " LL"," SL"," S ",
                'L',plasticLump,'S',plasticRod);
        GameRegistry.addRecipe(new ItemStack(ArkaneItems.plasticHoe)," CL"," S ", " S ",
        'C',clearPlasticLump,'L',plasticLump,'S',plasticRod);
        GameRegistry.addRecipe(new ItemStack(ArkaneItems.plasticShovel)," L ", " S ", " S ",
                'L',plasticLump,'S',plasticRod);
        GameRegistry.addRecipe(new ItemStack(ArkaneItems.plasticSword), " L ", " C ", " S ",
                'L',plasticLump,'C',clearPlasticLump,'S',plasticRod);
        
        /*SYNTH ARMY KNIFE RECIPES (LONG)*/
        GameRegistry.addShapelessRecipe(new ItemStack(ArkaneItems.sakplasticpick),
        		new ItemStack(ArkaneItems.craftingItem,1,9),new ItemStack(ArkaneItems.plasticAxe),
        		new ItemStack(ArkaneItems.plasticHoe), new ItemStack(ArkaneItems.plasticPick),
        		new ItemStack(ArkaneItems.plasticShovel),new ItemStack(ArkaneItems.plasticSword));
        
        //ARMOUR RECIPES
        /*--plastic armour--*/
        GameRegistry.addRecipe(new ItemStack(ArkaneArmor.plasticBoots),"   ","L L","L L",
                'L',plasticLump);
        GameRegistry.addRecipe(new ItemStack(ArkaneArmor.plasticChest),"L L","LCL","LLL",
                'L',plasticLump, 'C',clearPlasticLump);
        GameRegistry.addRecipe(new ItemStack(ArkaneArmor.plasticHelm),"LCL","L L", "   ",
                'L',plasticLump, 'C',clearPlasticLump);
        GameRegistry.addRecipe(new ItemStack(ArkaneArmor.plasticLegs),"LLL","L L", "L L",
                'L',plasticLump);
        
        //SMELTING RECIPES
       FurnaceRecipes.smelting().addSmelting(ArkaneItems.craftingItem.itemID, 6, new ItemStack(ArkaneItems.craftingItem,4,4), 0.1F);
       FurnaceRecipes.smelting().addSmelting(ArkaneItems.craftingItem.itemID, 8, new ItemStack(ArkaneItems.craftingItem,3,0), 0.3F);

        

        
        
        
    };

}
