
public class Grid {

	private int length;
	private int breadth;
	
	private int theGrid[][] ;
	
	public Grid(int length , int breadth) {
		
		this.length = length;
		this.breadth = breadth;
		this.theGrid = new int [length][breadth];
		setTheGrid();
	}
	
	public int getLatitude() {
		return length;
	}
	
	public void setLatitude(int length) {
		this.length = length;
	}
	
	public int getLongitude() {
		return breadth;
	}
	
	public void setLongitude(int breadth) {
		this.breadth = breadth;
	}
	
	public int [][] getTheGrid() {
		
		return theGrid;
		
	}
	
	public void setTheGrid() {
		
		for(int i = 0 ; i < length; i++) {
			
			for(int j = 0 ; j < breadth ; j++){
				
				if(i == j ){
					
					theGrid[i][j] = 1;
				}else{
					
					theGrid[i][j] = 0;
				}
				
			}
		}
		
	}
	
	public boolean isEmpty(int i , int j) {
		if(theGrid[i][j]==1){
			return false;
		}
		return true;
	}
}
