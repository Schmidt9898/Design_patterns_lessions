package chainofresponsibility;

public class Handler {
	private static java.util.Random s_rn = new java.util.Random();
    private static int s_next = 1;
    private int m_id = s_next++;
	Handler next;

	public void setNext(Handler next) {
		this.next = next;
	}
	public Handler(Handler next)
	{
		this.next = next;
	}

	public void handle(int num)
    {
        if (s_rn.nextInt(4) != 0)
        {
            System.out.print(m_id + "-busy  ");
			if(next != null)
            next.handle(num);
			else
			System.out.println("Well this is a problem");
        }
        System.out.println(m_id + "-handled-" + num);
    }
}
