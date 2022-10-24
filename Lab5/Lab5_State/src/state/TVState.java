package state;

public abstract class TVState {
	public abstract TVState pushPower();
	public abstract void increaseVolume(TVRemote tv);
	public abstract void decreaseVolume(TVRemote tv);
}
