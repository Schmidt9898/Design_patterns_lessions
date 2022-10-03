package bridge;

public class SmartRemote extends RemoteControl{	
	public SmartRemote(Device device)
	{
		super(device);
	}
	public void up(){
		this.setChannel(++currentChannel);
	};
	public void down(){
		this.setChannel(--currentChannel);
	};




}
