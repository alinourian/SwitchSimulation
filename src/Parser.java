import java.util.Scanner;

public class Parser {

    static final int HEADER_LENGTH = 4;
    private Scanner inputScanner;
    private byte[] headerBuffer;


    public Parser(Scanner scanner){
        inputScanner = scanner;
        headerBuffer = new byte[HEADER_LENGTH];
    }

    public Packet parse(){
        Header header = parseHeader(this.inputScanner);
        Payload payload = parsePayload(this.inputScanner,header.getPayloadLength());
        return new Packet(header,payload);
    }

    public Header parseHeader(Scanner inputScanner){
        for (int i = 0; i < HEADER_LENGTH; i++) {
            headerBuffer[i] = (byte)Integer.parseInt(inputScanner.nextLine(), 2);
        }
        return new Header(headerBuffer[0],headerBuffer[1],headerBuffer[2],headerBuffer[3]);
    }

    public Payload parsePayload(Scanner inputScanner, byte payloadLength){
        //TODO
        return null;
    }
}
