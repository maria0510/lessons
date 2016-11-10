package shape.example1;
import shape.example1.Figure;

public class Shape {
	private double width;
	private double height;
	private double radius;

	public Shape(double width, double height, double radius) {
		this.width = width;
		this.height = height;
		this.radius = radius;
	}
	
	public double calculateArea(Figure f) {
		double area = 0.0;
		
		switch (f) {
			case SQUARE: area = width * width; break; 
			case RECTANGLE: area = width * height; break;
			case CIRCLE: area = Math.PI * radius * radius; break;
			
			default : area = 0.0;
		}
		return area;
	}
}
