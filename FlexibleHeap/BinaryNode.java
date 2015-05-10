package FlexibleHeap;



import java.util.ArrayList;

/* Real Operation */

class BinaryNode extends Node {

    public BinaryNode(String value) {

        this.left = new NullNode();

        this.right = new NullNode();

        this.parentNode = new NullNode();

        this.setValue(value);

        this.setSubNodes(0);

    }

    public BinaryNode(String value, BinaryNode parentNode) {

        this.left = new NullNode();

        this.right = new NullNode();

        this.setValue(value);

        this.setSubNodes(0);

        this.setParentNode(parentNode);

// its parents subnode should be incremented to the root.

        this.incrementSubnode();

    }

/* Increments the SubNode count of the parentNode */

    private void incrementSubnode() {

        this.setSubNodes(this.getSubNodes() + 1);

    }

    private boolean compareValue(String value1, String value2, String type) {

        if (value1.compareTo(value2) > 0 && type.compareTo("MAXHEAP") == 0) {
            return true;
        }

        else if (value1.compareTo(value2) < 0 && type.compareTo("MINHEAP") == 0) {
            return true;
        }

        return false;

    }

/* parses the heap based on the type of heap */

    public void parse(String value, String type) {

        String tempValue;

        if (this.left.isNull()) {
            this.left = new BinaryNode(value, this);

        } else if (this.right.isNull()) {
            this.right = new BinaryNode(value, this);

        }











/* To Check left & right subheap have same length */

        else if ((this.getLeft().getSubNodes() / 2) == (this.getRight()

                .getSubNodes() / 2)) {

            if (compareValue(value, this.left.value, type))

            {

                tempValue = this.getLeft().getValue();

                this.getLeft().setValue(value);

                this.left.parse(tempValue, type);

            } else {

                this.left.parse(value, type);

            }

        }

        else if (compareValue(value, this.left.value, type)) {

            tempValue = this.getRight().getValue();

            this.getRight().setValue(value);

            this.right.parse(tempValue, type);

            this.right.parse(value, type);

        } else {

        }

    }

    @Override

    public String toString() {

        HeapIterator itr = new HeapIterator(this);

/* To fetch next Ing strings in the heap remove the comments below */

// HeapIterator heapitr = new HeapIterator(this);

// IngFilter itr = new IngFilter(heapitr);

        String str = "";

        while (itr.hasNext()) {
            str = str + itr.next() + " ";


        }

        return str;

    }

    public String[] toArray() {

        HeapIterator itr = new HeapIterator(this);

        ArrayList<String> array = new ArrayList<String>();

        while (itr.hasNext()) {
            array.add(itr.next());

        }

        String[] strArray = array.toArray(new String[array.size()]);

        return strArray;

    }

    @Override

    public boolean isNull() {

        return false;

    }

}

