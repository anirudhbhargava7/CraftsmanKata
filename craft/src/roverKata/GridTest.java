package roverKata;

import static org.junit.Assert.*;

import org.junit.Test;

public class GridTest {

	int testGrid[][] = new int[10][10];
	Grid newGrid = new Grid(10,10);
	
	int[][] getTestGrid (){
	
		for(int i = 0 ; i < 10; i++) {
		
		for(int j = 0 ; j < 10; j++){
			
			if(i == j ){
				
				testGrid[i][j] = 1;
			}else{
				
				testGrid[i][j] = 0;
			}
			
		}
	}
	
		return testGrid;
	}
	
	
	@Test
	public void testGetTheGrid() {
		
		int testGrid[][] = getTestGrid();
		
		
		
		int theGrid[][] = newGrid.getTheGrid();
		assertArrayEquals("Grid Test Passes",testGrid, theGrid);
		
	}

	@Test
	public void testIsEmpty() {
		
		assertFalse("Grid is not empty" , newGrid.isEmpty(1, 1) );
	}

}
