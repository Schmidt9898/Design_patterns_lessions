public class SrollDecorator extends Decorator {

	public SrollDecorator(Widget innre) {
		super(innre);
	}

	@Override
	public void draw() {
		System.out.println("*********====**********");
		inner.draw();
	}
	
}
