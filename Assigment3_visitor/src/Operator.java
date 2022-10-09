
public class Operator extends Component {

	private char operator;

	public char getOperator() {
		return operator;
	}

	public Operator(char operator, Component left, Component right) {
		super(left, right);
		this.operator = operator;
	}

	@Override
	public void accept(Visitor v) {
		v.visitOperator(this);
	}

}
