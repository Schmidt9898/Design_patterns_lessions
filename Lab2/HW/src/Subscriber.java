
public abstract class Subscriber {

	private static int id_count = 0;
	protected int id;
	protected Subscriber(){
		id=id_count++;
	}
	public abstract void Update(String msg);
	public void Subscribe(String topic)
	{
		Dispacher.get_instance().subscribe(topic, this);
	}
	public void UnSubscribe(String topic)
	{
		Dispacher.get_instance().unsubscribe(topic, this);
	}
	public void SendMsg_To_Topic(String msg,String topic) {
		Dispacher.get_instance().send_message(msg, topic);
	}
}
