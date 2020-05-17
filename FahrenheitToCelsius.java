import java.util.*; 

class FarenheitToCelsius 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in); 
		float temperature;

		System.out.println("Enter temparetaure in Farenheit"); 
		temperature = in.nextInt(); 

		temperature = ((temperature - 32)* 5)/9; 
		System.out.println("Temperature in Celsius = " + temperature); 
	}
	
}