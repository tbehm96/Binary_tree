import java.util.LinkedList;


public class MainActivity
{
	private Node root;

	public MainActivity(Node n)
	{
		this.root = n;
	}

	public Node getRoot()
	{
		return root;
	}

	public void addNode(int payload)
	{
		addNode(root, payload);
	}

	public Node addNode(Node appendTo, int payload)
	{
		if(appendTo == null)
		{
			//if the node to append to is null then create the Node
			appendTo = new Node(payload);
		}
		else
		{
			if(appendTo.getPayload() <= payload)
			{
				appendTo.setLeftChild(addNode(appendTo.getLeftChild(), payload));
			}
			else
			{
				appendTo.setRightChild(addNode(appendTo.getRightChild(), payload));
			}
		}
		return appendTo;
	}

	public void display(Node n)
	{
		System.out.println(n);
		if(n.getLeftChild() != null)
		{
			this.display(n.getLeftChild());
		}
		if(n.getRightChild() != null)
		{
			this.display(n.getRightChild());
		}

	}

}
