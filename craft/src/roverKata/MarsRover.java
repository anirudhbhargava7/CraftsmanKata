package roverKata;

import roverKata.Rover.Direction;

public class MarsRover {
	
	public static void main (String args[]) {
		
		Grid marsGrid = new Grid(10,10);
		//Setting the initial Position and Direction for the Rover
		Position initialPositionOnMars = new Position(0, 9 , marsGrid);
		Direction initialDirOnMars = Direction.NORTH;
		// Input String for the Rover 
		String input = "f";
		
		Rover rOneOnMars = new Rover(initialPositionOnMars , initialDirOnMars );
		navigate(rOneOnMars , input);
		
		System.out.println("Rover Final Position" + rOneOnMars.getPosition());
		System.out.println("Rover Final Direction" + rOneOnMars.getDirection());
	}
	
	private static Rover navigate(Rover rover , String str){
		
		char[] input = str.toCharArray();
		
		for(char c : input) {
			
			switch(c){
			
			case 'f' : rover.forwardMove();break;
			case 'b' : rover.backMove();break;
			case 'l' : rover.leftTurn();break;
			case 'r' : rover.rigthTurn();break;
			}
			
		}
		
		return rover;
	}
}
