package chain_layers;


public abstract class Layer {
	private Layer next = null;
	public Layer(Layer next)
	{
		this.next = next;
	}
	public final String pack(String msg)
	{
		msg = this.handle_pack(msg);
		//System.out.println(msg);
		if(next != null)
			msg = next.pack(msg);
		return msg;
	}
	public final String unpack(String msg)
	{
		if(next != null)
			msg = next.unpack(msg);
		msg = this.handle_unpack(msg);
		//System.out.println(msg);
		return msg;
	}

	public abstract String handle_pack(String msg);
	public abstract String handle_unpack(String msg);
}
