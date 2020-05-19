package datastructures.stacks; 

public class NodeStack<Item> 
{
	private static NodeStack<?> head;
	private NodeStack<?> previous;
	private static int size = 0;
	private NodeStack<?> next; 
	private Item data;

	public NodeStack(){}
	
	public NodeStack(Item item)
	{
		this.data = item; 
	}

	public static void main(String[] args)
	{
		NodeStack<Integer> Stack = new NodeStack<Integer>();

		Stack.push(3); 
		Stack.push(4); 
		Stack.push(5);
		System.out.println("Testing");
		Stack.print(); 

		Integer x = Stack.pop(); 
		Stack.push(1);
		Stack.push(8);
		Integer y = Stack.peek(); 
		System.out.println("Testing : ");
		Stack.print(); 

		System.out.println("Testing :");
		System.out.println("Value of :" + x);
		System.out.println("Value of :" + y);
	}

	private void push(Item item)
	{
		NodeStack<Item> newNs = new NodeStack<Item>(item);

		if(this.isEmpty())
		{
			NodeStack.setHead(new NodeStack<>(item));
			newNs.setNext(null);
			newNs.setPrevious(null);
		}
		else 
		{
			newNs.setPrevious(NodeStack.head); 
			NodeStack.head.setNext(newNs);
			NodeStack.head = newNs;
		}

		NodeStack.setSize(NodeStack.getSize() + 1);
	}

	public Item pop() 
	{
		
	}
}