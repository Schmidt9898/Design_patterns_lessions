public class Number extends Component{

	private int number;
	
	public int getNumber() {
		return number;
	}

	public Number(int n,Component left, Component right) {
		super(left, right);
		number = n;
	}

	@Override
	public void accept(Visitor v) {
		v.visitNumber(this);
	}
	
}
