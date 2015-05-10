package FlexibleHeap;

import java.util.Iterator;

/* Concrete Iterator for Heap to traverse in inorder */

class HeapIterator implements Iterator<String> {

    private Node currentNode = new NullNode();

    public HeapIterator(Node root) {

        currentNode = root;

        if (currentNode.isNull())

            while (!currentNode.getLeft().isNull());

    }

    public boolean hasNext() {

        return !currentNode.isNull();

    }

/* In order Traversal to fetch the next element in the heap */

    public String next() {

        Node r = currentNode;

/* if you can walk right, walk right, then fully left. */

/* otherwise, walk up until you come from left. */

        if (!currentNode.getRight().isNull()) {

            currentNode = currentNode.getRight();
            while (!currentNode.getLeft().isNull())
            currentNode = currentNode.getLeft();

        }
        else

        while (true) {

            if (currentNode.getParentNode().isNull()) {

                currentNode = new NullNode();

                return r.getValue();

            }

            if (currentNode.getParentNode().getLeft() == currentNode) {

                currentNode = currentNode.getParentNode();

                return r.getValue();

            }

            currentNode = currentNode.getParentNode();

        }

        return r.getValue();

    }

    @Override

    public void remove() {

// TODO Auto-generated method stub

    }

}

