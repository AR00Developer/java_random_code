class Array_basic 
{
	public static void main(String[] args)
	{
		int values = 7;
		values = new int[3];
		Systen.out.println(values[0]); 

		values = new int[0] = 10;
		values = new int[1] = 20;
		values = new int[2] = 30;
		
		Systen.out.println(values[0]); 
		Systen.out.println(values[1]); 
		Systen.out.println(values[2]); 

		for(int i = 0; i < values.length; i++)
		{
			System.out.println(values[i]);
		}

		int numbers = {5,6,7};

		for(int i = 0; i < numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
	}
}