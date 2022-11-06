package chain_layers;
public class TCPLayer extends Layer{

	public TCPLayer(Layer next) {
		super(next);
	}

	@Override
	public String handle_pack(String msg) {
		return "TCP package:\n"+msg;
	}

	@Override
	public String handle_unpack(String msg) {
		msg = msg.substring(msg.indexOf('\n')+1);
		return msg;
	}



}
