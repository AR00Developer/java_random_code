package com.company;

public class Array 
{
	public static void main(Stirng[] args)
	{
		int[] num = {1,2,3,4,5,6,7}; 
		String[] name = {"Tien","Oam","Tigger","Aum"};

		num[0] = 9; 
		int length = num.length;  
		String[] cars = {"Fiat","Ford","Renault","Chevy"};
		for(String car : cars)
		{
			System.out.println(car);
		}

		int myNumbers[][] = {{1,2,3,4,5}{3,8,5,9,7}};
		for(int i = 0; i < myNumbers.length; i++)
		{
			for(int j = 0; j < myNumbers[i].length ; ++j)
			{
				System.out.println(myNumbers[i][j]);
			}
		}
	}
	 	 /* Author @Tien-Jirattanun - https://github.com/Tien-Jirattanun */ 
}