
public class UpperSubscriber extends Subscriber {

	public UpperSubscriber()
	{
		System.out.println("I am "+id);
	}


	@Override
	public void Update(String msg) {
		System.out.println("MY ID:"+id+" "+msg.toUpperCase());
	}
}
