package imperialskull.at1.block;


import imperialskull.at1.entity.EntityAT1Explosive;
import net.minecraft.world.World;

public class EntityC4Primed extends EntityAT1Explosive
{
  public EntityC4Primed(World world, double x, double y, double z)
	  {
	    super(world, x, y, z, 60, 5.5F, 0.9F, 0.3F, net.minecraft.block.Block.blocksList[ArkaneBlocks.arkaneC4.blockID]);
	  }

	  public EntityC4Primed(World world) {
	    this(world, 0.0D, 0.0D, 0.0D);
	  }
	}
