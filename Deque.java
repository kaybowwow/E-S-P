public interface Deque<T> {
	
    public boolean isEmpty(); //returns boolean for whether Queue is empty
	
    public void addFirst(T value);//Adds T value to the beginning of Queue

    public void offerFirst(T value);//Adds T value to the beginning of Queue

    public T removeFirst();//Removes first element from beginning of Queue, returns removed value.  If empty, throws exception

    public T pollFirst();//Removes first element from beginning of Queue, returns removed value.  If empty, returns null

    public T getFirst();//Returns first element without removing
   
    public T peekFirst();//Returns first element without removing

    public void addLast(T value);//Adds T value to the end of Queue

    public void offerLast(T value);//adds T value to the end of Queue

    public T removeLast();//Removes last element from end of Queue, returns removed value. If empty, throws exception

    public T pollLast();//Removes last element from end of Queue, returns removed value.  If empty, returns null

    public T getLast();//Returns last element without removing

    public T peekLast();//Returns last element without removing

    public boolean contains(T value);//Checks if given value is in Deque
}
