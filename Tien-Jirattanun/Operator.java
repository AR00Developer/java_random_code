package com.company; 

public class Operator 
{
	public static void main(String[] args)
	{
		byte myByte1 = 25;
		byte myByte2 =5;
		int add = myByte1 + myByte2;
		int subs = myByte2 - myByte1;
		int mult = 2 * 5;
		int div = 25 / 5;
		int mod = 25 % 5;
		int addBefore = ++myByte1; 
		byte subsBefore = --myByte2; 

		System.out.println(" Operator (add) : " + add);
		System.out.println(" Operator (subs) : " + subs);
		System.out.println(" Operator (mult) : " + mult);
		System.out.println(" Operator (div) : " + div);
		System.out.println(" Operator (mod) : " + mod);
		System.out.println(" Operator (addBefore) : " + addBefore);
		System.out.println(" Operator (subsBefore) : " + subsBefore); 

	}
	 	 /* Author @Tien-Jirattanun - https://github.com/Tien-Jirattanun */ 
}