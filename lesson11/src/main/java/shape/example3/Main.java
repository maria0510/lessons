import shape.example3.Shape;
import shape.example3.Circle;
//import shape.example3.Square;
//import shape.example3.Rectungle;

public class Main {
	public static void main(String...args) {
		//instanceOfExample();
		
		Shape circle = new Circle(10.0);
		System.out.println(circle.calculateArea());
		
	}
	
	
}