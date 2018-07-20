package edu.iastate.cs228.hw1;

/**
 *  
 * @author
 *
 */

/**
 * 
 * Living refers to the life form occupying a square in a jungle grid. It is a 
 * superclass of Empty, Grass, and Animal, the last of which is in turn a superclass
 * of Deer, Jaguar, and Puma. Living has two abstract methods awaiting implementation. 
 *
 */
public abstract class Living 
{
	protected Jungle jungle; // the jungle in which the life form resides
	protected int row;       // location of the square on which 
	protected int column;    // the life form resides
	
	// constants to be used as indices. 
	protected static final int DEER = 0; 
	protected static final int EMPTY = 1; 
	protected static final int GRASS = 2; 
	protected static final int JAGUAR = 3; 
	protected static final int PUMA = 4; 
	
	public static final int NUM_LIFE_FORMS = 5; 
	
	// life expectancies 
	public static final int DEER_MAX_AGE = 6; 
	public static final int JAGUAR_MAX_AGE = 5; 
	public static final int PUMA_MAX_AGE = 4; 
	
	protected Living(Jungle j, int r, int c) {
		this.jungle = j;
		this.row = r;
		this.column = c;
	}
	

	/**
	 * Censuses all life forms in the 3 X 3 neighborhood in a jungle. 
	 * @param population  counts of all life forms
	 */
	protected void census(int population[])
	{	Living[] liv = new Living[8];
		int count = 0;
		int ro = this.row;
		int col = this.column;
		if (ro == 0 && col == 0) {
			
			liv[count] = jungle.grid[ro][col + 1];
			count ++;
			liv[count] = jungle.grid[ro + 1][col + 1];
			count ++;
			liv[count] = jungle.grid[ro + 1][col];
			count++;
		}
		if (ro == jungle.getWidth() - 1 && col == jungle.getWidth() - 1) {
			liv[count] =  jungle.grid[ro][col - 1];
			count ++;
			liv[count] = jungle.grid[ro - 1][col];
			count ++;
			liv[count] = jungle.grid[ro - 1][col - 1];
			count++;
			
		}
		if (ro == 0 && col > 0 && col < jungle.getWidth() - 1) {
			liv[count] = jungle.grid[ro][col + 1];
			count++;
			liv[count] = jungle.grid[ro][col - 1];
			count++;
			liv[count] = jungle.grid[ro + 1][col + 1];
			count++;
			liv[count] = jungle.grid[ro + 1][col];
			count++;
			liv[count] = jungle.grid[ro + 1][col - 1];
			count++;	
		}
		if (ro == jungle.getWidth() - 1 && col == 0) {
			liv[count] = jungle.grid[ro][col + 1];
			count++;
			liv[count] = jungle.grid[ro - 1][col + 1];
			count++;
			liv[count] = jungle.grid[ro - 1][col];
			count++;
		}
		if (ro == jungle.getWidth() - 1 && 0 < col && col < jungle.getWidth() - 1) {
			liv[count] = jungle.grid[ro][col - 1];
			count ++;
			liv[count] = jungle.grid[ro][col + 1];
			count ++;
			liv[count] = jungle.grid[ro - 1][col - 1];
			count ++;
			liv[count] = jungle.grid[ro - 1][col];
			count ++;
			liv[count] = jungle.grid[ro - 1][col + 1];
			count++;
		}
		if(ro > 0 && ro < jungle.getWidth() -1 && col == 0) {
			liv[count] = jungle.grid[ro - 1][col];
			count++;
			liv[count] = jungle.grid[ro + 1][col];
			count++;
			liv[count] = jungle.grid[ro - 1][col + 1];
			count++;
			liv[count] = jungle.grid[ro][col + 1];
			count++;
			liv[count] = jungle.grid[ro + 1][col + 1];
			count++;
			
		}
		if (ro == 0 && col == jungle.getWidth() - 1) 
		{
			liv[count] = jungle.grid[ro][col - 1];
			count++;
			liv[count] = jungle.grid[ro + 1][col];
			count++;
			liv[count] = jungle.grid[ro + 1][col - 1];
			count++;
		}
		if (ro > 0 && ro < jungle.getWidth() - 1 && col == jungle.getWidth() - 1) {
			liv[count] = jungle.grid[ro - 1][col];
			count++;
			liv[count] = jungle.grid[ro + 1][col];
			count++;
			liv[count] = jungle.grid[ro - 1][col - 1];
			count++;
			liv[count] = jungle.grid[ro][col - 1];
			count++;
			liv[count] = jungle.grid[ro + 1][col - 1];
			count++;
			
		}
		else if (ro != 0 && col != 0 && ro != jungle.getWidth() - 1 && col!= jungle.getWidth() - 1) {
			liv[count] = jungle.grid[ro - 1][col - 1];
			count++;
			liv[count] = jungle.grid[ro - 1][col];
			count++;
			liv[count] = jungle.grid[ro - 1][col + 1];
			count++;
			liv[count] = jungle.grid[ro + 1][col - 1];
			count++;
			liv[count] = jungle.grid[ro + 1][col];
			count++;
			liv[count] = jungle.grid[ro + 1][col + 1];
			count++;
			liv[count] = jungle.grid[ro][col - 1];
			count++;
			liv[count] = jungle.grid[ro][col + 1];
			count++;
		}
		
		for (int iter = 0; iter < count; iter ++) {
			State s = liv[iter].who();
			if (s == State.DEER) {
				population[0] += 1;
			}
			if (s == State.EMPTY) {
				population[1] += 1;
			}
			if (s == State.GRASS) {
				population[2] += 1;
			}
			if (s == State.JAGUAR) {
				population[3] += 1;
			}
			if (s == State.PUMA) {
				population[4] += 1;
			}
		}
		
		// TODO 
		// 
		// Count the numbers of Deers, Empties, Grasses, Jaguars, and Pumas  
		// in the 3 by 3 neighborhood centered at this Living object.  Store the 
		// counts in the array population[] at indices DEER, EMPTY, GRASS, JAGUAR, 
		// and PUMA, respectively. 
	}

	/**
	 * Gets the identity of the life form on the square.
	 * @return State
	 */
	public abstract State who();
	// To be implemented in each class of Deer, Empty, Grass, Jaguar, and Puma. 
	// 
	// There are five states given in State.java. Include the prefix State in   
	// the return value, e.g., return State.Puma instead of Puma.  
	
	/**
	 * Determines the life form on the square in the next cycle.
	 * @param  jNew  jungle of the next cycle
	 * @return Living 
	 */
	public abstract Living next(Jungle jNew); 
	// To be implemented in the classes Deer, Empty, Grass, Jaguar, and Puma. 
	// 
	// For each class (life form), carry out the following: 
	// 
	// 1. Obtains counts of life forms in the 3X3 neighborhood of the class object. 

	// 2. Applies the survival rules for the life form to determine the life form  
	//    (on the same square) in the next cycle.  These rules are given in the  
	//    project description. 
	// 
	// 3. Generate this new life form at the same location in the jungle jNew.      

}
