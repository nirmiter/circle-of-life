package edu.iastate.cs228.hw1;

/**
 *  
 * @author
 *
 */

/**
 * A jaguar eats a deer and competes against a puma. 
 */
public class Jaguar extends Animal
{
	/**
	 * Constructor 
	 * @param j: jungle
	 * @param r: row position 
	 * @param c: column position
	 * @param a: age 
	 */
	public Jaguar (Jungle j, int r, int c, int a) 
	{
		super(j,r,c,a);
	}
	
	/**
	 * A jaguar occupies the square. 	 
	 */
	public State who()
	{
		State temp = State.JAGUAR;
		
		return temp; 
	}
	
	/**
	 * A jaguar dies of old age or hunger, from isolation and attack by more numerous pumas.
	 *  
	 * @param jNew     jungle in the next cycle
	 * @return Living  life form occupying the square in the next cycle. 
	 */
	public Living next(Jungle jNew)
	{
		int[] population = new int[5];
		this.census(population);
		if (this.age >= 5) 
		{
			Living l = new Empty(jNew,this.row,this.column);
			return l;
		}
		else if(population[4] >= population[3] * 2) 
		{
			Living l = new Puma(jNew,this.row,this.column,0);
			return l;
		}
		else if(population[3] + population[4] > population[0]) {
			Living l = new Empty(jNew,this.row,this.column);
			return l;
		}
		else 
		{
			Living l = new Jaguar(jNew,this.row,this.column,this.age + 1);	
			return l;
		}
		// TODO 
		// 
		// See Living.java for an outline of the function. 
		// See Section 2.1 in the project description for the survival rules for a jaguar. 
	}
}
