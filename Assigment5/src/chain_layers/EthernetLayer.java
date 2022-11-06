package chain_layers;
public class EthernetLayer extends Layer {

	public EthernetLayer(Layer next) {
		super(next);
	}

	@Override
	public String handle_pack(String msg) {
		return "Ethernet package:\n"+msg;
	}

	@Override
	public String handle_unpack(String msg) {
		msg = msg.substring(msg.indexOf('\n')+1);
		return msg;
	}



}
