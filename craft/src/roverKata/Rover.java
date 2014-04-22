package roverKata;

public class Rover {

	public static enum Direction {
		
		NORTH, EAST , WEST , SOUTH
	}
	
	private Position pos;
	private Direction dir;
	
	public Rover (Position position , Direction direction) {
		
		this.pos = position;
		this.dir = direction;
	}
	
	public Position getPosition() {
		
		return pos;
	}
	
	public Direction getDirection() {
		
		return dir;
	}
	
	public void forwardMove() {
		
		switch(dir){
		case  NORTH : pos.right();
		break;
		case  EAST : pos.down();
		break;
		case  WEST : pos.up();
		break;
		case  SOUTH : pos.left();
		break;
		}
	}
	
	public void backMove() {
		
		switch(dir){
		case  NORTH : pos.left();
		break;
		case  EAST : pos.up();
		break;
		case  WEST : pos.down();
		break;
		case  SOUTH : pos.right();
		break;
		}
	}
	
	public void leftTurn() {
		
		switch(dir){
		case  NORTH : dir = Direction.WEST;
		break;
		case  EAST : dir = Direction.NORTH;
		break;
		case  WEST : dir = Direction.SOUTH;
		break;
		case  SOUTH : dir = Direction.EAST;
		break;
		}
	}
	
	public void rigthTurn() {
		
		switch(dir){
		case  NORTH : dir = Direction.EAST;
		break;
		case  EAST : dir = Direction.SOUTH;
		break;
		case  WEST : dir = Direction.NORTH;
		break;
		case  SOUTH : dir = Direction.WEST;
		break;
		}
	}
	
}
