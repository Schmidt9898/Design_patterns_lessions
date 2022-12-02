public class BorderDecorator extends Decorator {

	public BorderDecorator(Widget innre) {
		super(innre);
	}

	@Override
	public void draw() {
		System.out.println("#######################");
		inner.draw();		
		System.out.println("#######################");
	}
	
}
