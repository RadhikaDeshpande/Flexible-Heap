package FlexibleHeap;

import java.util.Iterator;

/* Concrete Iterator for heap to fetch strings ending with "ing" in inorder */

class IngFilter implements Iterator<String> {

    Iterator<String> itr;

    public IngFilter(Iterator<String> input) {

        this.itr = input;

    }

    @Override

    public boolean hasNext() {

        return itr.hasNext();

    }

    @Override

    public String next() {

        while (itr.hasNext()) {

            String nextStr = itr.next();

            if (nextStr.endsWith("ing")) {

                return nextStr;

            }

        }

        return null;

    }

    @Override

    public void remove() {

// TODO Auto-generated method stub

    }

}