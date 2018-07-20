package edu.iastate.cs228.hw1;

/**
 *  
 * @author
 *
 */

/*
 * A deer eats grass and lives no more than six years.
 */
public class Deer extends Animal 
{	
	/**
	 * Creates a Deer object.
	 * @param j: jungle  
	 * @param r: row position 
	 * @param c: column position
	 * @param a: age 
	 */
	public Deer(Jungle j, int r, int c, int a) 
	{
		super(j,r,c,a);
	}
		
	// Deer occupies the square.
	public State who()
	{
		State temp = State.DEER;
	
		return temp; 
	}
	
	/**
	 * @param jNew     jungle in the next cycle 
	 * @return Living  new life form occupying the same square
	 */
	public Living next(Jungle jNew)
	{
		int[] population = new int[5];
		this.census(population);
		if (this.age >= 6 || population[2] == 0) 
		{
		Living l = new Empty(jNew,this.row,this.column);
		return l;
		}
		if(population[3] + population[4] > population[0] && population[4] >= population[3] * 2) 
		{			
			Living l = new Puma(jNew,this.row,this.column,0);
			return l;
		}
		else if(population[3] + population[4] > population[0] && population[3] >= population[4]) 
		{
			Living l = new Jaguar(jNew,this.row,this.column,0);
			return l;
		}
		else
		{
			Living l = new Deer(jNew,this.row,this.column,this.age + 1);
			return l;
		}
		
		// TODO 
		// 
		// See Living.java for an outline of the function. 
		// See Section 2.3 in the project description for the survival rules for a deer. 
	}
}
