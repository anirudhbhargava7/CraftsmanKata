// This program is for QuickFind, it's not an optimal algorithm.

package craft;

public class UnionFind {
	
	private int id [];
	
	public UnionFind(int N){
		
		id = new int[N];
		
		for(int i = 0; i< id.length; i++){
			
			id[i]= i;
			
		}
	}
	
	public boolean isConnected(int p, int q){
		
		if(id[p]==id[q]){
			
			return true;
		}
		
		return false;
	}
	
	public void union(int p , int q){
		
		int pid = id[p];
		int qid = id[q];
		
		if(pid == qid){
			
			System.out.println("Nodes are already connected");
		}
		else{
		
			for(int i = 0 ; i< id.length ; i++) {
				
			if(id[i]==qid){
					id[i]=pid;
					}
		   
				}	
			}
		
	}
	
}
