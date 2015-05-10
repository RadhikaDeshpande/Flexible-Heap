# Flexible-Heap
GOAL :

Heap is to expected to have the following functionality:
1. Add strings to your min-heap. 
2. Print out the values in the heap in preorder (root, the left sub-heap, right sub-heap).
3. Print out the strings that end in "ing" in the heap in preorder.
   Don't store the heap in an array or vector like structure. Do not convert the heap into an array
    or vector like structure to traverse the heap.

4.To implement strategy pattern to allow your heap to be either a min heap or a max heap.
5.Implement an iterator for your heap. Using an in-order traversal will be easier than preorder
or post-order. Don't covert your heap to an array or other collection to implement your
iterator.
6.Use the null object pattern to remove null checks when finding the height of the heap.

7.Implement what we will for now will call IngFilter. Using Java syntax the class will have the
methods given below. People using other languages may need to implement different
methods to conform to their language's conventions.
IngFilter(Iterator input) - constructor
boolean hasNext() - returns true if the iteration has more elements that end in "ing".
next() - returns the next element in the iteration that ends in "ing".

8.Create a decorator class IngHeapDecorator that decorates your new Heap class. The
decorator modifies the toString, toArray and iterator methods to return just elements ending
in "ing.

GROUND RULES:
Min Heap Construction Rules:
A min-heap is a heap in which the root has the smallest value in the heap.
Normally one would implement a heap using an array. In this project pointers are used, not an array. 
In our min-heap each node has a value and 0, 1 or 2 children heaps. The root node of a minheap
contains the smallest value in the heap. If you pick any node in the heap it has a value
that is equal to or less than all the nodes in either the left or right sub-heaps of the node. 
To add a new value to the heap add it to the top of the heap.
If the heap is empty the new value becomes the root. If heap is not empty then the smaller of
the two values (current value in heap and the new value) is kept in the root. The larger of the
two values is added the sub-heap with the smallest height. If both sub-heaps have the same
height then the larger of the two values is added to the left heap. The process is repeated until
a value is added to a new node at the bottom of the heap. 

Max Heap Construction:
It is same as phase1 except that the root element will have the largest value and any incoming element 
is checked if its greater than or equal to root and then moved to subnodes accordingly.

