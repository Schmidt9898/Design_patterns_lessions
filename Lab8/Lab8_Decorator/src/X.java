
public class X extends Decorator{

	public X(A inner) {
		super(inner);
	}

	@Override
	public void doIt() {
        System.out.print('X');
		inner.doIt();
	}

}
