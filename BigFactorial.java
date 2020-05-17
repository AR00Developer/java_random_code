import java.util.Scanner; 
import java.math.BigInteger; 

class BigFactorial
{
	public static void main(String args[])
	{
		BigInteger inc = new BigInteger("1");
		BigInteger fact = new BigInteger("1");
		Scanner in = new Scanner(System.in); 
		int inputNumber, i;

		System.out.println("Input a integer"); 
		inputNumber =  in.nextInt(); 

		for( i = 0; i < inputNumber; i++)
		{
			fact = fact.multiply(inc); 
			inc = inc.add(BigInteger.ONE);
		}

		System.out.println(inputNumber + "! = " + fact);
	}
}