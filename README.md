# E-S-P

### Method Selections
#### isEmpty()
Helper method to check if the Deque is empty.
#### addFirst(T value)
Adds a new DLLNode to the front of the Deque.
#### removeFirst()
Removes the first DLLNode of the Deque and returns the value of removed DLLNode.
Throws NoSuchElementException if the Deque is empty.
#### getFirst()
Returns the value of the first DLLNode.
Throws NoSuchElementException if the Deque is empty.
#### addLast(T value)
Adds a new DLLNode at the end of the Deque.
#### removeLast()
Removes the last DLLNode of the Deque and returns the value of teh removed DLLNode. 
Throws NoSuchElementException if the Deque is empty.
#### getLast()
Returns last element in Deque.
Throws NoSuchElementException if the Deque is empty.
#### toString()
Allows Deque values to be printed out, separated by spaces

### Doubly Linked Node as underlying container
We chose a doubly lined node as the underlying container for the Deque class. Using DLLNodes, adding and removing nodes at the end and at the beginning of the Deque is simple. Additonally, all of our methods have a runtime of O(1), except the two string, making this DLLDeque more efficient than and ALDeque or ArrayDeque, which would use O(n) methods to add or remove elements to the list. 
