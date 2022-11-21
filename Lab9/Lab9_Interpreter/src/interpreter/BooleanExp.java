package interpreter;

public abstract class BooleanExp {
	abstract boolean evaluate(Context context);
	abstract BooleanExp replace(String name,BooleanExp exp);
}
