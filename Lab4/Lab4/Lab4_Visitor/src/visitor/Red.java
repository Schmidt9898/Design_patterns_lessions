package visitor;

public class Red extends Color {
	@Override
	public void Accept(Visitor v) {
		v.VisitRed(this);
	}
}
