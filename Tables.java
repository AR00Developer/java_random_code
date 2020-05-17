import java.util.Scanner; 

public class Tables 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int num1, b, i, j; 

		System.out.println("Enter range of numbers to print their multiplication table"); 

		num1 = in.nextInt(); 
		b = in.nextInt(); 

		for( i = num1 ; i <= b; i++)
		{
			System.out.println("Multiplication table of " + i);
			for( j = 1; j <= 10; j++)
			{
				System.out.println( i + "*" + j + " = " + (i * j));
			}
		}
	}
	
}