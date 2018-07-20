package edu.iastate.cs228.hw1;

public class CircleOfLifeTest {

	
	public static void main(String[] args) 
	{
		
		//Making sure I can update the jungle properly, need 2 jungle objects because I swap them
		//off in the actual simulation. I assume the full simulation can be shown to be working
		//in the CoL class and I just prove the methods here.
	Jungle j = new Jungle(5);
	j.randomInit();
	Jungle proof = new Jungle(5);
	System.out.println("Before modulation");
	System.out.println(j.toString());
	CircleOfLife.updateJungle(j,proof);
	System.out.println("Old jungle after modulation");
	System.out.println(j.toString());
	System.out.println("New jungle that was actually modulated");
	System.out.println(proof.toString());
	
	
	
	
	
	}
}
