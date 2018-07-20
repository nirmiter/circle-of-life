package edu.iastate.cs228.hw1;

public class GrassTest {

	public static void main(String[] args) 
	{
		Jungle j = new Jungle(5);
		j.randomInit();
		/*
		//to ask the Grass who it is
		j.grid[0][0] = new Grass(j,0,0);
		System.out.println(j.grid[0][0].who());
		
		
		// To make sure the deer eat the grass if there are 3x as many as grass
		j.grid[2][0] = new Grass(j,2,0);
		j.grid[1][1] = new Deer(j,1,1,3);
		j.grid[3][0] = new Deer(j,3,0,2);
		j.grid[2][1] = new Grass(j,2,1);
		j.grid[3][1] = new Deer(j,3,1,5);
		j.grid[1][0] = new Empty(j,1,0);
		System.out.println(j.toString());
		j.grid[2][0] = j.grid[2][0].next(j);
		System.out.println(j.toString());
		
		//To make sure the space turns into a Deer if there are at least 4 Deer
		j.grid[2][0] = new Grass(j,2,0);
		j.grid[1][1] = new Deer(j,1,1,3);
		j.grid[3][0] = new Deer(j,3,0,2);
		j.grid[2][1] = new Puma(j,2,1,2);
		j.grid[3][1] = new Deer(j,3,1,5);
		j.grid[1][0] = new Deer(j,1,0,3);
		System.out.println(j.toString());
		j.grid[2][0] = j.grid[2][0].next(j);
		System.out.println(j.toString());
		*/
		//To make sure the space is a Grass otherwise
		j.grid[3][3] = new Grass(j,3,3);
		j.grid[2][4] = new Grass(j,2,4);
		j.grid[3][4] = new Jaguar(j,3,4,2);
		j.grid[2][3] = new Puma(j,2,3,2);
		j.grid[2][2] = new Deer(j,2,2,5);
		j.grid[4][2] = new Grass(j,4,2);
		j.grid[4][3] = new Puma(j,4,3,1);
		j.grid[4][4] = new Empty(j,4,4);
		j.grid[4][2] = new Grass(j,4,2);

		System.out.println(j.toString());
		j.grid[3][3] = j.grid[3][3].next(j);
		System.out.println(j.toString());
		
		
		
		
	}	
}
