package com.company 

public static For 
{
	public static void main(String[] args)
	{
		for(int i = 0; i < 9 ; i++)
		{
			System.out.println(i);
		}

		System.out.println("\n" + "------------------------"); 
		for(int i = 0; i < 10; i +=2)
		{ 
			System.out.println(i);
		}

		System.out.println("\n" + "------------------------"); 
		String[] cars = {"Fiat","Ford","Renault","Chevy"};
		for ( String i : cars)
		{
			System.out.println(i); 
		} 
	 	 /* Author @Tien-Jirattanun - https://github.com/Tien-Jirattanun */ 
	}
}