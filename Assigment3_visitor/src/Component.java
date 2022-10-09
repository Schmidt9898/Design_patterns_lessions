public abstract class Component {
	public abstract void accept(Visitor v);
	protected Component left = null;
	protected Component right = null;
	public Component(Component left,Component right){
		this.left = left;
		this.right = right;
	}

	public void iterateInfix(Visitor v)
	{
		if (left != null)
		left.iterateInfix(v);
		accept(v);
		if (right != null)
			right.iterateInfix(v);

	}
	public void iteratePostfix(Visitor v)
	{
		if (left != null)
			left.iteratePostfix(v);
		if (right != null)
			right.iteratePostfix(v);
		accept(v);
	}


}
