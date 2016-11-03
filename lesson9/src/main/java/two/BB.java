package two;

import one.B;

public class BB extends B {
	
	public static final String CONSTANT_STRING = "1";
	public final String CONSTANT_STRING2;
	
	public BB(){
		CONSTANT_STRING2 = "2";
	}
	
	@Override
	public void foo() {
		System.out.println("BB");
	}
	
	public void bar() {}
	
	
}
