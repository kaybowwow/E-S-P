public class DLLDeque<T> implements Deque<T> {
    
    private DLLNode<T> _first , _last;
    private int _size;

    public DLLDeque() {
		_first = null;
		_last = null;
		_size = 0;
    } 
    
    /*---------------------------------------
    precond: DLLDeque is created
    postcond: adds DLLNode to front of DLLDeque
    ---------------------------------------*/
    public void addFirst(T value) {
		DLLNode<T> newNode = new DLLNode<T>(value , null , null); 
		if (isEmpty()) {
			_first = newNode;
			_last = newNode;
		}
		else {
			newNode.setNext(_first);
			_first = newNode;
		}
		_size++;
    }
    
    /*---------------------------------------
    precond: DLLDeque is created
    postcond: removes first element in DLLDeque
    		  if DLLDeque is empty, return null
    ---------------------------------------*/
    public T removeFirst(){
    	T ret = null;
    	
    	if (!isEmpty()){
    		ret = _first.getCargo();
    		_first = _first.getNext();
    		_size--;
    	}

    	return ret;
    }
    
    /*---------------------------------------
    precond: DLLDeque is created
    postcond: Returns first element in DLLDeque
    ---------------------------------------*/
    public T getFirst(){
    	if (isEmpty()){
    		return null;
    	}
    	return _first.getCargo();
    }
    
    // Checks if DLLDeque is empty
    public boolean isEmpty(){
    	return _size == 0;
    }

    // print each node, separated by spaces
    public String toString() 
    { 
		String foo = "";
		DLLNode<T> tmp = _first;
		while ( tmp != null ) {
			foo += tmp.getCargo() + " ";
			tmp = tmp.getNext();
		}
		return foo;
	}
    
    public static void main(String[] args) {
		DLLDeque<String> deeznuts = new DLLDeque<String>();
	
		deeznuts.addFirst("banana");
		deeznuts.addFirst("pear");
		deeznuts.addFirst("cherry");
		deeznuts.addFirst("lychee");
		System.out.println("DLLDeque: " + deeznuts);
		
		
		
		System.out.println("removed: " + deeznuts.removeFirst()); // lychee
		System.out.println("DLLDeque: " + deeznuts);
		/*------------------ test removeFirst ---------------------
		System.out.println("removed: " + deeznuts.removeFirst()); // cherry
		System.out.println("DLLDeque: " + deeznuts);
		System.out.println("removed: " + deeznuts.removeFirst()); // pear
		System.out.println("DLLDeque: " + deeznuts);
		System.out.println("removed: " + deeznuts.removeFirst()); // banana
		System.out.println("DLLDeque: " + deeznuts);
		System.out.println("removed: " + deeznuts.removeFirst()); // null
		System.out.println("DLLDeque: " + deeznuts);
		 ----------------------------------------------------------*/
		
		System.out.println("getFirst: " + deeznuts.getFirst()); //cherry
    }
	    
	  
	
}
