package templatemethod;

public class House extends BuildingTemplate {
	
	public final void build(){
		buildFoundation();
		buildHousePillars();
		buildHouseWalls();
		buildWindows();
		System.out.println("House is built.");
	}
	

	protected void buildHousePillars(){
		System.out.println("Building wooden pillars.");
	}
	
	protected void buildHouseWalls(){
		System.out.println("Building walls from wood.");
	}
}
