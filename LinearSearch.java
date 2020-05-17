import java.util.Scanner; 

class LinearSearch 
{
	public static void main(String args[])
	{
		int inputNumber, search, arr[], i;

		System.out.println("Enter the number of elements"); 
		inputNumber = in.nextInt(); 
		array = new int[inputNumber];

		System.out.println("Enter " + inputNumber  + " integers "); 
		for(i = 0; i < inputNumbers;  i++)
		{
			array[i] = int.nextInt();
		}

		System.out.println("Enter value to find");
		search = in.nextInt(); 
		for(  i = 0; i < inputNumber; i++)
		{
			if(array[c] == search)
			{
				System.out.println(search + " is present at location " + (i + 1) + ". "); 
				break;
			}
		}
		if( i == inputNumber) 
		{
			System.out.println(search + " isn't present in array ");
		}
	}
	
}