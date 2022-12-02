import java.util.Deque;
import java.util.Random;

public class Producer implements Runnable {

	Deque<String> deque; //shared que
	private int id;

	public Producer(int id,Deque<String> que)
	{
		this.id=id;
		deque = que;
	}

	@Override
	public void run() {
		
		Random rng = new Random();

		while(true)
		{
			Double sec = (rng.nextDouble() / 2.0 + 0.5) * 1000;
			try{
			Thread.sleep(sec.longValue());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

			String new_string = String.valueOf(id) + " music.mp3";
			synchronized (deque)
			{

				deque.add(new_string);
				System.out.println(String.valueOf(id)+" Producer release music: "+new_string);
				deque.notifyAll();
			}


		}
		
	}
	
}
