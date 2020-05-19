package datastructures.stacks; 

import java.util.NoSuchElementException; 

public class StackOfLinkedList 
{
	public static void main(String[] args)
	{
		LinkedListStack stack = new LinkedListStack(); 
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		System.out.println(stack); 
		System.out.println("Size of stack currently is: " + stack.getSize());

		assert stack.pop() == 5; 
		assert stack.pop() == 4;
		
		System.out.println("Top element of stack currently is: " + stack.peek()); 
			
	}
}


public class Node 
{
	public int data; 
	public Node next; 

	public Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

public LinkedListStack 
{
	private int size;
	Node head; 
	
	public LinkedListStack()
	{
		head = null; 
		size = 0; 
	}

	//Adds elements at the top
	public boolean push(int num) 
	{
		Node newNode = new Node(num);
		newNode.next = head; 
		head = newNode; 
		size++; 
		return true; 	
	}

	//Pop element at the top of the stack
	public int pop() 
	{
		Node erased = head; 
		head = head.next;
		int headValDep = erased.data;
		erased = null; 
		size--; 
		return headValDep;
	}

	@Override 
	public String toString() 
	{
		Node cur = head; 
		StringBuilder builder = new StringBuilder(); 
		while( cur != null)
		{
			builder.append(cur.data).append("->");
			cur = cur.next; 
		}
		return builder.replace(builder.length() - 2, builder.length(), "").toString();
	}

	public boolean isEmpty() 
	{
		return size == 0; 
	}

	public in getSize() 
	{
		return size;
	}
 
	 	 /* Author @Varun Upadhyay - https://github.com/TheAlgorithms */ 
}








