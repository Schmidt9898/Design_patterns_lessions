
public interface Visitor {
	void visitNumber(Number c);
	void visitOperator(Operator c);

	void printResult();

}
