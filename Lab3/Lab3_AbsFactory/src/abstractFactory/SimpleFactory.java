package abstractFactory;

public class SimpleFactory extends ShapeFactory {

	@Override
	public Round createRound() {
		return new Circle();
	}

	@Override
	public Rectangular createRectangular() {
		return new Square();
	}
	
}
