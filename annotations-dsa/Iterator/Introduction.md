* Design pattern that abstracts the process of iterate of a sequence of elements
* Java has java.util.Iterator
	* hasNext
	* next
	* remove -> removes the elemet on last call of next
* We cannot reset the iterator to the beggining
	* We can use java.util.Iterable to return an Iterator from a collection