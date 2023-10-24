A list that uses a position to refer to other variables. So, we don't use index to find nothing, but a relative location of some item to find another items.

Best implemented using a double linked list, but nodes, are, in fact, positions (a new data type below). Can be implemented with array too.

### ADT Position
* getElement -> returns the element stored at this position

## ADT

Positional List as collection of positions

* first
* last
* before(p)
* after(p)
* isEmpty
* size
* addFirst
* addLast
* addBefore
* addAfter
* set
* remove