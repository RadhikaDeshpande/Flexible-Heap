package FlexibleHeap;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class HeapTest

{

    @Test

/*test with respect to earlier assignment*/

/*preorder traversal of heap*/

    public void testOldMinHeapToString()

    {

        MinHeap min1= new MinHeap();

        min1.add("adding");

        min1.add("sneezing");

        min1.add("bowling");

        min1.add("coding");

        min1.add("object");

        assertEquals(min1.toString(),"adding coding sneezing object bowling");

    }

/*test with respect to earlier assignment*/

/*preorder traversal of ing nodes of heap*/

    public void testOldMinHeapIngToString()

    {

        MinHeap min2= new MinHeap();

        min2.add("adding");

        min2.add("sneezing");

        min2.add("bowling");

        min2.add("coding");

        min2.add("object");

        assertEquals(min2.toString(),"adding coding sneezing bowling");

    }

    @Test

    public void testMinHeapAdd()

    {

        Heap min= new Heap();

        min.setContainer(new MinHeap());

        assertEquals(min.add("adding"),true);

    }



    @Test

/*inorder traversal of minheap returns an inordered traversed String*/

    public void testMinHeapToString()

    {

        Heap min= new Heap();

        min.setContainer(new MinHeap());

        min.add("adding");

        min.add("sneezing");

        min.add("bowling");

        min.add("coding");

        min.add("object");

        assertEquals(min.toString(),"sneezing coding object adding bowling");

    }

    @Test

/*inorder traversal of minheap returns inorder Array of elements*/

    public void testMinHeapToArray()

    {

        Heap min= new Heap();

        min.setContainer(new MinHeap());

        min.add("adding");

        min.add("sneezing");

        min.add("bowling");

        min.add("coding");

        min.add("object");

        String [] expectedMinArray ={ "sneezing","coding","object","adding","bowling"};

        assertArrayEquals(expectedMinArray,min.toArray());

    }

    @Test

/*inorder heapiterator for minheap*/

    public void testMinHeapIterator()

    {

        Heap min= new Heap();

        min.setContainer(new MinHeap());

        min.add("adding");

        min.add("sneezing");

        min.add("bowling");

        min.add("coding");

        min.add("object");

        Iterator<String>itr = min.iterator();

        assertTrue(itr.hasNext());

        assertEquals(itr.next(),"sneezing");

        assertTrue(itr.hasNext());

        assertEquals(itr.next(),"coding");

        assertTrue(itr.hasNext());

        assertEquals(itr.next(),"object");

        assertTrue(itr.hasNext());

        assertEquals(itr.next(),"adding");

        assertTrue(itr.hasNext());

        assertEquals(itr.next(),"bowling");

        assertFalse(itr.hasNext());

    }



    @Test

    public void testMaxHeapAdd()

    {

        Heap max= new Heap();

        max.setContainer(new MaxHeap());

        assertEquals(max.add("adding"),true);

    }

    @Test

/*inorder traversal of maxheap which returns String*/

    public void testMaxHeapToString()

    {

        Heap max= new Heap();

        max.setContainer(new MaxHeap());

        max.add("adding");

        max.add("sneezing");

        max.add("bowling");

        max.add("coding");

        max.add("object");

        assertEquals(max.toString(),"adding object coding sneezing bowling ");

    }

    @Test

/*inorder traversal of maxheap which returns inorder Array of elements*/

    public void testMaxHeapToArray()

    {

        Heap max= new Heap();

        max.setContainer(new MaxHeap());

        max.add("adding");

        max.add("sneezing");

        max.add("bowling");

        max.add("coding");

        max.add("object");

        String [] expectedMaxArray ={"adding","object","coding","sneezing","bowling"};

        assertArrayEquals(expectedMaxArray,max.toArray());

    }

    @Test

/*inorder heap iterator for maxheap*/

    public void testMaxHeapIterator()

    {

        Heap max= new Heap();

        max.setContainer(new MaxHeap());

        max.add("adding");

        max.add("sneezing");

        max.add("bowling");

        max.add("coding");

        max.add("object");

        Iterator<String>itr = max.iterator();

        assertTrue(itr.hasNext());

        assertEquals(itr.next(),"adding");

        assertTrue(itr.hasNext());




        assertEquals(itr.next(),"object");

        assertTrue(itr.hasNext());

        assertEquals(itr.next(),"coding");

        assertTrue(itr.hasNext());

        assertEquals(itr.next(),"sneezing");

        assertTrue(itr.hasNext());

        assertEquals(itr.next(),"bowling");

        assertFalse(itr.hasNext());

    }

    @Test

    public void testIngFilter()

    {

        Heap min= new Heap();

        min.setContainer(new MinHeap());

        min.add("adding");

        min.add("sneezing");

        min.add("bowling");

        min.add("coding");

        min.add("object");

        min.add("special");

        IngFilter ingfilter = new IngFilter(min.iterator());

        assertTrue(ingfilter.hasNext());

        assertEquals(ingfilter.next(),"sneezing");

        assertTrue(ingfilter.hasNext());

        assertEquals(ingfilter.next(),"coding");

        assertTrue(ingfilter.hasNext());

        assertEquals(ingfilter.next(),"adding");

        assertTrue(ingfilter.hasNext());

        assertEquals(ingfilter.next(),"bowling");

        assertFalse(ingfilter.hasNext());

    }

    @Test

    public void testIngDecoratorToString()

    {

        Heap min= new Heap();

        min.setContainer(new MinHeap());

        min.add("adding");

        min.add("sneezing");

        min.add("bowling");

        min.add("coding");

        min.add("object");

        min.add("special");

        IngDecorator d = new IngDecorator(min);

        assertEquals(d.toString(),"sneezing coding adding bowling");

    }

    @Test

    public void testIngDecoratorToArray()

    {

        Heap min= new Heap();

        min.setContainer(new MinHeap());

        min.add("adding");

        min.add("sneezing");

        min.add("bowling");

        min.add("coding");

        min.add("object");

        min.add("special");

        IngDecorator d = new IngDecorator(min);

        String [] expectedMinArray ={"sneezing","coding","adding","bowling"};

        assertArrayEquals(d.toArray(),expectedMinArray);

    }

    @Test

    public void testIngDecoratorIterator()

    {

        Heap min= new Heap();

        min.setContainer(new MinHeap());

        min.add("adding");

        min.add("sneezing");

        min.add("bowling");

        min.add("coding");

        min.add("object");

        min.add("special");

        IngDecorator d = new IngDecorator(min);

        Iterator<String> itr = d.iterator();

        assertTrue(itr.hasNext());

        assertEquals(itr.next(),"sneezing");

        assertTrue(itr.hasNext());

        assertEquals(itr.next(),"coding");

        assertTrue(itr.hasNext());

        assertEquals(itr.next(),"adding");

        assertTrue(itr.hasNext());

        assertEquals(itr.next(),"bowling");

        assertFalse(itr.hasNext());

    }

}