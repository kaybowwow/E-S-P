// E-S-P: Kevin Bao, Jackie Woo, Max Chan
// APCS2 pd1
// LAB02 -- All Hands on Deque!
// 2017-04-03


import java.util.NoSuchElementException;

public class DLLDeque<T> implements Deque<T> {
    
    private DLLNode<T> _first , _last;
    private int _size;

    /*---------------------------------------
      precond: 
      postcond: constructs a DLLDeque
      ---------------------------------------*/    
    public DLLDeque() {
	_first = null;
	_last = null;
	_size = 0;
    }

    /*---------------------------------------
      precond: DLLDeque is created 
      postcond: returns true if value is in DLLDeque, false otherwise.
      ---------------------------------------*/    
    public boolean contains(T value) {//O(n)
	DLLNode<T> tmp = _first;
	int counter = _size;
	while ( counter > 0 ) {
	    if (tmp.getCargo().equals(value)) {return true;}
	    tmp = tmp.getNext();
	    counter --;
	}
	return false;
    }//end contains()
    
    /*---------------------------------------
      precond: DLLDeque is created 
      postcond: returns element at specified index
      ---------------------------------------*/  
    public T atIndex(int i){
		DLLNode<T> tmp = _first;
		int counter = i;
		while ( counter > 0 ) {
			tmp = tmp.getNext();
			counter --;
		}
		return tmp.getCargo();
    }  

    /*---------------------------------------
      precond: DLLDeque is created
      postcond: adds DLLNode to front of DLLDeque
      ---------------------------------------*/
    public void addFirst(T value) {//O(1)
	DLLNode<T> newNode = new DLLNode<T>(value , null , null); 
	if (isEmpty()) {
	    _first = newNode;
	    _last = newNode;
	}
	else {
	    newNode.setNext(_first);
	    _first.setPrev(newNode);
	    _first = newNode;
	}
	_size++;
    }//end addFirst()
    
    /*---------------------------------------
      precond: DLLDeque is created
      postcond: removes first element in DLLDeque
      if DLLDeque is empty, throw exception
      ---------------------------------------*/
    public T removeFirst(){//O(1)
    	if (!isEmpty()){
	    T ret = _first.getCargo();
	    _first = _first.getNext();
	    _size--;
	    return ret;
    	}
	else {
	    throw new NoSuchElementException( "Deque is empty!" );
	}
	
    }//end removeFirst()
    
    /*---------------------------------------
      precond: DLLDeque is created
      postcond: Returns first element in DLLDeque
      if DLLDeque is empty, throw exception
      ---------------------------------------*/
    public T getFirst(){//O(1)
    	if (isEmpty()){
	    throw new NoSuchElementException( "Deque is empty!" );
    	}
    	return _first.getCargo();
    }//end getFirst()

    /*---------------------------------------
      precond: DLLDeque is created
      postcond: adds DLLNode to end of DLLDeque
      ---------------------------------------*/
    public void addLast(T value) {//O(1)
	DLLNode<T> newNode = new DLLNode<T>(value , null , null);
	if (isEmpty()) {
	    _first = newNode;
	    _last = newNode;
	}
	else {
	    newNode.setPrev(_last);
	    _last.setNext(newNode);
	    _last = newNode;
	}
	_size++;
    }//end addLast()
	
    /*---------------------------------------
      precond: DLLDeque is created
      postcond: removes last element in DLLDeque
      if DLLDeque is empty, throw exception
      ---------------------------------------*/
    public T removeLast(){//O(1)
    	if (!isEmpty()){
	    T ret = _last.getCargo();
	    _last = _last.getPrev();
	    _size--;
	    return ret;
    	}
	else {
	    throw new NoSuchElementException( "Deque is empty!" );
	}
    }//end removeLast()
	
    /*---------------------------------------
      precond: DLLDeque is created
      postcond: Returns Last element in DLLDeque
      if DLLDeque is empty, throw exception
      ---------------------------------------*/
    public T getLast(){//O(1)
    	if (isEmpty()){
	    throw new NoSuchElementException( "Deque is empty!" );
    	}
    	return _last.getCargo();
    }//end getLast()

    /**=============================================================
       ============================================================**/

    /*---------------------------------------
      precond: DLLDeque is created
      postcond: adds DLLNode to front of DLLDeque
      ---------------------------------------*/
    public void offerFirst(T value) {//O(1)
	DLLNode<T> newNode = new DLLNode<T>(value , null , null); 
	if (isEmpty()) {
	    _first = newNode;
	    _last = newNode;
	}
	else {
	    newNode.setNext(_first);
	    _first.setPrev(newNode);
	    _first = newNode;
	}
	_size++;
    }//end offerFirst()

