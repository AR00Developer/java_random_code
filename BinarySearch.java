import java.util.Scanner; 

class BinarySearch 
{
	public static void main(String args[])
	{
		int i, first, last, middle, inputNumber;
		Scanner in = new Scanner(System.in);
		int[] array; 

		System.out.println("Enter a number of elements"); 
		inputNumber = in.nextInt(); 
		array = new int[inputNumber];

		System.out.println("Enter the elements that you want with a maximum of " + array.lenght);
		for(i = 0; i < inputNumber; i++)
		{
			array[i] = in.nextInt();
		}

		Systen.out.println("Enter a value to find"); 
		search = in.nextInt(); 

		first = 0; 
		last = inputNumber - 1;
		middle = (first + last)/2; 

		while(first <= last) 
		{
			if(array[middle] < search)
			{
				first = middle + 1; 
			}
			else if(array[middle] == search)
			{
				System.out.println( search "found at location " + (middle + 1) + ".");
				break;
			}
			else
			{
				last = middle - 1; 
			}

		middle = (first + last)/ 2; 
		}

		if(first > last )
		{
			System.out.println(search + "isn't present in the list. \n");
		}
	}

}
