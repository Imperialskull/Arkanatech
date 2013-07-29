package imperialskull.at1.network;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

import imperialskull.at1.lib.Reference;
import imperialskull.at1.network.packet.PacketAT;
import imperialskull.at1.network.packet.PacketTileUpdate;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;

public enum PacketTypeHandler {

    TILE(PacketTileUpdate.class);


    private Class<? extends PacketAT> clazz;

    PacketTypeHandler(Class<? extends PacketAT> clazz) {

        this.clazz = clazz;
    }

    public static PacketAT buildPacket(byte[] data) {

        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        int selector = bis.read();
        DataInputStream dis = new DataInputStream(bis);

        PacketAT packet = null;

        try {
            packet = values()[selector].clazz.newInstance();
        }
        catch (Exception e) {
            e.printStackTrace(System.err);
        }

        packet.readPopulate(dis);

        return packet;
    }

    public static PacketAT buildPacket(PacketTypeHandler type) {

        PacketAT packet = null;

        try {
            packet = values()[type.ordinal()].clazz.newInstance();
        }
        catch (Exception e) {
            e.printStackTrace(System.err);
        }

        return packet;
    }

    public static Packet populatePacket(PacketAT packetAT) {

        byte[] data = packetAT.populate();

        Packet250CustomPayload packet250 = new Packet250CustomPayload();
        packet250.channel = Reference.CHANNEL_NAME;
        packet250.data = data;
        packet250.length = data.length;
        packet250.isChunkDataPacket = packetAT.isChunkDataPacket;

        return packet250;
    }
}