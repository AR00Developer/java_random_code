import java.util.Scanner; 

public class ArmstrongNumber
{
	public static void main(String args[])
	{

		Scanner in = new Scanner(System.in);
		int n, sum, temp, remaind, digits; 
		digits = 0;  
		n = 0; 

		System.out.println("Input a number to check if it's an amstrong number"); 
		inputNumb = in.nextInt(); 
		temp = inputNumb;

		while(temp != 0) 
		{
			digits++;
			temp = temp/10; 
		}


		temp = inputNum; 
		while(temp != 0)
		{
			remainder = temp%10;
			sum = sum + power(remainder, digits);
			temp = temp /10; 
		}

		if ( inputNumb == sum )
			System.out.println( inputNumb + " is an Armstrong number.");
	    else
			System.out.println( inputNumb + " is not an Armstrong number.");
	}


	public static int power(int remainder,int digits)
	{
		int i , power = 1; 

		for ( i = 1;  i <= digits; i++)
		{
			power = power * remainder;
		}

		return p;
	}
}