package edu.iastate.cs228.hw1;

import java.io.FileNotFoundException;
import java.util.Scanner; 

/**
 *  
 * @Nathan Irmiter
 *
 */

/**
 * 
 * The CircleOfLife class performs simulation over a grid jungle 
 * with squares occupied by deers, jaguars, pumas, grass, or none. 
 *
 */
public class CircleOfLife 
{	
	/**
	 * Update the new jungle from the old jungle in one cycle. 
	 * @param jOld  old jungle
	 * @param jNew  new jungle 
	 */

	public static void updateJungle(Jungle jOld, Jungle jNew)
	{
		for(int i = 0; i < jOld.getWidth(); i++) 
		{
			for(int j = 0; j < jOld.getWidth(); j++) 
			{
				jNew.grid[i][j] = jOld.grid[i][j].next(jNew);
			}
		}
		
		// TODO 
		// 
		// For every life form (i.e., a Living object) in the grid jOld, generate  
		// a Living object in the grid jNew at the corresponding location such that 
		// the former life form changes into the latter life form. 
		// 
		// Employ the method next() of the Living class. 
	}
	
	/**
	 * Repeatedly generates jungles either randomly or from reading files. 
	 * Over each jungle, carries out an input number of cycles of evolution. 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException
	{	int type = 1;
		int trials = 1;
		Scanner user = new Scanner(System.in);
		System.out.println("Circle of Life in the Amazon Jungle");
		System.out.println("keys: 1 (random jungle)  2 (file input)  3 (exit)");
		while (type == 1 || type == 2) 
		{
		int cycles = 0;
		System.out.println("Trial " + trials + ": ");
		type = user.nextInt();
			
		if (type == 1) 
		{
			System.out.println("Random jungle");
			System.out.println("Enter grid width:");
			int wid = user.nextInt();
			System.out.println("Enter the number of cycles: ");
			cycles = user.nextInt();
			Jungle even = new Jungle(wid);
			even.randomInit();
			System.out.println("Initial jungle:");
			System.out.println(even.toString());
			Jungle odd = new Jungle(even.getWidth());
			
			for (int i = 0; i < cycles; i ++) 
			{
				if (i % 2 == 0) {
					updateJungle(even,odd);

					if(i == cycles - 1) {
						System.out.println("Final jungle:");
						System.out.println(odd.toString());
					}
				}
				if(i % 2 != 0) {
					updateJungle(odd,even);
					if(i == cycles - 1) {
						System.out.println("Final jungle:");
						System.out.println(even.toString());
					}
				}
			}
		}
		if (type == 2) 
		{
			System.out.println("Jungle input from a file");
			System.out.println("File name:");
			String fileName = user.next();
			Jungle even = new Jungle(fileName);
			System.out.println("Enter the number of cycles: ");
			cycles = user.nextInt();
			System.out.println("Initial jungle:");
			System.out.println(even.toString());
			Jungle odd = new Jungle(even.getWidth());
			
			for (int i = 0; i < cycles; i ++) 
			{
				if (i % 2 == 0) {
					updateJungle(even,odd);

					if(i == cycles - 1) {
						System.out.println("Final jungle:");
						System.out.println(odd.toString());
					}
				}
				if(i % 2 != 0) {
					updateJungle(odd,even);
					if(i == cycles - 1) {
						System.out.println("Final jungle:");
						System.out.println(even.toString());
					}
				}
			
		}

		}
		trials++;
		}
		user.close();
		// TODO 
		// 
		// Generate CircleOfLife simulations repeatedly like shown in the 
		// sample run in the project description. 
		// 
		// 1. Enter 1 to generate a random jungle, 2 to read a jungle from an input
		//    file, and 3 to end the simulation. (An input file always ends with 
		//    the suffix .txt.)
		// 
		// 2. Print out standard messages as given in the project description. 
		// 
		// 3. For convenience, you may define two jungles even and odd as below. 
		//    In an even numbered cycle (starting at zero), generate the jungle 
		//    odd from the jungle even; in an odd numbered cycle, generate even 
		//    from odd. 
		
		// the jungle after an even number of cycles 
		// the jungle after an odd number of cycles
		
		// 4. Print out initial and final jungles only.  No intermediate jungles should
		//    appear in the standard output.  (When debugging your program, you can 
		//    print intermediate jungles.)
		// 
		// 5. You may save some randomly generated jungles as your own test cases. 
		// 
		// 6. It is not necessary to handle file input & output exceptions for this 
		//    project. Assume data in an input file to be correctly formated. 
	
	}
}