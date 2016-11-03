import one.*;
import two.*;
import init.*;
public class Main {
	public static void main(String...args) {
		BB b = new BB();
		b.foo();
		
		System.out.println(BB.CONSTANT_STRING);
		print(BB.CONSTANT_STRING);
		
		System.out.println("----------");
		One one = new One();
		One one2 = new One();
		
	}
	
	public static void print(String type) {
		System.out.println(type);
	}
	public static void print(Types type) {
		System.out.println(type);
	}
}