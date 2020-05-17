import java.util.*; 
import java.io.*; 
/** 
* The runtime class allow us to execute any command in the terminal od the host system 
* https://docs.oracle.com/javase/7/docs/api/java/lang/Runtime.html
*/

class Notepad
{
	public static void main(String[] args)
	{
		Runtime rs = Runtime.getRuntime(); 

		try 
		{
			rs.exec("notepad");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}