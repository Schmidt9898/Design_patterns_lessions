package visitor;

public class CountVisitor extends Visitor {

	protected int num_red=0, num_blue=0;
    void reportNum() {
        System.out.println("Reds " + num_red + ", Blues " + num_blue);
    }



	@Override
	public void VisitRed(Red e) {
		num_red++;
	}
	
	@Override
	public void VisitBlue(Blue e) {
		num_blue++;
	}

}
