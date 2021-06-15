public class Payload {

    private byte length;
    private String context;

    public Payload(byte length, char[] payloadBytes){
        this.length=length;
        this.context = new String(payloadBytes);
    }

    public String getContext() {
        return context;
    }

    public byte getLength() {
        return length;
    }

    public void encdec(byte key){
        //TODO
    }
}