public interface Deque<T> {
	
    public boolean isEmpty(); //returns boolean for whether Queue is empty
	
    public void addFirst(T value);//Adds T value to the beginning of Queue

    public T removeFirst();//Removes first element from beginning of Queue, returns removed value

    public T getFirst();//Returns first element without removing

    public void addLast(T value);//Adds T value to the end of Queue

    public T removeLast();//Removes last element from end of Queue, returns removed value

    public T getLast();//Returns last element without removing
}
