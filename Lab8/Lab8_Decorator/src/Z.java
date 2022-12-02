
public class Z extends Decorator{

	public Z(A inner) {
		super(inner);
		//TODO Auto-generated constructor stub
	}
	@Override
	public void doIt() {
        System.out.print('Z');
		inner.doIt();
	}


}
