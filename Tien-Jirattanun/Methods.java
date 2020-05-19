import com.company; 

public class Methods
{
	public static void main(String[] args)
	{
		hello(); 
		print("How are you?");
		plus(5,10);
		System.out.println(plusMethod(6,5));
		System.out.println(plusMethod(6.8,7.6));
	}



	static void hello()
	{
		System.out.println("Hello world");
	} 
	static void hello(String hello)
	{
		System.out.println(hello);
	} 
	static void plus(int num1, int num2)
	{
		int sum = num1 + num2;
		System.out.println(sum);
	}

	/* Look how in plusMethod overloading it's used, a property that allows us to use the same method's name
	  but always with different  type of params  */
 	static void plusMethod(int num1, int num2)
	{
		int sum = num1 + num2;
		System.out.println(sum);
	}
	static void plusMethod(double num1, double num2)
	{
		double sum = num1 + num2;
		System.out.println(sum);
	}

	static float curcum(int radius)
	{
		//float within parentheses indicated casting type, search for it ;)
		return (float)((2*3.14)*radius);
	}
	static void checkage(int age)
	{

		if(age)
		{
			if (age < 18)
			{
				System.out.println("Can't pass"); 
			}
			else
			{
				System.out.println("pass")
			}
		}
		
	}
	 	 /* Author @Tien-Jirattanun - https://github.com/Tien-Jirattanun */  
}