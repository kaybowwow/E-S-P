public class DLLDeque<T> implements Deque {
    
    private DLLNode<T> _first , _last;
    private int _size;

    public DLLDeque<T> () {
	_first = null;
	_last = null;
	_size = 0;
    } 

    public void addFirst(T value) {
	DLLNode<T> newNode = new DLLNode<T>(value , null , null); 
	if (_size == 0) {
	    _first = newNode;
	    _end = newNode;
	}
	else {
	    newNode.setNext(_first);
	    _first = newNode;
	}
	_size += 1;
    }

    /*
    // print each node, separated by spaces
    public String toString() 
    { 
	String foo = "";
	LLNode<T> tmp = _first;
	while ( tmp != null ) {
	    foo += tmp.getValue() + " ";
	    tmp = tmp.getNext();
	}
	return foo;
    }//O(n)
    */
    public static void main(String[] args) {
	//DLLDeque<String> deeznuts = new DLLDeque<String>();
	
	//deeznuts.addFirst("banana");

	//System.out.println(deeznuts);
    }
	    
	  
	
}
