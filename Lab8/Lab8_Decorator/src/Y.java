
public class Y extends Decorator{

	public Y(A inner) {
		super(inner);
		//TODO Auto-generated constructor stub
	}
	@Override
	public void doIt() {
        System.out.print('Y');
		inner.doIt();
	}


}
