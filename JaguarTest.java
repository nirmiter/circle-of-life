package edu.iastate.cs228.hw1;

public class JaguarTest {
	
	public static void main(String[] args) 
	{
		Jungle j = new Jungle(5);
		j.randomInit();
		/*
		//To ask the Jaguar who it is
		j.grid[0][0] = new Jaguar(j,0,0,3);
		System.out.println(j.grid[0][0].who());

		//To make sure the Jaguar has a chance to die of old age first
		j.grid[0][4] = new Jaguar(j,0,4,5);
		System.out.println(j.toString());
		j.grid[0][4] = j.grid[0][4].next(j);
		System.out.println(j.toString());

		//To see if the Pumas outnumber the Jaguars
		j.grid[1][4] = new Jaguar(j,1,4,2);
		j.grid[2][3] = new Jaguar(j,2,3,3);
		j.grid[2][4] = new Empty(j,2,4);
		j.grid[0][3] = new Puma(j,0,3,1);
		j.grid[1][3] = new Grass(j,1,3);
		j.grid[0][4] = new Puma(j,0,4,4);
		System.out.println(j.toString());
		j.grid[1][4] = j.grid[1][4].next(j);
		System.out.println(j.toString());
		
		
		//To see if the Jaguars and Pumas outnumber the Deer
		j.grid[1][4] = new Jaguar(j,1,4,2);
		j.grid[2][3] = new Jaguar(j,2,3,3);
		j.grid[2][4] = new Empty(j,2,4);
		j.grid[0][3] = new Deer(j,0,3,1);
		j.grid[1][3] = new Grass(j,1,3);
		j.grid[0][4] = new Puma(j,0,4,4);
		System.out.println(j.toString());
		j.grid[1][4] = j.grid[1][4].next(j);
		System.out.println(j.toString());
						*/
		//To see if the Jaguar will live to hunt another day
		j.grid[1][4] = new Jaguar(j,1,4,2);
		j.grid[2][3] = new Deer(j,2,3,3);
		j.grid[2][4] = new Empty(j,2,4);
		j.grid[0][3] = new Deer(j,0,3,1);
		j.grid[1][3] = new Grass(j,1,3);
		j.grid[0][4] = new Puma(j,0,4,4);
		System.out.println(j.toString());
		j.grid[1][4] = j.grid[1][4].next(j);
		System.out.println(j.toString());
		
		
		
	}
}
