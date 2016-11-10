import shape.example1.Shape;
import shape.example1.Figure;

public class Main {
	public static void main(String...args) {
		
		Shape shape1 = new Shape(10.0, 5.0, 10.0);
		
		System.out.println(shape1.calculateArea(Figure.SQUARE));
	}
	//-------template-----
    	
}