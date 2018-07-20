package edu.iastate.cs228.hw1;

/**
 *  
 * @author
 *
 */

/**
 * Grass may be eaten out or taken over by deers. 
 *
 */
public class Grass extends Living 
{
	public Grass (Jungle j, int r, int c) 
	{
		super(j,r,c);
	}
	
	public State who()
	{
		State temp = State.GRASS;
	
		return temp;  
	}
	
	/**
	 * Grass can be eaten out by too many deers in the neighborhood. Deers may also 
	 * multiply fast enough to take over Grass. 
	 * 
	 * @param jNew     jungle in the next cycle
	 * @return Living  life form occupying the square in the next cycle. 
	 */
	public Living next(Jungle jNew)
	{
		int[] population = new int[5];
		this.census(population);
		if (population[0] >= population[2] * 3 && population[2] > 0) 
		{
			Living l = new Empty(jNew,this.row,this.column);
			return l;
		}
		if(population[0] >= 4)
		{
			Living l = new Deer(jNew,this.row,this.column,0);
			return l;
		}
		else 
		{
			Living l = new Grass(jNew,this.row,this.column);
			return l;
		} 
	}
}
