import java.util.Scanner; 

public class SwapNumbers
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int x, y, temp; 

		System.out.println("Enter x and y"); 
		x = int.nextInt();
		y = int.nextInt();

		System.out.println("Before Swapping\n x = " + x + "\n y = " + y); 
		temp = x; 
		x = y; 
		y = temp;

		System.out.println("After Swapping\n x = " + x + "\n y = " + y);
	}
}