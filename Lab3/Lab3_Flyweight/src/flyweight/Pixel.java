package flyweight;
public class Pixel {
	private int row;
	//private int color;
	public Pixel(int rowid ) {
		row = rowid;
		//col = colid;
		//color = _color;
	}
	void report(int col,int color) {
		System.out.print( " " + row + ", " + col + ": "+color);
	}
}