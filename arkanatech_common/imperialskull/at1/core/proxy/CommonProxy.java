package imperialskull.at1.core.proxy;

import java.io.File;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.IGuiHandler;

public class CommonProxy implements IGuiHandler {
    
    public File getMinecraftDir(){return new File(".");}
   
    
    
    public void initRenderingAndTextures(){
    	
    	
        
    }
    
    public void registerTileEntities(){

    }
    
    public void sendRequestEventPacket(byte eventType, int originX, int originY, int originZ, byte sideHit, byte rangeX, byte rangeY, byte rangeZ, String data) {

    }

    public void handleTileEntityPacket(int x, int y, int z, ForgeDirection orientation, byte state, String customName) {

    }



	@Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world,
            int x, int y, int z) {
	    // TODO Auto-generated method stub
	    return null;
    }



	@Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world,
            int x, int y, int z) {
	    // TODO Auto-generated method stub
	    return null;
    }



	public boolean isSimulating() {
	    // TODO Auto-generated method stub
	   return !FMLCommonHandler.instance().getEffectiveSide().isClient();
    }

}
         
    







