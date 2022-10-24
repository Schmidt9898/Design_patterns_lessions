package state;

public class TVRemote {
	private TVState state = new OFFstate();
	public int volume = 0;
	
	public void pushPower(){
		state = state.pushPower();
	}
	public void increaseVolume(){
		state.increaseVolume(this);
	}

	public void decreaseVolume(){
		state.decreaseVolume(this);
	}
}