    /*---------------------------------------
      precond: DLLDeque is created
      postcond: removes first element in DLLDeque
      if DLLDeque is empty, return null
      ---------------------------------------*/
    public T pollFirst(){//O(1)
    	if (!isEmpty()){
	    T ret = _first.getCargo();
	    _first = _first.getNext();
	    _size--;
	    return ret;
    	}
	else {
	    return null;
	}
	
    }//end pollFirst()

    /*---------------------------------------
      precond: DLLDeque is created
      postcond: Returns first element in DLLDeque
      if DLLDeque is empty, return null
      ---------------------------------------*/
    public T peekFirst(){//O(1)
    	if (isEmpty()){
	    return null;
    	}
    	return _first.getCargo();
    }//end peekFirst()

    /*---------------------------------------
      precond: DLLDeque is created
      postcond: adds DLLNode to end of DLLDeque
      ---------------------------------------*/
    public void offerLast(T value) {//O(1)
	DLLNode<T> newNode = new DLLNode<T>(value , null , null);
	if (isEmpty()) {
	    _first = newNode;
	    _last = newNode;
	}
	else {
	    newNode.setPrev(_last);
	    _last.setNext(newNode);
	    _last = newNode;
	}
	_size++;
    }//end offerLast()

    /*---------------------------------------
      precond: DLLDeque is created
      postcond: removes last element in DLLDeque
      if DLLDeque is empty, return null
      ---------------------------------------*/
    public T pollLast(){//O(1)
    	if (!isEmpty()){
	    T ret = _last.getCargo();
	    _last = _last.getPrev();
	    _size--;
	    return ret;
    	}
	else {
	    return null;
	}
    }//end pollLast()

    /*---------------------------------------
      precond: DLLDeque is created
      postcond: Returns Last element in DLLDeque
      if DLLDeque is empty, return null
      ---------------------------------------*/
    public T peekLast(){//O(1)
    	if (isEmpty()){
	    return null;
    	}
    	return _last.getCargo();
    }//end peekLast()

    //--v------------H E L P E R-----M E T H O D S------------v--

    /*---------------------------------------
      precond: DLLDeque is created
      postcond: Returns true if DLLDeque is empty, false otherwise
      ---------------------------------------*/
    public boolean isEmpty(){//O(1)
    	return _size == 0;
    }//end isEmpty()

    /*---------------------------------------
      precond: DLLDeque is created
      postcond: Returns String of DLLNodes in DLLDeque separated by spaces
      ---------------------------------------*/
    public String toString() {//O(n)
	String foo = "";
	DLLNode<T> tmp = _first;
	int counter = _size;
	while ( counter > 0 ) {
	    foo += tmp.getCargo() + " ";
	    tmp = tmp.getNext();
	    counter --;
	}
	return foo;
    }//end toString()

    //--^------------H E L P E R-----M E T H O D S------------^--

    //main method for testing
    public static void main(String[] args) {
	DLLDeque<String> deeznuts = new DLLDeque<String>();
	
	deeznuts.addLast("banana");
	deeznuts.addLast("pear");
	deeznuts.addLast("cherry");
	deeznuts.addLast("lychee");
	System.out.println("DLLDeque: " + deeznuts);

	System.out.println(deeznuts.atIndex(3));
	/*--------------------- test remove ------------------------	
	System.out.println(deeznuts.contains("lychee"));
	System.out.println(deeznuts.contains("apple"));		
	

	System.out.println("removed: " + deeznuts.removeLast()); // lychee
	System.out.println("DLLDeque: " + deeznuts);
	System.out.println("removed: " + deeznuts.removeLast()); // cherry
	System.out.println("DLLDeque: " + deeznuts);
	System.out.println("removed: " + deeznuts.removeLast()); // pear
	System.out.println("DLLDeque: " + deeznuts);
	System.out.println("removed: " + deeznuts.removeLast()); // banana
	System.out.println("DLLDeque: " + deeznuts);
	System.out.println("removed: " + deeznuts.removeLast()); // null
	System.out.println("DLLDeque: " + deeznuts);
	
	  ----------------------------------------------------------*/

	//test get
	//System.out.println("getFirst: " + deeznuts.getLast()); //lychee

    }//end main method
       
}//end DLLDeque
