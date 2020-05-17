import java.util.Scanner; 

class  LargestOfThreeNumbers 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int num1, num2, num3;

		System.out.println("Enter three integers ");
		num1 = in.next();
		num2 = in.next();
		num3 = in.next();

		if ( (num1 > num2) && (num1 > num3))
		{
			System.out.println("First number it's largest");
		}
		else if ( (num2 > num1) && (num2 > num3))
		{
			System.out.println("Second number it's largest");
		}
		else if ( (num3 > num1) && (num3 > num2))
		{
			System.out.println("Third number it's largest");
		}
		else
		{
			System.out.println("Some numbers are equals");
		}
	}
	
}