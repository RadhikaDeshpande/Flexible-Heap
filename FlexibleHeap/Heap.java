package FlexibleHeap;

import java.util.AbstractCollection;

import java.util.Iterator;

/* Context for Strategy pattern and Concrete Component for the decorator pattern */

public class Heap extends AbstractCollection<String> implements IContainer {

    IContainer container;

/* sets the strategy */

    public void setContainer(IContainer container) {

        this.container = container;

    }

    public IContainer getContainer() {

        return container;

    }

    public boolean add(String value) {

/* calls respective add method based on the strategy */

        return container.add(value);

    }

    public String toString() {

/* calls respective toString method based on the strategy */

        return container.toString();

    }

    @Override

    public Iterator<String> iterator() {

/* calls respective iterator method based on the strategy */

        return container.iterator();

    }

    @Override

    public String[] toArray() {

/* calls respective toArray method based on the strategy */

        return container.toArray();

    }

    public static void main(String[] args) {

        Heap heap1 = new Heap();

        Heap heap2 = new Heap();

/* sets the strategy to minheap */

        heap1.setContainer(new MinHeap());

/* sets the strategy to maxheap */

        heap2.setContainer(new MaxHeap());



/* Based on the strategy of heap elements are now added to minheap */

        heap1.add("adding");

        heap1.add("sneezing");

        heap1.add("bowling");

        heap1.add("coding");

        heap1.add("object");

/* minheap's toString is called */

        String str = heap1.toString();

        System.out.println(str);

/* minheap's size is called */

        System.out.println(heap1.size());

/* minheap's toArray is called */

        for (String str1 : heap1.toArray()) {

            System.out.println(str1);

        }

/* applies IngFilter Iteration on minheap nodes */

        IngFilter c = new IngFilter(heap1.iterator());

        while (c.hasNext()) {

            System.out.println(c.next());

        }

/*

 * applies IngDecorator to minheap and iterates through it in inorder

 * for the next "ing" string

 */

        IngDecorator d = new IngDecorator(heap1);

        System.out.println(d.toString());

        Iterator<String> i = d.iterator();

        while (i.hasNext()) {

            System.out.println(i.next());

        }

/*

 * Iterates over the minheap to get the next element in inorder

 * traversal

 */

        Iterator<String> itr = heap1.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());

        }

/* Elements are added to maxheap */

        heap2.add("golding");

        heap2.add("pooding");

        heap2.add("kidding");

        heap2.add("fitting");

        heap2.add("abject");

/* calls maxheap's toString */

        String str1 = heap2.toString();

        System.out.println(str1);




/* sets the strategy */

        heap1.setContainer(new MaxHeap());

        heap2.setContainer(new MinHeap());

        heap1.add("creaming");

        heap2.add("whipping");

/* calls the maxheap's toArray */

        for (String str2 : heap1.toArray()) {
            System.out.println(str2);

        }

    }

    @Override

    public int size() {

        return this.toArray().length;

    }

}




