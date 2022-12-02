import java.util.Deque;
import java.util.Random;

public class Consumer implements Runnable {

	Deque<String> deque; //shared que
	private int id;

	public Consumer(int id,Deque<String> que)
	{
		this.id=id;
		deque = que;
	}

	@Override
	public void run() {
		Random rng = new Random();
		String mysong = "";
		while(true)
		{
			mysong = "";
			synchronized (deque)
			{
				if(deque.size()<=0)
				{
					try {
						deque.wait();
					} catch (InterruptedException e) {
					}
				}else
				{
					mysong = deque.pop();
				}
			}
			if (!mysong.equals(""))
			{
				System.out.println(String.valueOf(id)+" consumer: "+mysong);
				Double sec = (rng.nextDouble() / 2.0 + 0.5) * 1000;
				try{
					Thread.sleep(sec.longValue());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
