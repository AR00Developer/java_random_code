import java.util.Scanner; 

class Factorial 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in); 
		int i, factorial, inputNumber; 
		factorial = 1; 

		System.out.println("Enter an integer to calculte its factorial"); 
		inputNumber = in.nextInt(); 

		if( inputNumber < 0 )
		{
			System.out.println("Number should be non-negative.");
		}
		else
		{
			for( i = 1; i <= inputNumber ; i++)
			{
				factorial = factorial * i ; 
			}
		}

		System.out.println("Factorial of " + inputNumber + " is = " + factorial); 
	}
	
}