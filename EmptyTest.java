package edu.iastate.cs228.hw1;

public class EmptyTest {

	public static void main(String[] args) 
	{
		Jungle j = new Jungle(5);
		j.randomInit();
		/*
		//To ask the Empty space who/what it is
		j.grid[0][0] = new Empty(j,0,0);
		System.out.println(j.grid[0][0].who());
		
		//To make sure Deer have priority when spawned
		j.grid[0][1] = new Deer(j,0,1,3);
		j.grid[1][0] = new Deer(j,1,0,2);
		System.out.println(j.toString());
		j.grid[0][0] = j.grid[0][0].next(j);
		System.out.println(j.toString());
		
		//To make sure Puma have second priority when spawned
		j.grid[0][0] = new Empty(j,0,0);
		j.grid[0][1] = new Puma(j,0,1,2);
		j.grid[1][0] = new Empty(j,1,0);
		j.grid[1][1] = new Puma(j,1,1,1);
		System.out.println(j.toString());
		j.grid[0][0] = j.grid[0][0].next(j);
		System.out.println(j.toString());
		
		j.randomInit();
		//To make sure Jags have third priority when spawned
		j.grid[4][4] = new Empty(j,4,4);
		j.grid[3][3] = new Jaguar(j,3,3,3);
		j.grid[4][3] = new Jaguar(j,4,3,1);
		j.grid[3][4] = new Grass(j,3,4);
		System.out.println(j.toString());
		j.grid[4][4] = j.grid[4][4].next(j);
		System.out.println(j.toString());
		
		j.randomInit();
		//To make sure Grass has fourth priority when spawned
		j.grid[0][4] = new Empty(j,0,4);
		j.grid[1][3] = new Jaguar(j,1,3,3);
		j.grid[1][4] = new Puma(j,1,4,1);
		j.grid[0][3] = new Grass(j,0,3);
		System.out.println(j.toString());
		j.grid[0][4] = j.grid[0][4].next(j);
		System.out.println(j.toString());
		*/
		//To make sure that if none of these are true it is Empty :[
		
		j.grid[4][0] = new Empty(j,4,0);
		j.grid[4][1] = new Jaguar(j,4,1,3);
		j.grid[3][0] = new Puma(j,3,0,1);
		j.grid[3][1] = new Deer(j,3,1,5);
		System.out.println(j.toString());
		j.grid[4][0] = j.grid[4][0].next(j);
		System.out.println(j.toString());
		
		
		
		
		
		
		
		
		
		
		
	}
}
