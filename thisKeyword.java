public class thisKeyword 
{
	static int num1, num2, num3; 

	public void sub( )
	{
		System.out.println("Done \n");
	}

	public void add(int number1, int number2)
	{
		this.sub(); 
		num2 = number1, number2;
		System.out.println("addition = " + num2);
	}

	public static void main(String[] args)
	{
		thisKeyword objThis = new ThisKeyword(); 
		objThis.add(5,6);
	}
	 /* Author @raiprogramming - https://github.com/raiprograming */ 
}