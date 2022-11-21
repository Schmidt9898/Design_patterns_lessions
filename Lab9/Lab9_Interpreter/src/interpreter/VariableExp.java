package interpreter;

public class VariableExp extends BooleanExp{


	String name;
	VariableExp(String name)
	{
		this.name = name;
	}
	@Override
	boolean evaluate(Context context) {
		return context.lookup(name);
	}

	@Override
	BooleanExp replace(String name, BooleanExp exp) {
		if( name.equals(this.name) )
		{
			return exp;
		}
		return this;
	}

}
