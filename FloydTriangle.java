import java.util.Scanner; 

class FloydTriangle 
{
	public static void main(String args[])
	{	
		Scanner in = new Scanner(System.in);
		int i, inputNumber, j, num;
		num = 1;

		System.out.println("Enter the number of rows of floyd's triangle we want"); 
		inputNumber = in.nextInt();


		System.out.println("Floy's triangle: - "); 
		for(i = 1; i <= inputNumber ; i++)
		{
			for( j = 1; j <= i ; j++)
			{
				System.out.println(num + " ");
				num++;
			}
			System.out.println();
		}
	}
	
}