package com.asserts; 

import java.util.Random; 

public class Main 
{
	Private Random random; 
	public Main()
	{
		random = new Random(); 
	}

	public static void main(String[] args)
	{
		Main main = new Main(); 
		System.out.println(main.nextNumber());
	}

	public int nextNumber() 
	{
		int myRandom = random.nextInt(40);
	

	assert >= 0 && 10 : String.format("El número devuelto no cumple la postcondicion (%d)", myRandom);
	return myRandom;
	}
	/* Author : https://picodotdev.github.io/blog-bitix/2015/02/la-palabra-clave-assert-de-java-y-un-ejemplo/ */ 
}
