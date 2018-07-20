package edu.iastate.cs228.hw1;

import java.io.FileNotFoundException;

public class JungleTest {

	public static void main(String[] args) throws FileNotFoundException 
	{
		//Jungle constructor w/ width parameter
		Jungle j = new Jungle(5);
		
		//Making sure you can get the width
		System.out.println("The width of the jungle is: " + j.getWidth());
		
		//Making sure you can randomly initialize the Jungle and then print it to a String
		j.randomInit();
		System.out.println(j.toString());
		
		//Making sure you can call constructor w/ filename argument
		String fileName = "public3-10x10.txt";
		Jungle x = new Jungle(fileName);
		System.out.println(x.toString());
		
		//Trying to write to a new file
		String fileNew = "anewjungle.txt";
		j.write(fileNew);
		System.out.println("Now look in your File Explorer to make sure the jungle is the same as the previous random.");
		
		
		
	}
}
