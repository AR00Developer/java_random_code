package com.company 

public class While 
{
	public static void main(String[] args)
	{
		int i = 0; 
		while(i < 5)
		{
			System.out.println(i + "\t");
			i++;
		}

		System.out.println("\t" + "------------------------------");
		i = 0; 
		do
		{
			System.out.println(i + "\t");
			i++; 
		} while( i < 5);
	}
	 	 /* Author @Tien-Jirattanun - https://github.com/Tien-Jirattanun */ 
}