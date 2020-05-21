package datastructures.List; 

public class CircleLinkedList<E> 
{

	private Node<E> head;
	private int size; 

	public CircleLinkedList()
	{
		head = new Node<E>(null, head);
		size = 0;
	}

	private static class Node<E> 
	{
		Node<E> next;
		E value; 

		private Node(E value, Node<E> next)
		{
			this.value = value;
			this.next  = next;
		}
	}

	public int getSize()
	{
		return size; 
	}

	public void append(E value)
	{
		if(value == null)
		{
			throw new NullPointerException("Cannot add null element to the list"); 
		}
		head.next = new Node<E>(value, head); 
		size++;
	}

	public E remove(int pos)
	{
		if(pos > size || pos < 0)
		{
			throw new IndexOutOfBoundsException("position cannot be greater than size or negative");
		}

		Node <E> before  = head; 
		for(int i = 1; i <= pos ; i++)
		{
			before = before.next; 
		}
		Node<E> destroy = before.next;
		E saved = destroy.value; 
		before.next = before.next.next; 
		destroy = null; 
		size--; 

		return saved;
	}
	 /* Author @TheAlgorithms - https://github.com/TheAlgorithms */   	
}