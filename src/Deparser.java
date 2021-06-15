public class Deparser {

    public byte[] deparse(Packet packet){
        byte[] headerBytes = deparseHeader(packet.getHeader());
        byte[] payloadBytes = deparsePayload(packet.getPayload());
        byte[] output = new byte[headerBytes.length + payloadBytes.length];
        //TODO
        return output;
    }
    public byte[] deparseHeader(Header header){
        //TODO
        return null;
    }
    public byte[] deparsePayload(Payload payload){
        //TODO
        return null;
    }
}
