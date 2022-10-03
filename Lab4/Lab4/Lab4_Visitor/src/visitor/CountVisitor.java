package visitor;

public class CountVisitor extends Visitor {

	@Override
	public void VisitRed(Red e) {
		e.count();
	}

	@Override
	public void VisitBlue(Blue e) {
		e.count();
	}

}
