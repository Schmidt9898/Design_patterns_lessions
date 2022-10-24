package privateClassData;

import java.awt.Color;
import java.awt.Point;

public class Circle {

	class PCData
	{	
		private double radius;
		public double getRadius() {
			return radius;
		}
		private Color color;
		private Point origin;
		public PCData(double radius2, Color color2, Point origin2) {
		this.radius=radius2;
		this.color =color2;// new Color(color2.getRGB());
		this.origin =origin2;// (Point)origin2.clone();
		}
	}
	PCData data; 

	public Circle(double radius, Color color, Point origin) {
		data = new PCData(radius,color,origin);
	}
	public double Circumference() {
		return 2 * Math.PI * this.data.getRadius();
	}
	public double Diameter() {
		return 2 * this.data.getRadius();
	}
	public void Draw() {
		System.out.println("Drawing...\n");
		//I can mess around with things I shouldn't be able to change
		//radius += 1;
	}
	public static void main(String[] args) {
		Circle myc = new Circle(5, new Color(1, 0, 0), new Point(20, 20));
		myc.Draw();
	}

}
