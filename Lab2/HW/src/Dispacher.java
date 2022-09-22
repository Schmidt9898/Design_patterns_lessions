import java.util.ArrayList;

public class Dispacher {
	protected static Dispacher singleton = null;

	protected ArrayList<Topic> topics = new ArrayList<>();

	private Dispacher()
	{

	}

	public static Dispacher get_instance()
	{
		if(singleton == null)
			singleton = new Dispacher();
		return singleton;
	}

	protected void send_message(String msg,String topic)
	{
		System.out.println(msg+" to "+topic);
		boolean found = false;
		for (Topic t : topics) {
			if(t.name.equals(topic))
			{
				found = true;
				t.Sendmsg(msg);
			}
		}
		if(!found)
		{
			System.out.println("No topic with this name, not creating!");
		}
	}

	public void subscribe(String topic,Subscriber s)
	{
		boolean found = false;
		for (Topic t : topics) {
			if(t.name.equals(topic))
			{
				found = true;
				t.subscribe(s);
			}
		}
		if(!found)
		{
			System.out.println("There is no topic named: "+topic+". Creating...");
			Topic t = new Topic(topic);
			topics.add(t);
			t.subscribe(s);
		}
	}
	public void unsubscribe(String topic,Subscriber s)
	{
		for (Topic t : topics) {
			if(t.name.equals(topic))
			{
				t.unsubscribe(s);
			}
		}
	}

	public void add_topic(Topic topic) {
		boolean found = false;
		for (Topic t : topics) {
			if(t.name.equals(topic.name))
			{
				found = true;
				System.out.println("Topic already exists, new was not added!");
				break;
			}
		}
		if(!found)
			topics.add(topic);
	}







}
