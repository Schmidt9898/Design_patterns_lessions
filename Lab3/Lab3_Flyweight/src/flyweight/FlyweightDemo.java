package flyweight;

import java.util.Random;

public class FlyweightDemo {
	public static final int ROWS = 6, COLS = 10;


	public static void main( String[] args ) {
	
		
		Random rand = new Random();
		Pixel[][] matrix = new Pixel[ROWS][COLS];
		
		int[] colors = new int[COLS];
		
		for (int j=0; j < COLS; j++)
		{
			for (int i=0; i < ROWS; i++)
			{
				matrix[i][j] = new Pixel( i );
			}
		}
			colors[j] = rand.nextInt()%128+128;
		for (int i=0; i < ROWS; i++) {
			for (int j=0; j < COLS; j++)
				matrix[i][j].report(j,colors[j]);
			System.out.println();
		}  
	}
}