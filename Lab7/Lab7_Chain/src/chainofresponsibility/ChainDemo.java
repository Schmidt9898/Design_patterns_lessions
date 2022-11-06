package chainofresponsibility;

public class ChainDemo {
	public static void main(String[] args)
    {
        Handler nodes = new Handler(null);
		Handler last = nodes;
		for (int i = 0; i < 3; i++) {
			last = new Handler(last);
		}
		nodes.setNext(last);


        for (int i = 1; i < 10; i++)
        {
			nodes.handle(i);
        }
    }
}
