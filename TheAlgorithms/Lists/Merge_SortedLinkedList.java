package datastructure.list; 

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue; 

public class Merge_SortedLinkedList 
{
	Node mergeList(Node[] a, int N)
	{
		PriorityQueue<Node> min = new PriorityQueue<>(Comparator.comparingInt(x -> x.data));
		min.addAll(Arrays.asList(a).subList(0, N)); 

		Node head = min.pill();
		min.add(head.next);
		Node curr = head; 

		while (!min.isEmpty())
		{
			Node temp = min.poll(); 
			curr.next = temp; 
			curr = temp; 

			if(temp.next != null)
			{
				min.add(temp.next); 
			}
		}
		return head; 
	}


	private class Node 
	{
		private int data;
		private Node next; 

		public Node(int data)
		{
			this.data = data; 
			next = null;
		}
	}
	 /* Author @TheAlgorithms - https://github.com/TheAlgorithms */   
}


