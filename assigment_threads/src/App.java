import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Thread assigment! \n Welcome to the intersection simulator.");

		Intersection intersection = new Intersection();

		Thread iThread = new Thread(intersection);
		iThread.start();
		
		ArrayList<Thread> cars = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			Thread cThread = new Thread(new Car(intersection));
			cThread.start();
			cars.add(cThread);
			Thread.sleep(500);
		}

		for (Thread thread : cars) {
			thread.join();
		}

		//for stopping the simulation
		iThread.interrupt();
		iThread.join();

    }
}
