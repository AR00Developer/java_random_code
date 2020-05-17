import java.util.Scanner;
import java.math.BigInteger; 

public class AddingLargeNumbers
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String num1, num2; 

		System.out.println("Enter first number");
		num1 = in.nextLine(); 
		System.out.println("Enter Second number");
		num2 = in.nextLine(); 

		BigInteger first = new BigInteger(num1);
		BigInteger second = new BigInteger(num2);
		BigInteger sum; 

		sum = first.add(second);
		System.out.println("Result of addition = " + sum);


	}
}