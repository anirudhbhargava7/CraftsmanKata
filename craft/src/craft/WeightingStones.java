package craft;

import java.util.Arrays;

public class WeightingStones {
	public static int max_weight=40;
	public static int balance[] = {-1, 0 , 1};
	
	public static void main(String args[]){
		// Forming combination of weights between 1 and 40
		for(int w1= 1 ; w1<max_weight ; w1++){
			for(int w2 = 1; w2 <max_weight ; w2++){
				for(int w3=1; w3< max_weight; w3++){
					
					int w4 = max_weight-w1-w2-w3;
					if (w4<=0 || w2<=0 || w3<= 0 || w1 <= 0){			
						break;
					}
					
					if(doWeight(w1,w2,w3,w4)){
					
					System.out.println("w1 "+w1+" "+"w2 "+w2+" "+"w3 "+w3+" "+"w4 "+w4);
					return;
					}
					
				}
			
			}
			
		}
			
	}

	private static boolean doWeight(int w1, int w2, int w3, int w4) {
		
	   int  all_number_array [] = new int[40];
	   int index = 0;
	   // Putting weights on the balance-scale -1 : left, +1 : right and 0 : weight not used
		for (int s1 : balance){
			for(int s2 : balance){
				for(int s3: balance){
					for(int s4 : balance){
						
						int result = s1*w1+s2*w2+s3*w3+s4*w4; 
						 if(result>0){
							 all_number_array[index]=s1*w1+s2*w2+s3*w3+s4*w4;
							 index++;
						 }				
					}	
				}
			}		
		}
		// Sorting the all_number_array and to find, whether it contain all the weight
		Arrays.sort(all_number_array);
		for(int iterator=0;iterator<40;iterator++){
			if(all_number_array[iterator]!=iterator+1){
				
				return false;
			}
		}
		return true;
		
	}
	
	
}
