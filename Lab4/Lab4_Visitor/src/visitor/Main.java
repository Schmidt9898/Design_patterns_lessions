package visitor;

public class Main {

	public static void main(String[] args) {
		Color set[] =
		{ new Red(), new Blue(), new Blue(), new Red(), new Red() };

		CountVisitor count_visitor = new CountVisitor();
		CallVisitor call_visitor = new CallVisitor();

		for (Color c : set)
		{
			c.Accept(count_visitor);
			c.Accept(call_visitor);
		}
		count_visitor.reportNum();
	}
}
