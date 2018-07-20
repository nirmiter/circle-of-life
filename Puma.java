package edu.iastate.cs228.hw1;

/**
 *  
 * @author
 *
 */

/**
 * A puma eats deers and competes against a jaguar. 
 */
public class Puma extends Animal 
{
	/**
	 * Constructor 
	 * @param j: jungle
	 * @param r: row position 
	 * @param c: column position
	 * @param a: age 
	 */
	public Puma (Jungle j, int r, int c, int a) 
	{
		super(j,r,c,a);
	}
		
	/**
	 * A puma occupies the square. 	 
	 */
	public State who()
	{
		State temp = State.PUMA;
		
		return temp;  
	}
	
	/**
	 * A puma dies of old age or hunger, or from attack by a jaguar. 
	 * @param jNew     jungle in the next cycle
	 * @return Living  life form occupying the square in the next cycle. 
	 */
	public Living next(Jungle wNew)
	{
		int[] population = new int[5];
		this.census(population);
		if(this.age == 4)
		{
			Living l = new Empty(wNew,this.row,this.column);
			return l;
		}
		else if(population[3] > population[4]) 
		{
			Living l = new Jaguar(wNew,this.row,this.column,0);
			return l;
		}
		else if(population[3] + population[4] > population[0])
		{
			Living l = new Empty(wNew,this.row,this.column);
			return l;
		}
		else
		{
			Living l = new Puma(wNew,this.row,this.column,this.age + 1);
			return l;
		}
	
		
		// TODO 
		// 
		// See Living.java for an outline of the function. 
		// See Section 2.2 in the project description for the survival rules for a puma. 
	}
	public String testQuestion() {
		String s = "it worked!";
		return s;
	}
}
