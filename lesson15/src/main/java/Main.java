

public class Main {
	public static void main(String...args) {
	List list1 = new List(); //no use
	//list1.add(10);
	
    List<Number> list2 = new List<>();
    list1 = list2;	
	list2.add(10L);
	list2.add(10.0f);
	
	list2.add(new List<Number>());
	//list2.add(new List<Integer>());
	
   // list2 = list1; / unsafe
	
	/*Tuple<Integer, String> t1 = new Tuple<>(10, "100");
	int a = t1.first;
	String b = t1.second;*/
	
	//Tuple<Long, String> t2 = Tuple.<Long, String>create(1L, "John");
	
	List2<FooBar> list3 = new List2<>();
	
	GenericList<String> strList = new GenericList<>();
	strList.addList(new GenericList<Integer>());
	strList.addList2(new GenericList<Number>());
	strList.addList2(new GenericList<Object>());
	
	StringTuple t4 = new StringTuple("1", "2");
	}
	
}

class List<T extends Number> {
	void add(T item) {}
	void add(List<T> list) {}
}

class List3<T extends Number> extends List<T>{
	void add(T item) {}
	void add(List<T> list) {}
}

class List2<T extends Foo & Bar> {
	void add(T item) {}
}

class GenericList<T> {
	void add(T item) {}
	void addList(GenericList<? extends Number> list) {
	list.toString();
	int i = list.size();
	}
	int size() {
		return 0;
	}
	void addList2(GenericList<? super Number> list) {}
}

interface Foo {}

interface Bar {}

class FooBar implements Bar, Foo {
	
}
class Tuple<T, S extends String> {
	public final T first;
	public final S second;
	
	public Tuple(T first, S second) {
		this.first = first;
		this.second = second;
	}
	
	public static <T, S extends String> Tuple<T, S> create (T first, S second) {
		return new Tuple<>(first, second); 
	}
}

class StringTuple extends Tuple<String, String> {
	public StringTuple(String first, String second) {
		super(first, second);
	}
}