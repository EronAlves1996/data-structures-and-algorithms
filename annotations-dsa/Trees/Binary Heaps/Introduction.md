It's a complete binary tree where each node is smaller or higher (depends if it's a min heap or a max heap) than its children. The root is the minimum/maximum value.

Both operations bellow take O(log n) time

##### Insert

Insert on bottom and fix the tree (heapify)

##### Extract the min/max element

It's always the root node on min/max heap.
To extract, remove and swap it with the last element on heap and swap in a way until the heap property is restored