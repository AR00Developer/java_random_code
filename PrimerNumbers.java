import java.util.*; 

public class PrimeNumbers
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in); 
		int status, num, inputNumber; 
		status = 1; 
		num = 3; 

		System.out.println("Enter the number of primer numbers you want ");
		inputNumber = in.nextInt(); 

		if(inputNumber >= 1) 
		{
			System.out.println("First " + n + "prime numbers are : - "); 
			System.out.println(2); 
		}

		for( int count = 2; count <= n;  count++)
		{
			for(int j = 2; j <= Math.sqrt(num); j++)
			{
				if( num%2 == 0)
				{
					status = 0; 
					break;
				}
			}
			if( status != 0)
			{
				System.out.println(num);
				count++;
			}
			status = 1; 
			num++;
		}
    }
}