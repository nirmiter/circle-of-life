package edu.iastate.cs228.hw1;

public class AnimalTest {

	public static void main(String[] args) 
	{
		Jungle j = new Jungle(5);
		//To see if you can create an Animal and then return its' age
		Animal ani = new Puma(j,0,0,3);
		//System.out.println(ani.testQuestion());
		Animal t;
		t = new Deer(j,0,0,2);
		t = new Puma(j,0,0,4);
		
		System.out.println(ani.getClass());
		
		
	
		
		
		
		
	}
}
