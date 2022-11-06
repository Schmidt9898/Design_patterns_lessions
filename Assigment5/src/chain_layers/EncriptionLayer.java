package chain_layers;

public class EncriptionLayer extends Layer{

	String key = "key";

	public EncriptionLayer(String key,Layer next) {
		super(next);
		this.key = key;
	}

	@Override
	public String handle_pack(String msg) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < msg.length(); i++)
			sb.append((char)(msg.charAt(i) ^ key.charAt(i % key.length())));
		String result = sb.toString();
		return result;
	}

	@Override
	public String handle_unpack(String msg) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < msg.length(); i++)
			sb.append((char)(msg.charAt(i) ^ key.charAt(i % key.length())));
		String result = sb.toString();
		return result;
	}



}
