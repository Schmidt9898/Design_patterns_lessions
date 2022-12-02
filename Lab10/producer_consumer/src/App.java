import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("producer-consumer!");

		Deque<String> deque = new LinkedList<String>();

		ArrayList<Thread> people = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			Producer temp = new Producer(i, deque);
			people.add(new Thread(temp));
		}
		for (int i = 0; i < 5; i++) {
			Consumer temp = new Consumer(i+100, deque);
			people.add(new Thread(temp));
		}

		for (Thread t : people) {
			t.start();
		}

		for (Thread t : people) {
			t.join();
		}
		
		
    }
}
