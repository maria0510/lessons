package data;


public class ArrayList<T> implements List<T> {
	public void add(T item) {
	  int n = 10;
	  int i = 0;
	  T[] items = (T[]) new Object[n];
	  items[i] = item;
	  System.out.println(items[i]);
	  i++;
	}
	public T get(int index) {
		return null;
	}
	public int size() { 
		return 0;
	}
	/*public Iterator<T> iterator() {
	
	}*/
}