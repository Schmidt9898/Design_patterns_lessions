package example;

import java.util.ArrayList;

public class MediatorExample {

	public static void main(String[] args) {
		//Let's add some kids with preset gifts
		ArrayList<Kid> kids = new ArrayList<>();
		kids.add(new GoodKid("Chocolate"));
		kids.add(new BadKid("Chocolate"));
		kids.add(new BadKid("Coal"));

		Mediator m = new  ChocforCoalMediator();
		m.apply(kids.get(0));
		m.apply(kids.get(1));
		m.apply(kids.get(2));
		
		m.exchange();

		//unorganized first-come-first-serve based trading
		for(int i=0;i<kids.size();i++){
			System.out.println(kids.get(i).getGift());
		}
		
		/*
		 * It'd be better if there was some central Mediator that could organize trades more efficiently.
		 * Make it so that it only lets trades happen which actually result in a chocolate <-> coal switch.
		 */
		
	}

}
