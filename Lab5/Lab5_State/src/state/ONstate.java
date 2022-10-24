package state;

public class ONstate extends TVState{

	@Override
	public TVState pushPower() {
		System.out.println("Turning off.");
		return new OFFstate();
	}

	@Override
	public void increaseVolume(TVRemote tv) {
		tv.volume++;		
		System.out.println(tv.volume+"++");
	}
	
	@Override
	public void decreaseVolume(TVRemote tv) {
		tv.volume--;		
		System.out.println(tv.volume+"--");
	}
	
}
