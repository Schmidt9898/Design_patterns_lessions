package dp;

public class RectangleAdapter implements ShapeAdapter{

	LegacyRectangle target;
	RectangleAdapter()
	{
		target = new LegacyRectangle();
	}

	public void draw(int x1, int y1, int x2, int y2)
	{
		System.out.print("Adapter ");
		target.draw(Math.min(x1, x2), Math.min(y1, y2)
					, Math.abs(x2 - x1), Math.abs(y2 - y1));
	}
	
}
