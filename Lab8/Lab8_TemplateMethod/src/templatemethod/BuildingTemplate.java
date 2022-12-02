package templatemethod;

public abstract class BuildingTemplate {
	protected final void buildFoundation(){
		System.out.println("Build proper foundation.");
	}
	
	protected final void buildWindows(){
		System.out.println("Adding Glass windows.");
	}	
	public abstract void build();
}
