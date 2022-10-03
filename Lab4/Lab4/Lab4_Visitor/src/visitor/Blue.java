package visitor;

public class Blue extends Color {
	@Override
	public void Accept(Visitor v) {
		v.VisitBlue(this);	
	}
}
