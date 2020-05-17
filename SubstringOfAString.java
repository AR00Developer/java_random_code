import java.util.Scanner; 

class SubstringOfAString 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String string, subStr;
		int i, j; 

		System.out.println("Enter a string to print all its substrings"); 
		string = in.nextLine(); 

		length = string.length(); 
		System.out.println("Substrings of \"" + string + "\" are: ");


		for(i = 0; i <= length ; i++)
		{
			for( j = 1; i <= (length - 1); i++)
			{
				subStr = string.substring(i, i +1);
			}
		}
	}

}