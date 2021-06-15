public class Packet {

    private Header header;
    private Payload payload;

    public Packet(Header header, Payload payload){
        this.header=header;
        this.payload=payload;
    }

    public short forward(){
        //TODO
        return 0;
    }
    public void encdec(){
        payload.encdec(header.getKey());
    }

    public Header getHeader() {
        return header;
    }

    public Payload getPayload() {
        return payload;
    }
}
