package com.company; 

public class String 
{
	public static void mian(String[] args)
	{
		String world = "Home";
		String firstName ="Jhon";
		String lastName = "Doe"; 

		System.out.println(firstName + " " + lastName);

		//Methods of String class
		System.out.println(world.method()); 
		System.out.println(world.length());
		System.out.println(world.toUpperCase());
		System.out.println(world.toLowerCase());
		System.out.println(world.indexOf("m"));

		//Escape character
		System.out.printlnn("Welcome\nHome");
		System.out.printlnn("Welcome\rHome");
		System.out.printlnn("Welcome\tHome");
		System.out.printlnn("Welcome\bHome");
		System.out.printlnn("Welcome\fHome"); 
	}
	 	 /* Author @Tien-Jirattanun - https://github.com/Tien-Jirattanun */ 
}