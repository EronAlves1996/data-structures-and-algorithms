* Is a tree where each node has 0-2 children
* If a node has no children, it's called a `leaf` node;
* Is ordered
* Proper/full Binary Tree: each node has either zero or two children. If some node has 1 children, it is improper
* Decision trees is an example of proper binary tree

### ADT

* left
* right
* sibling

### Properties

* For every level, it has 2^L nodes.

### Array representation

* For p is root of T, then f(p) = 0
* If p is the left position of q, then f(p) = 2f(q) + 1
* If p is the right child of positionq, then f(p) = 2f(q) + 2

Its known as level numbering. With it, it suggests an array based structure of the tree. 
The advantage is that a position, can be represented by an integer.