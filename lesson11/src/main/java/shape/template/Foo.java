package template;

public class Foo extends Bar {
	int i = 10;
	public Foo () {
		super();
	}
	
	protected void init() {
		System.out.println("Foo; i = ") + i;
	}
	
}

abstract class Bar {
	protected Bar() {
		init(); // method in constructor is dangerous;
	}
	
	protected abstract void init();
}