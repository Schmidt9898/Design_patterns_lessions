package chainofresponsibility;

public class ChainDemo {
	public static void main(String[] args)
    {
        Handler[] nodes = 
        {
            new Handler(), new Handler(), new Handler(), new Handler()
        };
        for (int i = 1, j; i < 10; i++)
        {
            j = 0;
            while (!nodes[j].handle(i))
              j = (j + 1) % nodes.length;
        }
    }
}
