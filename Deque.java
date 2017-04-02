public interface Deque<T> {
	
    public boolean isEmpty();
	
    public void addFirst(T value);

    public T removeFirst();

    public T getFirst();

    public void addLast(T value);

    public T removeLast();

    public T getLast();
}
