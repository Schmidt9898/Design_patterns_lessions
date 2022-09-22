
public class LowSubscriber extends Subscriber{

	public LowSubscriber()
	{
		System.out.println("I am "+id);
	}


	@Override
	public void Update(String msg) {
		System.out.println("my id:"+id+" "+msg.toLowerCase());
	}

}
