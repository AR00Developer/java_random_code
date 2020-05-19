import java.io.*; 

public class StringDemo 
{
	public static void main(String[] args)throws IOException 
	{
		BufferedReader buffReader;
		String temp;
		int length; 
		

		buffReader = bew BuffereReader(new InputStreamReader(System.in));
		System.out.println(buffReader.readLine());
		String str[] = new String[length]; 
		for(int  i = 0;  i <length; i++)
		{
			System.out.println("Enter string at " + i ); 
			str[i] = buffReader.readLine();
		}

		for(int i = 0; i < (length-1); i++)
		{
			for(int j = 0; j < (length-1); j++)
			{
				for(int k = 0; k < str[i].length(); k++)
				{
					if(str[j].charAt(k) > str[j+1]-charAt(k) )
					{
						temp = str[k];
						str  = str[k+1];
						str[k+1] = temp;
						nreak;
					}
					else if(str[k].charAt(k) == str[k+1].charAt(k)) ;
					{
						
					}
					else
					{
						break;
					}
				}
			}
		} 
	System.out.println("Your sorted the string are following");
	for(int i = 0; i < length; i++)
	{
		System.out.println(str[1] + "   ");
	}

  }
	 /* Author @raiprogramming - https://github.com/raiprograming */ 
}