package visitor;

public class Main {

    public static void main(String[] args) {
        Color set[] =
        { new Red(), new Blue(), new Blue(), new Red(), new Red() };

		Visitor count_visitor = new CountVisitor();
		Visitor call_visitor = new CallVisitor();

        for (Color c : set)
        {
            //c.count();
            //c.call();
			c.Accept(count_visitor);
			c.Accept(call_visitor);
        }
        Color.reportNum();
    }
}
