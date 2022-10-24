package state;

public class OFFstate extends TVState{

	@Override
	public TVState pushPower() {
		System.out.println("Turning on");
		return new ONstate();
	}

	@Override
	public void increaseVolume(TVRemote tv) {
		System.out.println("do nothing");
		return;		
	}
	
	@Override
	public void decreaseVolume(TVRemote tv) {
		System.out.println("do nothing");
		return;		
	}
	
}
