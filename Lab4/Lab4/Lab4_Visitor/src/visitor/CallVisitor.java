package visitor;

public class CallVisitor extends Visitor{

	@Override
	public void VisitRed(Red e) {
	    System.out.println("Red.eye");

	}

	@Override
	public void VisitBlue(Blue e) {
	    System.out.println("Blue.eye");

	}

}
