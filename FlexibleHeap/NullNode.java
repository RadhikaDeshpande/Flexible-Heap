package FlexibleHeap;

/* Null Operation for Null Object Pattern */

class NullNode extends Node {

    @Override

    public void parse(String value, String type) {

// TODO Auto-generated method stub

    }

    @Override

    public boolean isNull() {

        return true;

    }

    @Override

    protected String[] toArray() {

        return null;

    }

}