package visitor;

public class CallVisitor extends Visitor{

	@Override
	public void VisitRed(Red e) {
		e.call();
	}

	@Override
	public void VisitBlue(Blue e) {
		e.call();
	}

}
