public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Assigment 3!");

		Component tree = new Operator('+',
		new Operator('*', new Number(5, null, null), new Number(6, null, null) ),
		new Number(3, null, null) );

		Visitor printer = new PrintingVisitor();

		tree.iterateInfix(printer);

		printer.printResult();
		
		Visitor calculator = new CalculatingVisitor();
		
		tree.iteratePostfix(calculator);
		
		calculator.printResult();

    }
}
