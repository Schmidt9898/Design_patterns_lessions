package bridge;

public class Radio implements Device {

	@Override
	public void on() {
		System.out.println("Radio is on");
	}

	@Override
	public void off() {
		System.out.println("Radio is off");
	}

	@Override
	public void tuneChannel(int channel) {
		System.out.println("Radio chanel tuneing.. "+channel);
	}
	
}
