package roverKata;

public class Position {
	
	private int xAxis;
	private int yAxis;
	private Grid workGrid;
	
	public Position(int xAxis , int yAxis , Grid grid) {
		
		this.xAxis = xAxis;
		this.yAxis = yAxis;
		this.workGrid = grid;
	}

	public int getxAxis() {
		return xAxis;
	}

	public void setxAxis(int xAxis) {
		this.xAxis = xAxis;
	}

	public int getyAxis() {
		return yAxis;
	}

	public void setyAxis(int yAxis) {
		this.yAxis = yAxis;
	}
	
	public void right() {
	if(yAxis>=0 && yAxis<workGrid.getLongitude()-1){
	
		System.out.println(yAxis);
		if(workGrid.isEmpty(xAxis, yAxis+1)){
	
		yAxis = yAxis+1;
	}
	}else{	
		if(workGrid.isEmpty(xAxis, 0)){
			
			yAxis = 0;
			System.out.println(yAxis);
		}
	 }	
}
	
	public void left() {
		if(yAxis>0 && yAxis<workGrid.getLongitude()-1){
		if(workGrid.isEmpty(xAxis, yAxis-1)){
			
			yAxis = yAxis-1;
		}	
		}
		else{
			if(workGrid.isEmpty(xAxis, workGrid.getLongitude()-1)){
				yAxis = yAxis-1;
				
				
				yAxis = workGrid.getLongitude()-1;
				//System.out.println(yAxis);
			}
		}
	}

	public void up() {
		if(xAxis>0 && xAxis<workGrid.getLatitude()-1){
		if(workGrid.isEmpty(xAxis-1, yAxis )){
		
			xAxis = xAxis-1;
		}
		}
		else{	
			if(workGrid.isEmpty(xAxis, workGrid.getLongitude()-1)){
			
			xAxis = workGrid.getLatitude()-1;
			
			xAxis = workGrid.getLatitude()-1 ;
			}
		}
	}
	
	public void down() {
		
	//	System.out.print(xAxis +" "+ yAxis);
		
		if(workGrid.isEmpty(xAxis+1, yAxis)){
		
//			System.out.println("Down");
//			System.out.print(xAxis+1 +" "+ yAxis);
			xAxis = xAxis+1;
			
			if(xAxis >= workGrid.getLatitude()){
			xAxis = 0;
			}
		
		}
	}
	
	
	public String toString() {
		
		return "xAxis" + xAxis + "yAxis" + yAxis;
	}
}
