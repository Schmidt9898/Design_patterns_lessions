package dp;

public class LineAdapter implements ShapeAdapter {

	LegacyLine target;
	LineAdapter()
	{
		target = new LegacyLine();
	}
	public void draw(int x1, int y1, int x2, int y2)
	{
		System.out.print("Adapter ");
		target.draw(x1, y1, x2, y2);
	}
	
}
