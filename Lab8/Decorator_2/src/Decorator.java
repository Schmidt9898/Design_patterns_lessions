
public abstract class Decorator implements Widget {

	Widget inner;
	public Decorator(Widget inner)
	{
		this.inner = inner;
	}

}
