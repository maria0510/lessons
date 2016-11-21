package inner;

public class Enclosing<T> {
	int first;
	T tmp;
	public interface MyInterface {
	   public class Hello {}
	}
	static interface MyInterface2 {
		
	}
	public class Inner {
		/*Inner(T t) {
			
		}*/
		static final int staticInt = 0;
	//	int first;
		public void foo() {
		//	this.first = 10;
			Enclosing.this.first = 20;
		}
	  public void hasNext() {
		  if(first == 0) {}
	  }
	}
	
	static int sInt = 0;
	
	public static void esFoo() {
		System.out.println("esFoo");
		System.out.println(InnerStatic.isInt);
	}
	public static class InnerStatic {
		 public static class Hello2{
			 
		 }
		
		static int isInt = 100;
	  public static void foo() {
		  System.out.println("sInt:" + sInt);
		  sInt = 10;
		  System.out.println("sInt:" + sInt);
		  esFoo();
	  }	
	}
}
