import java.util.ArrayList;

public class Topic {

	protected ArrayList<Subscriber> subscribers = new ArrayList<>();
	public final String name;

	protected Topic(String name)
	{
		this.name=name;
		System.out.println("Topic: "+name+" was created!");
	}

	public void subscribe(Subscriber s)
	{
		if(!subscribers.contains(s))
			subscribers.add(s);
	}
	public void unsubscribe(Subscriber s)
	{
		subscribers.remove(s);
	}


	public void Sendmsg(String msg)
	{
		for (Subscriber subscriber : subscribers) {
			subscriber.Update(msg);
		}
	}
}
