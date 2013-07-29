package imperialskull.at1.network;

import imperialskull.at1.network.packet.PacketAT;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class PacketHandler implements IPacketHandler {

    @Override
    public void onPacketData(INetworkManager manager,
            Packet250CustomPayload packet, Player player) {
        PacketAT packetAT = PacketTypeHandler.buildPacket(packet.data);
        
        packetAT.execute(manager,player);
        
    }

}
