public abstract class Decorator extends A{
	A inner = null;
	public Decorator(A inner)
	{
		this.inner = inner;
	}
}
