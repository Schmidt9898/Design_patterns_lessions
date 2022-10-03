package abstractFactory;

public class ComplexFactory extends ShapeFactory {

	@Override
	public Round createRound() {
		return new Ellipse();
	}

	@Override
	public Rectangular createRectangular() {
		return new Rectangle();
	}
	
}
