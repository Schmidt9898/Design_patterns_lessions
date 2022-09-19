package shopping_strategy;

public class CardStrategy extends PaymentStrategy{

	private String name;
	private String card_number;
	private String cvc;
	private String date;
	public CardStrategy(String name,String card_number,String cvc,String date)
	{
		this.name=name;
		this.card_number=card_number;
		this.cvc=cvc;
		this.date=date;
	}
	@Override
	public void pay(int amount) {
		System.out.println("card pay");
		
	}

}
