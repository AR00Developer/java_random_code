package datastructures.stacks;

import java.util.Stack;

public class BalancedBrackets 
{

	public static void main(String[] args)
	{
		assert isBalanced("[()]{}{[()()]()}");
		assert !isBalanced("[(])");
	}

	public static boolean isBalanced(String brackets)
	{
		if(brackets == null)
		{
			throw new IllegalArgumentException("brackets is null");
		}

		Stack<Character> bracketStack = new Stack<>();
		for(char bracket : brackets.toCharArray())
		{
			switch(bracket)
			{
				case '(':
				case '[':
				case '{':
					bracketStack.push(bracket);
					break;

				case ')':
				case ']':
				case '}':
					if(bracketStack.isEmpty() || !isPaired(bracketStack.pop(), bracket()))
					{
						return false;
					}
					break;
				default: 
					return false;
			}
		}
		return bracketsStack.isEmpty();
	}

	public static boolean isPaired(char leftBracket, char rightBracket)
	{
		char[][] pairedBrackets = 
		{
			{'(',')'},
			{'[',']'},
			{'{','}'},
			{'<','>'},
		};
		for(char[] pairedBracket : pairedBrackets)
		{
			if(pairedBracket[0] == leftBracket && pairedBracket[1] == rightBracket)
			{
				return true;
			}
		}
		return false;
	}
	 /* Author @Akshay Sharma - https://github.com/TheAlgorithms */  
}