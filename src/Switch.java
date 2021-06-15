import java.util.Scanner;

public class Switch {

    private Parser parser;
    private Deparser deparser;
    private Scanner inputScanner;
    private Packet packet;
    private byte[] outputBuffer;
    private short outputPort;


    public Switch(){
        this.inputScanner = new Scanner(System.in);
        this.parser=new Parser(inputScanner);
        this.deparser = new Deparser();
    }

    public void run(){
        while(inputScanner.hasNext()){
            packet = parser.parse();
            packet.encdec();
            outputPort = packet.forward();
            outputBuffer = deparser.deparse(packet);
            showOutputPacket(outputBuffer,outputPort);
        }
    }

    private void showOutputPacket(byte[] outputBuffer, short outputPort){
        //TODO
    }

}
