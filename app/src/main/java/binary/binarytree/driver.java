package binary.binarytree;

public class Driver
{
    public static void main(String[] args)
    {
        Node n = new Node(7);
        MainActivity theTree = new MainActivity(n);
        theTree.addNode(n, 8);
        theTree.addNode(n, 9);
        theTree.addNode(n, 4);
        theTree.addNode(n, 3);
        theTree.display(n);
    }
}