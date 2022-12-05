import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

public class DemoExecutorUsage {

    public static void main(String[] args) {
        //Create executor, with fixed two threads




		ExecutorService executorService =
		Executors.newFixedThreadPool(2);
		
		
		ArrayList<Future<?>> futures = new ArrayList<Future<?>>(); 
		
		//Future<?> future = executorService.submit(new TestOne());
		Future<?> task1 = executorService.submit(new TestOne());
		Future<?> task2 = executorService.submit(new TestTwo());
		
		
		
        //In infinite loop, keep submitting tasks, and checking their returned futures if completed
		
		while(true)
		{
			if (task1.isDone() && !task1.isCancelled()) {
					try {
						task1.get();
					} catch (InterruptedException | ExecutionException e)
					{
						e.printStackTrace();
					}
					task1 = executorService.submit(new TestTwo());
				}
				
			if (task2.isDone() && !task2.isCancelled()) {
				try {
					task2.get();
				} catch (InterruptedException | ExecutionException e)
				{
					e.printStackTrace();
				}
				task2 = executorService.submit(new TestTwo());
			}
		}
    }
}