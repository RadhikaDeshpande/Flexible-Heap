package FlexibleHeap;

/* AbstractClass for Null Object Pattern*/

abstract class Node

{

    protected String value;

    protected int subNodes;

    protected Node left;

    protected Node right;

    protected Node parentNode;

    public abstract boolean isNull();

    protected abstract String[] toArray();

    public abstract void parse(String value, String type);

    public String getValue()

    {

        return value;

    }

    public void setValue(String value)

    {

        this.value = value;

    }

    public Node getLeft()

    {

        return left;

    }

    public void setLeft(Node left)

    {

        this.left = left;

    }

    public Node getRight()

    {

        return right;

    }

    public void setRight(Node right)

    {

        this.right = right;

    }

    public Node getParentNode()

    {

        return parentNode;

    }

    public void setParentNode(Node parentNode)

    {

        this.parentNode = parentNode;

    }

    public void setSubNodes(int subNodes)

    {

        this.subNodes = subNodes;

    }

    public int getSubNodes()

    {

        return subNodes;

    }
}
