package templatemethod;

public class TemplateMethodDemo {

	public static void main(String[] args) {
		BuildingTemplate t = new House();
		
		t.build();
		BuildingTemplate c = new Castle();
		c.build();
	}

}
