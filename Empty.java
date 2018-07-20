package edu.iastate.cs228.hw1;

/**
 *  
 * @author
 *
 */

/** 
 * Empty squares are competed by various forms of life.
 */
public class Empty extends Living 
{
	public Empty (Jungle j, int r, int c) 
	{
		super(j,r,c);
	}
	
	public State who()
	{
		State temp = State.EMPTY;
		
		return temp; 
	}
	
	/**
	 * An empty square will be occupied by a neighboring Deer, Grass, Jaguar, or Puma, or 
	 * remain empty. 
	 * @param jNew     jungle in the next life cycle.
	 * @return Living  life form in the next cycle.   
	 */
	public Living next(Jungle jNew)
	{
		int[] population = new int[5];
		this.census(population);
		if (population[0] > 1) 
		{
			Living l = new Deer(jNew,this.row,this.column,0);
			return l;
		}
		else if(population[4] > 1)
		{
			Living l = new Puma(jNew,this.row,this.column,0);
			return l;
		}
		else if(population[3] > 1)
		{
			Living l = new Jaguar(jNew,this.row,this.column,0);
			return l;
		}
		else if(population[2] >= 1)
		{
			Living l = new Grass(jNew,this.row,this.column);
			return l;
		}
		else {
			Living l = new Empty(jNew,this.row,this.column);
			return l;
		}
		// TODO 
		// 
		// See Living.java for an outline of the function. 
		// See Section 2.5 in the project description for corresponding survival rules. 

	}
}
