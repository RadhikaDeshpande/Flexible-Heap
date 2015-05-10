package FlexibleHeap;

import java.util.Iterator;

/* Concrete Strategy for Heap */

class MaxHeap implements IContainer {

    private Node root = new NullNode();

    public boolean add(String value) {

        String tempValue;

        if (root.isNull()) {

        } else if (value.compareTo(root.getValue()) > 0) {

            root = new BinaryNode(value);

            tempValue = root.getValue();

            root.setValue(value);

            add(tempValue);



        } else {
            root.parse(value, "MAXHEAP");

        }

        return true;

    }

    public String toString() {

        return root.toString();

    }

    @Override

    public Iterator<String> iterator() {

        return new HeapIterator(this.root);

    }

    @Override

    public String[] toArray() {

        return root.toArray();

    }

}
