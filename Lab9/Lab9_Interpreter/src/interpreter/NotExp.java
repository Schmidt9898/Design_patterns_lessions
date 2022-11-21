package interpreter;

public class NotExp extends BooleanExp{


	BooleanExp a;
	public NotExp(BooleanExp a)
	{
		this.a=a;
	}

	@Override
	boolean evaluate(Context context) {
		return !a.evaluate(context);
	}

	@Override
	BooleanExp replace(String name, BooleanExp exp) {
		return a.replace(name, exp);
	}

}
