package edu.iastate.cs228.hw1;

public class DeerTest {

	public static void main(String[] args) 
	{
		Jungle j = new Jungle(5);
		j.randomInit();
		
		//To ask the deer who/what it is
		j.grid[0][0] = new Deer(j,0,0,3);
		System.out.println(j.grid[0][0].who());
		
		j.randomInit();
		/*
		System.out.println(j.toString());
		j.grid[2][2] = new Deer(j,2,2,6);
		
		System.out.println(j.toString());
		System.out.println(j.grid[2][2].who());
		j.grid[2][2] = j.grid[2][2].next(jNew);
		System.out.println(j.toString());
		
		//to age the deer
		j.grid[4][3] = new Deer(j,4,3,3);
		j.grid[4][2] = new Deer(j,4,2,1);
		j.grid[4][4] = new Deer(j,4,4,3);
		j.grid[1][3] = new Jaguar(j,1,3,2);
		j.grid[3][3] = new Grass(j,3,3);
		System.out.println(j.toString());
		j.grid[4][3] = j.grid[4][3].next(j);
		System.out.println(j.toString());
		*/
		// to change to a Jaguar, need P + J > D and twice as many J as P
		j.grid[3][0] = new Deer(j,3,0,2);
		j.grid[2][0] = new Jaguar(j,2,0,1);
		j.grid[2][1] = new Jaguar(j,2,1,3);
		j.grid[3][1] = new Puma(j,3,1,3);
		j.grid[4][0] = new Grass(j,4,0);
		j.grid[4][1] = new Empty(j,4,1);
		System.out.println(j.toString());
		j.grid[3][0] = j.grid[3][0].next(j);
		System.out.println(j.toString());
		
		//to change to a Puma, need P + J > D and twice as many P as J
		j.grid[3][0] = new Deer(j,3,0,2);
		j.grid[2][0] = new Puma(j,2,0,1);
		j.grid[2][1] = new Jaguar(j,2,1,3);
		j.grid[3][1] = new Puma(j,3,1,3);
		j.grid[4][0] = new Grass(j,4,0);
		j.grid[4][1] = new Empty(j,4,1);
		System.out.println(j.toString());
		j.grid[3][0] = j.grid[3][0].next(j);
		System.out.println(j.toString());
		
		//to kill the deer via starvation you take away the grass
		j.grid[3][0] = new Deer(j,3,0,2);
		j.grid[2][0] = new Puma(j,2,0,1);
		j.grid[2][1] = new Jaguar(j,2,1,3);
		j.grid[3][1] = new Puma(j,3,1,3);
		j.grid[4][0] = new Deer(j,4,0,2);
		j.grid[4][1] = new Empty(j,4,1);
		System.out.println(j.toString());
		j.grid[3][0] = j.grid[3][0].next(j);
		System.out.println(j.toString());
		
		//or Bambi can die of old age
		j.grid[3][0] = new Deer(j,3,0,6);
		j.grid[2][0] = new Puma(j,2,0,1);
		j.grid[2][1] = new Jaguar(j,2,1,3);
		j.grid[3][1] = new Puma(j,3,1,3);
		j.grid[4][0] = new Grass(j,4,0);
		j.grid[4][1] = new Empty(j,4,1);
		System.out.println(j.toString());
		j.grid[3][0] = j.grid[3][0].next(j);
		System.out.println(j.toString());
		
	}
}
