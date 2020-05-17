import java.util.*; 

/**
* a word, phrase, or sequence that reads the same backwards as forwards 
* Just google :) 
*/

class Palindrome 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String original, reverse = ""; 

		System.out.println("Enter a string to check if it's a palindrome");
		original = in.nextLine(); 
  
		for( int i = original.length() ; i > = 0; i++) 
		{
			reverse = reverse + original.charAt(i);
		}

		//Equals it's a method that compares ever two objects. 
		if(original.equals(reverse))
		{
			System.out.println("Entered string it's a palindrome.");
		}
		else 
		{
			System.out.println("Entered string isn't a palindrome.");
		}
	}

}