# Team  E-S-P (period 1)
Kevin Bao,
Jackie Woo,
Max Chan

#### Since a Deque is a double-ended Queue, we decided that the most crucial methods to implement were methods that functioned in the front and end of a linear collection called Deque. Thus, we implemented accessors and mutators that specifically function with the first and last elements of a Deque. In addition, it is important to check for an element's presence in the Deque, and the value of an element located at a certain index. Thus, we also implemented intra-Deque accessors (accessors that access elements not necessarily located at the first or last indices).  
### Method Selections
#### boolean isEmpty() O(1)
<t>Helper method to check if the Deque is empty.
#### void addFirst(T value) O(1)
<t>Adds a new DLLNode to the front of the Deque.
#### void offerFirst(T value) O(1)
<t>Adds a new DLLNode to the front of the Deque.
#### T removeFirst() O(1)
<t>Removes the first DLLNode of the Deque and returns the value of the removed DLLNode.
Throws NoSuchElementException if the Deque is empty.
#### T pollFirst() O(1)
<t>REmoves the first DLLNode of the Deque and returns the value of the removed DLLNode. Returns null if the Deque is empty.
#### T getFirst() O(1)
<t>Returns the value of the first DLLNode in the Deque.
Throws NoSuchElementException if the Deque is empty.
#### T peekFirst() O(1)
<t> returns the value of the first DLLNode in the Deque. Returns null if Deque is empty
#### void addLast(T value) O(1)
<t>Adds a new DLLNode at the end of the Deque.
#### void offerLast(T value) O(1)
<t>Adds a new DLLNode at the end of the Deque.
#### T removeLast() O(1)
<t>Removes the last DLLNode of the Deque and returns the value of the removed DLLNode. 
Throws NoSuchElementException if the Deque is empty.
#### T pollLast() O(1)
<t>Removes the last DLLNode of the Deque and returns the value of the removed DLLNode. Returns null if the Deque is empty.
#### T getLast() O(1)
<t>Returns the value of the last DLLNode in the Deque.
Throws NoSuchElementException if the Deque is empty.
#### T peekLast() O(1)
<t>Returns the value of the last DLLNode in the Deque. Returns null if the Deque is empty.
#### String toString() O(n) 
<t>Returns String containing each node, separated by spaces.  Acts as iterator.
#### boolean contains(T value) O(n)
<t>Checks to see if given T value is in Deque.
#### T atIndex(int i) O(n)
<t>Returns the value of the DLLNode at index i.
Throws IndexOutOfBoundsException if i greater than size or less than 0.

### Doubly Linked Node as underlying container
We chose doubly linked nodes as the underlying container for the Deque class because DLLNodes allow for the most efficient implementation. Only 3 of our methods require traversing, and all of our methods have a runtime of O(1), except for toString(), contains(T value), and atIndex(int i). This makes this DLLDeque more efficient than ALDeque and ArrayDeque, which would require O(n) methods to add or remove (offer or poll)  elements to the Deque from one end.
