package roverKata;

import static org.junit.Assert.*;

import org.junit.Test;

public class PositionTest {

	Grid theGrid = new Grid(10,10);
	
	@Test
	public void righttest() {
		Position pos = new Position(0 , 0 , theGrid);	
		pos.right();
		assertEquals(pos.getyAxis() , 1);
	}
	@Test
	//Finds that there is obstacle so wont move to the new position
	public void rightTestAroundFailure() {
		Position pos = new Position(0 , 9 , theGrid);	
		pos.right();
		assertEquals(pos.getyAxis() , 9);
	}
	@Test
	public void rightTestAroundSuccess() {
		Position pos = new Position(1 , 9 , theGrid);	
		pos.right();
		assertEquals(pos.getyAxis() , 0);
	}
	@Test
	public void lefttest() {
		Position pos = new Position(0 , 0 , theGrid);	
		pos.left();
		assertEquals(pos.getyAxis() , 9);
	}
	@Test
	public void uptest() {
		Position pos = new Position(0 , 0 , theGrid);	
		pos.up();
		assertEquals(pos.getxAxis() , 9);
	}
	@Test
	public void uptestAroundFailure() {
		Position pos = new Position(9 , 0 , theGrid);	
		pos.up();
		assertEquals(pos.getxAxis() , 9);
	}
	@Test
	public void downtest() {
		Position pos = new Position(0 , 0 , theGrid);	
		pos.down();
		assertEquals(pos.getxAxis() , 1);
	}
	
	
}
