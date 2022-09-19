package observer;

public class AbsObserver implements observer {

	@Override
	public void update(int val) {
		System.out.println(val + " abs is " + Math.abs(val) +'\n');
	}

}
