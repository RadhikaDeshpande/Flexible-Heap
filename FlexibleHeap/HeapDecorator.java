package FlexibleHeap;

import java.util.Iterator;

/* Decorator for Heap */

abstract class HeapDecorator implements ICollection {

    protected ICollection collection;

    public HeapDecorator(ICollection collection) {

        this.collection = collection;

    }

    @Override

    public String toString() {

        return collection.toString();

    }

    public String[] toArray() {

        return collection.toArray();

    }

    public Iterator<String> iterator() {

        return collection.iterator();

    }

}