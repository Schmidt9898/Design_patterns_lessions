package dp;

public class LineAdapter extends LegacyLine implements ShapeAdapter {

	public void draw(int x1, int y1, int x2, int y2)
	{
		System.out.print("Adapter ");
		super.draw(x1, y1, x2, y2);
	}
	
}
