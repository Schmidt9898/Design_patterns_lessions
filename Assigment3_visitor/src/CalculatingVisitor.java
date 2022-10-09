
public class CalculatingVisitor implements Visitor {

	int a,b;

	boolean isa = true;


	@Override
	public void visitNumber(Number c) {
		if (isa)
		{
			isa = false;
			a = c.getNumber();
		}else{
			b = c.getNumber();
		}
	}
	
	@Override
	public void visitOperator(Operator c) {
		char operator = c.getOperator();
		if (operator == '+')
		{
			a = a+b;
		}
		else if (operator == '*')
		{
			a = a*b;
		} 	
	}

	@Override
	public void printResult() {
		System.out.println("The result is: "+a);
	}

}
