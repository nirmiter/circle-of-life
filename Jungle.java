package edu.iastate.cs228.hw1;

/**
 *  
 * @Nathan Irmiter
 *
 */

import java.io.File; 
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner; 
import java.util.Random; 

/**
 * 
 * The jungle is represented as a square grid of size width X width. 
 *
 */
public class Jungle 
{
	private int width; // grid size: width X width 
	public Living[][] grid; 
	
	/**
	 *  Default constructor reads from a file 
	 */
	public Jungle(String inputFileName) throws FileNotFoundException
	{	width = 0;
		String str = "DEGJP";
		int ageHolder;
		File f = new File(inputFileName);
		Scanner s = new Scanner(f);
		while (s.hasNextLine()){
			width++;
			s.nextLine();
		}
		s.close();
		grid = new Living[width][width];
		Scanner file = new Scanner(f);
		if (file.hasNext() == true) {
		for (int i = 0; i < width; i ++) {
			for (int j = 0; j < width; j ++) {
				
				String live = file.next();			
				if(str.indexOf(live.charAt(0)) == 0) 
				{
					ageHolder = Character.getNumericValue(live.charAt(1));
					grid[i][j] = new Deer(this,i,j,ageHolder);
				}
				if(str.indexOf(live.charAt(0)) == 1) 
				{
					grid[i][j] = new Empty(this,i,j);
				}
				if(str.indexOf(live.charAt(0)) == 2) 
				{
					grid[i][j] = new Grass(this,i,j);
				}
				if(str.indexOf(live.charAt(0)) == 3)
				{
					ageHolder = Character.getNumericValue(live.charAt(1));
					grid[i][j] = new Jaguar(this,i,j,ageHolder);
				}
				if(str.indexOf(live.charAt(0)) == 4) 
				{
					ageHolder = Character.getNumericValue(live.charAt(1));
					grid[i][j] = new Puma(this,i,j,ageHolder);
				}
				}
			}
		}
		file.close();
		// 
		// Assumption: The input file is in correct format. 
		// 
		// You may create the grid jungle in the following steps: 
		// 
		// 1) Reads the first line to determine the width of the grid.
		// 
		// 2) Creates a grid object. 
		// 
		// 3) Fills in the grid according to the input file. 
		// 
		// Be sure to close the input file when you are done. 
	}
	
	/**
	 * Constructor that builds a w X w grid without initializing it. 
	 * @param width  the grid 
	 */
	public Jungle(int w)
	{
		grid = new Living[w][w];
		width = w;
	}
	
	
	public int getWidth()
	{
		return width;  
	}
	
	/**
	 * Initialize the jungle by randomly assigning to every square of the grid  
	 * one of Deer, Empty, Grass, Jaguar, or Puma.  
	 * 
	 * Every animal starts at age 0.
	 */
	public void randomInit()
	{
		Random generator = new Random(); 
		 for (int i = 0; i < width; i ++) {
			 for (int j = 0; j < width; j ++) {
				 int x = generator.nextInt(5);
				 if (x == 0) {
					 grid[i][j] = new Deer(this,i,j,0);
				 }
				 if (x == 1) {
					 grid[i][j] = new Empty(this,i,j);
					 
				 }
				 if (x == 2) {
					 grid[i][j] = new Grass(this,i,j);
				 }
				 if (x == 3) {
					 grid[i][j] = new Jaguar(this,i,j,0);
				 }
				 if (x == 4) {
					 grid[i][j] = new Puma(this,i,j,0);
				 }
			 }
		 }
		// TODO 
	}
	
	
	/**
	 * Output the jungle grid. For each square, output the first letter of the living form
	 * occupying the square. If the living form is an animal, then output the age of the animal 
	 * followed by a blank space; otherwise, output two blanks.  
	 */
	public String toString()
	{	String livingThings = "";
		for (int i = 0; i < width; i ++) {
			if (i > 0 || i < width) {
				livingThings += "%n";
			}
			for (int j = 0; j < width; j++) {
				State t = grid[i][j].who();
				if (t == State.EMPTY) {
					livingThings += "E  ";					
				}
				if (t == State.GRASS) {
					livingThings += "G  ";					
				}
				
				if (t == State.DEER) {
					/*Living creature = grid[i][j];
					Deer dee = (Deer)creature;
					int x = dee.myAge();		*/			
					livingThings += "D" + ((MyAge) grid[i][j]).myAge() + " ";					
				}
				if (t == State.PUMA) {
					livingThings += "P" + ((MyAge) grid[i][j]).myAge() + " ";					
				}
				if (t == State.JAGUAR) {					
					livingThings += "J" + ((MyAge) grid[i][j]).myAge() + " ";					
				}
			}
		}
		livingThings = String.format(livingThings);
		return livingThings; 
	}
	

	/**
	 * Write the jungle grid to an output file.  Also useful for saving a randomly 
	 * generated jungle for debugging purpose. 
	 * @throws FileNotFoundException
	 */
	public void write(String outputFileName) throws FileNotFoundException
	{
		File f = new File(outputFileName);
		PrintWriter print = new PrintWriter(f);
		
		for (int i = 0; i < this.getWidth(); i++) 
		{
			if (i > 0 || i < getWidth()) {
				print.println();
			}
			for(int j = 0; j < this.getWidth(); j++) {
				State t = this.grid[i][j].who();
				if (t == State.DEER) {
					print.write("D" + ((Animal)this.grid[i][j]).myAge() + " ");					
				}
				if (t == State.EMPTY) {
					print.write("E  ");					
				}
				if (t == State.GRASS) {
					print.write("G  ");					
				}
				if (t == State.JAGUAR) {
					print.write("J" + ((Animal)this.grid[i][j]).myAge() + " ");					
				}
				if (t == State.PUMA) {
					print.write("P" + ((Animal)this.grid[i][j]).myAge() + " ");					
				}
			}
		}
		print.close();
		// TODO 
		// 
		// 1. Open the file. 
		// 
		// 2. Write to the file. The five life forms are represented by characters 
		//    D, E, G, J, P. Leave one blank space in between. Examples are given in
		//    the project description. 
		// 
		// 3. Close the file. 
	}			
}
