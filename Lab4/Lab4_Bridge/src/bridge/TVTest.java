package bridge;

import java.util.Random;

public class TVTest {
	public static void main(String[] args) {
		Device myDevice = new Sony(); //This could be put in a factory
		
		RemoteControl myremote = new RemoteControl(myDevice);
		
		//high level calls to the abstraction
		myremote.on();
		myremote.setChannel(8);
		myremote.off();

		//Now create a better remote control, which lets oyu change the channel up or down
		// without changing the device being controlled

		SmartRemote smartRemote = new SmartRemote(myDevice);
		smartRemote.up();
		smartRemote.down();

		// Now control a Radio!
		Device myDevice2 = new Radio();
		smartRemote = new SmartRemote(myDevice2);
		smartRemote.on();
		smartRemote.setChannel(8);
		
		smartRemote.up();
		smartRemote.down();

		smartRemote.off();
		


	}
}
