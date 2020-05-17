import java.util.Scanner; 

/**
*	Some primitives types has their own 'Wrapper Class' this allows to them being manipulated as an object 
*	with their methods from their parent upper Class. 
*	In this case String doesn't have a wrapper class nor a primitive type. Instead it's
*	manipulated as an object by default and this it's because we often need to manipulate
*	string values with certain actions and to avoid the constant necessity to create an object from the wrapper class
*	String was implemented this way. Sorry for the long explanation maybe for some it could be useful.
*/

class CompareStrings 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in); 
		String str1, str2; 

		System.out.prinln("Enter the first String");
		str1 = in.nextLine(); 

		System.out.println("Enter the second String"); 
		str2 = in.nextLine(); 

		//Some methods are obtained from the parent class, in this case CompareTo it's obtained from String class
		if(str1.compareTo(str2) == 0)
		{
			System.out.println("The first String is greater than the second.")
		}
		else if(str1.compareTo(s2) < 0) 
		{
			System.out.println("The first String is smaller than the second.")
		}
		else 
		{
			System.out.println("Both the strings are equal.");
		}
	}

}