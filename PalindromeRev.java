import java.util.*; 

class PalindromeRev 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in); 
		int i, begin, end, middle;
		String inputString; 

		System.out.println("Input a string");
		inputString = in.nextLine(); 

		int length = inputString.length(); 

		begin = 0; 
		end = length -1; 
		middle = (beggin + end)/2; 

		for( i = begin ; i <= middle; i++)
		{
			if(inputString.charAt(begin) ==  inputString.charAt(end))
			{
				begin++;
				end--;
			}
			else
			{
				break;
			}
			if( i == middle + 1)
			{
				System.out.println("Palindrome");
			}
			else 
			{
				System.out.println("Not a Palindrome");
			}
		}
	}
	
}
