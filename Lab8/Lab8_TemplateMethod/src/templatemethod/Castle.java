package templatemethod;

public class Castle extends BuildingTemplate {
		
		@Override
		public final void build() {
			buildFoundation();
			buildCastlePillars();
			buildCastleWalls();
			buildWindows();
			System.out.println("Castle is built.");	
	}
	
	protected void buildCastleWalls(){
		System.out.println("Building rock walls and dig moat.");
	}

	protected void buildCastlePillars(){
		System.out.println("Building great rock pillars and towers.");
	}

	
}
