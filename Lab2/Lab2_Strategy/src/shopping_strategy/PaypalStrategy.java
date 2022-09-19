package shopping_strategy;

public class PaypalStrategy extends PaymentStrategy {

	private String email;
	private String pwd;

	public PaypalStrategy(String email,String pwd)
	{
		this.email=email;
		this.pwd=pwd;
	}

	@Override
	public void pay(int amount) {
		System.out.println("paypalllllll");
	}

}
