package edu.iastate.cs228.hw1;

public class PumaTest {
	
	public static void main(String[] args) 
	{
		Jungle j = new Jungle(5);
		j.randomInit();
		/*
		//To ask the Puma what it is
		j.grid[0][0] = new Puma(j,0,0,2);
		System.out.println(j.grid[0][0].who());

		//To give the Puma the chance to die of old age first
		j.grid[0][1] = new Puma(j,0,1,4);
		System.out.println(j.toString());
		j.grid[0][1] = j.grid[0][1].next(j);
		System.out.println(j.toString());

		//To see if Jaguars outnumber the Pumas
		j.grid[0][1] = new Puma(j,0,1,2);
		j.grid[0][0] = new Empty(j,0,0);
		j.grid[1][1] = new Puma(j,1,1,1);
		j.grid[1][0] = new Jaguar(j,1,0,3);
		j.grid[1][2] = new Jaguar(j,1,2,2);
		j.grid[0][2] = new Jaguar(j,0,2,1);
		System.out.println(j.toString());
		j.grid[0][1] = j.grid[0][1].next(j);
		System.out.println(j.toString());
		

		//To see if it is Empty when Jag and Pum outnumber Deer
		j.grid[0][1] = new Puma(j,0,1,2);
		j.grid[0][0] = new Deer(j,0,0,1);
		j.grid[1][1] = new Puma(j,1,1,1);
		j.grid[1][0] = new Deer(j,1,0,3);
		j.grid[1][2] = new Puma(j,1,2,2);
		j.grid[0][2] = new Jaguar(j,0,2,1);
		System.out.println(j.toString());
		j.grid[0][1] = j.grid[0][1].next(j);
		System.out.println(j.toString());
		*/		
		//To see if the Puma will live to hunt another day
		j.grid[0][1] = new Puma(j,0,1,2);
		j.grid[0][0] = new Deer(j,0,0,1);
		j.grid[1][1] = new Puma(j,1,1,1);
		j.grid[1][0] = new Deer(j,1,0,3);
		j.grid[1][2] = new Grass(j,1,2);
		j.grid[0][2] = new Jaguar(j,0,2,1);
		System.out.println(j.toString());
		j.grid[0][1] = j.grid[0][1].next(j);
		System.out.println(j.toString());
		
		
	}

}
