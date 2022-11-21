package interpreter;

public class AndExp extends BooleanExp{


	BooleanExp a;BooleanExp b;
	public AndExp(BooleanExp a,BooleanExp b)
	{
		this.a=a;
		this.b=b;
	}

	@Override
	boolean evaluate(Context context) {
		return a.evaluate(context) && b.evaluate(context);
	}

	@Override
	BooleanExp replace(String name, BooleanExp exp) {
		return new AndExp(a.replace(name, exp), b.replace(name, exp));
	}

}
