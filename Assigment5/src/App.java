import chain_layers.ApplicationLayer;
import chain_layers.EncriptionLayer;
import chain_layers.EthernetLayer;
import chain_layers.Layer;
import chain_layers.TCPLayer;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Chain of responsibility");

		Layer protocol = new ApplicationLayer(new EncriptionLayer("mykey",new TCPLayer(new EthernetLayer(null))));
		
		String sent_msg = protocol.pack(null); // this will ask for input on console
		
		System.out.println("********************");
		System.out.println(sent_msg);
		System.out.println("********************");
		
		sent_msg = protocol.unpack(sent_msg);

		//System.out.println(sent_msg);		
    }
}
