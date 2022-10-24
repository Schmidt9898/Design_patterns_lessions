package example;

import java.util.ArrayList;

public class ChocforCoalMediator implements Mediator {

	ArrayList<Kid> withChoc = new ArrayList<>();
	ArrayList<Kid> withCoal = new ArrayList<>();


	@Override
	public void apply(Kid a) {
		if(a.getGift().equals("Chocolate"))
			withChoc.add(a);
		else
			withCoal.add(a);
	}

	@Override
	public void exchange() {
		
	}
	
}
