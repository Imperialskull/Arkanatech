package imperialskull.at1.render;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.Icon;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;

public abstract class RenderBlock 
implements ISimpleBlockRenderingHandler
	{
	  private final int renderId;

	  public RenderBlock()
	  {
	    this.renderId = RenderingRegistry.getNextAvailableRenderId();
	  }

	  public boolean renderWorldBlock(IBlockAccess blockAccess, int x, int y, int z, Block block, int modelId, RenderBlocks renderblocks)
	  {
		  return false;
	  }

	  public abstract void renderInventoryBlock(Block paramBlock, int paramInt1, int paramInt2, RenderBlocks paramRenderBlocks);

	  public boolean shouldRender3DInInventory()
	  {
	    return true;
	  }

	  public int getRenderId()
	  {
	    return this.renderId;
	  }

	  public static Icon getMissingIcon(ResourceLocation textureSheet) {
	    return ((TextureMap)Minecraft.getMinecraft().func_110434_K().func_110581_b(textureSheet)).func_110572_b("missingno");
	  }
	}


