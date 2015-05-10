package FlexibleHeap;

import java.util.Iterator;

/* Component for the decorator pattern */

interface ICollection {

    public String toString();

    public String[] toArray();

    public Iterator<String> iterator();

}
