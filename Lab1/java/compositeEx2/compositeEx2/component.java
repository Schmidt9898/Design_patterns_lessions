package compositeEx2;

public abstract class component {
	public abstract void addProjectItem(component c) throws Exception;
	public abstract String getDescription(int dept);
	public abstract double getTimeNeeded();
}
