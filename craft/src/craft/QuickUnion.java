package craft;

public class QuickUnion {

	private int id[];
	
	public QuickUnion(int N){
		id  = new int[N];
		for(int i = 0 ; i < id.length ; i++) {			
			id[i] = i;
		}		
	}
	
	private int root(int i) {
		
		while(i!=id[i]){
			
			i = id[i];
		}
		return i;
	}
	
	public boolean isConnected(int p , int q) {
		
		if(root(p)==root(q)){
			
			return true;
		}
		
		return false;
	}
	
	public void union(int p , int q){
		if(root(p)!=root(q)) {

			int i = root(p);    // Tricky step, when two nodes are joined that implies there 
							    // roots are joined.
			int j = root (q);
			
			id[i] = j;
		}
	}
}
