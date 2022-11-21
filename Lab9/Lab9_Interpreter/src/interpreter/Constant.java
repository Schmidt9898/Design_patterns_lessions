package interpreter;

public class Constant extends BooleanExp {

	boolean value;
	public Constant(boolean val)
	{
		this.value = val;
	}

	@Override
	boolean evaluate(Context context) {
		return value;
	}

	@Override
	BooleanExp replace(String name, BooleanExp exp) {
		return this;
	}

}
