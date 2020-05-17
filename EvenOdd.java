import java.util.Scanner; 

class EvenOdd 
{
	public static void main(String args[])
	{	
		Scanner in = new Scanner(System.in); 
		int inputNumber; 

		System.out.println("Input an integer"); 
		inputNumber = in.nextInt();


		if( (inputNumber/2) * 2 == inpuNumber)
		{
			System.out.printlln("Even");
		}		
		else
		{	
			System.out.printlln("Odd");
		}
	}
	
}