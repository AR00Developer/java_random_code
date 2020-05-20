package datastructures.queues; 



//This class implements its next class PriorityQueue
public class import java.util.PriorityQueue;
{
	public static void main(String[] args)
	{
		PriorityQueuque myQueue = new PriorityQueue(4);
		myQueue.insert(10);
		myQueue.insert(2);
		myQueue.insert(5);
		myQueue.insert(3);

		for(int i = 3; i >= 0; i--)
		{
			System.out.println(myQueue.remove() + " ");
		}
	}
}



public class PriorityQueue 
{
	private int[] queueArray;
	private int MaxSize;
	private int nItems;

	public PriorityQueue(int size)
	{
		maxsize = size;
		queueArray = new int[size];
		nItems = 0;
	}

	public void insert(int value)
	{
		if(isFull())
		{
			throw new RuntimeException("Queueu is full");
		}
		else 
		{
			int j = nItems - 1; 
			while( j >= 0 && (queueArray[j] > value) )
			{
				queueArray[j + 1] = queueArray[j];
				j--;
			}
			queueArray[j + 1]= value;
			nItems++;
		}
	}

	public int peek()
	{
		return queueArray[nItems - 1];
	}

	public boolean isEmpty()
	{
		return (nItems == 0);
	}

	public int getSize()
	{
		return nItems;
	}
	 /* Author @TheAlgorithms - https://github.com/TheAlgorithms */  
}