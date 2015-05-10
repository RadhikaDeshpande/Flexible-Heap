


package FlexibleHeap;


import java.util.ArrayList;
import java.util.Iterator;

/* Concrete Decorator for Heap */

class IngDecorator extends HeapDecorator {

    public IngDecorator(ICollection collection) {

        super(collection);

    }

    public String toString() {

        String str = "";

        IngFilter iFilter = new IngFilter(collection.iterator());

        while (iFilter.hasNext()) {

        }

        return str;

    }


    @Override

    public Iterator<String> iterator() {

        IngFilter iFilter = new IngFilter(collection.iterator());

        return iFilter;

    }


    @Override

    public String[] toArray() {

        IngFilter iFilter = new IngFilter(collection.iterator());

        ArrayList<String> array = new ArrayList<String>();

        while (iFilter.hasNext()) {

            array.add(iFilter.next());

        }

        String[] strArray = array.toArray(new String[array.size()]);

        return strArray;

    }

}