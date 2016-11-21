package data;

public interface List<T> {
	void add(T item);
	T get(int index);
	int size();
	//Iterator<T> iterator();
	
}