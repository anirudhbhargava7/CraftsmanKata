/*
 * Coursera exercise for QuickFind Algorithm
 * 
 */

package craft;


import java.util.Scanner;

public class QuickFind {
	
	private int id[];
	public QuickFind(int N){
		id = new int[N];
		for (int i = 0 ; i< N; i++)	{
			
			id[i] = i;
		}
		
	}
	public boolean connected(int p , int q){
		
		return id[p] == id[q];
	}

	public void union(int p , int q){
		
	if(connected(p,q) == false){	
		int pid = id[p];
		int qid = id[q];
		
		for (int k=0; k< id.length;k++){
			
			if(id[k] == pid)
				
				id[k] = qid;
			
		}
		System.out.println("Connection made");
		for(int key : id)
			System.out.println(id[key]);
		
	}else{
		
		System.out.println("Already Connected");
		for(int key : id)
		System.out.print(id[key]);		
	}
	}
	
	public static void main(String args [])	{
		
		QuickFind qf = new QuickFind(10);
	
		Scanner cin = new Scanner(System.in);
		for(int n : qf.id)
		System.out.print(qf.id[n]+" ");
		System.out.println();
	System.out.println("Enter the nodes for Union Operation");	
		int p = cin.nextInt();
		int q = cin.nextInt();
		cin.close();
		qf.union(p, q);
		
		
		
	}
	
}
