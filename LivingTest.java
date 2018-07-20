package edu.iastate.cs228.hw1;

public class LivingTest {

	public static void main(String[] args) 
	{
	Jungle j = new Jungle(5);
	j.randomInit();
	//To see if you can create a Living creature to stay within the Jungle
	Living l = new Empty(j,0,0);
	
	//To see if you can take a census of the population around the given space and return it
	int[] test = new int[5];
	l.census(test);
	String str = "";
	for( int i = 0; i < test.length; i++) {
		str+= test[i] + ", ";
	}
	System.out.println(str);
	
	//To see if you can ask the space who it is
	System.out.println(l.who());
	
	//To see if you can modify the space with next()
	j.grid[0][0] = new Deer(j,0,0,2);
	j.grid[0][1] = new Empty(j,0,1);
	j.grid[1][0] = new Deer(j,1,0,3);
	j.grid[1][1] = new Grass(j,1,1);
	
	System.out.println(j.toString());
	j.grid[0][0] = j.grid[0][0].next(j);
	System.out.println(j.toString());
	
	}
}
