package imperialskull.at1.entity;

import imperialskull.at1.Arkanatech;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityAT1Explosive extends Entity 
	{
		  public DamageSource damageSource;
		  public EntityLivingBase igniter;
		  public int fuse = 80;
		  public float explosivePower = 4.0F;
		  public float dropRate = 0.3F;
		  public float damageVsEntitys = 1.0F;

		  public Block renderBlock = Block.dirt;

		  public EntityAT1Explosive(World world)
		  {
		    super(world);
		    this.preventEntitySpawning = true;
		    setSize(0.98F, 0.98F);
		    this.yOffset = (this.height / 2.0F);
		  }

		  public EntityAT1Explosive(World world, double d, double d1, double d2, int fuselength, float power, float rate, float damage, Block block)
		  {
		    this(world);
		    setPosition(d, d1, d2);
		    float f = (float)(Math.random() * 3.141592741012573D * 2.0D);
		    this.motionX = (-MathHelper.sin(f * 3.141593F / 180.0F) * 0.02F);
		    this.motionY = 0.2000000029802322D;
		    this.motionZ = (-MathHelper.cos(f * 3.141593F / 180.0F) * 0.02F);
		    this.prevPosX = d;
		    this.prevPosY = d1;
		    this.prevPosZ = d2;
		    this.fuse = fuselength;
		    this.explosivePower = power;
		    this.dropRate = rate;
		    this.damageVsEntitys = damage;
		    this.renderBlock = block;
		  }

		  protected void entityInit()
		  {
		  }

		  protected boolean canTriggerWalking()
		  {
		    return false;
		  }

		  public boolean canBeCollidedWith()
		  {
		    return !this.isDead;
		  }

		  public void onUpdate()
		  {
		    this.prevPosX = this.posX;
		    this.prevPosY = this.posY;
		    this.prevPosZ = this.posZ;
		    this.motionY -= 0.04D;
		    moveEntity(this.motionX, this.motionY, this.motionZ);
		    this.motionX *= 0.98D;
		    this.motionY *= 0.98D;
		    this.motionZ *= 0.98D;

		    if (this.onGround) {
		      this.motionX *= 0.7D;
		      this.motionZ *= 0.7D;
		      this.motionY *= -0.5D;
		    }

		    if (this.fuse-- <= 0) {
		      setDead();

		      if (Arkanatech.proxy.isSimulating()) explode(); 
		    }
		    else { this.worldObj.spawnParticle("smoke", this.posX, this.posY + 0.5D, this.posZ, 0.0D, 0.0D, 0.0D); }
		  }

		  private void explode()
		    {
		        float f = 20.0F;
		        this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, f, true);
		    }

		  protected void writeEntityToNBT(NBTTagCompound nbttagcompound)
		  {
		    nbttagcompound.setByte("Fuse", (byte)this.fuse);
		  }

		  protected void readEntityFromNBT(NBTTagCompound nbttagcompound)
		  {
		    this.fuse = nbttagcompound.getByte("Fuse");
		  }

		  public float getShadowSize()
		  {
		    return 0.0F;
		  }

		  public EntityAT1Explosive setIgniter(EntityLivingBase igniter) {
		    this.igniter = igniter;
		    return this;
		  }
		}


