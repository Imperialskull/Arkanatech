package imperialskull.at1.core.util;

import imperialskull.at1.lib.Colours;
import imperialskull.at1.lib.Strings;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.oredict.OreDictionary;

public class ItemUtility {
    
    private static double rand;

    public static String toString(ItemStack itemStack) {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(String.format("itemID: %d, metaData: %d, stackSize: %d, ", itemStack.itemID, itemStack.getItemDamage(), itemStack.stackSize));

        if (itemStack.hasTagCompound()) {
            stringBuilder.append(String.format("nbtTagCompound: %s, ", itemStack.getTagCompound().toString()));
        }

        stringBuilder.append(String.format("itemName: %s, className: %s ", itemStack.getItemName(), itemStack.getItem().getClass().toString()));

        return stringBuilder.toString();
    }

    /**
* Compares two ItemStacks for equality, testing itemID, metaData,
* stackSize, and their NBTTagCompounds (if they are present)
*
* @param first
* The first ItemStack being tested for equality
* @param second
* The second ItemStack being tested for equality
* @return true if the two ItemStacks are equivalent, false otherwise
*/
    public static boolean compare(ItemStack first, ItemStack second) {

        // Check to see if either argument is null
        if ((first != null) && (second != null)) {
            // Check the item IDs
            if (first.itemID == second.itemID) {
                // Check the meta data

                if ((first.getItemDamage() == OreDictionary.WILDCARD_VALUE) || (second.getItemDamage() == OreDictionary.WILDCARD_VALUE)) {
                    //return true;
                }

                if (first.getItemDamage() == second.getItemDamage()) {
                    // Check the stack size
                    if (first.stackSize == second.stackSize) {
                        // If at least one of the ItemStacks has a NBTTagCompound, test for equality
                        if (first.hasTagCompound() || second.hasTagCompound()) {

                            // If one of the stacks has a tag compound, but not both, they are not equal
                            if (!(first.hasTagCompound() && second.hasTagCompound())) {
                                return false;
                            }
                            // Otherwise, they both have tag compounds and we need to test them for equality
                            else {
                                return first.getTagCompound().equals(second.getTagCompound());
                            }
                        }
                        // Otherwise, they must be equal if we have gotten this far (item IDs, meta data, and stack size all match)
                        else {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }

    public static boolean hasColor(ItemStack itemStack) {

        return !itemStack.hasTagCompound() ? false : !itemStack.getTagCompound().hasKey(Strings.NBT_ITEM_DISP) ? false : itemStack.getTagCompound().getCompoundTag(Strings.NBT_ITEM_DISP).hasKey(Strings.NBT_ITEM_COLOR);
    }

    public static int getColor(ItemStack itemStack) {

        NBTTagCompound nbtTagCompound = itemStack.getTagCompound();

        if (nbtTagCompound == null)
            return Integer.parseInt(Colours.HTMLWHITE, 16);
        else {

            NBTTagCompound displayTagCompound = nbtTagCompound.getCompoundTag(Strings.NBT_ITEM_DISP);
            return displayTagCompound == null ? Integer.parseInt(Colours.HTMLWHITE, 16) : displayTagCompound.hasKey(Strings.NBT_ITEM_COLOR) ? displayTagCompound.getInteger(Strings.NBT_ITEM_COLOR) : Integer.parseInt(Colours.HTMLWHITE, 16);
        }
    }

    public static void setColor(ItemStack itemStack, int color) {

        if (itemStack != null) {

            NBTTagCompound nbtTagCompound = itemStack.getTagCompound();

            if (nbtTagCompound == null) {

                nbtTagCompound = new NBTTagCompound();
                itemStack.setTagCompound(nbtTagCompound);
            }

            NBTTagCompound colourTagCompound = nbtTagCompound.getCompoundTag(Strings.NBT_ITEM_DISP);

            if (!nbtTagCompound.hasKey(Strings.NBT_ITEM_DISP)) {
                nbtTagCompound.setCompoundTag(Strings.NBT_ITEM_DISP, colourTagCompound);
            }

            colourTagCompound.setInteger(Strings.NBT_ITEM_COLOR, color);
        }
    }

}
