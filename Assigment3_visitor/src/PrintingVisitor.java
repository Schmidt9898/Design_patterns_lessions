
public class PrintingVisitor implements Visitor {

	String str = "";

	@Override
	public void visitNumber(Number c) {
		str += c.getNumber();		
	}
	
	@Override
	public void visitOperator(Operator c) {
		str += c.getOperator();		
	}

	@Override
	public void printResult() {
		System.out.println(str);
	}

}
