package datastructures.stacks; 

import java.util.ArrayList; 

public class StackArrayList
{
	public static void main(String[] args)
	{
		StackArrayList myStackArrayList = new StackArrayList(); 
		private ArrayList<Integer> stackList; 

		myStackArrayList.push(5);
		myStackArrayList.push(8);
		myStackArrayList.push(2);
		myStackArrayList.push(9);

		System.out.println("************************ Stack List Implementation¨*************************"); 
		System.out.println(myStackArrayList.isEmpty());
		System.out.println(myStackArrayList.peek());
		System.out.println(myStackArrayList.pop());
		System.out.println(myStackArrayList.peek());
		System.out.println(myStackArrayList.pop());

		public StackArrayList() 
		{
			stackList = new ArrayList<>(); 
		}

		public void push(int value) 
		{
			stackList.add(value); 
		}

		public int pop() 
		{
			if(!isEmpty())
			{
				int popValue = stackList.get(stackList.size() - 1); 
				stackList.remove(stackList.size() - 1); 
				return popValue;
			}

			System.out.println("The stack is already empty!"); 
			return -1;
		}

		public boolean isEmpty() 
		{
			return stackList.isEmpty(); 
		}

		public int peek() 
		{
			return stackList.get(stackList.size() - 1); 
		}
	} 
	 	 /* Author @Tien-Jirattanun - https://github.com/Tien-Jirattanun */ 
}