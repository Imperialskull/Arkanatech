package imperialskull.at1.entity;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityJeraPotion extends EntityThrowable {
	public EntityJeraPotion(World par1World){
		super(par1World);
	}
	public EntityJeraPotion(World par1World,EntityPlayer par2EntityPlayer){
		super(par1World,par2EntityPlayer);
	}
		@SideOnly(Side.CLIENT)
		public EntityJeraPotion(World par1World, double par2, double par4, double par6, int par8) {
		this(par1World, par2, par4, par6);
		}

		public EntityJeraPotion(World par1World, double par2, double par4, double par6) {
		super(par1World, par2, par4, par6);
		}

		/**
		* Gets the amount of gravity to apply to the thrown entity with each tick.
		*/
		@Override
		protected float getGravityVelocity() {
		return 0.03F;
		}

		@Override
		protected float func_70182_d() {
		return 0.7F;
		}

		@Override
		protected float func_70183_g() {
		return -20.0F;
		}

		/**
		* Called when this EntityThrowable hits a block or entity.
		*/
		@Override
		protected void onImpact(MovingObjectPosition mop) {
		this.spawnParticles();
		int x = (int)(posX + 0.5);
		int y = (int)(posY + 0.5);
		int z = (int)(posZ + 0.5);
		for (int xD = -1; xD <= 1; xD++) {
		for (int yD = -2; yD <= 1; yD++) {
		for (int zD = -1; zD <= 1; zD++) {
		if (this.getThrower() instanceof EntityPlayer) {
		Item.itemsList[Item.dyePowder.itemID].onItemUse(new ItemStack(Item.dyePowder, 1, 15), (EntityPlayer)this.getThrower(), worldObj, x + xD, y + yD, z + zD, 1, 0F, 0F, 0F);
		}
		}
		}
		}
		this.setDead();
		}

		private void spawnParticles() {
		double var8 = posX;
		double var10 = posY;
		double var12 = posZ;
		String var14 = "iconcrack_" + Item.potion.itemID;
		Random var7 = rand;
		for (int var15 = 0; var15 < 8; ++var15) {
		worldObj.spawnParticle(var14, var8, var10, var12, var7.nextGaussian() * 0.15D, var7.nextDouble() * 0.2D, var7.nextGaussian() * 0.15D);
		}
		float red = 1.0F;
		float green = 0.0F;
		float blue = 0.0F;
		String var19 = "spell";
		for (int var20 = 0; var20 < 100; ++var20) {
		double var39 = var7.nextDouble() * 4.0D;
		double var23 = var7.nextDouble() * Math.PI * 2.0D;
		double var25 = Math.cos(var23) * var39;
		double var27 = 0.01D + var7.nextDouble() * 0.5D;
		double var29 = Math.sin(var23) * var39;
		if (worldObj.isRemote) {
		EntityFX var31 = Minecraft.getMinecraft().renderGlobal.doSpawnParticle(var19, var8 + var25 * 0.1D, var10 + 0.3D, var12 + var29 * 0.1D, var25, var27, var29);
		if (var31 != null) {
		float var32 = 0.75F + var7.nextFloat() * 0.25F;
		var31.setRBGColorF(red * var32, green * var32, blue * var32);
		var31.multiplyVelocity((float)var39);
		}
		}
		}
		worldObj.playSoundEffect(posX + 0.5D, posY + 0.5D, posZ + 0.5D, "random.glass", 1.0F, worldObj.rand.nextFloat() * 0.1F + 0.9F);
		}
		}
