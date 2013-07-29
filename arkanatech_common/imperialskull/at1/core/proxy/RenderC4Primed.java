package imperialskull.at1.core.proxy;

import imperialskull.at1.block.EntityC4Primed;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderC4Primed extends Render 
{

	
    public RenderBlocks blockRenderer = new RenderBlocks();

    public RenderC4Primed()
    {
        this.shadowSize = 0.5F;
    }

    public void render(EntityC4Primed entityc4primed, double x, double y, double z, float f, float f1) {
        GL11.glPushMatrix();

        GL11.glTranslatef((float)x, (float)y, (float)z);

        if (entityc4primed.fuse - f1 + 1.0F < 10.0F) {
          float scale = 1.0F - (entityc4primed.fuse - f1 + 1.0F) / 10.0F;

          if (scale < 0.0F) scale = 0.0F;
          if (scale > 1.0F) scale = 1.0F;

          scale *= scale;
          scale *= scale;
          scale = 1.0F + scale * 0.3F;

          GL11.glScalef(scale, scale, scale);
        }

        float f3 = (1.0F - (entityc4primed.fuse - f1 + 1.0F) / 100.0F) * 0.8F;

        func_110776_a(TextureMap.field_110575_b);

        this.blockRenderer.renderBlockAsItem(entityc4primed.renderBlock, 0, entityc4primed.getBrightness(f1));

        if (entityc4primed.fuse / 5 % 2 == 0) {
          GL11.glDisable(3553);
          GL11.glDisable(2896);
          GL11.glEnable(3042);
          GL11.glBlendFunc(770, 772);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, f3);
          this.blockRenderer.renderBlockAsItem(entityc4primed.renderBlock, 0, 1.0F);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
          GL11.glDisable(3042);
          GL11.glEnable(2896);
          GL11.glEnable(3553);
        }

        GL11.glPopMatrix();
      }

      public void doRender(Entity entity, double x, double y, double z, float f, float f1)
      {
        render((EntityC4Primed)entity, x, y, z, f, f1);
      }

      protected ResourceLocation func_110775_a(Entity entity)
      {
        return null;
      }
    }
